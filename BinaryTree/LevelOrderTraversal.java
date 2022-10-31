package BinaryTree;
import java.util.Queue;
import java.util.LinkedList;

public class LevelOrderTraversal
{
    public static void levelOrderTraversal(BinaryTreeNode<Integer> root)
    {
        if(root==null) return;
        Queue<BinaryTreeNode<Integer>> nodesQueue=new LinkedList<BinaryTreeNode<Integer>>();
        nodesQueue.add(root);
        nodesQueue.add(null);//This act as a level barrier.
        while(!nodesQueue.isEmpty()){
            BinaryTreeNode<Integer> currRoot=nodesQueue.poll();

            if (currRoot==null){
                System.out.println();
                if (!nodesQueue.isEmpty()){
                    nodesQueue.add(null);
                }
            }else{
                System.out.print(currRoot.data+" ");
                if (currRoot.leftChild!=null){
                    nodesQueue.add(currRoot.leftChild);
                }
                if (currRoot.rightChild!=null){
                    nodesQueue.add(currRoot.rightChild);
                }
            }
        }
    }
}
