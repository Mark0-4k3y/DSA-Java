package Stack;
import java.util.*;
import Recursion.Searching_AND_Sorting.Array_Class;

public class Stock_Stack extends Array_Class
{
    //this is old skool method, have time complexity of O(n^2).
    public static int[] stockSpan(int[] price)
    {
        int[] stockSpan = new int[price.length];

        for(int index=0; index<price.length; index++){
            int span=1;
            for(int prevIndex=index-1; prevIndex>=0; prevIndex--){
                if(price[index]>price[prevIndex]) span++;
                else break;
            }
            stockSpan[index]=span;
        }
        return stockSpan;
    }

    //This is the best method using stack, have time complexity of O(n).
    public static int[] stockSpanBest(int[] price)
    {
        if(price.length<1) return price;

        //This will store value of the stock stack.
        int[] span=new int[price.length];
        span[0] = 1; //For the first element the span of stock will always one.

        //Creating a stack which store indexes of the lasrgest variation price.
        Stack<Integer> stack=new Stack<>();
        stack.push(0);//Index of the first element.

        for(int index=1; index<price.length; index++){
            while(!stack.isEmpty() && (price[index] > price[stack.peek()]) ){
                stack.pop();
            }
            if(stack.isEmpty()){
                //If stack is empty means this prices is highest price till the index.
                span[index]=index+1;
                stack.push(index);
            }else{
                span[index]=index-stack.peek();
                stack.push(index);
            }
        }

        return span;
    }

    public static void main(String[] args)
    {
        int[] arr= Array_Class();
        System.out.println("The stock prices are: ");
        printArray(arr);

        int[] span=stockSpanBest(arr);
        System.out.println("The Stock span is given as: ");
        printArray(span);
    }
}
