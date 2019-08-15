package ArreglosOrdenamiento;

public class burbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * el método de ordenamiento de burbuja (Bubble sort). 
		 * Este método revisa y arregla el orden de cada elemento del arreglo 
		 * comparándolo con el siguiente. El proceso se repite varias veces 
		 * hasta que se hayan verificado todos los elementos, ya no sean 
		 * necesarios más cambios y el arreglo se encuentre ordenado.
		 */
		
		int arreglo[] = {5,3,2,99,10,12};
		
		//método manual de ordenamiento de mayor a menor
	    for (int x = 0; x < arreglo.length; x++) {
	        for (int i = 0; i < arreglo.length-x-1; i++) {
	            if(arreglo[i] < arreglo[i+1]){
	                int tmp = arreglo[i+1];
	                arreglo[i+1] = arreglo[i];
	                arreglo[i] = tmp;
	            }
	        }
	    }
	    for(int elemento:arreglo) {
	    	System.out.print(elemento+" ");
	    }

	}

}
