package BinaryTree;
import java.util.Arrays;

public class ConstructTreeUsingInorderAndPostOrder extends TakeInputLevelWise
{
    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder)
    {
            if (preOrder.length<=0 || inOrder.length<=0) return null;
            return buildTreeHelper(preOrder, 0, preOrder.length-1, inOrder, 0, inOrder.length-1);
    }
    private static BinaryTreeNode<Integer> buildTreeHelper(int[] preOrder, int siPre, int eiPre, int[] inOrder, int siIn, int eiIn)
    {
        //When the start index crosses the end index simply return null.
        if (siPre>eiPre) return null;

        //If only one element present in the array then it is the only present so simply return the root.
        if (siPre==eiPre) return new BinaryTreeNode<>(preOrder[siPre]);

        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(preOrder[siPre]);

        int rootIndex=-1;
        for (int index=siIn; index<=eiIn; index++){
            if (inOrder[index] == preOrder[siPre]) {
                rootIndex=index;
                break;
            }
        }

        if (rootIndex==-1) return null;

        int leftSubtreeLength = rootIndex - siIn;
        int rightSubtreeLength = eiIn - rootIndex;

        //Left Subtree Parameters.
        int siLeftpre = siPre+1;
        int eiLeftpre = siLeftpre+leftSubtreeLength-1; //siPre+leftSubtreeLength.
        int siLeftIn = siIn;
        int eiLeftIn = rootIndex-1;

        //Right Subtree Parameters.
        int siRightpre = eiLeftpre+1;
        int eiRightpre = eiPre;
        int siRightIn = rootIndex+1;
        int eiRightIn = eiIn ;

        BinaryTreeNode<Integer> leftSubtree = buildTreeHelper(preOrder, siLeftpre, eiLeftpre, inOrder, siLeftIn, eiLeftIn);
        BinaryTreeNode<Integer> rightSubtree = buildTreeHelper(preOrder, siRightpre, eiRightpre, inOrder, siRightIn, eiRightIn);

        root.leftChild=leftSubtree;
        root.rightChild=rightSubtree;

        return root;
    }


    public static void main(String[] args)
    {
        int[] inOrder={4, 2, 5, 1, 6, 3};
        int[] preOrder={1, 2, 4, 5, 3, 6};
        BinaryTreeNode<Integer> root=buildTree(preOrder, inOrder);
        printLevelWise(root);
    }

}
