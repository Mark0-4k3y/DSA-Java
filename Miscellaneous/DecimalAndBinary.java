package Miscellaneous;
import java.util.Scanner;

public class DecimalAndBinary
{
    private static long convertToBinary(int deciamlNumber)
    {
        long binaryNum=0;
        long tenthBasePower=1;
        int num=deciamlNumber;
        while(num>0){
            binaryNum += tenthBasePower*(num%2);
            num/=2;
            tenthBasePower*=10;
        }
        return binaryNum;
    }

    private static int convertToDecimal(long BinaryNum)
    {
        int decimalNum=0;
        int twoBasePower=1;
        long Binary=BinaryNum;
        while(Binary>0){
            decimalNum += twoBasePower*(Binary%10);
            Binary/=10;
            twoBasePower*=2;
        }

        return decimalNum;
    }

    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        System.out.println("Enter the decimal number to convert it into binary num: ");
        int decimal=X.nextInt();
        //Inbuilt function to that, which would return the string of binary.
        //System.out.println("The binary form of the decimal number "+decimal+" is: "+Integer.toBinaryString(decimal));
        System.out.println("The binary form of the decimal number "+decimal+" is: "+convertToBinary(decimal));

        System.out.println("Enter the binary number to convert it into the decimal number: ");
        long binaryNum=X.nextInt();
        //Inbuilt function to that.
        //System.out.println("The decimal form of the binary number "+binaryNum+" is: "+Integer.parseInt(String.valueOf(binaryNum), 2));
        System.out.println("The decimal form of the binary number "+binaryNum+" is: "+convertToDecimal(binaryNum));
    }
}
