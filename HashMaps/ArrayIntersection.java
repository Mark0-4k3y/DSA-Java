package HashMaps;
import java.util.HashMap;
public class ArrayIntersection
{
    public static void printIntersection(int[] arr1,int[] arr2)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int element : arr1){
            map.put(element, map.getOrDefault(element, 0)+1);
        }

        for(int element : arr2){
            if(map.containsKey(element) && map.get(element)>0){
                System.out.println(element);
                map.put(element, map.get(element)-1);
            }
        }
    }

    public static void main(String[] args)
    {
        int arr1[] = {2, 6, 8, 5, 4, 3};
        int arr2[] = {2, 3, 4, 7};
        printIntersection(arr1, arr2);
    }
}
