package Recursion;
import java.util.Scanner;

//In this function we have to find the number of digits present in the given number.
public class Number_Of_Digits
{
    public static Scanner X=new Scanner(System.in);

    //Function to count the number of digits in it.
    public static long numDigits(long num)
    {
        //Base case of the problem:
        if(num<10) return 1;

        //Assumed part which is already solved:
        long smallPart=numDigits(num/10);

        //Giving the result which have one digit + small part answer
        return 1+smallPart;
    }


    //This is the function to find the number of zero digits present in the number.
    public static int zeroNum(long num)
    {
        //Base case or simple derived case:
        if(num<10 && num==0) return 1;
        else if(num<10) return 0;

        //Now Before jump into correct assumed part we have to make choice between the input.
        if(num%10==0){
            //Now the assumed part will be:
            int smallPart=zeroNum(num/10);

            //And the result will be 1 + smallPart:
            return 1+smallPart;
        }else{
            return zeroNum(num/10);
        }
    }


    //This is the function which we return sum of digits:
    public static int sumOfDigit(long num)
    {
        //Base Case:
        if(num<10) return (int)num;

        //Assumed small part answer
        int smallPartResult=sumOfDigit(num/10);

        //Giving the sum of the digits present in it.
        return  ((int)(num%10)+smallPartResult);
    }


    public static void main(String[] args)
    {
        System.out.println("Enter the number of the queries you wanna run: ");
        int q=X.nextInt();
        for(int t=1; t<=q; t++){
            System.out.println("\nEnter the number, to find it's digits: ");
            long num=X.nextLong();
            System.out.println("The number of digits in "+num+" is: "+numDigits(num));
            System.out.println("The number of zero's in "+num+" is: "+zeroNum(num));
            System.out.println("The sum of the digits is: "+sumOfDigit(num));

        }
    }
}
