
public class Bow_Tie 
{
	
	public static void main (String [] args)
	{
		
		int n=14;
		char x = '*';
		char y = ' ';
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if(i==(n-3)*(n-1)/n  || i+j>=(n-1)+(n-1)/4 && i<(n-3)*(n-1)/n || i-j>=(n-1)/4 && i<(n-3)*(n-1)/n)
					System.out.print(x);
				else System.out.print(y);
			}
			System.out.println();
		}
	}

}
