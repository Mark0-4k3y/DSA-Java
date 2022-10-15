package BinarySearchTrees;
import BinaryTree.BinaryTreeNode;
import BinaryTree.TakeInputLevelWise;

import java.util.Scanner;

public class SearchNodesInK1andK2 extends BuidBST_UsingSortedArray
{
    public static void findInK1andK2(BinaryTreeNode<Integer> root, int startNum, int endNum)
    {
        if (root==null) return;

        if (root.data < startNum) findInK1andK2(root.rightChild, startNum, endNum);
        else if (root.data > endNum) findInK1andK2(root.leftChild, startNum, endNum);
        else{
            //That is the root data is between the range.
            findInK1andK2(root.leftChild, startNum, endNum);
            System.out.println(root.data+" ");
            findInK1andK2(root.rightChild, startNum, endNum);
        }
    }

    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        BinaryTreeNode<Integer> root=SortedArrayToBST(arr);

        System.out.println("Enter the number K1 and K2: ");
        int k1= X.nextInt();
        int k2=X.nextInt();
        findInK1andK2(root, k1, k2);
    }
}
