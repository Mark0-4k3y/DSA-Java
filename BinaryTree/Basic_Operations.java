package BinaryTree;

import com.sun.source.tree.IfTree;

public class Basic_Operations extends BinaryTreeNode_Use
{
    public static int numOfNodes(BinaryTreeNode<Integer> root)
    {
        if (root==null) return 0;

//        int thisNode=1;
//        int numOfNodes_leftchild = numOfNodes(root.leftChild);
//        int numOfNodes_rightChild = numOfNodes(root.rightChild);
//        return thisNode + numOfNodes_leftchild + numOfNodes_rightChild;

        return 1 + numOfNodes(root.leftChild) + numOfNodes(root.rightChild);
    }

    public static int sumOfTreeNodes(BinaryTreeNode<Integer> root)
    {
        if (root==null) return 0;

//        int thisNode=root.data;
//        int sumOfLeftSubtree=sumOfTreeNodes(root.leftChild);
//        int sumOfRightSubtree=sumOfTreeNodes(root.rightChild);
//        return thisNode + sumOfLeftSubtree + sumOfRightSubtree;

        return root.data + sumOfTreeNodes(root.leftChild) + sumOfTreeNodes(root.rightChild);
    }


    public static void preOrderPrint(BinaryTreeNode<Integer> root)
    {
        if (root == null) return;

        System.out.println(root.data+" ");
        preOrderPrint(root.leftChild);
        preOrderPrint(root.rightChild);
    }

    public static void postOrderPrint(BinaryTreeNode<Integer> root)
    {
        if (root==null) return;

        postOrderPrint(root.leftChild);
        postOrderPrint(root.rightChild);
        System.out.println(root.data+" ");
    }

    public static void inOrderPrint(BinaryTreeNode<Integer> root)
    {
        if (root==null) return;
        inOrderPrint(root.leftChild);
        System.out.println(root.data+"");
        inOrderPrint(root.rightChild);
    }



    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=takeTreeInput_Easy(true, 0, true);

        System.out.println("\nPrinting Pre order: ");
        preOrderPrint(root);

        System.out.println("\nPrinting Post order: ");
        postOrderPrint(root);

        System.out.println("\nPrinting In order: ");
        inOrderPrint(root);
    }
}
