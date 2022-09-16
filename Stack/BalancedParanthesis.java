package Stack;
import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis
{
    public static boolean isParenthesisBalanced(String expression)
    {
        Stack<Character> stack=new Stack<>();
        int strLen=expression.length();
        if (strLen<=1) return false;

        int index=0;
        while(index < strLen){
            if ((expression.charAt(index) == '(') ||
                    (expression.charAt(index) == '[') ||
                    (expression.charAt(index) == '{')) {
                stack.push(expression.charAt(index));
            }
            else{
                if (stack.isEmpty()) return false;
                char chr=expression.charAt(index);
                char stackChr=stack.peek();
                if (chr==')' && stackChr=='(') stack.pop();
                else if (chr==']' && stackChr=='[') stack.pop();
                else if (chr=='}' && stackChr=='{') stack.pop();
                else return false;
            }
            index++;
        }
    return stack.isEmpty();
    }


    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        System.out.println("Enter the expression");
        String str=X.nextLine();

        System.out.println("Are parenthesis balanced in given expression? "+isParenthesisBalanced(str));
    }
}
