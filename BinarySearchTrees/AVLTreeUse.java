package BinarySearchTrees;

public class AVLTreeUse
{
    public static void main(String[] args) {
        AVL tree = new AVL();

        /* Constructing tree given in the above figure */
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);

        /* The constructed AVL Tree would be
             30
            /  \
          20   40
         /  \     \
        10  25    50
        */

        System.out.println("Preorder traversal" + " of constructed tree is : ");
        tree.preOrder(tree.root);
        System.out.println("");
        AVL anotherTree=new AVL();
        anotherTree.insert(10);
        anotherTree.insert(20);
        anotherTree.insert(30);
        anotherTree.insert(40);
        anotherTree.insert(50);
        anotherTree.insert(25);
        anotherTree.insert(30);
        System.out.println("Preorder traversal" + " of constructed tree is : ");
        anotherTree.preOrder(anotherTree.root);
        System.out.println("");


        //Deletion operation.
        AVL newTree = new AVL();
        /* Constructing tree given in the above figure */
        newTree.insert(9);
        newTree.insert(5);
        newTree.insert(10);
        newTree.insert(0);
        newTree.insert(6);
        newTree.insert(11);
        newTree.insert(-1);
        newTree.insert(1);
        newTree.insert(2);

        /* The constructed AVL Tree would be
        9
        / \
        1 10
        / \ \
        0 5 11
        / / \
        -1 2 6
        */
        System.out.println("");
        System.out.println("Preorder traversal of "+"constructed tree is : ");
        newTree.preOrder(newTree.root);
//        Preorder traversal of the constructed AVL tree is
//        9 1 0 -1 5 2 6 10 11

        newTree.deletion(9);
        System.out.println("");
        System.out.println("Preorder traversal after "+"deletion of 10 :");
        newTree.preOrder(newTree.root);
//        Preorder traversal after deletion of 10
//        1 0 -1 9 5 2 6 11
    }
}
