package Regex;
import java.util.Scanner;
import java.util.regex.*;
public class MatchingStartAndEnd
{
    // ^:The ^ symbol matches the position at the start of a string.
    //$: The $ symbol matches the position at the end of a string.

    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        String str=X.nextLine();

        Pattern regex=Pattern.compile("^\\d\\w{4}\\.$");
        Matcher match=regex.matcher(str);

        if(match.find()) System.out.println(true);
        else System.out.println(false);
    }
}
