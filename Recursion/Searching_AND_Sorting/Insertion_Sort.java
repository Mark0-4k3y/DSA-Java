package Recursion.Searching_AND_Sorting;

public class Insertion_Sort extends Array_Class
{
    //This is the shifting function which will shift the function by one till the index given
    public static void shiftByOne(int[] arr, int sI, int eI)
    {
        if (arr.length<=1) return;
        int temp=arr[eI];
        for (int i=eI; i>sI; i--){
            arr[i]=arr[i-1];
        }
        arr[sI]=temp;
    }

    //This is the function of Insertion Sort without using recursion.
    public static void insertionSortBf(int[] arr)
    {
        if (arr.length<=1) return;

        for (int index=1; index<arr.length; index++){
            for (int backInd=0; backInd<index; backInd++){
                if (arr[index]<arr[backInd]){
                    shiftByOne(arr, backInd, index);
                }
            }
        }
    }


    //Doing Insertion sort without using any shifting functions
    public static void insertionSortWS(int[] arr)
    {
        if (arr.length<=1) return;

        for (int i=1; i<arr.length; i++){

            int ele=arr[i];
            int j=i-1;
            //In this we are doing shifting with comparing on same time.
            while(j>=0 && arr[j]>ele){
                arr[j+1]=arr[j];
                arr[j]=ele;
                j--;
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr=Array_Class();
        printArray(arr);
        insertionSortWS(arr);
        printArray(arr);
    }
}
