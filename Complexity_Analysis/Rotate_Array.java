package Complexity_Analysis;
import Recursion.Searching_AND_Sorting.Array_Class;

public class Rotate_Array extends Array_Class
{
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
}
