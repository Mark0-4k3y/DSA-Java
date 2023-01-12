package Regex;
import java.io.*;
import java.util.*;
import java.util.regex.*;
public class MatchingSpecifString
{
    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        String str=X.nextLine();
        int count=0;

        //By creating a String Array.
        // String[] strArray=str.split(" ");
        // for(String ele:strArray){
        //     // if(ele.equals("hackerrank")) count++;
        //     if(Pattern.matches("hackerrank", ele)) count++;
        // }System.out.println("Number of matches : "+count);

        //Without creating an Array.

        // Create a pattern to be searched
        // Custom pattern
        Pattern regex=Pattern.compile("hackerrank");

        // Search above pattern in the input.
        Matcher match=regex.matcher(str);

        // Finding string using find() method
        while(match.find()) count++;

        System.out.println("Number of matches : "+count);
    }
}
