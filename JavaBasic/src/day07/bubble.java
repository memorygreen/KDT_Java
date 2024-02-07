package day07;

public class bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	      int[] array = { 35, 5, 7897, 555, 20 };
	      int a = 0;
		
	      for (int i = 0; i < array.length; i++) {
	          for (int j = 0; j < i; j++) {
	             if (array[j] > array[i]) {
	                a = array[j];
	                array[j] = array[i];
	                array[i] = a;
	             }
	          }
	       }

	      
	      //실행 
	       for (

	             int i = 0; i < array.length; i++) {
	          System.out.print(array[i] + " ");
	       }	
		
	}

}
