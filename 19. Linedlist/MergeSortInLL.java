public class MergeSortInLL {

    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next=null;
        } 
    }

    public static Node head;
    public static Node tail;

    private Node getMid(Node head)
    {
        Node slow = head;
        Node fast = head.next;  //For even number of LL we need Last node first Part;

        while(fast!=null && fast.next!=null)
        {
            slow= slow.next;
            fast= fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2)
    {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1!=null && head2!=null)
        {
            if(head1.data  <= head1.data)
            {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else
            {
                temp.next = head2;
                head2 = head2.next;
                temp  = temp.next;
            }
        }

        while(head1!= null)
        {
            temp=head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2!= null)
        {
            temp=head2;
            head2 = head2.next;
            temp = temp.next;
        }
    }

    public Node MergeSort()
    {
        if(head == null && head.next != null)
        {
            return head;
        }
        //Find mid
        Node mid = getMid(head);

        //left and Right MS calling
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = MergeSort();
        Node newRight = MergeSort();
        
        //merge
        retrun merge(newLeft,newRight);

    }    
}
