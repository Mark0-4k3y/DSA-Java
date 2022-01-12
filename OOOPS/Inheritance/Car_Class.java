package OOOPS.Inheritance;

public class Car_Class extends Vehicle_Class
{
    int numDoors;

    /*
        Here I am making a function same for Car objects.
        This print function is added some functionality to the parent class(Vehicle) print function.
        Here I am performing function overriding.
     */
    public void print()
    {
        super.print();
        System.out.println("Number of doors in car: "+numDoors+"\n");
    }
}
