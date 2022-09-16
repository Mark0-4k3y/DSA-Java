package Bit_;
import java.util.Scanner;

public class SwapNumbers
{
    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num1=X.nextInt();
        int num2=X.nextInt();

        //Old skool method.
//        int temp=num2;
//        num2=num1;
//        num1=temp;

        //Swap numbers using bit manipulation.
        //Swap numbers without using third variable.
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("The numbers after swapping are: "+num1+" "+num2);
    }
}
