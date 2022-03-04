package Recursion.Searching_AND_Sorting;

public class Linear_Search
{
    //This is the method to do linear search using the normal or what we did early.
    public static<G> boolean simpleLinearSearch(G arr[], G ele)
    {
        //I made this element variable in case I will have to return the Index instead of boolean
        //G element = null;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==ele){
//                element=arr[i];
                System.out.println("\nThe element "+ele+" present at index: "+i);
                return true;
            }
        }
        return false;
    }



    //This is the function, which use recursion to do linear search
    public static<G> boolean recursiveLinearSearch(G[] arr, G ele, int sI)
    {
        if (sI>=arr.length) return false;

        System.out.println(arr[sI]+" "+ele);
        if (arr[sI]==ele){
            System.out.println("The element "+ele+" present at index "+sI+" in the given array.");
            return true;
        }

        boolean smallPart=recursiveLinearSearch(arr, ele, sI+1);
        return smallPart;
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
        System.out.println("Is the element present in the array?! "+recursiveLinearSearch(arr, 20, 0)+" \n");


        String arrStr[]=new String[26];
        for (int i=0; i<arrStr.length; i++){
            arrStr[i] = "A"+(char)(65+i);
        }
        print(arrStr);
        System.out.println("Is the string present in the array?! "+recursiveLinearSearch(arrStr, "AA", 0));
    }



}
