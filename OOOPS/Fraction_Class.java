package OOOPS;
import java.util.Scanner;

public class Fraction_Class
{
    private int num;
    private int deno;

    public Scanner X=new Scanner(System.in);

    public Fraction_Class()
    {
        System.out.println("Enter the numerator for the fraction number: ");
        int num=X.nextInt();
        System.out.println("Enter the denominator for the fraction number: ");
        int deno=X.nextInt();
        if(deno==0){
            System.out.println("Invalid denominator ;@");
            return;
        }

        simplify(num, deno);
    }

    public Fraction_Class(int num, int deno)
    {
        if(deno==0){
            System.out.println("Invalid denominator ;@");
            return;
        }
        this.num=num;
        this.deno=deno;
        simplify(num, deno);
    }



    //This is the function to simplify the fraction into the simplest form
    private void simplify(int num, int deno)
    {
        int gCoDivisor=1;
        int smallOne=Math.min(num,deno);
        for(int i=2; i<=smallOne; i++){
            if(num%i==0 && deno%i==0){
                gCoDivisor=i;
            }
        }
        this.num=num/gCoDivisor;
        this.deno=deno/gCoDivisor;
    }


    //Printing the fraction number in the a/b form
    public void print()
    {
        if(deno==0){
            System.out.println("Invalid denominator ;@");
            return;
        }
        if(deno==1){
            System.out.println("The fraction number is: "+num);
            return;
        }
        if(num==0){
            System.out.println("The fraction number is: "+0);
            return;
        }
        System.out.println("The fraction number is: "+num+"/"+deno);
    }


    //Increament the function
    public void incr()
    {
        this.num+=this.deno;
        simplify(this.num, this.deno);
    }

    //This function will add the both fractions but store the result by updating the fraction number by which it's called
    public void addFractions(Fraction_Class fracNum2)
    {
        int newDen=0;
        int newNum=0;

        newNum=this.num* fracNum2.deno + this.deno* fracNum2.num;
        newDen=this.deno* fracNum2.deno;
        simplify(newNum, newDen);
        this.num=newNum;
        this.deno=newDen;
    }

    //This function will add the both the function and store the result in the new fraction number:
    public static Fraction_Class addBothFractionNumber(Fraction_Class fracNum1, Fraction_Class fracNum2)
    {
        int newDen=0;
        int newNum=0;


        newNum=fracNum1.num* fracNum2.deno + fracNum1.deno* fracNum2.num;
        newDen=fracNum1.deno* fracNum2.deno;
        Fraction_Class newFracNum=new Fraction_Class(newNum,newDen);

        return newFracNum;
    }


    //This is the function to store and return the multiplication result of two fractions in a new fraction.
    public static Fraction_Class mulFractions(Fraction_Class frac1, Fraction_Class frac2)
    {
        int newDen=0;
        int newNum=0;

        newNum=frac1.num* frac2.num;
        newDen= frac1.deno* frac2.deno;
        Fraction_Class newFracNum=new Fraction_Class(newNum,newDen);

        return newFracNum;
    }


    //This is the function to subtract the fractions and return a new fraction as result of subtraction
    public static Fraction_Class subFractions(Fraction_Class fracNum1, Fraction_Class fracNum2)
    {
        int newDen=0;
        int newNum=0;

        newNum=fracNum1.num* fracNum2.deno - fracNum1.deno* fracNum2.num;
        newDen=fracNum1.deno* fracNum2.deno;
        Fraction_Class newFracNum=new Fraction_Class(newNum,newDen);

        return newFracNum;
    }

    //This is the function to perform divide function on two fraction numbers
    public static Fraction_Class diviFractions(Fraction_Class frac1, Fraction_Class frac2)
    {
        int newDen=0;
        int newNum=0;

        //Here What I did, I multiply each other numerator and then denominator after that I simplify them using constructor
        newNum=frac1.num*frac2.deno;
        newDen= frac1.deno*frac2.num;
        Fraction_Class newFracNum=new Fraction_Class(newNum,newDen);

        return newFracNum;
    }
}





























