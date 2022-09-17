package Bit_;
import java.util.Scanner;

public class Bit_Diference_TwoNumbers
{
    //Function to check the bit difference between two numbers.
    public static int bitDifference(int num1, int num2)
    {
        //To find the difference between two numbers, I will use XOR operator.
        int difference = num1 ^ num2;

        /*
        Now to calculate the numbers of 1 bits, because :-
        XOR will return 1, when the both bits are different.
        If both the bits are same than it will return 0.
        So I have to calculate the number of 1 in difference.
         */

        //I will make a loop and right shift the difference each time.
        //In each iteration, I will count number of 1 bit by checking the number, i.e. number is even or odd.

        int count=0;

        //This one is old skool method have time complexity of O(log n).
//        while(difference != 0){
//            if((difference & 1) != 0) count++;//When odd number.
//            difference = difference >> 1;
//        }

        //The best method is this: Time complexity O(Number of set bits)
        while(difference != 0){
           difference = difference & (difference-1);
           count++;
        }
        return count;
    }


    public static void main(String[] args) throws BitsLimitExceed, InvalidBit {
        Scanner X=new Scanner(System.in);
        System.out.println("Enter the numbers to check its bit difference: ");
        int num1=X.nextInt();
        int num2=X.nextInt();

        System.out.println("The number of bits difference is: "+bitDifference(num1, num2));
    }
}
