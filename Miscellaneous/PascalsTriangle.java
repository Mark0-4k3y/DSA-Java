package Miscellaneous;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PascalsTriangle
{
    public static List<List<Integer>> generate(int numRows)
    {
        if(numRows<=0) return null;

        List<List<Integer>> pt=new ArrayList<>();
        pt.add(new ArrayList<>());
        pt.get(0).add(1);
        if(numRows==1) return pt;

        pt.add(new ArrayList<>());
        pt.get(1).add(1);
        pt.get(1).add(1);
        if(numRows==2) return pt;

        for(int listNo=2; listNo<numRows; listNo++){
            pt.add(new ArrayList<>());
            for(int index=0; index<=pt.get(listNo-1).size(); index++){
                if(index==0 || index==pt.get(listNo-1).size()) pt.get(listNo).add(1);
                else{
                    int insert=pt.get(listNo-1).get(index-1) + pt.get(listNo-1).get(index);
                    pt.get(listNo).add(insert);
                }
            }
        }

        return pt;
    }

    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        System.out.println("Enter total number of rows: ");
        int totalRows=X.nextInt();
        List<List<Integer>> pascalsTriangle=generate(totalRows);

        for(int listNo=0; listNo<pascalsTriangle.size(); listNo++){
            for(int space=pascalsTriangle.size(); space>listNo; space--) System.out.print(" ");
            for(int ele:pascalsTriangle.get(listNo)){
                System.out.print(ele+" ");
            }System.out.println();
        }
    }
}
