package ArrayList;
import java.util.*;

public class ConsecutiveProfitMonths
{
    public static long maximumProfitsKmonths(List<Integer> stockPrices, int k)
    {
        int totalMonths=stockPrices.size();
        if(k>totalMonths) return -1;

        long answer=0;
        for(int month=0; month<totalMonths-k; month++){
            long sum=0;
            boolean isDuplicate=false;
            HashMap<Integer, Integer> data=new HashMap<>();

            for(int index=month; index<month+k; index++){
                int key=stockPrices.get(index);
                System.out.print(key+" ");
                if (data.containsKey(key)){
                    isDuplicate=true;
                    break;
                }else{
                    data.put(key, 1);
                    sum+=key;
                }
            }System.out.println();

            if (sum>answer && !isDuplicate) answer=sum;
        }

        if (answer==0) return -1;
        return answer;
    }

    public static void main(String[] args)
    {
        int[] arr={6, 1, 2, 3, 7, 3, 5, 3};
        List<Integer> list=new ArrayList<>();
        for(int ele:arr) list.add(ele);
        System.out.println("The maximum 3 consecutive months for stocks are: "+maximumProfitsKmonths(list, 3));
    }
}
