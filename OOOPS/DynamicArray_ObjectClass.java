package OOOPS;

public class DynamicArray_ObjectClass
{
    public static void main(String[] args)
    {
        DynamicArray_class arr1=new DynamicArray_class();

        for(int i=1; i<=50; i++){
            arr1.addEle(i);
        }
        arr1.print();
        arr1.sizeDataSet();

        arr1.getELe(48);

        arr1.setEle(26, 99);
        arr1.getELe(100);
        arr1.print();
        arr1.sizeDataSet();


        arr1.removeLast();
        arr1.print();
        arr1.sizeDataSet();
    }
}
