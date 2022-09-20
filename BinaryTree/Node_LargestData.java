package BinaryTree;

public class Node_LargestData extends BinaryTreeNode_Use
{
    public static int largestNode(BinaryTreeNode<Integer> root)
    {
        if (root==null) return 0;

        int childNodes=Math.max(largestNode(root.leftChild), largestNode(root.rightChild));
        return Math.max(root.data, childNodes);
    }

    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=takeTreeInput_Easy(true, 0, false);
        System.out.println("The node with largest data is: "+largestNode(root));
    }
}
