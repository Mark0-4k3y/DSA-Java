package BinaryTree;

public class isTreeBalanced extends BinaryTreeNode_Use
{
    //A tree said to balance if at each node it fulfills this condition:
    // | height(leftSubtree) - height(rightSubtree) | <= 1, and vice versa.

    public static boolean isBalancedTree(BinaryTreeNode<Integer> root)
    {
        if (root==null) return true;
        int leftSubTreeHeight=treeHeight(root.leftChild);
        int rightSubTreeHeight=treeHeight(root.rightChild);

        int heightDiff=Math.abs(leftSubTreeHeight - rightSubTreeHeight);
        if (heightDiff > 1) return false;

        return isBalancedTree(root.leftChild) && isBalancedTree(root.rightChild);
    }
    private static int treeHeight(BinaryTreeNode<Integer> root)
    {
        if (root==null) return 0;
        return 1 + Math.max((treeHeight(root.leftChild)), treeHeight(root.rightChild));
    }

    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=takeTreeInput_Easy(true, 0, true);
        printDetailed(root);

        System.out.println("Is this binary tree balanced?: "+isBalancedTree(root));
    }
}
