package OOOPS.Generics;

import OOOPS.Inheritance.Vehicle_Class;

public class PrintArray_Generic
{

    //Here I will create a generic function which will print the array
    public static<G> void print(G arr[])
    {
        System.out.print("["+arr[0]);
        for(G ele:arr){
            if(arr[0]==ele) continue;
            System.out.print(" "+ele);
        }System.out.print("]\n");
    }
    //Here I will make a print function which will print all the objects present in the Vehicle class
    //For this I have to make bound of the <G>
    public static <G extends Vehicle_Class> void printVehicle(G arr[])
    {
        System.out.println("[.................................................................\n");
        for(int i=0; i<arr.length; i++){
            arr[i].print();
        }System.out.print("\n...................................................................]\n");
    }

    public static void main(String[] args)
    {
        Integer intArr[]=new Integer[10];
        for(int i=0; i<10; i++){
            intArr[i]=i+1;
        }print(intArr);

        String strArr[]=new String[10];
        for(int i=0; i<10; i++){
            strArr[i]="abc"+(char)i;
        }print(strArr);

        Character charArr[]=new Character[26];
        for(int i=0; i<26; i++){
            charArr[i] = (char)(65+i);
        }print(charArr);

        Vehicle_Class vehicleArr[]=new Vehicle_Class[3];
        for(int i=0; i<3; i++){
            vehicleArr[i] = new Vehicle_Class();
        }print(vehicleArr);
        vehicleArr[0].setColor("White");
        vehicleArr[0].print();


        printVehicle(vehicleArr);
    }
}
