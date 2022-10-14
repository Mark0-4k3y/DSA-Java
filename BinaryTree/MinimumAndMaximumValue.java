package BinaryTree;

public class MinimumAndMaximumValue extends TakeInputLevelWise
{
    static class Pair<T, U> {
        T minimum;
        U maximum;

        public Pair(T minimum, U maximum) {
            this.minimum = minimum;
            this.maximum = maximum;
        }

    }

    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root)
    {
        if(root==null){
//            int min=Integer.MAX_VALUE;
//            int max=Integer.MIN_VALUE;
            Pair answer=new Pair<Integer, Integer>(Integer.MAX_VALUE, Integer.MIN_VALUE);
            return answer;
        }

        Pair<Integer, Integer> leftSubtree = getMinAndMax(root.leftChild);
        Pair<Integer, Integer> rightSubtree = getMinAndMax(root.rightChild);

        int min=Math.min(root.data, Math.min(leftSubtree.minimum, rightSubtree.minimum));
        int max=Math.max(root.data, Math.max(leftSubtree.maximum, rightSubtree.maximum));

        return new Pair(min, max);
    }
}
