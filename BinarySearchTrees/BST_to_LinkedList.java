package BinarySearchTrees;
import BinaryTree.BinaryTreeNode;
import Linked_List.Node;
import java.util.Scanner;

class HeadAndTail<G>{
    Node<G> head;
    Node<G> tail;
    public HeadAndTail(Node<G> head, Node<G> tail)
    {
        this.head=head;
        this.tail=tail;
    }
}


public class BST_to_LinkedList extends BuidBST_UsingSortedArray
{
    //In this we have to use the while loop again and again.
    public static Node<Integer> builLinkedList(BinaryTreeNode<Integer> root)
    {
        if (root==null){
            return null;
        }

        Node<Integer> leftTreeHead=builLinkedList(root.leftChild);
        Node<Integer> curRootHead=new Node<>(root.data);
        Node<Integer> rightTreeHead=builLinkedList(root.rightChild);

        Node<Integer> tail=leftTreeHead;
        //To avoid the null pointer exception when left head is null.
        while(tail!=null && tail.next!=null){
            tail=tail.next;
        }
        if(tail==null){
            curRootHead.next=rightTreeHead;
            return curRootHead;
        }
        tail.next=curRootHead;
        curRootHead.next=rightTreeHead;

        return leftTreeHead;
    }


    //Then we will use class to discontinue the while loop to find the tail.
    public static Node<Integer> constructLinkedList(BinaryTreeNode<Integer> root)
    {
        if (root==null) return null;
        HeadAndTail<Integer> head=constructLinkedListHelper(root);
        return head.head;
    }
    private static HeadAndTail<Integer> constructLinkedListHelper(BinaryTreeNode<Integer> root)
    {
        if (root==null){
            return new HeadAndTail<>(null, null);
        }

        HeadAndTail<Integer> leftTree=constructLinkedListHelper(root.leftChild);
        HeadAndTail<Integer> rightTree=constructLinkedListHelper(root.rightChild);

        Node<Integer> currHead=new Node<>(root.data);
        if (leftTree.head==null){
            leftTree.head=currHead;
            leftTree.tail=currHead;
        }else{
            leftTree.tail.next=currHead;
            leftTree.tail=currHead;
        }
        currHead.next=rightTree.head;

        //If the right tree head is null than it will not execute this line.
        if(rightTree.head!=null) leftTree.tail=rightTree.head;

        return new HeadAndTail<>(leftTree.head, leftTree.tail);
    }



    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        BinaryTreeNode<Integer> root=SortedArrayToBST(arr);

    }
}
