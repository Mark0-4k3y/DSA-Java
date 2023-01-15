package BinarySearchTrees;

import BinaryTree.BinaryTreeNode_Use;
import BinaryTree.BinaryTreeNode;
import java.util.ArrayList;
import java.util.Collections;

public class PreOrderToBST extends BinaryTreeNode_Use
{
    //After the list, and then building the tree.
    private static BinaryTreeNode<Integer> buildTreeSorted(ArrayList<Integer> arr, int si, int ei)
    {
        if(si>ei) return null;
        int mi=(si+ei)/2;
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(arr.get(mi));

        root.leftChild=buildTree(arr, si, mi-1);
        root.rightChild=buildTree(arr, mi+1, ei);

        return root;
    }

    //Direct Conversion.
     private static BinaryTreeNode<Integer> buildTree(ArrayList<Integer> arr, int si, int ei){
             if(si>ei) return null;

             BinaryTreeNode<Integer> root=new BinaryTreeNode<>(arr.get(si));

             int rightTreeIndex=si+1, index=si+1;
             while(index<arr.size() && arr.get(si)>arr.get(index)){
                rightTreeIndex++;
                index++;
             }

             root.leftChild=buildTree(arr, si+1, rightTreeIndex-1);
             root.rightChild=buildTree(arr, rightTreeIndex, ei);

             return root;
         }


     public static BinaryTreeNode<Integer> prorderToBST(ArrayList<Integer> preorder)
     {
         BinaryTreeNode<Integer> tree=new BinaryTreeNode<>(preorder.get(0));
//         return buildTree(preorder, 0, preorder.size()-1);
         Collections.sort(preorder);
         return buildTreeSorted(preorder, 0, preorder.size()-1);
     }
}


