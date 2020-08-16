import java.util.Scanner;
class even
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("Enter the upper limit: ");
		n=sc.nextInt();
		}while(n<0);
		System.out.println("Even numbers between 1 and "+n+" are: ");
		for(int i=1;i<n;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}
}