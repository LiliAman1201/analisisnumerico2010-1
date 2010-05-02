package co.edu.eafit.analisisnumerico.framework;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import co.edu.eafit.analisisnumerico.metodos.sistemasecuaciones.Cholesky;
import co.edu.eafit.analisisnumerico.metodos.sistemasecuaciones.Croult;
import co.edu.eafit.analisisnumerico.metodos.sistemasecuaciones.Dolytle;
import co.edu.eafit.analisisnumerico.metodos.sistemasecuaciones.GaussSimple;
import co.edu.eafit.analisisnumerico.metodos.sistemasecuaciones.LUSimple;
import co.edu.eafit.analisisnumerico.metodos.sistemasecuaciones.PivoteoEscalonado;
import co.edu.eafit.analisisnumerico.metodos.sistemasecuaciones.PivoteoParcial;
import co.edu.eafit.analisisnumerico.metodos.sistemasecuaciones.PivoteoTotal;

/**
 * Clase Gestor Metodos. Posee la fabrica de metodos y la ejecucion dinamica de los mismos
 * @author Sebastian
 *
 */
public class GestorMetodos {
	static MetodoUnidad1 mPadreU1;
	static MetodoUnidad2 mPadreU2;
	private static String funciones;
	private static int modo;
	private static final String TEXTOINICIO="";
	private static final String TEXTOFIN=":";

	/**Variable global que contiene el metodo activo en el momento*/
	public static int metodoEjecutandose;

	/**Nombres y orden de las variables (delta, iteraciones, etc) que pueden modificarse en la salida*/
	public static String[] variablesModificables; 


	/**
	 * Ejecuta un metodo dinamicamente, de acuerdo a los parametros recibidos
	 * @param numMetodo: Constante del metodo a ejecutar
	 * @param modo: Indica si es modo consola o modo grafico
	 * @param valoresPredefinidos: Array con valores por defecto, o null, para pedirselos al usuario
	 * @param strings: Lista de valores a solicitarle al usuario
	 */
	public static void ejecutar(int numMetodo, int modo, String titulo, String funciones, String[] funcionesPredeterminadas, double[] valoresPredefinidos, String...strings){
		variablesModificables=strings;
		metodoEjecutandose=numMetodo;
		MetodoUnidad1 mp = GestorMetodos.fabricaMetodosUnidad1(numMetodo);
		GestorMetodos.modo=modo;
		GestorMetodos.mPadreU1=mp;
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
			ejecutarMetodoUnidad1(entradas);
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

	public static void ejecutarSistemaEcuacion(int numMetodo, String titulo, Object[][] matriz){
		MetodoUnidad2 mp = null;
		try {
			mp = GestorMetodos.fabricaMetodosUnidad2(numMetodo, matriz);
		} catch (AnalisisException e1) {

		}
		if(mp==null)return;
		GestorMetodos.mPadreU2=mp;
		String resultado="";
		try {
			/*ejecuta el metodo*/
			resultado = mPadreU2.metodoSistema();
		} catch (AnalisisException e) {
			e.printStackTrace();
		}
		String[] titulos = new String[mp.datos.size()];
		for(int i=0;i<titulos.length;i++)titulos[i]="";
		
		/*MUESTRA LA INTERFAZ DE SALIDA*/
		ResultadosInterfaz1 ri1= new ResultadosInterfaz1();
		ri1.tablaResultados.setModel(new DefaultTableModel(mp.generarMatrizSinTitulos(), titulos));
		ri1.txtDatosGenerales.setText(generarTextoReferenciaUnidad());
		ri1.lblResultado.setText("Resultado: "+resultado);
		ri1.setVisible(true);
	}

	private static boolean validarFuncionesNecesarias() {
		PrincipalUnidad1 p = PrincipalUnidad1.getInstance();
		boolean fOk = p.crearFuncionesNuevas();
		if(!fOk)return false;
		String[] funcionesNecesarias = funciones.split(",");
		for(String s : funcionesNecesarias){
			if(s.equals("f")&&MetodoUnidad1.getParserF()==null){
				new AnalisisException("La Funcion f(x) es necesaria para este m�todo y no se ha inicializado");
				return false;
			}
			else if(s.equals("g")&&MetodoUnidad1.getParserG()==null){
				new AnalisisException("La Funcion g(x) es necesaria para este m�todo y no se ha inicializado");
				return false;
			}
			else if(s.equals("fdev")&&MetodoUnidad1.getParserFdev()==null){
				new AnalisisException("La primera derivada de f(x) es necesaria para este m�todo y no se ha inicializado");
				return false;
			}
			else if(s.equals("fdd")&&MetodoUnidad1.getParserFdd()==null){
				new AnalisisException("La segunda derivada de f(x) es necesaria para este m�todo y no se ha inicializado");
				return false;
			}
		}
		return true;
	}

	private static void ejecutarMetodoConsola(double... entradas) {
		String resultado="";
		try {
			resultado = mPadreU1.metodo(entradas);
		} catch (AnalisisException e) {}
		System.out.println("-------------------------------");
		System.out.println(resultado);
		System.out.println("-------------------------------");
		Object[][] resul = mPadreU1.generarMatriz();
		UtilConsola.imprimir(resul);
	}

	@SuppressWarnings("static-access")
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
					mPadreU1.setParserF(parser, funcionesPredeterminadas[i]);
				}else{
					try {
						String funcion="";
						while(pedir){
							pedir=false;
							funcion = UtilConsola.leerString("Ingrese f(x): ");
							parser.addVariable("x", 0);
							parser.parseExpression(funcion);
							if(parser.hasError()){
								new AnalisisException("Por favor ingrese una funcion correcta");
								pedir=true;
							}
						}
						mPadreU1.setParserF(parser, funcion);
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
					mPadreU1.setParserG(parser, funcionesPredeterminadas[i]);
				}else{
					try {
						String funcion="";
						while(pedir){
							pedir=false;
							funcion = UtilConsola.leerString("Ingrese g(x): ");
							parser.addVariable("x", 0);
							parser.parseExpression(funcion);
							if(parser.hasError()){
								new AnalisisException("Por favor ingrese una funcion correcta");
								pedir=true;
							}
						}
						mPadreU1.setParserG(parser, funcion);
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
					mPadreU1.setParserFdev(parser, funcionesPredeterminadas[i]);
				}else{
					try {
						String funcion="";
						while(pedir){
							pedir=false;
							funcion = UtilConsola.leerString("Ingrese la primer derivada de f(x): ");
							parser.addVariable("x", 0);
							parser.parseExpression(funcion);
							if(parser.hasError()){
								new AnalisisException("Por favor ingrese una funcion correcta");
								pedir=true;
							}
						}
						mPadreU1.setParserFdev(parser, funcion);
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
					mPadreU1.setParserFdd(parser, funcionesPredeterminadas[i]);
				}else{
					try {
						String funcion="";
						while(pedir){
							pedir=false;
							funcion = UtilConsola.leerString("Ingrese la segunda derivada de f(x): ");
							parser.addVariable("x", 0);
							parser.parseExpression(funcion);
							if(parser.hasError()){
								new AnalisisException("Por favor ingrese una funcion correcta");
								pedir=true;
							}
						}
						mPadreU1.setParserFdd(parser, funcion);
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
	private static MetodoUnidad1 fabricaMetodosUnidad1(int metodo) {
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
	 * Fabrica de metodos 
	 * @param metodo: Identificador del metodo a crear
	 * @return
	 */
	private static MetodoUnidad2 fabricaMetodosUnidad2(int metodo, Object[][] matriz) throws AnalisisException {
		if(metodo==Constantes.GAUSSSIMPLE) return new GaussSimple(matriz);
		if(metodo==Constantes.PIVOTEOPARCIAL) return new PivoteoParcial(matriz);
		if(metodo==Constantes.PIVOTEOTOTAL) return new PivoteoTotal(matriz);
		if(metodo==Constantes.LUSIMPLE) return new LUSimple(matriz);
		if(metodo==Constantes.PIVOTEOESCALONADO) return new PivoteoEscalonado(matriz);
		if(metodo==Constantes.CROULT) return new Croult(matriz);
		if(metodo==Constantes.CHOLESKY) return new Cholesky(matriz);
		if(metodo==Constantes.DOOLITTLE) return new Dolytle(matriz);
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


	public static void ejecutarMetodoUnidad1(double[] d) {
		if(modo==Constantes.MODOCONSOLA)ejecutarMetodoConsola(d);
		else if(modo==Constantes.MODOGRAFICOINTERFAZ1||modo==Constantes.MODOGRAFICOINTERFAZ2)ejecutarMetodoInterfaz(d);

	}

	private static void ejecutarMetodoInterfaz(double... entradas) {
		String resultado="";
		try {
			resultado = mPadreU1.metodo(entradas);
		} catch (AnalisisException e) {}
		final ResultadosInterfaz1 ri1 = new ResultadosInterfaz1();
		ri1.lblResultado.setText("Resultado: "+resultado);
		Object[][] resul = mPadreU1.generarMatrizSinTitulos();
		Object[] titulos = mPadreU1.getTitulos();
		//ri1.tablaResultados = new JTable(resul,titulos);

		ri1.tablaResultados.setModel(new DefaultTableModel(resul, titulos));
		ri1.txtDatosGenerales.setText(generarTextoReferenciaUnidad());
		ri1.setVisible(true);
		/*seteo variables modificables en interfaz*/
		if(variablesModificables!=null&&variablesModificables.length>0){
			coordinarLabelsYTextBoxVariablesModificables(ri1);
		}
		/*en caso de recalcular metodo, ejecuto la funcion again*/
		ri1.btnRecalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				double[] d= new double[variablesModificables.length];
				for(int i=0;i<variablesModificables.length;i++){
					try{
						if(i==0){
							d[0] = Double.parseDouble(ri1.txtVariable1.getText());
						}
						else if(i==1){
							d[1] = Double.parseDouble(ri1.txtVariable2.getText());
						}
						else if(i==2){
							d[2] = Double.parseDouble(ri1.txtVariable3.getText());
						}
						else if(i==3){
							d[3] = Double.parseDouble(ri1.txtVariable4.getText());
						}
					}
					catch(Exception ex){
						new AnalisisException("ENTRADA INVALIDA EN LA POSICION "+(i+1));
						return;
					}
				}
				ri1.setVisible(false);
				mPadreU1.resetDatos();
				ejecutarMetodoInterfaz(d);
			}
		});
	}

	private static void coordinarLabelsYTextBoxVariablesModificables(
			ResultadosInterfaz1 ri1) {
		switch(variablesModificables.length){
		case 1:
			ri1.lblVariable1.setText(TEXTOINICIO+variablesModificables[0]+TEXTOFIN);
			ri1.lblVariable2.setVisible(false);
			ri1.txtVariable2.setVisible(false);
			ri1.lblVariable3.setVisible(false);
			ri1.txtVariable3.setVisible(false);
			ri1.lblVariable4.setVisible(false);
			ri1.txtVariable4.setVisible(false);
			break;
		case 2:
			ri1.lblVariable1.setText(TEXTOINICIO+variablesModificables[0]+TEXTOFIN);
			ri1.lblVariable2.setText(TEXTOINICIO+variablesModificables[1]+TEXTOFIN);
			ri1.lblVariable3.setVisible(false);
			ri1.txtVariable3.setVisible(false);
			ri1.lblVariable4.setVisible(false);
			ri1.txtVariable4.setVisible(false);
			break;
		case 3:
			ri1.lblVariable1.setText(TEXTOINICIO+variablesModificables[0]+TEXTOFIN);
			ri1.lblVariable2.setText(TEXTOINICIO+variablesModificables[1]+TEXTOFIN);
			ri1.lblVariable3.setText(TEXTOINICIO+variablesModificables[2]+TEXTOFIN);
			ri1.lblVariable4.setVisible(false);
			ri1.txtVariable4.setVisible(false);
			break;
		case 4:
			ri1.lblVariable1.setText(TEXTOINICIO+variablesModificables[0]+TEXTOFIN);
			ri1.lblVariable2.setText(TEXTOINICIO+variablesModificables[1]+TEXTOFIN);
			ri1.lblVariable3.setText(TEXTOINICIO+variablesModificables[2]+TEXTOFIN);
			ri1.lblVariable4.setText(TEXTOINICIO+variablesModificables[3]+TEXTOFIN);
			break;

		}
	}

	private static String generarTextoReferenciaUnidad() {
		String salida = "";
		if(MetodoUnidad1.getParserF()!=null){
			salida+="f(x)= "+MetodoUnidad1.funcionF+"\n";
		}
		if(MetodoUnidad1.getParserG()!=null){
			salida+="g(x)= "+MetodoUnidad1.funcionF+"\n";
		}
		if(MetodoUnidad1.getParserFdev()!=null){
			salida+="f'(x)= "+MetodoUnidad1.funcionFdev+"\n";
		}
		if(MetodoUnidad1.getParserFdd()!=null){
			salida+="f''(x)= "+MetodoUnidad1.funcionFdd+"\n";
		}
		return salida;
	}

}
