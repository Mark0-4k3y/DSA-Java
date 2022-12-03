package HashMaps;
import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;
public class ExtractUniqueCharacters
{
    public static String extractUniqueChars(String str)
    {
        if (str.length()<=1) return str;

        HashMap<Character, Integer> map=new HashMap<>();
        String newStr="";
        for(int position=0; position<str.length(); position++){
            char key=str.charAt(position);
            if (map.containsKey(key)) continue;
            map.put(key,1);
            newStr+=key;
        }



//        This is another method, but it would not return the answer in its original sequence.
//        for(int position=0; position<str.length(); position++){
//            char key=str.charAt(position);
//            map.put(key, 0);
//        }
//        Set<Character> keys=map.keySet();
//        String newStr="";
//        for (char key:keys){
//            newStr += key;
//        }

        return newStr;
    }

    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        String str=X.nextLine();
        System.out.println("String after extract the unique characters: "+extractUniqueChars(str));
    }
}
