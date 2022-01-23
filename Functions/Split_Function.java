package Functions;
import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Random;
import java.util.Scanner;

public class Split_Function
{
    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        System.out.println("Enter the string separated with spaces:  ");
        String str=X.nextLine();
        String strArr[]=str.split(" ");

        for(String ele:strArr){
            System.out.println(ele);
        }
    }
}
