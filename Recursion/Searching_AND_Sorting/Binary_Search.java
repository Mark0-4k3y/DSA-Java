package Recursion.Searching_AND_Sorting;
import java.util.Scanner;

public class Binary_Search extends Array_Class
{
    //Doing Binary Search using the iterative approach.
    public static int binarySearchBF(int[] arr, int ele)
    {
        if (arr.length==0){
            System.out.println("The array is null ;*");
            return -1;
        }

        int sI=0, eI=arr.length-1;
        while (true){
            if (sI>eI) break;
            int mI=(sI+eI)/2;

            if (arr[mI]==ele){
                System.out.println("The element "+ele+" present at index "+mI+" in the given array.");
                return mI;
            }else if (arr[mI]>ele){
                //Then update end Index endIndex=MidIndex-1;
                eI=mI-1;
            }else{
                //In this case the element is greater than the element which is present at the mid.
                sI=mI+1;
            }
        }

        return -1;
    }


    //Doing the Binary Search using recursion.
    public static int binarySearchR(int[] arr, int ele)
    {
        if (arr.length==0){
            System.out.println("The array is null ;*");
            return -1;
        }
        return binarySearchH(arr, ele, 0, arr.length-1);
    }
    //Helper Function
    public static int binarySearchH(int[] arr, int ele, int sI, int eI)
    {
        if (sI>eI) return -1;

        int mI=(sI+eI)/2;
        if (arr[mI]==ele){
            System.out.println("The element "+ele+" present at index "+mI+" in the given array.");
            return mI;
        }else if (arr[mI]>ele){
            eI=mI-1;
            return binarySearchH(arr, ele, sI, eI);
        }else{
            sI=mI+1;
            return binarySearchH(arr, ele, sI, eI);
        }
    }



    public static void main(String[] args)
    {
        int[] arr=Array_Class();
        printArray(arr);
        System.out.println("Enter the element you want to find in the array: ");
        int ele=X.nextInt();
        System.out.println(binarySearchR(arr,ele));
    }
}
