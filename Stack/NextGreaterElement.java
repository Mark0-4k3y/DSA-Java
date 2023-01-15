package Stack;
import java.util.Stack;
public class NextGreaterElement
{
    public static long[] nextLargerElementBest(long[] arr, int n)
    {
        Stack<Long> larger=new Stack<>();
        long answer[]=new long[n];

        larger.push(arr[n-1]);
        answer[n-1]=-1;
        for(int ele=n-2; ele>=0; ele--){

            if(arr[ele] < larger.peek()){
                answer[ele]=larger.peek();
                larger.push(arr[ele]);
            }else{

                while(!larger.isEmpty() && arr[ele] > larger.peek()) larger.pop();

                if(larger.isEmpty()) {
                    answer[ele]=-1;
                    larger.push(arr[ele]);
                    continue;
                }
                answer[ele]=larger.peek();
                larger.push(arr[ele]);
            }

        }

        return answer;
    }
    //Time limit Exceed.
     public static long[] nextLargerElement(long[] arr, int n)
     {
         long[] answers=new long[n];
         for(int curEle=0; curEle<n-1; curEle++){
             boolean isPresent=false;
             for(int nextEle=curEle+1; nextEle<n; nextEle++){
                 if(arr[curEle]<arr[nextEle]){
                     answers[curEle]=arr[nextEle];
                     isPresent=true;
                     break;
                 }
             }
             if(!isPresent) answers[curEle]=-1;
         }
         //For the last element.
         answers[n-1]=-1;
         return answers;
     }

     public static void main(String[] args)
     {
         long[] arr={6, 8, 0, 1, 3};
         long[] answers=nextLargerElementBest(arr, arr.length);
         System.out.println("Next larger for each element in array: [6, 8, 0, 1, 3]");
         for(long ele:answers) System.out.print(ele+" ");
     }
}
