package Complexity_Analysis;
import Recursion.Searching_AND_Sorting.Array_Class;

import java.util.Arrays;
import java.util.Scanner;
public class Rotate_Array extends Array_Class
{
    //The best method to do this is by reverse the arrays.
    public static void rotateB(int[] arr, int d)
    {
        if(arr.length<=1 || d==arr.length) return;

        //If D is greater than arr.length.
        if (d>arr.length){
            d %= arr.length;
        }
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, (arr.length-1)-d);
        reverse(arr, arr.length-d, arr.length-1);
    }
    private static void reverse(int[] arr, int sI, int eI)
    {
        while(sI<eI){
            swapElements(arr, sI, eI);
            sI += 1;
            eI -= 1;
        }
    }
    private static void swapElements(int[]arr, int sI, int eI)
    {
        int temp=arr[sI];
        arr[sI]=arr[eI];
        arr[eI]=temp;
    }



    //The another method is to create a small array which will store first n-d elements.
    public static void rotate(int[] arr, int d)
    {
        if(arr.length<=1 || d==arr.length) return;

        //If D is greater than arr.length.
        if (d>arr.length){
            d %= arr.length;
        }

        //Copying first elements to the new Array.
        int[] newArr=new int[d];
        for(int i=0; i<newArr.length; i++){
            // System.out.println(newArr.length);
            newArr[i]=arr[i];
        }

        //Shifting the elements to the left of the array.
        for(int i=d; i<arr.length; i++){
            arr[i-d]=arr[i];
        }

        //Copying the first elements to the last.
        int ind=0;
        for(int i=arr.length-d; i<arr.length; i++){
            arr[i]=newArr[ind];
            // System.out.println(newArr[ind]);
            ind++;
        }
    }


    //This method has many test cases time issues.
    public static void rotateW(int[] arr, int d)
    {
        if(arr.length<=1) return;
        if(arr.length==d) return;

        for(int i=0; i<d; i++) shiftByOne(arr);
    }
    public static void shiftByOne(int[] arr)
    {
        int firstEle=arr[0];
        for(int i=0; i<arr.length-1; i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=firstEle;
    }



    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        int[] arr=Array_Class();
        System.out.println("Enter the number by which rotation will occur: ");
        int d=X.nextInt();
        printArray(arr);
        rotateB(arr, d);
        printArray(arr);
    }
}
