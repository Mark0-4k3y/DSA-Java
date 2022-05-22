package Functions;

import java.util.Scanner;
public class Function_FibonacciMember
{
    public static Scanner X=new Scanner(System.in);

    public static int num=25;

    public static void inc(int n)
    {
        n++;
    }

    public static boolean isMember(int n)
    {
        int a=0, b=1;
        if(n==0 || n==1) return true;
        while(b<=n){
            int sum=a+b;
            a=b;
            b=sum;
            if(sum==n) return true;
        }
        return false;
    }


    public static void main(String[] args)
    {
//        System.out.println("Enter the number:  ");
//        int n=X.nextInt();
//        boolean isMember=isMember(n);
//        System.out.println(isMember);

        inc(num);
        //Here it shows the concept of pass by value
        //Even the global value follows the pass by value phenomena
        System.out.println(num);
    }
}
