package OOOPS.Exception_Handling;

public class Passing_Exception
{
    /*
        There are two ways to deal with the exception, when the exception raised.
        1. Passing the exception or throw it to whomever has called it.
        2. Dealt with the exception
     */

    /*
        In this I will pass the exception or throw it to whomever it has been called by!
        Throw keyword is used to throw the exception
        Below we can see that in the divide class we used throw two times:
            1. First in the starting which is used to pass or throw the exception by which the functions called:
                Mainly it will pass the exception to the main function.
            2. Second one is used to raise the exception when a certain condition hits.
     */
    public static int divide(int num, int deno) throws Divide_By_ZeroException_Class {
        if(deno==0){
            throw new Divide_By_ZeroException_Class();
        }
        return num/deno;
    }


    /*
        Here I will also have a choice to dealt with or pass the exception.
        Now here I will pass the exception instead of dealing with it.
     */
    public static void main(String[] args) throws Divide_By_ZeroException_Class
    {
       divide(10, 0);
       System.out.println("This line will not print because when we only pass the exception not handle it, the code after the exception will not run ;* ");
    }
}
