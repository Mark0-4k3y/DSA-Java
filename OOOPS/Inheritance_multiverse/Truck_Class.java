package OOOPS.Inheritance_multiverse;
import OOOPS.Inheritance.Vehicle_Class;

public class Truck_Class extends Vehicle_Class
{
    int maxCapacity;

    public Truck_Class(int mileage, int maxSpeed, String fuelType)
    {
        this.mileage=mileage;
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
        System.out.println("Truck's Constructor");
    }

    public void print()
    {
        super.print();
        System.out.println("Maximum capacity for load is: "+maxCapacity+"kg");
    }
}
