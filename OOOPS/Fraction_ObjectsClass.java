package OOOPS;

public class Fraction_ObjectsClass
{
    public static void main(String[] args)
    {
        Fraction_Class fracNum1=new Fraction_Class();
//        fracNum1.print();
//        fracNum1.incr();
//        fracNum1.print();

        Fraction_Class fracNum2=new Fraction_Class();
        fracNum1.addFractions(fracNum2);
        fracNum1.print();
    }
}
