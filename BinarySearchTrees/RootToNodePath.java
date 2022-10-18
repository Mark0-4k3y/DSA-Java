package BinarySearchTrees;
import BinaryTree.BinaryTreeNode;
import java.util.ArrayList;

public class RootToNodePath extends BuidBST_UsingSortedArray
{

    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data)
    {
        if(root==null) return null;

        ArrayList<Integer> list=new ArrayList<Integer>();

        if(root.data==data){
            list.add(root.data);
            return list;
        }

        if(root.data>data){
            ArrayList<Integer> leftList=getPath(root.leftChild, data);
            if(leftList==null) return null;//When the data is not present in the BST
            leftList.add(root.data);
            return leftList;
        }else{
            ArrayList<Integer> rightList=getPath(root.rightChild, data);
            if(rightList==null) return null;//When data is not present in BST
            rightList.add(root.data);
            return rightList;
        }
    }




    public static void main(String[] args)
    {
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        BinaryTreeNode<Integer> root=SortedArrayToBST(arr);

        System.out.println("Enter the node data which you want to find in the tree: ");
        int nodeData=X.nextInt();
        ArrayList<Integer> list=getPath(root, nodeData);
        if (list==null){
            System.out.println("The node data "+nodeData+" not found in the BinaryTree.");
        }else{
            for (int data:list){
                System.out.print(data+" ");
            }
        }
    }
}
