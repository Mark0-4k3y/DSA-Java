package Regex;
import java.util.Scanner;
import java.util.regex.*;
public class MatchingWhitespaceAndNonWhitespaceCharacter
{
    // \s:defines a whitespace character(tab or space).
    // \S:define a non whitespace character.
    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        String str=X.nextLine();

        Pattern regex=Pattern.compile("\\S{2}\\s\\S{2}\\s\\S{2}");
        Matcher match=regex.matcher(str);

        if(match.find()) System.out.println(true);
        else System.out.println(false);
    }
}
