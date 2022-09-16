package Recursion.Searching_AND_Sorting;
import java.util.Scanner;

public class Array_Class
{

    public static Scanner X=new Scanner(System.in);

    //Function to create an array and take inputs of it's elements:
    public static int[] Array_Class()
    {
        System.out.println("Enter the length of the array: ");
        int n=X.nextInt();
        int arr[]=new int[n];


        for(int i=0; i<arr.length; i++){
            System.out.println("Enter the "+(i+1)+" Element in the array: ");
            arr[i]=X.nextInt();
        }
        return arr;
    }

    //Function to print the elements in the array
    public static void printArray(int[] arr)
    {
        System.out.print("[ ");
        for(int ele:arr) System.out.print(ele+" ");
        System.out.print("]\n");
    }


    //Function to return the largest element in the array:
    public static int larELe(int[] arr)
    {
        int lar=Integer.MIN_VALUE;
        for(int ele:arr){
            if(ele>lar) lar=ele;
        }
        return lar;
    }
}
