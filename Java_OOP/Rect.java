package ab;

public class Rect implements Polygon{
    float length,breadth,area,perimeter;
    public Rect(float len,float bre)
    {
        length=len;
        breadth=bre;
    }
    public void calcArea()
    {
        area=length*breadth;
    }
    public void calcPeri()
    {
        perimeter=2*(length+breadth);
    }
    public void display()
    {
        System.out.println("The area and perimeter of rectangle is "+area+" "+perimeter);
    }
}