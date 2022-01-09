package OOOPS;

public class DynamicArray_class
{
    private int index;
    private int[] arr;

    //Constructor for dynamic array class
    public DynamicArray_class()
    {
        arr=new int[5];
        index=0;
    }


    //This is the function which will add new element to the array:
    public void addEle(int n)
    {
        if(index == arr.length) incArray(arr);

        arr[index]=n;
        index++;
    }


    //This is the function which will increase the array when it will be completely filled
    private void incArray(int[] arr)
    {
        int[] newArr=new int[2*arr.length];
        for(int i=0; i<arr.length; i++){
            newArr[i]=arr[i];
        }
        this.arr=newArr;
    }


    //This is the function for printing the array
    public void print()
    {
        //This is the example of hard work after using a lot of brain :|
//        System.out.print("["+arr[0]);
//        for(int ele=0; ele<arr.length; ele++){
//            if(ele==0) continue;
//            if((arr[ele]==0 && arr[ele+1]==0) && arr[ele+2]==0) break;
//            System.out.print(", "+arr[ele]);
//        }System.out.print("]\n");


        //This is the example smart work ;)
        System.out.print("["+arr[0]);
        for(int ele=1; ele<=index; ele++){
            System.out.print(", "+arr[ele]);
        }System.out.print("]\n");
    }

    //This is the function to define the size of the array
    public void sizeDataSet()
    {
        System.out.println("The size of the array is: "+index+"\nAnd the length of the array is: "+this.arr.length);
    }

    //This is the function to get the element from the array at the ith index
    public void getELe(int index)
    {
        if(index > this.index){
            System.out.println("Invalid Index number :x");
            return;
        }
        System.out.println("The element at the "+index+" index is: "+this.arr[index]);
    }

    //This is the function which will set an element "ele" at the given index i:
    public void setEle(int element, int index)
    {
        if(index > this.index) {
            incArray(arr);
            this.index=index+1;
        }
        this.arr[index]=element;
    }

    //This is the function to remove the last element from the array:
    public void removeLast()
    {
        int temp=arr[index-1];
        arr[index-1]=0;
        System.out.println("The last element which has been removed from the array is: "+temp);
    }
}
