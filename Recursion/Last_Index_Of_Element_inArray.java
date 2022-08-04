package Recursion;
import Recursion.Searching_AND_Sorting.Array_Class;
import java.util.Scanner;

public class Last_Index_Of_Element_inArray extends Array_Class
{
    //Finding the last index of the array using last Index pointer.
    public static int findLastIndex_1(int[] arr, int li, int ele)
    {
        if(li<0) return -1;
        if(arr[li]==ele) return li;
        return findLastIndex_1(arr, li-1, ele);
    }

    //Finding last index using Start Index pointer.
    public static int findLastIndex_2(int[] arr, int si, int ele) {
        if (si == arr.length) return -1;

        int forwardCheck = findLastIndex_2(arr, si + 1, ele);
        //When the element is already found in forward array.
        if (forwardCheck != -1) return forwardCheck;
            //When the element not found in forward array.
        else {
            if (arr[si] == ele) return si;
            else return forwardCheck;
        }
    }

    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        int[] arr=Array_Class();
        printArray(arr);

        System.out.println("Enter the element to find it's last index in the array: ");
        int ele=X.nextInt();

        System.out.println("The last index of the given element "+ele+" is: "+findLastIndex_2(arr, 0, ele));
    }
}
