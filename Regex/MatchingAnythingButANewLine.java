package Regex;
import java.util.*;
import java.util.regex.*;

public class MatchingAnythingButANewLine
{
    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        String str=X.nextLine();

        //^: Starting of the string.
        //$: Ending of the string.
        // \\:used for escaping the .
        Pattern regex=Pattern.compile("^...\\....\\....\\....$");
        Matcher match=regex.matcher(str);
        if(match.find()) System.out.println(true);
        else System.out.println(false);
    }

}
