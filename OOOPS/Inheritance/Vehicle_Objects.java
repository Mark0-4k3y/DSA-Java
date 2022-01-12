package OOOPS.Inheritance;

public class Vehicle_Objects
{
    public static void main(String[] args)
    {
        Vehicle_Class veh1=new Vehicle_Class();
        veh1.setColor("White");
        veh1.mileage=11;
        veh1.maxSpeed=120;
        veh1.fuelType="Diesel";
        veh1.print();

        Car_Class car1=new Car_Class();
        car1.numDoors=2;
        car1.fuelType="Electrical";
        car1.maxSpeed=205;
        car1.mileage=100;
        car1.setColor("Blue");
        car1.print();

        MotorBike_Class mBike1=new MotorBike_Class();
        mBike1.fuelType="Petrol";
        mBike1.maxSpeed=180;
        mBike1.numOfSeats=1;
        mBike1.mileage=35;
        mBike1.setColor("Black");
        mBike1.print();


        Bicycle_Class bCycle=new Bicycle_Class();
        bCycle.hasGear=true;
        bCycle.setColor("Red and Black");
        bCycle.print();
    }
}
