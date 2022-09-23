package BinaryTree;

public class MirroBinaryTree extends BinaryTreeNode_Use
{
    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root)
    {
        if(root==null) return;

        mirrorBinaryTree(root.leftChild);
        mirrorBinaryTree(root.rightChild);

        //Then simple swap the nodes.
        BinaryTreeNode<Integer> tempNode=root.rightChild;
        root.rightChild=root.leftChild;
        root.leftChild=tempNode;
    }

    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=takeTreeInput_Easy(true, 0, true);
        printDetailed(root);

        System.out.println("Binary tree after making it mirror updating: ");
        mirrorBinaryTree(root);
        printDetailed(root);
    }
}
