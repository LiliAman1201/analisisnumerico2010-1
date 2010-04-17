package co.edu.eafit.analisisnumerico.framework;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.nfunk.jep.JEP;

import co.edu.eafit.analisisnumerico.GUI.ResultadosInterfaz1;
import co.edu.eafit.analisisnumerico.metodos.iterativos.Biseccion;
import co.edu.eafit.analisisnumerico.metodos.iterativos.BusquedasIncrementales;
import co.edu.eafit.analisisnumerico.metodos.iterativos.Newton;
import co.edu.eafit.analisisnumerico.metodos.iterativos.PuntoFijo;
import co.edu.eafit.analisisnumerico.metodos.iterativos.RaicesMultiples;
import co.edu.eafit.analisisnumerico.metodos.iterativos.ReglaFalsa;
import co.edu.eafit.analisisnumerico.metodos.iterativos.Secante;

/**
 * Clase Gestor Metodos. Posee la fabrica de metodos y la ejecucion dinamica de los mismos
 * @author Sebastian
 *
 */
public class GestorMetodos {
	static MetodoPadre mp;
	private static String funciones;
	private static int modo;

	/**
	 * Ejecuta un metodo dinamicamente, de acuerdo a los parametros recibidos
	 * @param numMetodo: Constante del metodo a ejecutar
	 * @param modo: Indica si es modo consola o modo grafico
	 * @param valoresPredefinidos: Array con valores por defecto, o null, para pedirselos al usuario
	 * @param strings: Lista de valores a solicitarle al usuario
	 */
	public static void ejecutar(int numMetodo, int modo, String titulo, String funciones, String[] funcionesPredeterminadas, double[] valoresPredefinidos, String...strings){
		MetodoPadre mp = GestorMetodos.fabricaMetodos(numMetodo);
		GestorMetodos.modo=modo;
		GestorMetodos.mp=mp;
		GestorMetodos.funciones=funciones;
		if(modo==Constantes.MODOCONSOLA){
			if(funciones!=null&&funciones!=""){
				crearFunciones(funcionesPredeterminadas);
			}
			double[] entradas=null;
			if(valoresPredefinidos==null){
				try {
					entradas = solicitarListaDoubleConsola(strings);
				} catch (AnalisisException e) {	

				}
			}
			else{
				entradas=valoresPredefinidos;
			}
			ejecutarMetodo(entradas);
		}
		else if(modo==Constantes.MODOGRAFICOINTERFAZ1){
			boolean resul = validarFuncionesNecesarias();
			if(resul){
				GestorInterfaz1 gi1 = new GestorInterfaz1();
				try {
					gi1.pintar(numMetodo,titulo, funciones.split(",").length, funciones,  strings);
				} catch (AnalisisException e) {}
			}
			
		}
	}

	private static boolean validarFuncionesNecesarias() {
		Principal p = Principal.getInstance();
		boolean fOk = p.crearFuncionesNuevas();
		if(!fOk)return false;
		String[] funcionesNecesarias = funciones.split(",");
		for(String s : funcionesNecesarias){
			if(s.equals("f")&&MetodoPadre.getParserF()==null){
				new AnalisisException("La Funcion f(x) es necesaria para este m�todo y no se ha inicializado");
				return false;
			}
			else if(s.equals("g")&&MetodoPadre.getParserG()==null){
				new AnalisisException("La Funcion g(x) es necesaria para este m�todo y no se ha inicializado");
				return false;
			}
			else if(s.equals("fdev")&&MetodoPadre.getParserFdev()==null){
				new AnalisisException("La primera derivada de f(x) es necesaria para este m�todo y no se ha inicializado");
				return false;
			}
			else if(s.equals("fdd")&&MetodoPadre.getParserFdd()==null){
				new AnalisisException("La segunda derivada de f(x) es necesaria para este m�todo y no se ha inicializado");
				return false;
			}
		}
		return true;
	}

	private static void ejecutarMetodoConsola(double... entradas) {
		String resultado="";
		try {
			resultado = mp.metodo(entradas);
		} catch (AnalisisException e) {}
		System.out.println("-------------------------------");
		System.out.println(resultado);
		System.out.println("-------------------------------");
		Object[][] resul = mp.generarMatriz();
		UtilConsola.imprimir(resul);
	}

	public static void crearFunciones(String[] funcionesPredeterminadas) {
		String[] misFunciones = funciones.split(",");
		for(int i=0;i<misFunciones.length;i++){
			if(misFunciones[i].equalsIgnoreCase("f")){
				boolean pedir=true;
				JEP parser = new JEP();
				parser.setImplicitMul(true);
				parser.addStandardConstants();
				parser.addStandardFunctions();
				if(funcionesPredeterminadas!=null){
					parser.addVariable("x", 0);
					parser.parseExpression(funcionesPredeterminadas[i]);
					mp.setParserF(parser);
				}else{
					try {
						while(pedir){
							pedir=false;
							String funcion = UtilConsola.leerString("Ingrese f(x): ");
							parser.addVariable("x", 0);
							parser.parseExpression(funcion);
							if(parser.hasError()){
								new AnalisisException("Por favor ingrese una funcion correcta");
								pedir=true;
							}
						}
						mp.setParserF(parser);
					} catch (AnalisisException e) {}
				}
			}
			else if(misFunciones[i].equalsIgnoreCase("g")){
				boolean pedir=true;
				JEP parser = new JEP();
				parser.setImplicitMul(true);
				parser.addStandardConstants();
				parser.addStandardFunctions();
				if(funcionesPredeterminadas!=null){
					parser.addVariable("x", 0);
					parser.parseExpression(funcionesPredeterminadas[i]);
					mp.setParserG(parser);
				}else{
					try {
						while(pedir){
							pedir=false;
							String funcion = UtilConsola.leerString("Ingrese g(x): ");
							parser.addVariable("x", 0);
							parser.parseExpression(funcion);
							if(parser.hasError()){
								new AnalisisException("Por favor ingrese una funcion correcta");
								pedir=true;
							}
						}
						mp.setParserG(parser);
					} catch (AnalisisException e) {}
				}
			}
			else if(misFunciones[i].equalsIgnoreCase("fd")||misFunciones[i].equalsIgnoreCase("fdev")){
				boolean pedir=true;
				JEP parser = new JEP();
				parser.setImplicitMul(true);
				parser.addStandardConstants();
				parser.addStandardFunctions();
				if(funcionesPredeterminadas!=null){
					parser.addVariable("x", 0);
					parser.parseExpression(funcionesPredeterminadas[i]);
					mp.setParserFdev(parser);
				}else{
					try {
						while(pedir){
							pedir=false;
							String funcion = UtilConsola.leerString("Ingrese la primer derivada de f(x): ");
							parser.addVariable("x", 0);
							parser.parseExpression(funcion);
							if(parser.hasError()){
								new AnalisisException("Por favor ingrese una funcion correcta");
								pedir=true;
							}
						}
						mp.setParserFdev(parser);
					} catch (AnalisisException e) {}
				}
			}
			else if(misFunciones[i].equalsIgnoreCase("fdd")){
				boolean pedir=true;
				JEP parser = new JEP();
				parser.setImplicitMul(true);
				parser.addStandardConstants();
				parser.addStandardFunctions();
				if(funcionesPredeterminadas!=null){
					parser.addVariable("x", 0);
					parser.parseExpression(funcionesPredeterminadas[i]);
					mp.setParserFdd(parser);
				}else{
					try {
						while(pedir){
							pedir=false;
							String funcion = UtilConsola.leerString("Ingrese la segunda derivada de f(x): ");
							parser.addVariable("x", 0);
							parser.parseExpression(funcion);
							if(parser.hasError()){
								new AnalisisException("Por favor ingrese una funcion correcta");
								pedir=true;
							}
						}
						mp.setParserFdd(parser);
					} catch (AnalisisException e) {}
				}
			}
		}
	}

	/**
	 * Fabrica de metodos 
	 * @param metodo: Identificador del metodo a crear
	 * @return
	 */
	private static MetodoPadre fabricaMetodos(int metodo) {
		if(metodo==Constantes.BISECCION) return new Biseccion();
		if(metodo==Constantes.BUSQUEDASINCREMENTALES) return new BusquedasIncrementales();
		if(metodo==Constantes.REGLAFALSA) return new ReglaFalsa();
		if(metodo==Constantes.NEWTON) return new Newton();
		if(metodo==Constantes.PUNTOFIJO) return new PuntoFijo();
		if(metodo==Constantes.SECANTE) return new Secante();
		if(metodo==Constantes.RAICESMULTIPLES) return new RaicesMultiples();
		return null;
	}

	/**
	 * Solicita por consola una serie de parametros Double
	 * @param strings: Lista de parametros a solicitar al usuario
	 * @return: La lista de valores que el usuario ingresa
	 * @throws AnalisisException: En caso de entrada invalida
	 */
	private static double[] solicitarListaDoubleConsola(String[] strings) throws AnalisisException {
		double[] entradas = new double[strings.length];
		for(int i=0;i<strings.length;i++){
			entradas[i]=UtilConsola.leerDouble("Ingrese "+strings[i]+": ");
		}
		return entradas;
	}

	public static boolean esFuncionCorrecta(String funcion){
		JEP parser = new JEP();
		parser.setImplicitMul(true);
		parser.addStandardConstants();
		parser.addStandardFunctions();
		parser.addVariable("x", 0);
		parser.parseExpression(funcion);
		if(parser.hasError())return false;
		return true;

	}


	public static void ejecutarMetodo(double[] d) {
		if(modo==Constantes.MODOCONSOLA)ejecutarMetodoConsola(d);
		else if(modo==Constantes.MODOGRAFICOINTERFAZ1||modo==Constantes.MODOGRAFICOINTERFAZ2)ejecutarMetodoInterfaz(d);

	}

	private static void ejecutarMetodoInterfaz(double... entradas) {
		String resultado="";
		try {
			resultado = mp.metodo(entradas);
		} catch (AnalisisException e) {}
		ResultadosInterfaz1 ri1 = new ResultadosInterfaz1();
		ri1.lblResultado.setText("Resultado: "+resultado);
		Object[][] resul = mp.generarMatrizSinTitulos();
		Object[] titulos = mp.getTitulos();
		//ri1.tablaResultados = new JTable(resul,titulos);

		ri1.tablaResultados.setModel(new DefaultTableModel(resul, titulos));
		ri1.setVisible(true);
	}

}
