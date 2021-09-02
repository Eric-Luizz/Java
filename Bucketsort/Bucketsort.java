import java.util.Scanner;
import java.util.Stack;
import java.util.*;


public class Bucketsort {
	private static Scanner entrada;
	public static void main(String[] args) {
		Bucket b=new Bucket();		
		    float[] arr = { (float) 0.42, (float) 0.32, (float) 0.33, (float) 0.52, (float) 0.37, (float) 0.47,
		   (float) 0.51 };
				  
		    System.out.println("-------Desordenado-------");
		    for (float i : arr) {
			      System.out.print(i + "  ");
			  }		  
		    
		    b.bucketSort(arr, arr.length);
		    System.out.println("\n-------Ordenado-------");
		    for (float i : arr) {
		      System.out.print(i + "  ");
			}
		  } 
	   
		   

}


