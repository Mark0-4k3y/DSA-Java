package Complexity_Analysis;
import Recursion.Searching_AND_Sorting.Array_Class;
import java.util.Arrays;
public class Array_Intersection extends Array_Class
{
    //This method has complexity O(mlogm + nlogn) where m and n are size of the arrays.
    public static void intersection(int[] arr1, int[] arr2)
    {
        if(arr1.length<=0) return;
        if(arr2.length<=0) return;


        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int p1=0;
        int p2=0;

        while(p1<arr1.length && p2<arr2.length){
            if(arr1[p1]<arr2[p2]){
                p1++;
            }else if(arr1[p1]>arr2[p2]){
                p2++;
            }else{
                System.out.print(arr1[p1]+" ");
                p1++;
                p2++;
            }
        }

    }


    //The another method to solve this is by sort the smallest array and than apply binary search.
    public static void intersectionB(int[] arr1, int[] arr2)
    {
        if(arr1.length==0 || arr2.length==0) return;

        //Comparing the length of both the arrays for sorting the smallest one.
        int len1=arr1.length, len2=arr2.length;
        if (arr1.length>arr2.length){
            Arrays.sort(arr2);
        }else{
            Arrays.sort(arr1);
        }

        //Now applying binary search on the arrays.

    }

// public class Solution
// {
// // 	public static void intersection(int[] arr1, int[] arr2)
// //     {
// // 		Arrays.sort(arr1);
// //         Arrays.sort(arr2);

// //         int i=0, j=0;
// //         while(i<arr1.length && j<arr2.length){
// //             if(arr1[i]>arr2[j]) {
// //                 j++;
// //             }else if(arr1[i]<arr2[j]){
// //                 i++;
// //             }else{
// //                 System.out.print(arr1[i]+" ");
// //                 i++;
// //                 j++;

// //             }
// //         }
// // 	}


//     public static void intersection(int[] arr1, int[] arr2)
//     {
//         if(arr1.length>arr2.length){
//             Arrays.sort(arr2);
//             for(int i=0; i<arr2.length; i++){

//             }
//         }else{
//             Arrays.sort(arr1);
//         }
//     }
// }
// //Also do binary search here buddy!
// //Sort the second one array and then make the search pssole through it:>

    public static void main(String[] args)
    {
        int[] arr= Array_Class();
        int[] arr1=Array_Class();
        printArray(arr);
        printArray(arr1);
        intersection(arr, arr1);
    }
}
