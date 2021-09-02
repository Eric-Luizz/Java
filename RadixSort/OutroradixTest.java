import java.util.*;
public class OutroradixTest {	

		public static void main(String[] args) {
		Outroradix rs = new Outroradix();
		int[] data = { 121, 432, 564, 23, 1, 45, 788 };			
		int size = data.length;	    
	    rs.radixSort(data, size);
	    System.out.println("Sorted Array in Ascending Order: ");
	    System.out.println(Arrays.toString(data));
		  
		   	    
		   	    		    
			
		  
	}

}
