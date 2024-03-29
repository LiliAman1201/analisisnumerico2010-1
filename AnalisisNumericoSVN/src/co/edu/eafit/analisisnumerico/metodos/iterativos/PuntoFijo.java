package co.edu.eafit.analisisnumerico.metodos.iterativos;

import co.edu.eafit.analisisnumerico.framework.AnalisisException;
import co.edu.eafit.analisisnumerico.framework.Constantes;
import co.edu.eafit.analisisnumerico.framework.GestorMetodos;
import co.edu.eafit.analisisnumerico.framework.MetodoInterfaz;
import co.edu.eafit.analisisnumerico.framework.MetodoUnidad1;
import co.edu.eafit.analisisnumerico.framework.UtilConsola;

/**
 * 
 * @author Daniela
 *
 */
public class PuntoFijo  extends MetodoUnidad1 implements MetodoInterfaz{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double[] valoresIniciales = {3.5,4.0,5.0,20};
		String[] fPredeterminadas = {"e^(-2x-5)-x^2+2x","sqrt(e^(-2x-5)+2x)"};
		GestorMetodos.ejecutar(Constantes.PUNTOFIJO,Constantes.MODOGRAFICOINTERFAZ1, "M�todo de Punto Fijo","f,g", fPredeterminadas , valoresIniciales, "X0", "Cifras significativas", "iteraciones");
	}
	
	@Override
	public String metodo(double... entradas)  throws AnalisisException{
		this.adicionarFilaTitulos("iteracion","xi","f(xi)","error");
		double x0 = entradas[0];
		double cifrasSignificativas = entradas[1];
		double iteraciones = entradas[2];
		double tolerancia = UtilConsola.getTolerancia(cifrasSignificativas);
		
		double y =f(x0);
		double error= tolerancia+1;
		double cont =0;
		double x1=0;
		adicionarFilaResultados(cont,x0,y,-1.0);
		while(y!=0&&error>tolerancia&&cont<iteraciones){
			x1=g(x0);
			y=f(x1);
			error=Math.abs(x1-x0);
			x0=x1;
			adicionarFilaResultados(cont,x0,y,error);
			cont++;
		}
		if(y==0)return xFormat(x1)+"es raiz. Hallado en "+cont+" iteraciones.";
		else if(error<=tolerancia)return xFormat(x1)+" es raiz con un error relativo de "+eFormat(error)+". Hallado en "+cont+" iteraciones.";
		else return "Se ha fracasado con "+cont+" iteraciones";
	}

	
}