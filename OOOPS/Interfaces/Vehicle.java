package OOOPS.Interfaces;

/*
    An interface class is a class which contains only abstract functions in it.
    Basically we can say that it is a blueprint to it's derived classes.
    It shows what a class should contain in it.
 */
public interface Vehicle
{
    //We will only store the data members in an interface class which are constant.
    //And the constant member has to be declared as static.
    public final static String Message="Interface Class";

    public boolean isCustomized();
    public int numberOfTyres();
}
