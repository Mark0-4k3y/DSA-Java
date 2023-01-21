package HashMaps;
import java.util.HashMap;
import java.util.Scanner;

public class FirstEleToOccurKtimes
{
    public static int firstElementKTime(int[] arr, int k)
    {
        HashMap<Integer, Integer> hash=new HashMap<>();
        for(int element:arr){
            hash.put(element, hash.getOrDefault(element, 0)+1);
            if(hash.containsKey(element)) if(hash.get(element)>=k) return element;

        }

        return -1;
    }

    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        int arr[]={1, 7, 4, 3, 4, 8, 7};
        System.out.println("Enter the times you want to see: ");
        int times=X.nextInt();
        System.out.println("The first element which occurs k times: "+firstElementKTime(arr, times));
    }
}
