package Miscellaneous;
import java.util.Scanner;

public class EuclidsTheorm_GCD
{
    public static int euclidsGCD(int a, int b)
    {
        while(b>0){
            int temp=a;
            a=b;
            b=temp%b;
        }
        return a;
    }


    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        System.out.println("Enter the numbers to find their gcd: ");
        int num1=X.nextInt();
        int num2=X.nextInt();
        int gcd=euclidsGCD(Math.max(num1, num2), Math.min(num1, num2));
        System.out.println("The GCD of the numbers "+num1+" & "+num2+" is: "+gcd);
    }
}
