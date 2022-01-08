package OOOPS;

public class Student_Object
{
    public static void main(String[] args)
    {
        //Here I will create objects which belongs to the class Student
        Student_Class stu1=new Student_Class();

        Student_Class stu2;
        //This statement is just creating the reference not the object;
        stu2=new Student_Class();
        //This statement is creating the object;

        //stu1 and stu2 are stores reference to Student 1 and Student 2 object;
        //And Student 1 and 2 are having properties and functionalities which are belongs to class Student
        System.out.println(stu1+"\n"+stu2);

        //For access the properties of the objects we will use this syntax:
        // ObjectName.property
        stu1.name="Keshav Vashishta";
        stu2.name="Unkown";

        stu1.id=10077;
        stu2.id=10078;

        //Printing the properties
//        System.out.println("The name of the student and id is: \n"+stu1.name+"\n"+stu1.id);


//        stu1.getPhoneNo()="1121385151";
//        This is inaccessible because it phones number is private

        //For showing that "this" keyword holds the address of the object on which function is called:
//        System.out.println("\n stu1 address: "+stu1);
//        stu1.setPhoneNo("9985983325");
//        System.out.println("stu2 address: "+stu2);
//        stu2.setPhoneNo("01245645");
//        System.out.println("Student one phone number is: "+stu1.getPhoneNo());
//        System.out.println("Student two phone number is: "+stu2.getPhoneNo());


        Student_Class stu3=new Student_Class();
        Student_Class stu4=new Student_Class();
        stu2.printAll();



        System.out.println(Student_Class.getNumOfStu());
    }
}
