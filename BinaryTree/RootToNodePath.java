package BinaryTree;
import java.util.ArrayList;

public class RootToNodePath extends TakeInputLevelWise
{
    public static ArrayList<Integer> rootToNodePath(BinaryTreeNode<Integer> root, int nodeData)
    {
        if (root==null) return null;

        if (root.data==nodeData){
            ArrayList<Integer> output=new ArrayList<>();
            output.add(root.data);
            return output;
        }

        ArrayList<Integer> leftTreeOutput=rootToNodePath(root.leftChild, nodeData);
        if (leftTreeOutput!=null){
            leftTreeOutput.add(root.data);
            return leftTreeOutput;
        }

        ArrayList<Integer> rightTreeOutput=rootToNodePath(root.rightChild, nodeData);
        if (rightTreeOutput!=null){
            rightTreeOutput.add(root.data);
            return rightTreeOutput;
        }

        return null;
    }



    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=takeInputLevelwise();

        System.out.println("Enter the node data which you want to find in the tree: ");
        int nodeData=X.nextInt();
        ArrayList<Integer> list=rootToNodePath(root, nodeData);
        if (list==null){
            System.out.println("The node data "+nodeData+" not found in the BinaryTree.");
        }else{
            for (int data:list){
                System.out.print(data+" ");
            }
        }
    }
}
