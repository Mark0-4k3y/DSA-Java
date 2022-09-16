package Stack;
import java.util.*;

public class RedundantParenthesis
{
    public static boolean isRedundantParenthesis(String expression)
    {
        int strLen=expression.length();

        int index=0;
        Stack<Character> stack=new Stack<>();
        while (index<strLen){
            if (expression.charAt(index) != ')') stack.push(expression.charAt(index));
            else{
                if (stack.isEmpty()) return true;
                int count=0;
                while(stack.pop() != '(') {
                    count++;
                }
                if (count == 0) return true;
            }
            index++;
        }

        return false;
    }


    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        System.out.println("Enter the expression");
        String str=X.nextLine();

        System.out.println("is this expression has redundant brackets?? "+isRedundantParenthesis(str));
    }
}
