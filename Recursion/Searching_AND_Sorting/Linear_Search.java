package Recursion.Searching_AND_Sorting;

import java.lang.reflect.Array;

public class Linear_Search
{
    //This is the method to do linear search using the normal or what we did early.
    public static<G> boolean simpleLinearSearch(G arr[], G ele)
    {
        for(int i=0; i<arr.length; i++){
            if(arr[i]==ele){
                System.out.println("\nThe element "+ele+" present at index: "+i);
                return true;
            }
        }
        return false;
    }

    //This is the function, which use recursion to do linear search
    public static<G> boolean recursiveLinearSearch(G[] arr, G ele)
    {
        return true;
    }

    public static<G> void print(G arr[])
    {
        System.out.print("["+arr[0]);
        for(G ele:arr){
            if(arr[0]==ele) continue;
            System.out.print(" "+ele);
        }System.out.print("]\n");
    }


    public static void main(String[] args)
    {
        Integer arr[]=new Integer[20];
        for(int i=0; i<arr.length; i++){
            arr[i]=i*10;
        }
        System.out.println("Is the element present in the array?! "+simpleLinearSearch(arr, 20));


        String arrStr[]=new String[26];
        for (int i=0; i<arrStr.length; i++){
            arrStr[i] = "A"+(char)(65+i);
        }
        print(arrStr);
        System.out.println("Is the string present in the array?! "+simpleLinearSearch(arrStr, "AB"));
    }



}
