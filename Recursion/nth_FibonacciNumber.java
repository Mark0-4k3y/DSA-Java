package Recursion;
import java.util.Scanner;

public class nth_FibonacciNumber
{
    public static Scanner X=new Scanner(System.in);

    //Creating a fibonacci function which will take input to find the nth Fibonacci number without using recursion.
    public static int simpleFibo(int nth)
    {
        if (nth==0) return 0;
        if (nth==1 || nth==2) return 1;

        nth-=2;

        int a=1, b=1, count=nth;
        for(int i=1; i<=count; i++){
//            System.out.println(a+" "+b+" "+nth);
            nth--;
            int nextNum=a+b;
            if (nth==0) return nextNum;
            a=b;
            b=nextNum;
//            System.out.println(a+" "+b);
        }

        return -1;
    }


    //Creating a Fibonacci nth finding element by using recursion
    public static int fibonacci(int nth)
    {
        if (nth==0) return 0;
        if (nth==1 || nth==2) return 1;

        nth-=2;

        return recursiveFibo(nth, 1, 1);
    }
    private static int recursiveFibo(int nth, int a, int b)
    {
        nth--;
        int nextNum=a+b;
        if(nth==0) return nextNum;
        else{
            return recursiveFibo(nth, b, nextNum);
        }
    }


    public static void main(String[] args)
    {
        System.out.println("Enter the number of queries you wanna run!: ");
        int q=X.nextInt();
        for(int t=0; t<q; t++){
            System.out.println("Enter the nth position to find the Fibonacci number: ");
            int nth=X.nextInt();
            System.out.println("The Fibonacci number at "+nth+" position is: "+fibonacci(nth));
        }
    }
}
