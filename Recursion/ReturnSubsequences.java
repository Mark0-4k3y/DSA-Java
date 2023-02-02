package Recursion;


class PrintSubsequences
{
    public static void main(String[] args)
    {
        String str="xyz";
        printSubsequences(str);
    }

    private static void printSubsequences(String str)
    {
        printSubsequences(str, " ");
    }
    private static void printSubsequences(String str, String outputSoFar)
    {
        if (str.length()==0) {
            //Means input string is empty, and now we will simply print the output till we have this moment.
            System.out.println(outputSoFar);
            return;
        }
        //When character don't want to take part in output.
        printSubsequences(str.substring(1), outputSoFar);

        //When character want to take part in output.
        printSubsequences(str.substring(1), outputSoFar + str.charAt(0));
    }
}



public class ReturnSubsequences
{
    public static void main(String[] args)
    {
        String str="xyz";
        String[] subSequences=findSubsequences(str);
        for(String ele:subSequences) System.out.println(ele+" ");
    }

    private static String[] findSubsequences(String str)
    {
        if (str.length()==0){
            String answer[]={" "};
            return answer;
        }

        String[] smallAns=findSubsequences(str.substring(1));
        String[] answer=new String[2 * smallAns.length];

        for(int index=0; index<smallAns.length; index++){
            answer[index]=smallAns[index];
        }
        for(int index=0; index<smallAns.length; index++){
            answer[index + smallAns.length] = str.charAt(0) + smallAns[index];
        }

        return answer;
    }
}
