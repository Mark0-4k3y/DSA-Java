package BinarySearchTrees;
import BinaryTree.BinaryTreeNode;

import java.util.Scanner;

public class ReplaceSum_GreaterNode extends BuidBST_UsingSortedArray
{
    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
        helper(root,0);
    }
    private static int helper(BinaryTreeNode<Integer> root,int sum) {

        if(root==null) {
            return 0;
        }
        int sumOfGreaterNodes = helper(root.rightChild,sum);
        int temp = root.data;
        root.data += sumOfGreaterNodes + sum;
        int leftSum  = helper(root.leftChild,root.data);
        return temp + leftSum+ sumOfGreaterNodes ;
    }

    public static void main(String[] args){
        Scanner X=new Scanner(System.in);
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        BinaryTreeNode<Integer> root=SortedArrayToBST(arr);

        replaceWithLargerNodesSum(root);
        System.out.println("Binary Search tree after replacing nodes with larger and itself node sum: ");
        printDetailed(root);
    }

}
