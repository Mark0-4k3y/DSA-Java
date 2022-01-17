package OOOPS.Exception_Handling;

public class Dealing_Exception
{
    public static int divide(int num, int deno) throws Divide_By_ZeroException_Class {
        if(deno==0){
            throw new Divide_By_ZeroException_Class();
        }
        return num/deno;
    }


    //Factorial function
    public static int factorial(int num) throws NegativeNumberException
    {
        int fact=1;
        if (num<0){
            throw new NegativeNumberException();
        }
        for(int i=num; i>0; i--){
            fact*=i;
        }
        return fact;
    }


    /*
     Here I will also have a choice to dealt with or pass the exception.
     Now here I will deal with the exception instead of passing it.

     ~try() and catch() statement will be used to deal with the exception:
           try {
            //Statement which can throw exception.
        } catch (Divide_By_ZeroException_Class e) {
            //If the exception has been catches in the try block, the catch block will be executed.
        }
  */
    public static void main(String[] args)
    {
        int result;
        try {
            result=divide(10, 5);
            System.out.println("The result of divide is: "+result+"\nAnd the factorial is: "+factorial(10));
        } catch (Divide_By_ZeroException_Class e) {
            e.printDivide_By_ZeroException();
        } catch (NegativeNumberException e) {
            e.printNeagativeException();
        } catch (Exception e){
            System.out.println("\nGeneric Exception");
        }finally {
          System.out.println("\nFINALLY BLOCK: In this we can code anything which will defiantly executed after try and catch statement");
        }
        System.out.println("\nThis line will be print because after handle it, the code after the exception will run ;) ");
    }
}
