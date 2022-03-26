package Complexity_Analysis;
import Recursion.Searching_AND_Sorting.Array_Class;
import java.util.Scanner;

public class Equillibirum_Index extends Array_Class
{
    public static int arrayEquilibriumIndexB(int[] arr)
    {
        //Time complexity is O(n).
        int totalSum=0;
        for(int i=0; i<arr.length; i++){
            totalSum+=arr[i];
        }

        int leftSum=0, rightSum=0;
        for(int i=1; i<arr.length-1; i++){
            leftSum+=arr[i-1];
            rightSum=totalSum-leftSum-arr[i];
            if(leftSum==rightSum) return i;
        }
        return -1;
    }


    //This has more time complexity.
    public static int arrayEquilibriumIndex(int[] arr)
     {
 		if(arr.length<=1) return -1;

         for(int ind=1; ind<arr.length-1; ind++){
             int sum1=0, sum2=0;
             int indL=0, indR=ind+1;

             while(indL<ind){
                 sum1+=arr[indL];
                 indL++;
             }
             while(indR<arr.length){
                 sum2+=arr[indR];
                 indR++;
             }
             if (sum1==sum2) return ind;
         }

         return -1;
     }

    public static void main(String[] args)
    {
        int[] arr= Array_Class();
        printArray(arr);
        int index=arrayEquilibriumIndex(arr);
        System.out.println("The equilibrium Index is: "+index);
    }
}
