package Bit_;
import java.util.Scanner;

public class BitMasking
{
    public static Scanner X=new Scanner(System.in);

    //Function to find the ith bit of the number.
    public static void find_ithBit(int num) throws BitsLimitExceed {
        System.out.println("Which ith number bit you want to find?! ");
        int ith=X.nextInt();
        if (ith>32) throw new BitsLimitExceed();

        int mask = 1 << ith;
        if ((num & mask) == 0) System.out.println("The "+ith+" bit of the number is: "+0);
        else System.out.println("The "+ith+" bit of the number is: "+1);

        //Another method but not recommend this.
//        num = num >> ith;
//        if ((num & 1) == 0)System.out.println("The "+ith+" bit of the number is: "+0);
//        else System.out.println("The "+ith+" bit of the number is: "+1);
    }

    //Function to set the ith bit of the number or to clear it.
    public static void set_ithBit(int num) throws BitsLimitExceed, InvalidBit {
        System.out.println("Which ith number bit you want to change?! ");
        int ith=X.nextInt();
        System.out.println("You want to change in 0 or 1?");
        int bit=X.nextInt();
        if (bit>1 && bit<0) throw new InvalidBit();
        if (ith>32) throw new BitsLimitExceed();

        int intialNum = num;
        if (bit==1){
            int mask = 1 << ith;
            num = num | mask;
        }else{
            //It is also said to be clear the ith bit, or set it to be zero.
            int mask = ~(1 << ith);//Inversion
            num = num & mask;
        }
        if (intialNum == num) System.out.println("The "+ith+" bit of the number "+num+" is already "+bit);
        System.out.println("The number "+intialNum+" after set the "+ith+" bit to "+bit+" bit is: "+num);
    }


    public static void main(String[] args) throws BitsLimitExceed, InvalidBit {
        System.out.println("Enter the number to apply bit masking: ");
        int num=X.nextInt();

        find_ithBit(num);
        set_ithBit(num);
    }
}
