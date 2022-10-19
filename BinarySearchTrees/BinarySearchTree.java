package BinarySearchTrees;
import BinaryTree.BinaryTreeNode;

public class BinarySearchTree
{
    private BinaryTreeNode<Integer> root;
    private int size;


    //Check whether the node present in the binary tree or not?!
    public boolean isPresent(int nodeData) {return isPresentHelper(root, nodeData);}
    private static boolean isPresentHelper(BinaryTreeNode<Integer> node, int nodeData) {
        if(node==null) return false;

        if (node.data==nodeData) return true;
        return isPresentHelper(node.leftChild, nodeData) || isPresentHelper(node.rightChild, nodeData);
    }
//  You can't use a class's generic type parameters in static methods or static fields.
//  The class's type parameters are only in scope for instance methods and instance fields.


    public void insert(int nodeData){root=insertHelper(root, nodeData); size++;}
    private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node, int nodeData){
        if (node==null) {
            BinaryTreeNode<Integer> newRoot=new BinaryTreeNode<>(nodeData);
            return newRoot;
        }

        if (nodeData < node.data){
            BinaryTreeNode<Integer> leftTreeUpdate=insertHelper(node.leftChild, nodeData);
            node.leftChild=leftTreeUpdate;
        }else{
            BinaryTreeNode<Integer> rightTreeUpdate=insertHelper(node.rightChild, nodeData);
            node.rightChild=rightTreeUpdate;
        }

        return node;
    }


    public void deleteData(int nodeData)
    {

    }

    public int size()
    {
        return size;
    }


    //Print the binary tree.
    public void printTree() {printTreeHelper(root);}
    private static void printTreeHelper(BinaryTreeNode<Integer> node)
    {
        if(node==null) return;

        System.out.print("Root "+node.data+":");
        //For left child node.
        if (node.leftChild != null) System.out.print(" LeftChild->"+node.leftChild.data);
        else System.out.print(" null");
        //For right child node.
        if (node.rightChild!=null) System.out.println(", RightChild->"+node.rightChild.data);
        else System.out.println(", null");

        printTreeHelper(node.leftChild);
        printTreeHelper(node.rightChild);

    }
}
