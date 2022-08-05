package Recursion.Strings;
import java.util.Scanner;
public class Remove_Char_X
{
    //This is the method to remove the character from the String using iteration.
    public static String removeCharBF(String str, char x)
    {
        if (str.length()==0) return str;

        String newString="";
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i)=='x') continue;
            newString += str.charAt(i);
        }
        return newString;
    }


    //This is the method to remove the character using recursion approach.
    public static String removeCharR(String str, char x)
    {
        if (str.length()==0) return str;

        //Calling recursive process on small String.
        String smallStr=removeCharR(str.substring(1), x);

        if (str.charAt(0)==x) return smallStr;
        else return str.charAt(0)+smallStr;
    }


    //Given an input string S and two characters c1 and c2.
    //I need to replace every occurrence of character c1 with character c2 in the given string.
    public static String replaceChar(String str, char c1, char c2)
    {
        if (str.length()==0) return str;

        String smallStr=replaceChar(str.substring(1), c1, c2);

        if(str.charAt(0)==c1) return c2+smallStr;
        else return str.charAt(0)+smallStr;
    }



    //In this I have to replace the pi char from the String to 3.14
    public static String replacePie(String str)
    {
        if (str.length()<=1) return str;

        if (str.charAt(0)=='p' && str.charAt(1)=='i')
        {
            String smallStr=replacePie(str.substring(2));
            return "3.14"+smallStr;
        }else{
            String smallStr=replacePie(str.substring(1));
            return str.charAt(0)+smallStr;
        }
    }



    //Given a string S, remove consecutive duplicates from it recursively.
    public static String removeConsecutive(String str)
    {
        if (str.length()<=1) return str;

        if (str.charAt(0)==str.charAt(1)){
            return removeConsecutive(str.substring(1));
        }else{
            return str.charAt(0)+removeConsecutive(str.substring(1));
        }
    }




    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=X.nextLine();
//        System.out.println("Enter the char you want to remove from the string "+str);
//        char x=X.nextLine().charAt(0);

//        System.out.println("The string after removing the char "+x+" is: "+removeCharR(str,x));

//        System.out.println("Enter the char which you want to replace in place of char "+x+": ");
//        char y=X.nextLine().charAt(0);
//        System.out.println("The string after replacing the char "+x+" with char "+"y is: "+replaceChar(str, x, y));

//        System.out.println("The string after replacing the value of pi with 3.14 is: "+replacePie(str));
//        System.out.println("The string after replacing the consecutive duplicates is: "+removeConsecutive(str));
//        System.out.println("Remove X from string "+str+": "+removeX(str));
    }

    //Practice Code:
    public static String removeX(String str)
    {
        if(str.length()<=0) return str;

        if(str.charAt(0)=='x') return removeX(str.substring(1, str.length()));
        else return str.charAt(0) + removeX(str.substring(1, str.length()));
    }
}

