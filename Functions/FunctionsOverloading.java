package Functions;

import java.util.Scanner;
public class FunctionsOverloading
{
    //We use Function Overloading to give use flexibility and avoid error sometimes

    public static Scanner X=new Scanner(System.in);

    public static int sum(int num1, int num2)
    {
        return num1+num2;
    }

    //This is the function if by mistake user will pass only one value!
    public static int sum(int num)
    {
        System.out.println("Enter the number to add in the given number"+num+" or enter '0' for increase value by 1:  ");
        int n=X.nextInt();
        if(n==0) return ++num;
        return num+n;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the numbers: ");
        int num1=X.nextInt(), num2=X.nextInt();
        System.out.println("The sum of both numbers is: "+sum(num1, num2)+"\n");
        System.out.println("The result of single number is: "+sum(num1));
    }
}
