package Linked_List;
public class Traverse_M_and_N extends Linked_List_Basic
{
    public static Node<Integer> traverseMN(Node<Integer> head, int M, int N)
    {
        if(head==null || N==0) return head;
        if(M==0) return null;

        Node<Integer> traverse=head;
        while(traverse.next!=null){
            int save=0, delete=0;
            while(save<M-1 && traverse.next!=null){
                traverse=traverse.next;
                save++;
            }
            Node<Integer> jump=traverse.next;
            while(delete<N && jump.next!=null){
                jump=jump.next;
                delete++;
            }

            if(jump.next==null && delete<N){
                traverse.next=null;
                break;
            }

            traverse.next=jump;
            traverse=jump;
        }
        return head;
    }


    public static void main(String[] args)
    {
        Node<Integer> head=takeInput1();
        printLL2(head);

        System.out.println("Enter the M number you want to save and N number you want to traverse the linked list: ");
        int M=X.nextInt();
        int N=X.nextInt();

        head=traverseMN(head, 2, 3);
        System.out.println("Linked List after traversing.");
        printLL2(head);
    }
}
