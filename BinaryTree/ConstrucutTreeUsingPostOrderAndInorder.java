package BinaryTree;

public class ConstrucutTreeUsingPostOrderAndInorder extends TakeInputLevelWise
{
    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder)
    {
        if(inOrder.length==0 || postOrder.length==0) return null;

        return buildTree(postOrder, 0, postOrder.length-1, inOrder, 0, inOrder.length-1);
    }
    private static BinaryTreeNode<Integer> buildTree(int[] postOrder, int siPost, int eiPost, int[] inOrder, int siIn, int eiIn)
    {
        //Base Condition.
        if(siPost>eiPost || siIn>eiIn) {
//            System.out.println("Start index is greater than end Index: "+siPost+" "+eiPost);
            return null;
        }

        //When tree only have one element in it.
        if(siPost==eiPost) return new BinaryTreeNode<Integer>(postOrder[siPost]);

        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(postOrder[eiPost]);

        //Finding root Index in Inorder array.
        int rootIndex=-1;
        for(int index=siIn; index<=eiIn; index++){
            if(inOrder[index]==root.data){
                rootIndex=index;
                break;
            }
        }
        if(rootIndex==-1) {
//            System.out.println("No root present....");
            return null;
        }

//        System.out.println("Root data: "+root.data);

        //Length of leftSubtree
        int leftSubtreeLength = rootIndex-siIn;

        //LeftSubtree Attributes.
        int siLeftPost=siPost;
        int eiLeftPost=siPost+leftSubtreeLength-1;
        int siLeftIn=siIn;
        int eiLeftIn=rootIndex-1;

        //RightSubtree Attributes.
        int siRightPost=siPost+leftSubtreeLength;
        int eiRightPost=eiPost-1;
        int siRightIn=rootIndex+1;
        int eiRightIn=eiIn;

        //Building the left and the right Subtree.
        BinaryTreeNode<Integer> leftSubtree=buildTree(postOrder, siLeftPost, eiLeftPost, inOrder, siLeftIn, eiLeftIn);
        BinaryTreeNode<Integer> rightSubtree=buildTree(postOrder, siRightPost, eiRightPost, inOrder, siRightIn, eiRightIn);

        //Attaching the leftChild Subtree and right Child Subtree to the root.
        root.leftChild=leftSubtree;
        root.rightChild=rightSubtree;

        return root;
    }

    public static void main(String[] args)
    {
       int[] postOrder={1, 4, 7, 6, 3, 13, 14, 10, 8};
       int[] inOrder={1, 3, 4, 6, 7, 8, 10, 13, 14};

       BinaryTreeNode<Integer> root=buildTree(postOrder, inOrder);
       printLevelWise(root);
    }
}
