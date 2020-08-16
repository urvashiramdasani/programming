import java.util.Scanner;
class Term
{
    int coefficient,exponent;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Polynomial p=new Polynomial();
        char ch='y';
        int cof,expo,res;
        do
        {
            System.out.println("Enter the coefficient and exponenet of polynomial: ");
            cof=sc.nextInt();
            expo=sc.nextInt();
            res=p.setTerm(cof,expo);
            if(res==-2)
                break;
            else if(res==-1)
                continue;
            System.out.println("You want to enter more?\n Enter y for yes and n for no: ");
            ch=sc.next().charAt(0);
        }while(ch=='y' || ch=='Y');
        p.sort();
        p.display();
    }   
}