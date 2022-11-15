package JavaCollection_Framework;
import java.util.HashMap;
import java.util.Set;

public class InbuiltHashMap
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map=new HashMap<>();

        //Inserting key value in map O(1).
        map.put("a", 5);
        map.put("abc", 3);
        map.put("fuck", 9);
        map.put("d", 1);
        //Size function to find the size of the HashMap O(1).
        System.out.println("Size of the HashMap is: "+map.size());

        //Finding presence of the key value pair O(1).
        if (map.containsKey("a")) System.out.println("\nMap contains the key 'a' ");
        if (map.containsKey("b")) System.out.println("Map contains the key 'b' ");
        if (map.containsKey("fuck")) System.out.println("Map contains the key 'fuck' ");
        if (map.containsKey("mark")) System.out.println("Map contains the key 'mark' ");

        //Get the value of the key's O(1).
        if (map.containsKey("a")) System.out.println("\nValue of the key 'a' is: "+map.get("a"));
        if (map.containsKey("fuck")) System.out.println("Value of the key 'fuck' is: "+map.get("fuck"));
        if (map.containsKey("down")) System.out.println("Value of the key 'down' is: "+map.get("down"));
        if (map.containsKey("abc")) System.out.println("Value of the key 'abc' is: "+map.get("abc"));
        //If I does not use if statement before getting an value of the key and the key are emptier than it will give null pointer exception.
        //int value = map.get("keshav");
        //System.out.println("The value of keshav is: "+value);

        //Removing the key from the HashMap O(1).
        map.remove("d");
        map.remove("abc");
        map.remove("toxic");//If the key is not present in HashMap than, nothing will happen.
        System.out.println("\nSize of the HashMap after removing key's: "+map.size());

        //Iterating over the keys in HashMap O(n).
        map.put("hello", 1);
        map.put("Hey", 1);
        map.put("b", 45);
        Set<String> keys = map.keySet();
        System.out.print("\nKeys in HashMap are: ");
        for (String key:keys){
            System.out.print(key+" ");
        }System.out.println("");

        //Find if the HashMap contain the value O(n).
        if (map.containsValue(69)) System.out.println("It contains value of 69");
        if (map.containsValue(9)) System.out.println("It contains value of 9");
    }
}
