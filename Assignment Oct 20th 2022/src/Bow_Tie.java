
public class Bow_Tie 
{
	
	public static void main (String [] args)
	{
		
		int n=14;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if(i==11*(n-1)/n  || i+j>=(n-1)+(n-1)/4 && i<11*(n-1)/n || i-j>=(n-1)/4 && i<11*(n-1)/n)
					System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
