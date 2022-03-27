package Complexity_Analysis;
import Recursion.Searching_AND_Sorting.Array_Class;
import java.util.Arrays;
public class Duplicate_InArray extends Array_Class
{
    //It has time complexity of O(n).
    //But not suitable for all cases.
    public static int findDuplicate(int[] arr)
    {
        if(arr.length<=1) return -1;

        int sumOfTwo=0;
        for(int i=0; i<(arr.length-1); i++)
        {
            sumOfTwo+=arr[i];
        }

        int sumOfAll=0;
        for(int i=0; i<arr.length; i++){
            sumOfAll+=arr[i];
        }

        return(sumOfAll-sumOfTwo);
    }



    //This has time complexity of O(nlogn).
    //But it is suitable for all test cases.
    public static int findDuplicateForAll(int[] arr)
     {
         if(arr.length<=1) return -1;

         Arrays.sort(arr);

         for(int ind=0; ind<arr.length-1; ind++){
             if(arr[ind]==arr[ind+1]) return arr[ind];
         }
         return -1;
 	}


    public static void main(String[] args)
    {
        int[] arr=Array_Class();
        printArray(arr);
        System.out.println("The duplicate element in the array is: "+findDuplicateForAll(arr));
    }
}
