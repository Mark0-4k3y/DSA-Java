package Recursion;
import java.util.Scanner;

public class Check_Palindrome
{
    public static boolean isStringPalindrome(String str)
    {

        if (str.length()<=1) return true;

        boolean isSubPalindrome=isStringPalindrome(str.substring(1, str.length()-1));
        boolean isPalindrome=false;
        if (str.charAt(0)==str.charAt(str.length()-1)) isPalindrome=true;

        return isPalindrome && isSubPalindrome;
    }


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(isStringPalindrome(input));
    }
}







// public class solution
// {
// 	public static boolean isStringPalindrome(String s)
//     {
//         if(s.length()<=1) return true;

//         if(s.charAt(0)!=s.charAt(s.length()-1)) return false;

//         //I was doing a mistake here, find out the mistake :)
//         boolean smallStr=isStringPalindrome(s.substring(1, s.length()-2));

//         return smallStr;

// 	}
// }

// public static boolean isStringPalindrome(String input)
//     {
//         if(input.length() == 0 || input.length() == 1)
//             return true;
//         if(input.charAt(0) == input.charAt(input.length()-1))

//         return isStringPalindrome(input.substring(1, input.length()-1));

//         return false;
//     }
