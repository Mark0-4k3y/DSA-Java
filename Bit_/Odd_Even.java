package Bit_;
import java.util.Scanner;

public class Odd_Even
{
    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=X.nextInt();

        //Old Skool method.
//        if(num%2==0) System.out.println("Even");
//        else System.out.println("Odd");

        //New fast method.
        if((num & 1) == 0) System.out.println("Even number it is.");
        else System.out.println("Odd number it is.");
    }
}
