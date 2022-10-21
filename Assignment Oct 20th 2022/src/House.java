
public class House 
{
	
	public static void main (String [] args)
	{
		
		int n=14;
		char x = '*';
		char y = ' ';
		for (int i=0;i<n;i++)
		{
			System.out.print(y);
			for (int j=0;j<n;j++)
			{
				if(i==0 && j>0 && j<n-1 || j==n/16 || i==n-1 && j>0 && j<n-1 || j==n-1 || i+j<=(n-1)/2 && j>0 || j-i>=(n-1)/2 && j<n-1)
					System.out.print(x);
				else System.out.print(y);
			}
			System.out.print(y);
			System.out.println();
		}
	}

}
