package BinaryTree;

public class CopyAndInsertInLeft extends TakeInputLevelWise
{
    public static void insertDuplicateNode(BinaryTreeNode<Integer> root)
    {
        if(root==null) return;

        BinaryTreeNode<Integer> copyNode=new BinaryTreeNode<>(root.data);

        copyNode.leftChild=root.leftChild;
        root.leftChild=copyNode;

        insertDuplicateNode(copyNode.leftChild);
        insertDuplicateNode(root.rightChild);
    }

    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=takeInputLevelwise();
        printDetailed(root);

        insertDuplicateNode(root);
        printDetailed(root);
    }
}
