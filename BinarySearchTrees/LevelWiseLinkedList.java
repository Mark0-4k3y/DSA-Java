package BinarySearchTrees;
import java.util.LinkedList;
import java.util.Queue;

import BinaryTree.Basic_Operations;
import Linked_List.Node;
import java.util.ArrayList;
import BinaryTree.BinaryTreeNode;

//Linked List Node Class
//public class Node<G>
//{
//    public G data;
//    public Linked_List.Node next;
//
//    public Node(G data)
//    {
//        this.data=data;
//        next=null;
//    }
//
//    public Node()
//    {
//        next=null;
//    }
//}

public class LevelWiseLinkedList extends Basic_Operations
{

    //This has better time complexity than the other one method.
    public static ArrayList<Node<Integer>> constructLinkedListForEachLevelBetter(BinaryTreeNode<Integer> root)
    {
        if(root==null) return null;

        Queue<BinaryTreeNode<Integer>> nodes=new LinkedList<>();
        nodes.add(root);
        int remainListNodes=1;
        int nodesToAdd=0;

        Node<Integer> head=null, tail=null;

        ArrayList<Node<Integer>> arrList=new ArrayList<Node<Integer>>();

        while(!nodes.isEmpty()){
            BinaryTreeNode<Integer> curRoot=nodes.poll();
            Node<Integer> tempHead=new Node<>(curRoot.data);
            if(head==null){
                head=tempHead;
                tail=head;
            }else{
                tail.next=tempHead;
                tail=tempHead;
            }

            if(curRoot.leftChild!=null){
                nodesToAdd++;
                nodes.add(curRoot.leftChild);
            }
            if(curRoot.rightChild!=null) {
                nodesToAdd++;
                nodes.add(curRoot.rightChild);
            }
            remainListNodes-=1;

            if(remainListNodes==0){
                arrList.add(head);
                remainListNodes=nodesToAdd;
                head=null;
                tail=null;
                nodesToAdd=0;
            }
        }

        return arrList;
    }


    public static ArrayList<Node<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root)
    {
         if (root==null) return null;
         Queue<BinaryTreeNode<Integer>> nodes=new LinkedList<>();
         nodes.add(root);
         nodes.add(null);

         ArrayList<Node<Integer>> arrList=new ArrayList<Node<Integer>>();
         while (!nodes.isEmpty()){
             Node<Integer> head=null;
             Node<Integer> tail;

             BinaryTreeNode<Integer> curRoot=nodes.poll();
             if (curRoot!=null) {
                 head=new Node<>(curRoot.data);
 				tail=head;

 				if (curRoot.leftChild!=null) nodes.add(curRoot.leftChild);
 				if (curRoot.rightChild!=null) nodes.add(curRoot.rightChild);

 			    while(nodes.peek()!=null){
 					BinaryTreeNode<Integer> remove=nodes.poll();

 					if(remove.leftChild!=null) nodes.add(remove.leftChild);
 					if(remove.rightChild!=null) nodes.add(remove.rightChild);

 					Node<Integer> temp=new Node<>(remove.data);
                     tail.next=temp;
 					tail=temp;
                 }
 				arrList.add(head);
 				curRoot=nodes.poll();
 				if(!nodes.isEmpty()){
 					nodes.add(null);
 				}
             }
         }
         return arrList;
    }





    private static void print(Node<Integer> temp)
    {
        while(temp != null){
            System.out.print(temp.data + " ") ;
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        BinaryTreeNode<Integer> root = takeInputLevelwise();
        ArrayList<Node<Integer>> output = constructLinkedListForEachLevel(root);
        if(output!=null)
        {
            for(Node<Integer> head : output){
                print(head);

            }
        }
    }

}
