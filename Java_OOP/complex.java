import java.util.Scanner;
class complex
{
    private float real,imag;       // float newRe = this.real + c.real;
    complex()                       // float newIm = this.imag + c.imag
    {
        real=0.0f;
        imag=0.0f;
    }
    void get(float r,float i)
    {
        real=r;
        imag=i;
    }
    complex add(complex c2)
    {
        complex c=new complex();
        c.real=real+c2.real;
        c.imag=imag+c2.imag;
        return c;
    }
    complex subtract(complex c2)
    {
        complex c=new complex();
        c.real=real-c2.real;
        c.imag=imag-c2.imag;
        return c;
    }
    void display()
    {
        System.out.println("Your Result is "+real+" + "+imag+" i ");
    }
    public static void main(String args[])
    {
        float r,i;
        Scanner sc=new Scanner(System.in);
        complex c1=new complex();
        complex c2=new complex();
        complex c3=new complex();
        System.out.println("Enter real part of number 1: ");
        r=sc.nextFloat();
        System.out.println("Enter imaginary part of number 1: ");
        i=sc.nextFloat();
        c1.get(r,i);
        System.out.println("Enter real part of number 2: ");
        r=sc.nextFloat();
        System.out.println("Enter imaginary part of number 2: ");
        i=sc.nextFloat();
        c2.get(r,i);
        c3=c1.add(c2);
        c3.display();
        c3=c1.subtract(c2);
        c3.display();
    }
}