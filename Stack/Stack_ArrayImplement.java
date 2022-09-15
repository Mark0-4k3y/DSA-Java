package Stack;
import java.util.Scanner;

public class Stack_ArrayImplement extends Stack_UsingArray
{
    public static void main(String[] args) throws Stack_OutOfBound_Exception, Stack_EmptyException {
        Stack_UsingArray stack =new Stack_UsingArray();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.print();
        System.out.println(stack.isEmpty());
        System.out.println(stack.top());
        System.out.println(stack.size());
        stack.pop();
//        stack.pop();
    }
}
