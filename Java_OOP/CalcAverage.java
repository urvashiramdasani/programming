import java.util.Scanner;

class CalcAverage
{
    public double avgFirstN(int N)
    {
        double sum=0.0;
        for(int i=1;i<=N;i++)
        {
            sum+=i;
        }
        return sum/N;
    }
    public static void main(String args [])
    {
        CalcAverage ag=new CalcAverage();
        System.out.println("Insert a natural number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        try
        {
            if(n<=0) throw new IllegalArgumentException();
            double avg=ag.avgFirstN(n);
            System.out.println("Average of first "+n+" Natural Numbers is "+avg);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(n+" is not a natural number");
        }
    }
}