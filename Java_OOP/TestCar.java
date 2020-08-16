class Car
{
    double speed;
    int noOfGear;
    void drive()
    {
        speed=20.0;
        noOfGear=6;
    }
    void display()
    {
        System.out.println("Speed of Car: "+speed);
        System.out.println("No. of Gears: "+noOfGear);
    }
}
class SportsCar extends Car
{
    String AirBalloonType;
    SportsCar()
    {
        super.drive();
        AirBalloonType="Small";
    }
    void display()
    {
        super.display();
        System.out.println("Air Balloon Type: "+AirBalloonType);
    }
}
class TestCar
{
    public static void main(String args [])
    {
        SportsCar s=new SportsCar();
        s.display();
    }
}