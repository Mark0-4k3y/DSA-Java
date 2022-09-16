package JavaCollection_Framework;
//import java.util.Stack;
import java.util.*;

public class StackClass
{
    public static void main(String[] args)
    {
        Stack<Integer> stack=new Stack<>();
        Scanner X=new Scanner(System.in);

        System.out.println("Enter the element you want to push in stack, if not enter -1: ");
        int element = X.nextInt();
        while(element != -1){
            stack.push(element);
            System.out.println("Enter the element you want to push in stack, if not enter -1: ");
            element = X.nextInt();
        }

        System.out.println("Size of stack is: "+stack.size());//return size.
        System.out.println("Element present at top of stack: "+stack.peek());//return element present at the top of stack

        while(!stack.isEmpty()){
            System.out.println("[__"+stack.pop()+"__]");//Pop out the elements.
        }
        System.out.println("is Stack empty? "+stack.isEmpty());
    }
}
