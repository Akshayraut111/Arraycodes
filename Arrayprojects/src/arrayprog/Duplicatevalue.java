package arrayprog;

public class Duplicatevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,30,10,30,55,60,55};
		
		for(int i=0;i<a.length-1;i++)
		{
			    int count = 1;
			    
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count=count+1;
				}
			}
			System.out.println( a[i]   +    "  duplicate value: "  +   count);
		}
	}

}
