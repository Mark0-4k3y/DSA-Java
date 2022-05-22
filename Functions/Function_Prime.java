package Functions;

import java.util.Scanner;
public class Function_Prime
{
    public static Scanner X=new Scanner(System.in);

    public static boolean isPrime(int n)
    {
        int div=2;
        while(div<=n/2){
            if(n%div==0) return false;
            div++;
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the number to find its primality: ");
        int n=X.nextInt();
        System.out.println(isPrime(n));
    }
}
