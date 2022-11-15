package BinarySearchTrees;

class AVLNode{
    int data, height;
    AVLNode left;
    AVLNode right;
    public AVLNode(int data){
        this.data=data;
        height=1;
    }
}

public class AVL
{
    AVLNode root;

    // A utility function to get the height of the tree
    int height(AVLNode node) {
        if (node == null) return 0;
        return node.height;
    }

    //Right rotate the tree.
    public AVLNode rightRotate(AVLNode node)
    {
        AVLNode leftNode=node.left;
        AVLNode leftNodeChild=leftNode.right;

        //Perform rotation.
        leftNode.right=node;
        node.left=leftNodeChild;//Assigning the rightNode children to node lefts;

        //Maintain the height of the nodes;
        node.height=Math.max(height(node.left), height(node.right)) + 1;
        leftNode.height=Math.max(height(leftNode.left), height(leftNode.right)) + 1;

        return leftNode;
    }

    //Left rotate the tree.
    public AVLNode leftRotate(AVLNode node){
        AVLNode rightNode=node.right;
        AVLNode rightNodeChild=rightNode.left;

        //Rotation.
        rightNode.left=node;
        node.right=rightNodeChild;

        //Height Update.
        node.height=Math.max(height(node.left), height(node.right)) + 1;
        rightNode.height=Math.max(height(node.left), height(node.right)) + 1;

        return rightNode;
    }

    // Get Balance factor of node N
    int getBalance(AVLNode N)  {
        if (N == null)
            return 0;

        return height(N.left) - height(N.right);
    }

    //Insertion function of AVL trees.
    public void insert(int nodeDataInsert){
        root=insert(root, nodeDataInsert);
    }
    private  AVLNode insert(AVLNode root, int nodeData) {
        if (root==null){
            return new AVLNode(nodeData);
        }

        //Sending the node to exact location in BST.
        if (nodeData < root.data){
            root.left = insert(root.left, nodeData);
        }else{
            root.right=insert(root.right, nodeData);
        }

        //Updating the height of the root.
        root.height=Math.max(height(root.right), height(root.left)) + 1;

        //Finding if the tree is balanced or not.
        int balanceValue=getBalance(root);

        //Case 1: LeftLeft case.
        if (balanceValue > 1 && (nodeData < root.left.data)){
            AVLNode updatedRoot=rightRotate(root);
            return updatedRoot;
        }else if(balanceValue < -1 && (nodeData > root.right.data)){
            //Case 2: RightRight Case.
            AVLNode updatedRoot=leftRotate(root);
            return updatedRoot;
        }else if(balanceValue < -1 && nodeData < root.right.data){
            //Case 3: RightLeft case.
            root.right=rightRotate(root.right);
            AVLNode updatedRoot=leftRotate(root);
            return updatedRoot;
        }else if(balanceValue > 1 && nodeData > root.left.data){
            //Case 4: LeftRight case.
            root.left=leftRotate(root.left);
            AVLNode updatedRoot=rightRotate(root);
            return updatedRoot;
        }

        return root;
    }


    //Deletion operation on AVL Trees.
    public void deletion(int deleteData){root=deletion(root, deleteData);}
    private AVLNode deletion(AVLNode root, int deleteData)
    {
        if (root==null) return root;

        if (deleteData < root.data){
            AVLNode updatedLeftTree=deletion(root.left, deleteData);
            root.left=updatedLeftTree;
        }else if (deleteData > root.data){
            AVLNode updatedRight=deletion(root.right, deleteData);
            root.right=updatedRight;
        }else{
            //When the root has no child.
            if (root.left==null && root.right==null){
                root=null;
            }else if (root.left!=null && root.right==null){
                root.data=root.left.data;
                root.left=null;
            }else if (root.left==null && root.right!=null){
                root.data=root.right.data;
                root.right=null;
            }else{
                AVLNode smallestNode=root.right;
                while(smallestNode.left!=null){
                    smallestNode=smallestNode.left;
                }
                root.data=smallestNode.data;
                AVLNode rightUpdated=deletion(root.right, smallestNode.data);
                root.right=rightUpdated;
            }
        }

        if (root==null) return root;

        root.height=Math.max(height(root.left), height(root.right)) + 1;

        int balanceDiff=getBalance(root);
        //Case 1: LeftLeft case.
        if (balanceDiff > 1 && getBalance(root.left) >= 0){
            AVLNode updatedRoot=rightRotate(root);
            return updatedRoot;
        }else if(balanceDiff < -1 && (getBalance(root.right) <= 0)){
            //Case 2: RightRight Case.
            AVLNode updatedRoot=leftRotate(root);
            return updatedRoot;
        }else if(balanceDiff < -1 && getBalance(root.right) > 0){
            //Case 3: RightLeft case.
            root.right=rightRotate(root.right);
            AVLNode updatedRoot=leftRotate(root);
            return updatedRoot;
        }else if(balanceDiff > 1 && getBalance(root.left) < 0){
            //Case 4: LeftRight case.
            root.left=leftRotate(root.left);
            AVLNode updatedRoot=rightRotate(root);
            return updatedRoot;
        }

        return root;
    }


    public static void preOrder(AVLNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
}
