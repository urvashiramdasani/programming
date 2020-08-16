import java.util.Scanner;
class matrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int A[][]=new int [3][3];
        int B[][]=new int [3][3];
        int C[][]=new int [3][3];
        int i,j,k;
        System.out.println("Enter the elements in matrix 1: ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements in matrix 2: ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                B[i][j]=sc.nextInt();
            }
        }
        System.out.println("Addition of matrices is ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("\t"+(A[i][j]+B[i][j]));
            }
        }
        System.out.println("\nMultiplication of two matrices is ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                C[i][j]=0;
                for(k=0;k<3;k++)
                {
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("\t"+C[i][j]);
            }
        }
    }
}