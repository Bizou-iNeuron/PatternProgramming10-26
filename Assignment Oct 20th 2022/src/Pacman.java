
public class Pacman {
	
	public static void main (String [] args)
	{
		
		int n=17;
		for (int i=0;i<n;i++)
		{
			System.out.print(" ");
			for (int j=0;j<n;j++)
			{
				if (i==0 && j<15*(n-1)/n || i+j <= 6 || i==13 && j<15*(n-1)/n || i-j>=6 && i<15*(n-1)/n)
					System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
