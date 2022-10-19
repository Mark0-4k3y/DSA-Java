package BinarySearchTrees;
import BinaryTree.BinaryTreeNode;

class DeleteNode{
    BinaryTreeNode<Integer> root;
    boolean isPresent;
    public DeleteNode(BinaryTreeNode<Integer> root, boolean isPresent)
    {
        this.root=root;
        this.isPresent=isPresent;
    }
}

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
        DeleteNode delete=deleteNode(root, nodeData);

    }
    private static DeleteNode deleteNode(BinaryTreeNode<Integer> root, int deleteData)
    {
        if (root==null){return new DeleteNode(null, false);}

        if (deleteData<root.data){
            DeleteNode leftUpdated=deleteNode(root.leftChild, deleteData);
            root.leftChild=leftUpdated.root;
            leftUpdated.root=root;
            return leftUpdated;
        }else if(root.data<deleteData){
            DeleteNode rightUpdated=deleteNode(root.rightChild, deleteData);
            root.rightChild=rightUpdated.root;
            rightUpdated.root=root;
            return rightUpdated;
        }else{
            //First case when the root has no child:
            if (root.leftChild==null && root.rightChild==null){
                return new DeleteNode(null, true);
            }else if(root.leftChild==null && root.rightChild!=null){
                return new DeleteNode(root.rightChild, true);
            }else if(root.leftChild!=null && root.rightChild==null){
                return new DeleteNode(root.leftChild, true);
            }else{
                /*
                In this case when both child are present. We will have to replace the root data.

                1. First is we can the largest node data from left child band replace it with to delete node data.
                   But the problem is this that, if on the left side the tree contain duplicate numbers than it will not make a Binary Search tree.
                   Because in BST left side nodes should be less than and also not equal to the parent root.

                2. So we have to find the minimum from the right child and replace it with the delete root data
                   In this if multiple duplicate nodes present than it will follow BST rule.
                 */

                BinaryTreeNode<Integer> smallestNode=root.rightChild;
                while(smallestNode.leftChild!=null){
                    smallestNode=smallestNode.leftChild;
                }
                root.data=smallestNode.data;
                DeleteNode updatesRight=deleteNode(root.rightChild, smallestNode.data);
                root.rightChild=updatesRight.root;
                return new DeleteNode(root, true);
            }
        }
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
