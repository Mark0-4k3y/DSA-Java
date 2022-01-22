package Recursion;
import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

/*
    Given k, find the geometric sum i.e.
    1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)
    using recursion.
 */

public class Geometric_Sum
{
    public static Scanner X=new Scanner(System.in);

    //Function to calculate the power of the denominator:
    public static double power(int num, int pow)
    {
        //Base Case.
        if(pow==0) return 1;

        //Assumed working part:
        double smallerPart=power(num, pow-1);

        //Result using the assumed part:
        return num*smallerPart;
    }

    //Function to find the geometric sum answer:
    public static double geometSum(int range)
    {
        //Base case
        if(range==0) return 1;

        //Assumed part which is solved:
        /*
          *********CAUTION***********************
            I was doing a mistake here which was, instead of range-1 I wrote --range.
            which lead to decrease in actual value of range.
            Due to this when its reaches at, fraction part the range actual value was 0 instead of the value needed at the constructor.
         */
        double smallPart=geometSum(range-1);

        //returning the result
        //Calculating the fraction part:
        double fraction=1.0/power(2, range);
        return  fraction + smallPart;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the number of the queries you wanna run: ");
        int q=X.nextInt();
        for(int t=1; t<=q; t++){
            System.out.println("\nEnter the range, to find it's geometric sum: ");
            int num=X.nextInt();
            System.out.println("The geometric sum is: "+geometSum(num));
        }
    }


}
