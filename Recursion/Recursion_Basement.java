package Recursion;

import java.util.Scanner;

public class Recursion_Basement
{
/*
    What is recursion?
    Recursion is a method to use where the solution to a problem depends upon solutions of it's smaller instances.
    In simple language, when a problem depend upon itself smaller problem solution until the base call arrived, then we will use recursion.
 */


    //Here is the method/function which will find the factorial by normal method.
    public static int simpleFact(int n)
    {
        int fact=1;
        for(int i=n; i>0; i--){
            fact*=i;
        }
        return fact;
    }

    //Here is the Recursive way to solve the factorial.
    public static int recurFact(int n)
    {
        //Defining the base case:
        if(n==0) return 1;

        //call the function again for the smaller problem:
        int smallPart=recurFact(n-1);

        //returning the result
        return n*smallPart;

        //Or we can simply write as:
        //return n * recurFact(--n)
    }


    //Here is a recursion method to find the multiplication
    public static int mul(int num, int times)
    {
        //Base case, if times(how much times the number is multiplied i.e, 4*5. 5 times multiplied)
        if(times==1) return num;

        //Running to the hypothetical part:
        int smallerPart=mul(num, --times);

        //return the result to the function:
        return num+smallerPart;
    }

    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        System.out.println("Enter the number to find it's factorial: ");
        int num=X.nextInt();
        System.out.println("By using the simple method: "+simpleFact(num));
        System.out.println("By using the recursion method: "+recurFact(num)+"\n");

        System.out.println("Enter the number for multiplication and for how many times: ");
        int num2=X.nextInt(), times=X.nextInt();
        System.out.println("The result of multiplication is: "+mul(num2, times));

    }
}
