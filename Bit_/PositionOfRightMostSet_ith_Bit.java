package Bit_;
import java.util.Scanner;

public class PositionOfRightMostSet_ith_Bit
{
    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        int x=X.nextInt();

        System.out.println("The right most ith bit present at the posiotion of: "+rightMostSetBit(x));
    }

    public static int rightMostSetBit(int num)
    {
        if (num==0) return -1;
        int count=0;
        while(num!=0){
            if((num & 1) != 0) return count;
            num>>=1;
            count++;
        }
        //Another approach
//        int count=0, temp=num;
//        while(temp!=0){
//            temp = temp & (temp-1);
//            count++;
//        }

        return -1;
    }

}
