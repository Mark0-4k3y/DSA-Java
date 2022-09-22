package BinaryTree;

public class NodesWithoutSibling extends BinaryTreeNode_Use
{

    public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root)
    {
        if(root==null) return;

        if(root.leftChild==null && root.rightChild!=null) System.out.print(root.rightChild.data+" ");
        else if(root.rightChild==null && root.leftChild!=null) System.out.print(root.leftChild.data+" ");

        printNodesWithoutSibling(root.leftChild);
        printNodesWithoutSibling(root.rightChild);
    }


    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=takeTreeInput_Easy(true, 0, true);

        System.out.print("Nodes without siblings are: ");
        printNodesWithoutSibling(root);
    }
}
