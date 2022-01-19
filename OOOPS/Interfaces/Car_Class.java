package OOOPS.Interfaces;

//We can only inherit from one superclass by using the extends keyword
//But we can import as many interface classes as we want to.
//We have to use "Implement" as keyword to implement an interface.

public class Car_Class extends Abstract_Vehicle implements Vehicle,Car
{

    public Car_Class() {
    }
    public Car_Class(String vehicleName) {
        super(vehicleName);
    }



    //Here I have to implement Abstract Company Name function.
    @Override
    public void abstract_CompanyName()
    {
        System.out.println("The vehicle company name is: "+this.companyName);
    }

    //Here I will make a print function, but I can't override the vehicle class print() function.
    //Because I declared the print() function of vehicle class as final.
    public void printCar()
    {
        super.print();
        System.out.print("This car is badass!!\n");
    }

    @Override
    public int numberOfTyres() {
        return 4;
    }

    @Override
    public boolean isCustomized() {
        return false;
    }

    @Override
    public boolean testDriveTaken() {
        return false;
    }
}

