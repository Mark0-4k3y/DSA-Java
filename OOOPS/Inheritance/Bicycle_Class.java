package OOOPS.Inheritance;

public class Bicycle_Class extends Vehicle_Class
{
    boolean hasGear;

     /*
        Here I am making a function same for Bicycle objects.
        This print function is added some functionality to the parent class(Vehicle) print function.
        Here I am performing function overriding.
     */
    public void print()
    {
        System.out.println("\nThe vehicle has following properties:\nCompany: "+companyName+"\nColor: "+getColor()+"\nAre gears present in the bicycle?! "+hasGear+"\n");
    }
}
