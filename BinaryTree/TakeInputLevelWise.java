package BinaryTree;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class TakeInputLevelWise extends BinaryTreeNode_Use
{
    public static Scanner X=new Scanner(System.in);

    public static BinaryTreeNode<Integer> takeInputLevelwise(){
        System.out.println("Enter the root data for the binary tree: ");
        int rootData=X.nextInt();
        if (rootData==-1) return null;

        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingNodes=new LinkedList<BinaryTreeNode<Integer>>();
        pendingNodes.add(root);//Here I am giving whole root instead of root data because I have to attach right and left child to it.

        while (!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> parentRoot=pendingNodes.poll();

            System.out.println("Enter the left node data for the root "+parentRoot.data);
            int leftData=X.nextInt();
            if (leftData!=-1){
                BinaryTreeNode<Integer> leftChild=new BinaryTreeNode<>(leftData);
                pendingNodes.add(leftChild);//Again adding the root itself in the queue.
                parentRoot.leftChild=leftChild;
            }

            System.out.println("Enter the right child node data for the root "+parentRoot.data);
            int rightData=X.nextInt();
            if (rightData!=-1){
                BinaryTreeNode<Integer> rightChild=new BinaryTreeNode<>(rightData);
                pendingNodes.add(rightChild);
                parentRoot.rightChild=rightChild;
            }
        }
        return root;
    }

    public static void printLevelWise(BinaryTreeNode<Integer> root)
    {
        if (root==null) return;
        Queue<BinaryTreeNode<Integer>> nodesToPrint=new LinkedList<BinaryTreeNode<Integer>>();
        nodesToPrint.add(root);
        while(!nodesToPrint.isEmpty()){
            BinaryTreeNode<Integer> printRoot=nodesToPrint.poll();
            System.out.print("Root "+printRoot.data+": LeftChild->");

            //Printing leftChildData.
            if (printRoot.leftChild!=null){
                System.out.print(printRoot.leftChild.data+", RightChild->");
                nodesToPrint.add(printRoot.leftChild);
            }else{
                System.out.print("null, RightChild->");
            }

            //Printing rightChildData.
            if (printRoot.rightChild!=null){
                System.out.print(printRoot.rightChild.data+"\n");
                nodesToPrint.add(printRoot.rightChild);
            }else{
                System.out.print("null\n");
            }
        }
    }

    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=takeInputLevelwise();
        System.out.println("Level wise print: ");
        printLevelWise(root);

        System.out.println("\nOrder wise print: ");
        printDetailed(root);
    }
}
