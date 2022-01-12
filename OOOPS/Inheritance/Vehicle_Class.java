package OOOPS.Inheritance;

import java.util.Objects;

public class Vehicle_Class
{
    //Here are some common properties which are common in all vehicles:
    int maxSpeed;
    int mileage;
    final String companyName="ASAK";
    private String color;
    String fuelType;

    //I will make these properties inherit by other class of vehicle(Car, MotorBike, and Bicycle).
    //By using the "extend" keyword the child classes(Car, MotorBike, and Bicycle), will inherit the properties from the parent class(Vehicle class).

/*
The subclasses or derived class have their own function which would have same named as base class or parent class function name.
These phenomena of writing same function in child class as in parent class known as function overriding.
Function overriding occurs in Inheritance Relationships between classes.
 */
    //Here I will make a print function which will print the properties of the vehicle
    public void print()
    {
        System.out.println("\nThe vehicle has following properties:\nCompany: "+companyName+"\nMax/Top Speed: "+maxSpeed+"km/hr\nColor of the vehicle is: "+color);
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
