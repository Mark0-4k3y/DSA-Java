package OOOPS.Interfaces;

public class Abstract_CarObjects
{
    public static void main(String[] args)
    {
//        Abstract_Vehicle v=new Abstract_Vehicle("Bentley");
        //We can see that the abstract vehicle class cannot not able to make an object
        //But it can create a reference
        Abstract_Vehicle v;
        v=new Car_Class("Bentley");
        v.fuelType="Electrical";
        v.maxSpeed=205;
        v.mileage=100;
        v.setColor("Blue");
        v.print();

        //For make use car functions we have ti typecast V into Car.
        Car_Class c=(Car_Class) v;
        c.printCar();

        c.numberOfTyres();
        c.testDriveTaken();
        c.isCustomized();
    }
}
