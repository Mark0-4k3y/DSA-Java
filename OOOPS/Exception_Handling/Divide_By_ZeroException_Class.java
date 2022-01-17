package OOOPS.Exception_Handling;

//For make an Exception class we have to inherit the parent class Exception which is already present in the Java.
public class Divide_By_ZeroException_Class extends Exception
{
    public void printDivide_By_ZeroException()
    {
        System.out.println("The denominator is zero so, it will not be expected ;*\n");
    }
}
