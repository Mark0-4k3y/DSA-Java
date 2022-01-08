package OOPS_Multiverse;
import OOOPS.Student_Class;
public class Student_Class_Teachers_Use extends Student_Class
{
    public static void main(String[] args)
    {
        Student_Class t1=new Student_Class();
//        t1.name="Keshav";
            /*
            why is name not accessible here?
            Because name has default modifier we have to convert it public, to make visible here.
            So for future reference leave the upper name as it is and make a new public variable which is person name:
             */

        t1.personName="Keshav Vashishta";
        System.out.println("It will print the address of t1 which stores the reference of object: "+t1);
    }
}
