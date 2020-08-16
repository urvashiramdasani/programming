package ab;

public class Square implements Polygon{
    float side,area,perimeter;
    public Square(float s)
    {
        side=s;
    }
    public void calcArea()
    {
        area=side*side;
    }
    public void calcPeri()
    {
        perimeter=4*side;
    }
    public void display()
    {
        System.out.println("The area and perimeter of square is "+area+" "+perimeter);
    }
}