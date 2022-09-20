package BinaryTree;

public class Node_GreatestThan_X extends BinaryTreeNode_Use
{
    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x)
    {
        if(root==null) return 0;

        int leftSubtree=countNodesGreaterThanX(root.leftChild,x);
        int rightSubtree=countNodesGreaterThanX(root.rightChild,x);

        if(root.data>x){
            return 1 + leftSubtree + rightSubtree;
        }

        return leftSubtree + rightSubtree;
    }


    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=takeTreeInput_Easy(true, 0, false);
        System.out.println("Enter the X value to find nodes greater than it in the binary tree: ");
        int num=X.nextInt();
        System.out.println("Total number of nodes in binary tree which are greater than "+num+" are: "+countNodesGreaterThanX(root, num));
    }
}
