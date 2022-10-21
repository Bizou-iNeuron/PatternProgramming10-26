
public class Pacman {
	
	public static void main (String [] args)
	{
		
		int n=17;
		char x = '*';
		char y = ' ';
		for (int i=0;i<n;i++)
		{
			System.out.print(y);
			for (int j=0;j<n;j++)
			{
				if (i==0 && j<(n-2)*(n-1)/n || i+j <= (n-11) || i==(n-4) && j<(n-2)*(n-1)/n || i-j>=(n-11) && i<(n-2)*(n-1)/n)
					System.out.print(x);
				else System.out.print(y);
			}
			System.out.println();
		}
	}

}
