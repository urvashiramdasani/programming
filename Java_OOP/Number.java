import java.util.*;

class Number
{
    int firstNumber,secondNumber;
    double result;
    Number(int x,int y)
    {
        firstNumber=x;
        secondNumber=y;
    }
    void add()
    {
        result=firstNumber+secondNumber;
    }
    void sub()
    {
        result=firstNumber-secondNumber;
    }
    void mul()
    {
        result=firstNumber*secondNumber;
    }
    void div() throws ArithmeticException
    {
        if(secondNumber==0) throw new ArithmeticException("Divide by zero");
        else result=(double) firstNumber/secondNumber;
    }
    void display()
    {
        System.out.println("Result : "+result);
    }
    public static void main(String args[]) 
    {
        System.out.println("Insert two Integers: ");
        int n1,n2,ch;
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        Number num=new Number(n1,n2);
        System.out.println("Arithmetic Calculator Menu : ");
        System.out.println("1. Add \n2. Subtarct \n3. Multiply \n4. Divide");
        System.out.println("Enter your choice: ");
        ch=sc.nextInt();
        if(ch==1) num.add();
        else if(ch==2) num.sub();
        else if(ch==3) num.mul();
        else if(ch==4) num.div();
        else System.out.println("Enter a valid choice!");
        num.display();
        sc.close();
    }
}