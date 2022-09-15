package Stack;
import java.util.Scanner;

public class Stack_UsingArray
{
    private int stack[];
    private int topIndex;

    public Scanner X=new Scanner(System.in);

    public Stack_UsingArray(){
        stack = new int[2];
        topIndex=-1; //Index of the element present at the top.
    }

    public int size(){
        return topIndex + 1;
    }

    public boolean isEmpty(){
        if (topIndex != -1) return false;
        return true;
    }

    public void push(int element) throws Stack_OutOfBound_Exception{
        //When the stack size reached its limits.
//        if(topIndex > stack.length){
//            throw new Stack_OutOfBound_Exception();
//        }

        if (topIndex >= stack.length-1){
            stack = doubleSize(stack);
        }

//        stack[topIndex+1]=element; this step make topindex value only increase in bracket only.
        stack[++topIndex]=element;
        System.out.println(element+" added to stack!");
    }
    private int[] doubleSize(int[] stack){
        int[] newStack=new int[stack.length*2];
        for(int index=0; index<stack.length; index++){
            newStack[index]=stack[index];
        }
        return newStack;
    }

    public int top() throws Stack_EmptyException{
        if (topIndex== -1){
            throw new Stack_EmptyException();
        }
        return stack[topIndex];
    }

    public void pop() throws Stack_EmptyException{
        if (topIndex== -1){
            throw new Stack_EmptyException();
        }
        System.out.println("The element which is removed is: "+stack[topIndex]);
        stack[topIndex]=0;
        topIndex--;
    }

    public void print(){
        printFormat(stack, 0);
    }
    private void printFormat(int[] stack, int index){
        if(index > topIndex) return;

        printFormat(stack, index+1);

        System.out.println("[__"+stack[index]+"__]");
    }
}
