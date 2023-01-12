package Regex;
import java.util.Scanner;
import java.util.regex.*;
public class MatchingWordAndNonWordCharacter
{
    /*
        \w: The expression \w will match any word character.
        Word characters include alphanumeric characters (a-z, A- Z and 0-9) and underscores (_). */


    /*
        \W: The expression \w will match any non word character.
        Word characters excludes alphanumeric characters (a-z, A- Z and 0-9) and underscores (_). */


    public static void main(String[] args)
    {
        String str="http://www.wikipedia.com.http://www.hackerrank.com";

        Pattern regex=Pattern.compile("\\w{3}\\W\\w{10}\\W\\w{3}");
        Matcher match=regex.matcher(str);

        if(match.find()) System.out.println(true);
        else System.out.println(false);
    }
}
