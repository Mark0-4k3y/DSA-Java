package Bit_;
import java.util.Scanner;

public class Multiply_and_Divide
{
    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=X.nextInt();

        //I will use left shift for calculating multiply of number by 2.
        int multi=num<<1;
        System.out.println("Multiplication of the number by 2 is: "+multi);

        //I will do right shift for calculating divide of number by 2.
        int divide=num>>1;
        System.out.println("Divide of the number by 2 is: "+divide);
    }
}
