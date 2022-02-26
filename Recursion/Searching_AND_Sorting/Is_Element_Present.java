package Recursion.Searching_AND_Sorting;

import OOOPS.Generics.Pair;

public class Is_Element_Present extends Array_Class
{
    //Finding the element using Brute Force:
    public static boolean isElePreBF(int[] arr, int num)
    {
        for(int ele=0; ele<arr.length; ele++){
            if(arr[ele]==num) return true;
        }
        return false;
    }

    //Finding the element using recursion and by creating a second array:
    public static boolean isElePreR(int[] arr, int num)
    {
        //Base Case
        if(arr.length==0) return false;

        if(arr[0]==num) return true;
        else{
            int[] newArr=new int[arr.length-1];
            for(int i=0; i<newArr.length; i++){
                newArr[i]=arr[i+1];
            }

            return isElePreR(newArr, num);
        }
    }


    //Finding the number using recursion without making a new array:
    public static boolean isElePre(int[] arr, int num, int sI)
    {
        if(sI>=arr.length) return false;

        if (arr[sI]==num) return true;
        else return isElePre(arr, num, sI+1);
    }

    public static void main(String[] args)
    {
        int[] arr=Array_Class();
        printArray(arr);
        System.out.println("Enter the number you want to find out in the array: ");
        int n=X.nextInt();
        System.out.println("Is element "+n+" present in the array?! "+isElePre(arr, n, 0));
    }
}
