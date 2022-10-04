package BinaryTree;
import java.util.Arrays;

public class ConstructTreeUsingInorderAndPostOrder
{
    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder)
    {
        if (preOrder.length<=0 || inOrder.length<=0) return null;

        int rootData=preOrder[0];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);

        int count=0;
        while(true){
            if (inOrder[count]!=rootData) count++;
            else break;
        }

        




        return root;
    }

}
