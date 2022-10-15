package BinarySearchTrees;
import BinaryTree.BinaryTreeNode;
public class BuidBST_UsingSortedArray
{
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr)
    {
        if(arr.length<=0) return null;
        return buildBST(arr, 0, arr.length-1);
    }
    private static BinaryTreeNode<Integer> buildBST(int[] arr, int si, int ei)
    {
        if(si>ei) return null;

        int mi=(si+ei)/2;
        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(arr[mi]);

        BinaryTreeNode<Integer> leftSubtree=buildBST(arr, si, mi-1);
        BinaryTreeNode<Integer> rightSubtree=buildBST(arr, si, mi-1);

        root.leftChild=leftSubtree;
        root.rightChild=rightSubtree;

        return root;
    }

    public static void main(String[] args)
    {
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        BinaryTreeNode<Integer> root=SortedArrayToBST(arr);
    }
}
