package Recursion;








public class KeyPadProblem
{

    public static void main(String[] args)
    {
        int digits=234;
        String[] letters=keyPad(digits);
        for(String ele:letters) System.out.println(ele+" ");
    }



    public static String[] keyPad(int digits)
    {
        if (digits==0 || digits==1){
            return new String[] {""};
        }

        String[] smallAns=keyPad(digits/10);

        Character[] chars=letters(digits%10);
        String[] answer=new String[smallAns.length * chars.length];
        int index=0;
        for(char ele:chars){
            for(int loop=0; loop<smallAns.length; loop++){
                answer[index] = smallAns[loop] + ele;
                index++;
            }
        }

        return answer;
    }

    public static Character[] letters(int digit)
    {
        Character[][] keypad={
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
                {'j', 'k', 'l'},
                {'m', 'n', 'o'},
                {'p', 'q', 'r', 's'},
                {'t', 'u', 'v'},
                {'w', 'x', 'y', 'z'}
        };

        return keypad[digit-2];
    }
}
