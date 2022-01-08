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
        System.out.println("The fraction number is: "+num+"/"+deno);
    }


    //Setting the denominator
    public void setDenominator()
    {

    }

    //Getting the denominator
    public void getDenominator()
    {

    }


    //Increament the function
    public void incr()
    {
        this.num+=this.deno;
        simplify(this.num, this.deno);
    }
}
