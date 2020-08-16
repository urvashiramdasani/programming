package abc;	// All the .class files will be generated in their respective packages
		// No need of manually making folders	
import ab.*;
import java.util.*;   		// javac -d . *.java (for compiling all the files in folder pack1)
				// java abc.TestPolygon
public class TestPolygon{
    public static void main(String args[])
    {
        float l,b,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of square: ");
        s=sc.nextFloat();
        System.out.println("Enter the length and breadth of Rectangle: ");
        l=sc.nextFloat();
        b=sc.nextFloat();
        Square sq=new Square(s);
        Rect r=new Rect(l,b);
        sq.calcArea();
        sq.calcPeri();
        sq.display();
        r.calcArea();
        r.calcPeri();
        r.display();
    }
}