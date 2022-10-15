package BinarySearchTrees;
import BinaryTree.BinaryTreeNode;

import java.util.Scanner;

class isBSTClass{
    int maximum;
    int minmum;
    boolean isBST;

    public isBSTClass(int maximum, int minimum, boolean isBST)
    {
        this.maximum=maximum;
        this.minmum=minimum;
        this.isBST=isBST;
    }
}


public class Intro extends BuidBST_UsingSortedArray
{
    /*
    In computer science, a binary search tree, also called an ordered or sorted binary tree, is a rooted binary tree data structure.
    The key of each internal node being greater than all the keys in the respective node's left subtree and less than the ones in its right subtree.
    */




    //This has not good time complexity.
    public static boolean isBST(BinaryTreeNode<Integer> root)
    {
        if (root==null) return true;

        int leftMax=maximum(root.leftChild);
        if (leftMax>=root.data){
            return false;
        }
        int rightMin=minimum(root.rightChild);
        if (rightMin<root.data){
            return false;
        }

        return isBST(root.leftChild) && isBST(root.rightChild);
    }
    private static int minimum(BinaryTreeNode<Integer> root)
    {
        if (root==null) return Integer.MAX_VALUE;

        int leftMin=minimum(root.leftChild);
        int rightMin=minimum(root.rightChild);

        return Math.min(root.data, Math.min(leftMin, rightMin));
    }
    private static int maximum(BinaryTreeNode<Integer> root)
    {
        if (root==null) return Integer.MIN_VALUE;

        int leftMax=maximum(root.leftChild);
        int rightMax=maximum(root.rightChild);

        return Math.max(root.data, Math.max(leftMax, rightMax));
    }



    //To reduce we use class to get three things from it.
    public static boolean isBinarySearchTree(BinaryTreeNode<Integer> root)
    {
        if (root==null) return true;
        isBSTClass answer=isBSTHelper(root);
        return answer.isBST;
    }
    private static isBSTClass isBSTHelper(BinaryTreeNode<Integer> root)
    {
        if (root==null){
            return new isBSTClass(Integer.MIN_VALUE, Integer.MAX_VALUE, true);
        }

        isBSTClass leftSubtree=isBSTHelper(root.leftChild);
        isBSTClass rightSubtree=isBSTHelper(root.rightChild);

        boolean isAnswer=true;

        if (root.data <= leftSubtree.maximum) isAnswer=false;
        if (root.data > rightSubtree.minmum) isAnswer=false;

        int minimum=Math.min(root.data, Math.min(leftSubtree.minmum, rightSubtree.minmum));
        int maximum=Math.max(root.data, Math.max(leftSubtree.maximum, rightSubtree.maximum));
        boolean isBST = isAnswer && (leftSubtree.isBST && rightSubtree.isBST);

        return new isBSTClass(maximum, minimum, isBST);
    }


    //The best method is to do by boundation method.
    public static boolean isBSTbest(BinaryTreeNode<Integer> root)
    {
        if (root==null) return true;
        return isBSTbestHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private static boolean isBSTbestHelper(BinaryTreeNode<Integer> root, int minimum, int maximum)
    {
        if (root==null) return true;

        if (root.data<=minimum || root.data>maximum) return false;
        boolean isLeftBST=isBSTbestHelper(root.leftChild, minimum, root.data-1);
        boolean isRightBST=isBSTbestHelper(root.rightChild, root.data, maximum);

        return isLeftBST && isRightBST;
    }

    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        int[] arr={1, 2, 3, 4, 15, 6, 7, 8, 9, 10, 11};
        BinaryTreeNode<Integer> root=SortedArrayToBST(arr);
        System.out.println("is BST? "+isBSTbest(root));
    }
}
