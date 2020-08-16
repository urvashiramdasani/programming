import java.util.*;
abstract class Compartment
{
    abstract void notice();
}
class FirstClass extends Compartment
{
    void notice()
    {
        System.out.println("Welcome to First Class Coach.");
    }
}
class General extends Compartment
{
    void notice()
    {
        System.out.println("Welcome to General Coach.");
    }
}
class Ladies extends Compartment
{
    void notice()
    {
        System.out.println("Welcome to Ladies Coach.");
    }
}
class Luggage extends Compartment
{
    void notice()
    {
        System.out.println("Welcome to Luggage Section.");
    }
}
class TestCompartment
{
    public static void main(String args[])
    {
        Compartment c[]=new Compartment [10];
        Random r=new Random();
        for(int i=0;i<c.length;i++)
        {
            int temp=r.nextInt(4);
            if(temp==0)
            {
                c[i]=new FirstClass();
                c[i].notice();
            }
            else if(temp==1)
            {
                c[i]=new General();
                c[i].notice();
            }
            else if(temp==2)
            {
                c[i]=new Ladies();
                c[i].notice();
            }
            else if(temp==3)
            {
                c[i]=new Luggage();
                c[i].notice();
            }
        }
    }
}