package HashMaps;
import java.util.HashMap;
public class FirstEleToOccurKtimes
{
    public static int firstElementKTime(int[] arr, int n, int k)
    {
        HashMap<Integer, Integer> hash=new HashMap<>();
        for(int element:arr){
            hash.put(element, hash.getOrDefault(element, 0)+1);
            if(hash.containsKey(element)) if(hash.get(element)>=k) return element;

        }

        return -1;
    }

    public stat
}
