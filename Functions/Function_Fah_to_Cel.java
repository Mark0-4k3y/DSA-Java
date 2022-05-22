package Functions;

import java.util.Scanner;
public class Function_Fah_to_Cel
{
    public static Scanner X=new Scanner(System.in);


    public static void table(int startP, int endP, int gap)
    {
        while(startP<=endP){
            int cel=(int)((5*(startP-32))/9);
            System.out.println(startP+"\t"+cel);
            startP+=gap;
        }
    }


    public static void main(String[] args)
    {
        System.out.println("Enter the starting point, end point and the gap to find a Celsius table:  ");
        int startP=X.nextInt(), endP=X.nextInt(), gap=X.nextInt();
        table(startP, endP, gap);
    }
}
