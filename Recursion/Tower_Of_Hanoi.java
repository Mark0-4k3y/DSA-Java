package Recursion;
import java.util.Scanner;

public class Tower_Of_Hanoi
{
    public static void towerOfHanoi(int disks, String source, String auxiliary, String destination)
    {
        if(disks==1){
            System.out.println("Move the "+disks+" disk from " + source + " to "+destination);
            return;
        }

        towerOfHanoi(disks-1, source, destination, auxiliary);
        System.out.println("Move "+disks+"th disk from "+source+" to "+destination);
        towerOfHanoi(disks-1, auxiliary, source, destination);
    }

    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        int n=X.nextInt();
        X.close();

        towerOfHanoi(n, "Source", "Helper", "Destination");
    }
}
