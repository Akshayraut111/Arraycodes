package arrayprog;

public class MaxnoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,15,25,78,45,65}; 
		  
		int maximumno = a[0];

		for(int i=0;i<a.length-1;i++)
		{
			if(maximumno<a[i+1])
			{
				maximumno =a[i+1];
			}
         }
           System.out.println(maximumno);
	}
}
