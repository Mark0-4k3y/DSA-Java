package OOOPS.Inheritance_multiverse;
import OOOPS.Inheritance.Vehicle_Class;

public class Vehicle_Objects
{
    public static void main(String[] args)
    {

//        Vehicle_Class veh=new Vehicle_Class();
//        veh.setColor("White");
//        veh.mileage=11;
//        veh.maxSpeed=120;
//        veh.fuelType="Diesel";
//        veh.print();
        // Here we can see that these properties are not accessible here, because they are protected.
        //So I make them accessible through a derived class(Truck class)

        Truck_Class truck=new Truck_Class(11, 120, "Diesel");
        truck.setColor("White");
        truck.maxCapacity=1200;
        truck.print();
    }
}
