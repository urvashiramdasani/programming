class array
{
    public static void main(String args[])
    {
        int sum=0,temp=Integer.MAX_VALUE;
        int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
        for(int i=0;i<15;i++)
        {
            sum=sum+A[i];
        }
        A[15]=sum;
        A[16]=(int) sum/15;
        for(int i=0;i<15;i++)
        {
            if(temp>A[i])
                temp=A[i];
        }
        A[17]=temp;
        for(int i=0;i<18;i++)
        {
            System.out.print("\t"+A[i]);
        }
        System.out.println("\n"+A);
        //System.out.print(A+1);
        //System.out.print(A+2);
    }
}