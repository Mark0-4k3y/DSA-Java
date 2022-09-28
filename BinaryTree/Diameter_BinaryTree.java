package BinaryTree;

class HeigthAndDiameter{
    int height;
    int diameter;

    public HeigthAndDiameter(){
        height=0;
        diameter=0;
    }
    public HeigthAndDiameter(int height, int diameter){
        this.height=height;
        this.diameter=diameter;
    }
}

public class Diameter_BinaryTree extends BinaryTreeNode_Use
{
    public static int binaryTreeDiameter(BinaryTreeNode<Integer> root)
    {
        if (root==null) return 0;

        HeigthAndDiameter answer=diameter(root);
        return answer.diameter;
    }
    private static  HeigthAndDiameter diameter(BinaryTreeNode<Integer> root)
    {
        if (root==null){
            //In this constructor the default value of height and diameter is 0.
            return new HeigthAndDiameter();
        }

        HeigthAndDiameter leftSubtree=diameter(root.leftChild);
        HeigthAndDiameter rightSubtree=diameter(root.rightChild);

        //Defining the diameter.
        int leftDiameter=leftSubtree.diameter;
        int rightDiameter=rightSubtree.diameter;

        //Distance denotes the deepest distance between left subtree node and right subtree node.
        int distance= 1 + leftSubtree.height + rightSubtree.height;

        int diameter=Math.max(distance, Math.max(leftDiameter, rightDiameter));
        int height = 1 + Math.max(leftSubtree.height, rightSubtree.height);

        return new HeigthAndDiameter(height, diameter);
    }


    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=takeTreeInput_Easy(true, 0, true);
        printDetailed(root);

        System.out.println("The diameter of binary tree is: "+binaryTreeDiameter(root));
    }
}
