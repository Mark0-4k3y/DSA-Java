package Stack;

public class Stack_LL_Implementation
{
    public static void main(String[] args) throws Stack_EmptyException
    {
        Stack_UsingLinkedList<Integer> stack=new Stack_UsingLinkedList<>();
//        stack.pop();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("""
                Is Stack Empty? """+stack.isEmpty());
        System.out.println("The element at top of stack is: "+stack.top()+" and size of stack is: "+stack.size());
        stack.print();

        stack.push(40);
        System.out.println("The element at top of stack is: "+stack.top()+" and size of stack is: "+stack.size());

        stack.pop();
        System.out.println("The element at top of stack is: "+stack.top()+" and size of stack is: "+stack.size());

    }
}
