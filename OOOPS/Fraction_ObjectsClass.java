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
//        fracNum1.addFractions(fracNum2);
//        fracNum1.print();

        Fraction_Class fracNum3=Fraction_Class.subFractions(fracNum1, fracNum2);
        fracNum3.print();

        Fraction_Class fracNum4=Fraction_Class.mulFractions(fracNum1, fracNum2);
        fracNum4.print();

        Fraction_Class fracNum5=Fraction_Class.diviFractions(fracNum1, fracNum2);
        fracNum5.print();
    }
}
