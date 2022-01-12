package OOOPS.Inheritance;

public class MotorBike_Class extends Vehicle_Class
{
    int numOfSeats;

    /*
       Here I am making a function same for MotorBikes objects.
       This print function is added some functionality to the parent class(Vehicle) print function.
       Here I am performing function overriding.
    */
    public void print()
    {
        super.print();
        System.out.println("Number of seats: "+numOfSeats+"\n");
    }
}
