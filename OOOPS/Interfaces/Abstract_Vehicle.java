package OOOPS.Interfaces;
import java.util.Objects;

/*
    An abstract class is the class which contain abstract function or method in it.
    An abstract method is a method which has only declaration part, but not implemented.
    They are also known as incomplete functions/methods or incomplete classes.
    We use abstract keyword to declare these classes or methods/functions.

    We cannot create any object from the abstract class because it is incomplete, but what we can make is only reference to make object in subclasses.

    Abstraction help us to make force the subclass of the abstract class to implement some function.
 */



public abstract class Abstract_Vehicle
{
    //Here are some common properties which are common in all vehicles:
    protected int maxSpeed;
    protected int mileage;
    protected String companyName;
    private String color;
    protected String fuelType;

    //Here I will make a constructor for the Abstract vehicle class
    //I cannot be able to make object from this abstract class but, abstract class has print function which have vehicle name in it.
    //So we have to take ot from the subclasses we will make.
    public Abstract_Vehicle(String vehicleName)
    {
        this.companyName=vehicleName;
    }

    protected Abstract_Vehicle() {
    }


    //Here I am declare an abstract function, which will make this class an abstract class.
     public abstract void abstract_CompanyName();


    //Here I will make a print function which will print the properties of the vehicle
    //Here I make the final function as final, so not any subclass can override it.
    public final void print()
    {
        System.out.println("The vehicle has following properties:\nCompany: "+companyName+"\nMax/Top Speed: "+maxSpeed+"km/hr\nColor of the vehicle is: "+color);
        if (Objects.equals(fuelType, "Electrical") || Objects.equals(fuelType, "Electricity") || fuelType == "E" || fuelType == "EV"){
            System.out.println("Fuel Type: "+fuelType+"\nMileage: "+mileage+"km/After full charging!\n");
            //fuelType=="Electrical" || fuelType=="Electricity"
        }else{
            System.out.println("Fuel Type: "+fuelType+"\nMileage: "+mileage+"km/L\n");
        }
    }



    //Here I will make an getter function to get the color
    public String getColor()
    {
        return color;
    }
    //Here is the function to set the color
    public void setColor(String color)
    {
        this.color=color;
    }
}
