package Linked_List;
import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.Scanner;

public class Pallindrome_LinkedList extends Linked_List_Basic
{
    //This has space complexity of S(1).
    public static boolean isPalindromeBest(Node<Integer> head)
    {
        if (head==null || head.next==null) return true;
        if (head.next.next==null){
            if (head.data==head.next.data) return true;
            else return false;
        }

        int numOdNodes=0;
        Node<Integer> temp=head;
        while(temp!=null){
            numOdNodes++;
            temp=temp.next;
        }temp=head;
        Node<Integer> firstList=head;
        Node<Integer> secondList=head.next;

//        Instead of finding the middle I can also use Fast slow appraoch
//        int count=1;
//        while(count<numOdNodes/2){
//            temp=secondList;
//            secondList=secondList.next;
//            count++;
//        }temp.next=null;

        secondList=middle(head);
        secondList=reverseLL(secondList);
        while(secondList!=null && firstList!=null){
            if (secondList.data!=firstList.data) return false;
            secondList=secondList.next;
            firstList=firstList.next;
        }
        return true;
    }
    //Fast and Slow approach to find the middle one.
    public static Node<Integer> middle(Node<Integer> head)
    {
        Node<Integer> fast=head;
        Node<Integer> slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }



    //This has space complexity of S(n).
    public static boolean isPalindrome(Node<Integer> head)
    {
        //Base Case.
        if(head==null || head.next==null) return true;

        //Creating an Arrayslist
        ArrayList<Integer> arr=new ArrayList<>();
        Node<Integer> temp=head;
        while(temp!=null){
            arr.add(temp.data);
            temp=temp.next;
        }

        int front=0, back=arr.size()-1;
        while(front<=back){
            if(arr.get(front)!=arr.get(back)) return false;
            front++;
            back--;
        }
        return true;
    }


    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        Node<Integer> head=takeInput1();
        printLL2(head);
        boolean isPall=isPalindromeBest(head);
        System.out.println("Is the given linked list palindrome?"+isPall);
    }

    public static Node<Integer> reverseLL(Node<Integer> head) {
        if (head == null || head.next == null) return head;

        Node<Integer> curNode = head.next;
        Node<Integer> preNode = head;
        Node<Integer> nextNode = curNode.next;

        preNode.next = null;
        while (nextNode != null) {
            curNode.next = preNode;
            preNode = curNode;
            curNode = nextNode;
            nextNode = nextNode.next;
        }
        curNode.next = preNode;
        return curNode;
    }
}



// public class Solution
// {
// 	public static boolean isPalindrome(LinkedListNode<Integer> head)
//     {
//         if(head==null || head.next==null) return true;

//         int size=size(head);
//         int[] arr=new int[size];
//         LinkedListNode<Integer> temp=head;
//         for(int i=0; i<arr.length; i++){
//             arr[i]=temp.data;
//             temp=temp.next;
//         }

//         int front=0, back=arr.length-1;
//         while(front<=back){
//             if(arr[front]!=arr[back]) return false;
//             front++;
//             back--;
//         }
//         return true;
//  	}

//     public static int size(LinkedListNode<Integer> head)
//     {
//         int count=0;
//         LinkedListNode<Integer> temp=head;
//         while(temp!=null){
//             count++;
//             temp=temp.next;
//         }
//         return count;
//     }
// }


// public class Solution {

// 	public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){


// 		if(head.next==null ) {
// 			return head;
// 		}

// 		LinkedListNode<Integer> tail=head.next;
// 		LinkedListNode<Integer> newHead= reverse(head.next);
// 		tail.next=head;
// 		head.next=null;
// 		return newHead;
// 	}


// 	public static boolean isPalindrome(LinkedListNode<Integer> head) {

//         if(head==null || head.next==null) return true;

// 		LinkedListNode<Integer> slow=head,fast=head;

// 		while(fast.next!=null && fast.next.next!=null) {

// 			slow=slow.next;
// 			fast=fast.next.next;
// 		}
// 		LinkedListNode<Integer> head1=slow.next;
// 		LinkedListNode<Integer> head2= head;
// 		head1=reverse(head1);

// 		while(head1!=null && head2!=null) {

// 			if(!head1.data.equals(head2.data)) {
// 				return false;
// 			}
// 			head1=head1.next;
// 			head2=head2.next;
// 		}
// 		return true;

// 	}

// }



// This is an addition approach towards palindrome number


// public class Solution
// {
// 	public static boolean isPalindrome(LinkedListNode<Integer> head)
//     {
//         if(head==null || head.next==null) return true;
//        LinkedListNode<Integer> temp=head;
//         int count=0;
//         while(temp!=null){
//             count++;
//             temp=temp.next;
//         }
//         temp=head;
//         if(count%2==0){
//             return left(head, count/2)==right(head, count/2);
//         }else{
//             return left(head, count/2-1)==right(head, count/2);
//         }

// 	}


//     public static int left(LinkedListNode<Integer> head, int center)
//     {
//         if(head==null) return 0;
//     	LinkedListNode<Integer> temp=head;
//         int leftSum=0, count=0;
//         while(count<=center){
//             leftSum+=temp.data;
//             temp=temp.next;
//             count++;
//         }
//         // System.out.println(leftSum);
//         return leftSum;
//     }



//     public static int right(LinkedListNode<Integer> head, int center)
//     {
//         if(head==null) return 0;

//     	LinkedListNode<Integer> temp=head;
//         int rightSum=0, count=0;
//         while(temp!=null){
//            if(count>center){
//             rightSum+=temp.data;
//             temp=temp.next;
//             count++;
//            }else{
//                count++;
//                temp=temp.next;
//            }
//         }
//         // System.out.println("RightSUm"+rightSum);
//         return rightSum;
//     }
// }