package BinarySearchTrees;
import BinaryTree.BinaryTreeNode;

import java.util.Scanner;

public class LCSofBST extends BuidBST_UsingSortedArray
{
    public static int getLCA(BinaryTreeNode<Integer> root, int a, int b)
    {
        if(root==null) return -1;

        if(a<=root.data && b>=root.data) return root.data;

        if(a<root.data && b<root.data) return getLCA(root.leftChild, a, b);
        return getLCA(root.rightChild, a, b);
    }

    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        BinaryTreeNode<Integer> root=SortedArrayToBST(arr);

        System.out.println("Enter the nodes A and B: ");
        int a=X.nextInt();
        int b=X.nextInt();

        System.out.println("The LCS of the Nodes "+a+" and "+b+" is: "+getLCA(root, a, b));
    }
}
