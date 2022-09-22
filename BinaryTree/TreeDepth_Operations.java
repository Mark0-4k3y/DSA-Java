package BinaryTree;

public class TreeDepth_Operations extends BinaryTreeNode_Use
{

    //Print the elements present at depth k.
    public static void dataAtDepthK(BinaryTreeNode<Integer> root, int kDepth)
    {
        if (root==null) return;

        if(kDepth==0) {
            System.out.println(root.data);
            return;
        }

        dataAtDepthK(root.leftChild, kDepth-1);
        dataAtDepthK(root.rightChild, kDepth-1);
    }


    public static void changeToDepthTree(BinaryTreeNode<Integer> root)
    {
        if(root==null) return;
        changeToDepthTree(root, 0);
    }
    private static void changeToDepthTree(BinaryTreeNode<Integer> root, int depth)
    {
        if(root==null) return;

        root.data=depth;
        changeToDepthTree(root.leftChild, depth+1);
        changeToDepthTree(root.rightChild, depth+1);
    }





    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=takeTreeInput_Easy(true, 0, true);

        System.out.println("Enter the kth depth to find elements at the depth: ");
        int kth=X.nextInt();

        dataAtDepthK(root, kth);

//        changeToDepthTree(root);
//        printDetailed(root);


    }
}
