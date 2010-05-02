package co.edu.eafit.analisisnumerico.metodos.sistemasecuaciones;

import co.edu.eafit.analisisnumerico.framework.AnalisisException;
import co.edu.eafit.analisisnumerico.framework.DatoMatriz;
import co.edu.eafit.analisisnumerico.framework.MetodoUnidad2;
import co.edu.eafit.analisisnumerico.framework.SistemaEcuacionInterfaz;

public class Croult extends MetodoUnidad2 implements SistemaEcuacionInterfaz {
	
    static boolean error = false;
	public Croult(Object[][] matriz) throws AnalisisException{
		super(matriz);
	}

	 
	public String metodoSistema(double... d) throws AnalisisException {
			double[][] a = new double[matriz.length][matriz[0].length-1];
			double[] b = new double[matriz.length];
	        error = false;//booleano que permita controlar presencia de errores
	        llenarLU(n); //metodo que llena la matriz u y la matriz l con sus respectivos datos
	        //poner uii=1
	        for (int i = 0; i < n; i++) {
	            u[i][i] = 1;
	        }
	        //llenar matriz a
	        for(int i=0;i<matriz.length;i++){
				for(int j=0;j<matriz[0].length-1;j++){
					a[i][j]=matriz[i][j].getValor();
				}
			}
	        //llenar vector b
	        for(int i=0;i<matriz.length;i++){
				b[i]=matriz[i][matriz.length].getValor();
			}
	        for (int k = 0; k < n; k++) {
	            double suma = 0;
	            //despejar el resto de elementos l[i][j]
	            for (int i = k; i < n; i++) {
	                //suma = suma + (l[k][i] * u[i][k]);
	            	suma =0;
	                for (int p = 0; p < k ; p++) {
	                    suma = suma + l[i][p] * u[p][k];
	                }
	                l[i][k] = a[i][k] - suma;
	            }
	            //despejar el resto de elementos u[i][j]
	            for (int j = k + 1; j < n; j++) {
	                suma = 0;
	                for (int p = 0; p < k; p++) {
	                    suma = suma + l[k][p] * u[p][j];
	                }
	                adicionarMatrizImpresion(matriz, "Etapa "+(k+1));
	                if (l[k][k] != 0) {//controlar que no se divida por cero
	                    u[k][j] = (a[k][j] - suma) / l[k][k];
	                } else {
	                    return "Error: Division por cero";
	                }
	            }
	        }
        	double[][] lnueva = aumentarMatriz(l,b);
        	double[] z=sustitucionProgresiva2(lnueva); // Lz=b
        	double[][] unueva = aumentarMatriz(u,z);
        	double[] x=sustitucionRegresiva2(unueva); //Ux=z
            //para mostrar resultados
            //para mostrar resultados
            String[] col = new String[n];
            Impresion.mostrarResultadoLU(lnueva, unueva, x, z, col, "Resultados Dolytle", n);
            String resultado=imprimirResultadosMatrizTermino();
            return resultado;
	    }
	

}
