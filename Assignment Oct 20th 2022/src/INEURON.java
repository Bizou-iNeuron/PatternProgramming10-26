
public class INEURON 
{

	public static void main(String[] args) 
	{
		int n=8;
		char x = 'O';
		char y = ' ';
		String z ="  ";
		for (int i=0;i<n;i++)
		{
			for (int j=0; j<n;j++)
			{
				if (j==(n-1)*(n-1)/n && i!=1)
				System.out.print(x);
				else System.out.print(y);
			}
			System.out.print(y);
			for (int j=0; j<n;j++)
			{
				if (j==0||i==j||j==(n-1))
				System.out.print(x);
				else System.out.print(y);
			}
			System.out.print(z);
			for (int j=0; j<n;j++)
			{
				if (j==0||i==0||i==(n-1)/2||i==(n-1))
				System.out.print(x);
				else System.out.print(y);
			}
			System.out.print(z);
			for (int j=0; j<n;j++)
			{
				if (j==0 && i<n-1||i==(n-1) && j>0 && j<n-1||j==(n-1) && i<n-1)
				System.out.print(x);
				else System.out.print(y);
			}
			System.out.print(z);
			for (int j=0; j<n;j++)
			{
				if (i==0 && j<n-1||j==0 && i>0||i==(n-1)/2 && j<=(n-1)*(n-1)/n||j==(n-1)&& i>0 && i <=(n-1)/2*(n-1)/n || i==j && i>(n-1)/2)
				System.out.print(x);
				else System.out.print(y);
			}
			System.out.print(z);
			for (int j=0; j<n;j++)
			{
				if (i==0 && j>0 && j<n-1||j==0 && i>0 && i<n-1||i==(n-1) && j>0 && j<n-1||j==(n-1) && i>0 && i<n-1)
				System.out.print(x);
				else System.out.print(y);
			}
			System.out.print(z);
			for (int j=0; j<n;j++)
			{
				if (j==0||i==j||j==(n-1))
				System.out.print(x);
				else System.out.print(y);
			}
			System.out.println();
		}

	}

}
