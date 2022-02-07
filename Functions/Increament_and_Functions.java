package Functions;
import java.util.Scanner;

public class Increament_and_Functions
{
    public static void print(int i)
    {
        System.out.println("\nThe answer is:"+i);
    }

    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        int num=X.nextInt();
        int temp=num;
        print(num+1);
        System.out.println("The value of num after num+1 operation is: "+num);

        num=temp;
        print(++num);
        System.out.println("The value of num after pre increment(++num) operation is: "+num);

        num=temp;
        print(num++);
        System.out.println("The value of num after post increment(num++) operation is: "+num);
    }
}
