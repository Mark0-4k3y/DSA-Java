package HashMaps;

public class MapUse
{
    public static void main(String[] args)
    {
        Map<String, Integer> map=new Map<>();
        for(int i=0; i<20; i++){
            map.insert("abc"+i, i+1);
            System.out.println(map.loadFactor());
        }System.out.println("\n");

        map.removeKeyValue("abc3");
        map.removeKeyValue("abc7");
        for(int i=0; i<20; i++){
            System.out.println("abc"+i+": "+map.getValue("abc"+i));
        }
    }
}
