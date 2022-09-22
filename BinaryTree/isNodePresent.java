package BinaryTree;

public class isNodePresent extends BinaryTreeNode_Use
{
    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x)
    {
        if(root==null) return false;

        if(root.data==x) return true;

        return(isNodePresent(root.leftChild, x) || isNodePresent(root.rightChild, x));
    }

    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=takeTreeInput_Easy(true, 0, true);

        System.out.println("Enter the data to find id the node is present in the binary tree or not!");
        int data=X.nextInt();

        System.out.println("Is node with data "+data+" present in binary tree? "+isNodePresent(root, data));
    }
}
