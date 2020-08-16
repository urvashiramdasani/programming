import java.util.Scanner;
class sort
{
    public static void main(String args[])
    {
        int n,i,j,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter elements in array: ");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("In Ascending order: ");
        for(i=0;i<n;i++)
        {
            System.out.print("\t"+arr[i]);
        }
        System.out.println("\nIn Descending order: ");
        for(i=n-1;i>=0;i--)
        {
            System.out.print("\t"+arr[i]);
        }
    }
}