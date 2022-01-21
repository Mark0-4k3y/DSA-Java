package OOOPS.Generics;

//Here G defines that it is Generic i.e, we not initialize what data type is used by this class.
//So on creating objects from the class, we will have to define the data type, on requirements basis.
public class Pair<G>
{
    private G first;
    private G second;

    //Here I made a constructor.
    public Pair(G position1, G position2){
        this.first=position1;
        this.second=position2;
    }

    //Getters and Setters for the first one.
    public void setFirst(G first) {
        this.first = first;
    }
    public G getFirst() {
        return first;
    }

    //Getters and Setters for the second one.
    public void setSecond(G second) {
        this.second = second;
    }
    public G getSecond() {
        return second;
    }


    //Print function which will print the pairs
    public void print()
    {
        System.out.println("The pairs are given as: "+first+" "+second+"");
    }

}

