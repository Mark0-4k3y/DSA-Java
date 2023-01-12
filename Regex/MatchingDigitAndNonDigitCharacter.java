package Regex;
import java.util.Scanner;
import java.util.regex.*;
public class MatchingDigitAndNonDigitCharacter
{
    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        String str=X.nextLine();

        Pattern regex=Pattern.compile("\\d{2}\\D\\d{2}\\D\\d{4}");
        Matcher match=regex.matcher(str);

        if(match.find()) System.out.println(true);
        else System.out.println(false);
    }
}
