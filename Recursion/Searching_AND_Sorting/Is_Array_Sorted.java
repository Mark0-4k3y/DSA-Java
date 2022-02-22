package Recursion.Searching_AND_Sorting;
import java.util.Scanner;

public class Is_Array_Sorted extends Array_Class
{
    public static Scanner X=new Scanner(System.in);


    //Solving the question using brute force.
    public static boolean isSortBF(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }

    //Solving the question using recursion.
    public static boolean isSortR(int[] arr)
    {
        if(arr.length==0){
            System.out.println("No Array Exist, So it's already sorted ;) ");
            return true;
        }
        if(arr.length==1) return true;

        //Creating a smaller array for passing into the function.
        int[] newArray = new int[arr.length-1];
        for(int i=0; i<arr.length-1; i++){
            newArray[i]=arr[i+1];
        }

        //Assumed that it will return answer for the smaller Array.
        boolean isSmallSort=isSortR(newArray);
        if (!isSmallSort) return false;
        //The reason for writing the upper is to take answer from the smaller part also.
        //If I does not take answer from smaller part than, it will only return answer to its respective turn function operation.

        //Giving the result on the simple case
//        System.out.println(arr[0]+" "+arr[1]+" difference: "+(arr[0]<arr[1]));
        if(arr[0]<arr[1])return true;
        else return false;
    }

    //Solving the question without using recursion, but doesn't create a new array.
    public static boolean isSort(int[] arr, int sI)
    {
        //In this one I will also take starting Index "sI" as Input.

        if(arr.length==0){
            System.out.println("No Array Exist, So it's already sorted ;) ");
            return true;
        }
        if(sI>=arr.length-1) return true;

        //First checking whether the first one element are sorted to avoid extra work, if they are not.
        if (arr[sI]>arr[sI+1]) return false;

        //Generating the smaller part answer.
        boolean isSorted=isSort(arr, sI+1);

        //Returning the answer which is depending on the rest of the array.
        return isSorted;
    }

    public static void main(String[] args)
    {
        int[] arr=Array_Class();
        printArray(arr);
        System.out.println("Is the array sorted?! "+isSort(arr, 0));
    }

}

