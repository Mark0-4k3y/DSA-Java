package OOOPS.Inheritance;

import java.util.Scanner;

public class Vehicle_Polymorphism
{
    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);

        //Here I created a reference to the vehicle not an object.
        Vehicle_Class vehicle;


        /*
        Here I am performing polymorphism.
        The word polymorphism means having many forms.
        In simple words, we can define polymorphism as the ability of a message to be displayed in more than one form.
        But we can only apply it for parent to child relationship not vice versa.
         */
        System.out.println("What type of vehicle you want?\n1.Machine powered\n2.Man powered\nChoose between 1 and 2");
        int opt=X.nextInt();

        if(opt==1){
            System.out.println("Choose between\n1.Two Wheeler\n2.Four Wheeler\nChoose between 1 and 2");
            int opt2=X.nextInt();

            if(opt2==1) {
                vehicle=new MotorBike_Class();
                vehicle.fuelType="Petrol";
                vehicle.maxSpeed=136;
                vehicle.mileage=35;
            }
            else {
                vehicle=new Car_Class();
                vehicle.fuelType="Diesel";
                vehicle.maxSpeed=225;
                vehicle.mileage=7;
            }
        }else{
            vehicle = new Bicycle_Class();
        }

        //We can only access to the properties of the parent class
        vehicle.setColor("Matte Black");

        /*
            We cannot access to the properties of the child or derived class even though it is respective class object.
            Because in starting we have seen that the vehicle is reference and referring to the object depending on the input of the user.
            So, if we try to access the child class properties it will show compile time error
         */

//        vehicle.numDoors=4;
//        vehicle.numOfSeats=1;
//        vehicle.hasGear=true;

        vehicle.print();
    }
}
