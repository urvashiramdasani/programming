import java.util.Scanner;
class Rectangle
{
    float length,breadth,Area,pm;
    Scanner sc=new Scanner(System.in);
    Rectangle(float x, float y)
    {
        length=x;
        breadth=y;
        setlength();
        setbreadth();
    }
    Rectangle()
    {
        length=0.0f;
        breadth=0.0f;
    }
    float getlength()
    {
        return length;
    }
    float getbreadth()
    {
        return breadth;
    }
    void setlength()
    {
        if(length<0.0 || length>20.0)
        {
            System.out.println("Length out of range!");
            length=1.0f;
        }
    }
    void setbreadth()
    {
        if(breadth<0.0 || breadth>20.0)
        {
            System.out.println("Breadth out of range!");
            breadth=1.0f;
        }
    }
    void area()
    {
        Area=length*breadth;
        if(Area>440.0)
            Area=1.0f;
        else
            Area=length*breadth;
    }
    void peri()
    {
        pm=2*(length+breadth);
    }
    void display()
    {
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
        System.out.println("Area: "+Area);
        System.out.println("Perimeter: "+pm);
    }
}