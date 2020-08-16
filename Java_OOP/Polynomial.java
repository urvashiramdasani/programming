import java.util.Scanner;
class Polynomial
{
    int count=0;
    Term t[]=new Term[5];
    Polynomial()
    {
        for(int i=0;i<5;i++)
        {
            t[i] = new Term();
           // t[i].coefficient=0;
           // t[i].exponent=0;
        }
    }
    int setTerm(int c,int e)
    {
        if(count>=5)
            {
                System.out.println("Array out of bound!");
                return -2;
            }
        else if(e<0)
            {
                System.out.println("Negative Exponent not allowed!");
                return -1;
            }
        for(int i=count;i>=0;i--)
        {
            if(t[i].exponent==e)
                {
                    System.out.println("Exponent already in use!");
                    return -1;
                }
        }
        t[count].coefficient=c;
        t[count].exponent=e;
        count++;
        return 0;
    }
    void sort()
    {
        int temp;
        for(int i=0;i<count;i++)
        {
            for(int j=i+1;j<count;j++)
            {
                if(t[i].exponent>t[j].exponent)
                {
                    temp=t[i].exponent;
                    t[i].exponent=t[j].exponent;
                    t[j].exponent=temp;
                    temp=t[i].coefficient;
                    t[i].coefficient=t[j].coefficient;
                    t[j].coefficient=temp;
                }
            }
        }
    }
    void display()
    {
        int i;
        System.out.println("Your polynomial is: ");
        for(i=0;i<count-1;i++)
        {
            System.out.print(t[i].coefficient+"x"+t[i].exponent+" + ");
        }
        System.out.println(t[i].coefficient+"x"+t[i].exponent);
    }
}