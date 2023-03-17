package arrayprog;

public class EvenandoddARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//sorting even number from the aaray
		System.out.println("enter the even no above array:");
		int []a= {50,65,40,100,150,10};
		
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]%2==0)
				
			    System.out.println(a[i]);
		}
		//sorting  odd number from the aaray
		
		System.out.println("enter the odd no above array:");
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				
			    System.out.println(a[i]);
	}
	

  }
}
