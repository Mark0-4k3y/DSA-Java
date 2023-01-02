package Miscellaneous;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers
{
    //For checking whether the given number is prime or not.
    public static boolean isPrime(int num)
    {
        if(num <= 1) return false;
        if(num <= 3) return true;

        //If number is divisible by two means it is not prime number, and we don't have need to check with other prime number as well.
        if(num%2 == 0) return false;

        //Only checking with odd numbers.
        for(int values=3; values<=Math.sqrt(num); values+=2){
            if(num%values==0) return false;
        }

        return true;
    }

    //Return a list of odd numbers in less optimized way.
    public static ArrayList<Integer> primeNumbers(int num)
    {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        if (num <= 1) return null;

        primeNumbers.add(2);
        for(int numbers=3; numbers<=num; numbers+=2){
            if(isPrime(numbers)) primeNumbers.add(numbers);
        }

        return primeNumbers;

    }

    //Return a list of odd numbers in optimized way which have
    //Using Sieve Method:
    public static ArrayList<Integer> sieveEratosthenes(int num)
    {
        if(num <= 1) return null;

        boolean[] isPrime=new boolean[num+1];//For excluding 0 and 1.
        isPrime[0]=false;
        isPrime[1]=false;
        for(int index=2; index<num+1; index++) {
            //Setting all the indexes values which are corresponds to every number between 2 and num equal to true
            isPrime[index]=true;
        }

        for(int number=2; number<=Math.sqrt(num); number++){
            //Means the number is not prime.
            if(!isPrime[number]) continue;

            //But when the number is prime.
            for(int multiples=number*number; multiples<=num; multiples+=number){
                //Every number present in table of a prime number is not a prime number.
                isPrime[multiples]=false;
            }
        }

        ArrayList<Integer> primeNumbers=new ArrayList<>();
        for(int number=2; number<num+1; number++){
            if (isPrime[number]) primeNumbers.add(number);
        }

        return primeNumbers;
    }

    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int nth=X.nextInt();
        System.out.println("For checking the number is prime or not enter 'C':\n" +
                "For printing all prime numbers till the number"+nth+" enter 'P':\n" +
                "And for both the operations enter 'B': "
        );

        String str=X.nextLine();
        char input=X.nextLine().charAt(0);

        boolean isPrime=isPrime(nth);
//        ArrayList<Integer> primeNumbers=primeNumbers(nth);
        ArrayList<Integer> primeNumbers=sieveEratosthenes(nth);
        switch (input){
            case 'C':
                if (isPrime) System.out.println("The given number "+nth+" is a prime number!");
                else System.out.println("The given number "+nth+" is not a prime number!");
                break;
            case 'P':
                System.out.println("The natural prime number till "+nth+" are: ");
                for(int ele:primeNumbers){
                    System.out.print(ele+" ");
                }System.out.println("\nTotal number of natural numbers in between are: "+primeNumbers.size());
                break;
            case 'B':
                if (isPrime) System.out.println("The given number "+nth+" is a prime number!");
                else System.out.println("The given number "+nth+" is not a prime number!");

                System.out.println("The natural prime number till "+nth+" are: ");
                for(int ele:primeNumbers){
                    System.out.print(ele+" ");
                }System.out.println("\nTotal number of natural numbers in between are: "+primeNumbers.size());
        }

    }
}
