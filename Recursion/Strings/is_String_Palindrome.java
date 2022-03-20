package Recursion.Strings;
import java.util.Scanner;

public class is_String_Palindrome
{
    //Function to find whether the string is palindrome or not without using recursion.
    public static boolean isPalindromeBF(String str)
    {
        if (str.length()<=1) return true;

        int sI=0, eI=str.length()-1;

        while(sI!=eI || sI>eI){
            if (str.charAt(sI)!=str.charAt(eI)){
                return false;
            }
            sI++;
            eI--;
        }
        return true;
    }


    //Function to check whether the string is palindrome or not with using recursion.
    public static boolean isPalindrome(String str)
    {
        if (str.length()<=1) return true;

        boolean isSubPalindrome=isPalindrome(str.substring(1, str.length()-1));
        boolean isPalindrome=false;
        if (str.charAt(0)==str.charAt(str.length()-1)) isPalindrome=true;

        return isPalindrome && isSubPalindrome;
    }
}
