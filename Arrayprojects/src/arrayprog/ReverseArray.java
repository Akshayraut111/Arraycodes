package arrayprog;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,15,25,78,45,65};
		
		for(int i=0;i<(a.length)/2;i++)
		{
			
			int k= a[(a.length-1)-i];
			
			a[(a.length-1)-i]= a[i];
			
			a[i]=k;
			
		}
		System.out.println(Arrays.toString(a));
	}
	 
}
