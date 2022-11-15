package HashMaps;
import java.util.ArrayList;
import java.util.HashMap;

public class RemovingDuplicates
{
    public static void main(String[] args)
    {
        int[] arr={1, 2, 3, 4, 1, 1, 6, 7, 2, 4, 4, 4, 5};
        ArrayList<Integer> arrList=removeDuplicates(arr);
        System.out.println(arrList);
    }

    private static ArrayList<Integer> removeDuplicates(int[] arr)
    {
        ArrayList<Integer> arrList=new ArrayList<>();

        HashMap<Integer, Boolean> map=new HashMap<>();
        for (int elements : arr){
            if (map.containsKey(elements)) continue;
            arrList.add(elements);
            map.put(elements, true);
        }

        return arrList;
    }
}
