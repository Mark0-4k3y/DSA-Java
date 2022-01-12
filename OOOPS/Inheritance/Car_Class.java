package OOOPS.Inheritance;

public class Car_Class extends Vehicle_Class
{
    int numDoors=4;

    //Here I am making a Car constructor which will define the constructor
    public Car_Class(){
        //Here I used super to insert the value in the vehicle constructor.
        //Because by default the first constructor called is vehicle constructor.
        //After than the car constructor has been called.
        super("Car");
        System.out.println("Car Services ");
    }


    /*
        Here I am making a function same for Car objects.
        This print function is added some functionality to the parent class(Vehicle) print function.
        Here I am performing function overriding.
     */

    //The Super keyword is used to indicate something which is present in Parent's class.
    public void print()
    {
        //Here we can see that in the derived class I called the parent's class function.
        super.print();
        System.out.println("Number of doors in car: "+numDoors+"\n");
    }
}
