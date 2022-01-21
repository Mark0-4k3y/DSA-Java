package OOOPS.Generics;

//I made this another pair class, because I want to make pair two data types.
public class PairTwoDataTypes<G1, G2>
{
    private G1 first;
    private G2 second;

    //Here I made a constructor.
    public PairTwoDataTypes(G1 position1, G2 position2){
    this.first=position1;
    this.second=position2;
}

    //Getters and Setters for the first one.
    public void setFirst(G1 first) {
    this.first = first;
}
    public G1 getFirst() {
    return first;
}

    //Getters and Setters for the second one.
    public void setSecond(G2 second) {
    this.second = second;
}
    public G2 getSecond() {
    return second;
}


    //Print function which will print the pairs
    public void print()
    {
        System.out.println("The pairs are given as: "+first+" "+second+"");
    }

}
