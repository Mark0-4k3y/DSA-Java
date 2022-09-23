package BinaryTree;

public class RemoveLeafNodes extends BinaryTreeNode_Use
{

    public static BinaryTreeNode<Integer> removeLeafNodes(BinaryTreeNode<Integer> root)
    {
        if (root==null) return root;

        if (root.leftChild==null && root.rightChild==null) return null;

        root.leftChild=removeLeafNodes(root.leftChild);
        root.rightChild=removeLeafNodes(root.rightChild);

        return root;
    }

    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=takeTreeInput_Easy(true, 0, true);
        printDetailed(root);

        System.out.println("Binary tree after removing the leaf nodes: ");
        root=removeLeafNodes(root);
        printDetailed(root);
    }
}
