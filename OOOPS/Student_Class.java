package OOOPS;

public class Student_Class
{
    String name;
    public String personName;
    int id;
    private String phoneNo;
    final String organisationaName="AASK";

    private final int regNum;
    /*
        Static keyword are used for those properties which belongs to Class:
        Static properties are shared by objects of a class, they are not belong to an object.
        The best way to call a static Variable is by using class name:
            Student_Class.numOfStu;
     */
    static private int numOfStu=0;
    private static int NUMBER=0;



    //Here we will constructor which is default present in the class
    public Student_Class()
    {
        numOfStu++;
        regNum=++NUMBER;
        /*
        I can also pass some default values to the properties and the functions:
        name="I don't care";
        id=420;
         */
    }
    //Here I will make second constructor which will take only name as input
    public Student_Class(String name)
    {
        regNum=++NUMBER;
        numOfStu++;
        this.name=name;
        this.personName=name;
    }
    //Here I will make third, in which I will take name and id as input
    public Student_Class(String name, int id)
    {
        regNum=++NUMBER;
        this.name=name;
        personName=name;
        this.id=id;
    }


    //What will this function do is, that it will return the value of phone number make it accessible even though it is private.
    public String getPhoneNo()
    {
        if(phoneNo==null) return ":!";
        return phoneNo;
    }

    /*
    This function(Setter) will set the roll number.
    But If we will have to set the number, and we make it public which means it's accessible to all packages.
    SO why to make phone no private in first place?
    Because after setting the setters we can apply some rules for input value.
     */
    public void setPhoneNo(String phoneNo)
    {
        if(phoneNo.length()<10){
            System.out.println("\nError: The number you entered is invalid number\n");
            return;
        }
        else if(phoneNo.charAt(0)==0){
            System.out.println("\nError: The number you entered is invalid number\n");
            return;
        }
        else {
            System.out.println("It gives the address of the object on which this function called: \n"+this);
            this.phoneNo=phoneNo;
        }
        //"this" function holds the address of the object on which the function or operation called
    }


    //We can only make access to static keyword with static function
    public static int getNumOfStu()
    {
        //We cannot acces non static variable in static function because it doesn't know from which objects it belongs?
//        System.out.println(this.name);
        return numOfStu;
    }

    //This is a print function which will written all the information about the object
    public void printAll(){
        System.out.println("\nName of the object: "+this.name+"\nId of the objectt: "+this.id+"\nOrganisation name:"+this.organisationaName+"\nPhone number of the object is: "+phoneNo);
        System.out.println("Total number of students are: "+Student_Class.numOfStu+"Student registration number: "+regNum);
    }
}
