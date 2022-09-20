package BinaryTree;

public class Tree_Height extends BinaryTreeNode_Use
{
    public static int height(BinaryTreeNode<Integer> root)
    {
        if(root==null) return 0;

        int leftSubtreeHeight=height(root.leftChild);
        int rightSubtreeHeight=height(root.rightChild);
        int maxSubtreeHeight=Math.max(leftSubtreeHeight, rightSubtreeHeight);

        return 1 + maxSubtreeHeight;

        //Or I can simply write this line:
        //return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root = takeTreeInput_Easy(true, 0, false);
        System.out.println("Height of the binary tree is: "+height(root));
    }
}
