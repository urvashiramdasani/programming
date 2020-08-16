import java.util.*;
class BMI
{
	static final int k=703;
	public static void main(String args[])
	{
		double bmi;
		int feet,inch,weight,height;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Enter your Weight in pounds: ");
			weight=sc.nextInt();
		}while(weight<0);
		do
		{
			System.out.println("Enter your height in feet and inches format...");
			System.out.println("Enter Feets: ");
			feet=sc.nextInt();
			System.out.println("Enter Inches: ");
			inch=sc.nextInt();
		}while(inch<0 && feet<0);
		height=12*feet + inch;
		bmi=(k*(double) weight)/(height*height);
		System.out.println("Your Body-Mass Index is: "+bmi);
		if(bmi<18.5 && bmi>0.0)
			System.out.println("Person is Under-weight");
		else if(bmi>18.5 && bmi<24.9)
			System.out.println("Person is Normal");
		else if(bmi>25.0 && bmi<29.9)
			System.out.println("Person is Over-Weight");
		else if(bmi>30.0)
			System.out.println("Person is Obese");
	}
}