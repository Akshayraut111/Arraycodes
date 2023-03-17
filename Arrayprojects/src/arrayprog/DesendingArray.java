package arrayprog;

import java.util.Arrays;

public class DesendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int []a= {50,65,40,100,150,10};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if( a[i] < a[j])
				{
					int k= a[j];
					
					a[j] =a[i];
					
					a[i]=k;	
				}
	         }
			
			System.out.println("Assending order:"+Arrays.toString(a));
         }  
       }
	}


