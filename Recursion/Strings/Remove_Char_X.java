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

        if (str.charAt(0)=='x') return smallStr;
        else return str.charAt(0)+smallStr;
    }


    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=X.nextLine();
        System.out.println("Enter the char you want to remove from the string "+str);
        char x=X.nextLine().charAt(0);

        System.out.println("The string after removing the char "+x+" is: "+removeCharR(str,x));
    }
}
