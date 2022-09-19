package BinaryTree;

public class BinaryTreeNode <T>
{
    public T data;
    public BinaryTreeNode<T> leftChild;
    public BinaryTreeNode<T> rightChild;

    public BinaryTreeNode(T data)
    {
        this.data=data;
        leftChild=null;
        rightChild=null;
    }
}
