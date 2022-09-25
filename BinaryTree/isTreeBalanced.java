package BinaryTree;


class BalancedTree
{
    int treeHeight;
    boolean isBalanced;
}



public class isTreeBalanced extends BinaryTreeNode_Use
{
    //A tree said to balance if at each node it fulfills this condition:
    // | height(leftSubtree) - height(rightSubtree) | <= 1, and vice versa.


    //This function has not good and efficient time complexity.
    //Time complexity: O(number of nodes * treeHeight).
    public static boolean isBalancedTree(BinaryTreeNode<Integer> root)
    {
        if (root==null) return true;
        int leftSubTreeHeight=treeHeight(root.leftChild);
        int rightSubTreeHeight=treeHeight(root.rightChild);

        int heightDiff=Math.abs(leftSubTreeHeight - rightSubTreeHeight);
        if (heightDiff > 1) return false;

        return isBalancedTree(root.leftChild) && isBalancedTree(root.rightChild);
    }
    private static int treeHeight(BinaryTreeNode<Integer> root)
    {
        if (root==null) return 0;
        return 1 + Math.max((treeHeight(root.leftChild)), treeHeight(root.rightChild));
    }



    //For enhance the time complexity of the isBalanced we will return a object of a class.
    //Class has two values in it.
    //First is tree height.
    //Second is boolean, is tree balanced.
    public static boolean isBalancedBest(BinaryTreeNode<Integer> root)
    {
        if (root==null) return true;
        BalancedTree answer=heightAndBalanced(root);

        return answer.isBalanced;
    }
    private static BalancedTree heightAndBalanced(BinaryTreeNode<Integer> root)
    {
        if (root==null){
            BalancedTree answer=new BalancedTree();
            answer.treeHeight=0;
            answer.isBalanced=true;
            return answer;
        }

        BalancedTree leftOutput=heightAndBalanced(root.leftChild);
        BalancedTree rightOutput=heightAndBalanced(root.rightChild);

        int height= 1 + Math.max(leftOutput.treeHeight, rightOutput.treeHeight);
        boolean isBalanced=true;

        int heightDiff=Math.abs(leftOutput.treeHeight - rightOutput.treeHeight);
        if (heightDiff > 1) isBalanced=false;
        if (!leftOutput.isBalanced || !rightOutput.isBalanced) isBalanced=false;

        BalancedTree answer=new BalancedTree();
        answer.isBalanced=isBalanced;
        answer.treeHeight=height;

        return answer;
     }



    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=takeTreeInput_Easy(true, 0, true);
        printDetailed(root);

        System.out.println("Is this binary tree balanced?: "+isBalancedBest(root));
    }
}
