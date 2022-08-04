package Recursion;
import Recursion.Searching_AND_Sorting.Array_Class;
import java.util.Scanner;

public class All_Index_Of_An_Element extends Array_Class
{
    public static void all_Indexs(int[] arr, int si, int ele)
    {
        if (si>=arr.length) return;

        if(arr[si]==ele) System.out.print(si+" ");

        all_Indexs(arr, si+1, ele);
    }


    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        int[] arr=Array_Class();
        printArray(arr);

        System.out.println("Enter the element for find it's index in given array: ");
        int ele=X.nextInt();

        all_Indexs(arr, 0, ele);
    }
}
