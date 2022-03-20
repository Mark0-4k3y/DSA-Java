package Recursion.Searching_AND_Sorting;
import java.util.Scanner;

public class Quick_Sort extends Array_Class
{
    public static void quickSort(int[] arr)
    {
        if(arr.length==0) return;
        quickSort(arr, 0, arr.length-1);
    }
    public static void quickSort(int[] arr, int sI, int eI)
    {
        if(sI>=eI) return;

        int placedInd = partition(arr, sI, eI);
        quickSort(arr, sI, placedInd-1);
        quickSort(arr, placedInd+1, eI);
    }
    private static int partition(int[] arr, int sI, int eI)
    {

        //Placing the starting element at its correct position.
        int placedInd = 0;
        int pivot=arr[sI];
        for(int i=sI+1; i<=eI; i++){
            if(arr[i]<=pivot) placedInd++;
        }
        int pivotIndex = placedInd+sI;
        int temp=arr[pivotIndex];
        arr[pivotIndex]=arr[sI];
        arr[sI]=temp;

        //Now arranging the elements into two parts smaller than arr[0] and greater than arr[0].

        int leftEle=sI; //Elements in the left of arr[placedInd] element.
        int rightEle=eI; //Elements in the right of arr[placedInd] element.
        while(leftEle<pivotIndex && rightEle>pivotIndex){
            if (arr[leftEle]<pivot) {
                leftEle++;
            }else if (arr[rightEle]>pivot){
                rightEle--;
            }else{
                temp = arr[leftEle];
                arr[leftEle]=arr[rightEle];
                arr[rightEle]=temp;
                leftEle++;
                rightEle--;
            }
        }

        return pivotIndex;
     }

    /**
     * The Mistake I was doing is that is partition function I was assuming that pivot Index is from 0th index.
     * But it should be from sI.
     * The another mistake I was doing is not to handle the elements which is equal to pivot element
     * @param args
     */

    public static void main(String[] args)
    {
        int[] arr=Array_Class();
        printArray(arr);
        quickSort(arr);
        printArray(arr);
    }
}
