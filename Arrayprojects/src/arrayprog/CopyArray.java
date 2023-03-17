package arrayprog;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,15,25,78,45,65}; 
		
		  //copy array
		int b[]= Arrays.copyOf(a, 4);  //copy aaray
		
		b[2]=10;    //replace the value of index 2
		System.out.println(Arrays.toString(b));  //print the array
  
		
	}

}
