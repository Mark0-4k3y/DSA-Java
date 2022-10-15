package BinarySearchTrees;
import BinaryTree.BinaryTreeNode;
import BinaryTree.TakeInputLevelWise;

import java.util.Scanner;

public class SearchNodeInBST extends BuidBST_UsingSortedArray
{
    public static boolean isNodePresentInBST(BinaryTreeNode<Integer> root, int data)
    {
        if (root==null) return false;
        if (root.data==data) return false;

        //Means data should present in left subtree of BST.
        if (root.data>data) return isNodePresentInBST(root.leftChild, data);
        //Means data should be present in right subtree of BST.
        return isNodePresentInBST(root.rightChild, data);
    }


    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);

        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        BinaryTreeNode<Integer> root=SortedArrayToBST(arr);
        int data=X.nextInt();
        System.out.println("Is node with data "+ data +" present in BST?! "+isNodePresentInBST(root, data));

        /*
        Time complexity of the find node function depend on the height of the tree.
        If the tree is balanced than height approximately equal to log(n), where N=number of nodes.
        else in worse it can be O(n).
         */

    }
}
