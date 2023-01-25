package Recursion;

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
