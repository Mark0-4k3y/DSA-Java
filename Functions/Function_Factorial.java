package Functions;

import java.util.Scanner;
public class Function_Factorial
{
    public static Scanner X=new Scanner(System.in);

    public static int factorial(int n)
    {
        int i=1, fact=1;
        while(i<=n){
            fact*=i;
            i++;
        }
//        System.out.println("product"+fact);
        return fact;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the numbers to find nCr\nn,r: ");
        int n=X.nextInt(), r=X.nextInt();

        int nCr=(int)(factorial(n)/(factorial(r)*factorial(n-r)));
        System.out.println("The nCr is: "+nCr);
    }
}
