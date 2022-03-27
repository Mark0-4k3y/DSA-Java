package Complexity_Analysis;
import Recursion.Searching_AND_Sorting.Array_Class;
import java.util.Arrays;

public class Unique_Element extends Array_Class
{
    //This is the best approach to find unique using XOR.
    //Complexity will be O(n).
    public static int findUniqueB(int[] arr)
    {
        if(arr.length==1) return arr[0];
        if(arr.length<=0) return -1;

        //Using Xor Approach the complexity will be O(n).
        int xor=0;
        for(int ele:arr){
            xor = xor^ele;
        }

        return xor;
    }

 	public static int findUnique(int[] arr)
    {
         Arrays.sort(arr);
 	    // int ele=uniEle(arr, 0);
 	    // return ele;

         if(arr.length==1) return arr[0];

         for(int i=0; i<arr.length-1; i+=2){
             if(arr[i]!=arr[i+1]) return arr[i];
             //if the condition is not true than I have to update i value by 2
         }

         return arr[arr.length-1];
 	}

     //Recursive function to find the unique element
     public static int uniEle(int[] arr, int si)
     {
         	if(arr.length==1 || si>arr.length-1) return arr[arr.length-1];

          if(arr[si]!=arr[si+1]) return arr[si];

          si+=2;
          int smallArr=uniEle(arr, si);
          return smallArr;
      }


      public static void main(String args[])
      {
          int[] arr= Array_Class();
          printArray(arr);
          System.out.println("The unique element is: "+findUniqueB(arr));
      }
}
