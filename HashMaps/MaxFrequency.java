package HashMaps;
import java.util.HashMap;
import java.util.Set;
public class MaxFrequency
{
    public static int maxFrequencyNumber(int[] arr)
    {
        if (arr.length <= 0) return Integer.MIN_VALUE;

        HashMap<Integer, Integer> map=new HashMap<>();
        for(int element : arr){
            if(map.containsKey(element)){
                map.put(element, map.get(element) + 1);
            }else{
                map.put(element, 1);
            }
        }

        int maxFrequency = 0, maxFrequencyEle = Integer.MIN_VALUE;
        // Set<Integer> keys=map.keySet();
        // for(int key : keys){
        // 	int frequency=map.get(key);
        // 	if(frequency > maxFrequency){
        // 		maxFrequency = frequency;
        // 		maxFrequencyEle = key;
        // 	}    Two cases were wrong by using set.
        // }
        for(int key:arr){
            int frequency=map.get(key);
            if(frequency > maxFrequency){
                maxFrequency = frequency;
                maxFrequencyEle = key;
            }
        }

        return maxFrequencyEle;
    }
}
