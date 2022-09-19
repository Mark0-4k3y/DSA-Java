package BinaryTree;
import java.util.Scanner;

public class BinaryTreeNode_Use
{
    public static Scanner X=new Scanner(System.in);

    public static void main(String[] args)
    {
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
//        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(20);
//        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(30);
//        root.leftChild = rootLeft;
//        root.rightChild = rootRight;
//
//        BinaryTreeNode<Integer> rootRight2 = new BinaryTreeNode<>(50);
//        BinaryTreeNode<Integer> rootLeft2 = new BinaryTreeNode<>(40);
//        rootLeft.rightChild = rootRight2;
//        rootRight.leftChild = rootLeft2;

        BinaryTreeNode<Integer> root=takeTreeInput_Complex();

        printDetailed(root);
    }
    public static void print(BinaryTreeNode root) {
        if (root == null) return;
        System.out.println(root.data);
        print(root.leftChild);
        print(root.rightChild);
    }
    public static void printDetailed(BinaryTreeNode root)
    {
        if(root==null) return;

//        This will not run properly because if one the child is null than it will return null pointer exception.
//        System.out.println("Root: " + root.data + ": Left Child " + root.leftChild.data + " Right Child " + root.rightChild.data);

        System.out.print("Root "+root.data+":");
        //For left child node.
        if (root.leftChild != null) System.out.print(" LeftChild->"+root.leftChild.data);
        else System.out.print(" null");
        //For right child node.
        if (root.rightChild!=null) System.out.println(", RightChild->"+root.rightChild.data);
        else System.out.println(", null");

        printDetailed(root.leftChild);
        printDetailed(root.rightChild);
    }


    public static BinaryTreeNode<Integer> takeTreeInput_Complex()
    {
        System.out.println("Enter the root data, if not have then enter -1(null): ");
        int rootData=X.nextInt();

        if (rootData == -1) return null;

        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> rootLeftChild=takeTreeInput_Complex();
        BinaryTreeNode<Integer> rootRightChild=takeTreeInput_Complex();
        root.leftChild=rootLeftChild;
        root.rightChild=rootRightChild;

        return root;
    }

}