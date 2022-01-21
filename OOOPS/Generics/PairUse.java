package OOOPS.Generics;

public class PairUse
{
    public static void main(String[] args)
    {
        //String Object
        Pair<String> stringPair=new Pair<String>("Keshav", "Vashishta");
        stringPair.setFirst("Keshvvv");
        stringPair.setSecond("Humannn");
        stringPair.print();

        //Integer Object
        Pair<Integer> integerPair=new Pair<>(6,9);
        integerPair.setFirst(2);
        integerPair.setSecond(6);
        integerPair.print();

        //Char Object
        Pair<Character> charPair=new Pair<>('a','b');
        charPair.setFirst('K');
        charPair.setSecond('v');
        charPair.print();

        //What if I want to add to type of data types into pairs?!
        //Then we will define the first one with another Data Type.
        //And second one with another data type.
        //Here I will add my name and birthday date together.
        PairTwoDataTypes<String, Integer> stringIntegerPair=new PairTwoDataTypes<String, Integer>("Keshav Vashishta", 26);
        stringIntegerPair.print();

        //But what if I have to make a triplet pair with different Data types?!
        //I will give as pair input in the constructor data type.
        PairTwoDataTypes<PairTwoDataTypes<String, Integer>, String> tripletDataPair=new PairTwoDataTypes<PairTwoDataTypes<String, Integer>, String>(stringIntegerPair, "August");
        System.out.print("The pair is given as: "+tripletDataPair.getFirst().getFirst()+" ");
        System.out.print(tripletDataPair.getFirst().getSecond()+" ");
        System.out.print(tripletDataPair.getSecond()+"\n");

        //We cannot directly apply print function to it, because it will first print the address of the first PairTwoDataTypes and then the value of second one present in triplets pair.
        tripletDataPair.print();
    }
}
