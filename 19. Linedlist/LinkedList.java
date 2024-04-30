// import java.util.Scanner;

public class LinkedList {    
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;    
    public static Node tail;
    public static int size;


    public void addFirst(int data) {

        // Step 1---create a new linked list
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step2----NewNode next =head
        newNode.next = head; // link

        // Step 3 -----head =m nbewNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public void print()
    {
        if (head == null) {
            System.out.print("Linked List Is empty");
        }
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data);
            System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addMiddle(int data, int index1)
    {
         if( index1 == 0)
         {
            addFirst(data);
            return;
         }
        Node newNode = new Node(data);
        size++;
        int count = 0;
        Node temp = head;
        while(count != index1 - 1)
        {
            temp = temp.next;
            count ++;
        }
        newNode.next= temp.next;
        temp.next = newNode;
    }

    public int removeFirst()
    {
        if(head == null)
        {
            return Integer.MIN_VALUE; 
        }
        else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        else 
        {
            int val = head.data;
            head = head.next;
            System.out.println(val  + " Is Deleted....");
            size --;
            return val;
        }
    }

    public int removeLast()
    {
        if(head == null)
        {
            return Integer.MIN_VALUE; 
        }
        else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        else 
        {
            Node prev  = head;
            for (int i =0; i<size - 2; i++)
            {
                prev = prev.next;
            }

            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size --;
            return val;
        }
    }

    public int itrsearch(int key)
    {
         Node temp = head;
         int i=0;

         while(temp != null)
         {
            if(temp.data == key)
            {
                return i;
            }
            temp = temp.next;
            i++;
         }
         
         ///If Key not Found 
         return -1;

    } 

    //Recursive function for searching///////////////////////////////////////////////////////////////////

    public int helper(Node head, int key)
    {
        if(head == null)
        {
            return -1;
        }
        if(head.data == key)
        {
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1)
        {
            return -1;
        }

        return idx +1;
    }

    public int recSearch(int key)
    {
        return helper(head, key);
    }
/////////////////////////////////////////////Reversing the linked list /////////////////////////////////////////////////////

    public void Reverse()
    {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
/////////////////////////////////////////Remove the nth node from the last////////////////////////////////////////////

    public void deleteNthfromEnd(int n)
    {
        //Calculate Size
        int sz = 0;
        Node temp =head;
        while(temp !=null)
        {
            temp = temp.next;
            sz++;
        }

        if(n == sz )
        {
            head = head.next;  ///Remove the first 
                                //Remove last elements from the Last ie head
            return ;
        }
        //sz - n 
        int i  = 1;
        int iToFind = sz -n ;
        Node prev =  head  ;
        while( i < iToFind)
        {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    ///////////////////Finding middle Node for Linked list/////////////////////////////////////////////
    ///By slow fast Approach
    public Node findMid(Node head)       //helper for check palindrome
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next; //+1
            fast  = fast.next.next; //+2
        }
        return slow;

    }


    ///PAlindrone Function.............
    public boolean checkPalindrome()
    {
        if(head == null || head.next != null)
        {
            return true;
        }
        //Step 1 - Find mid
        Node midNode 
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter first number- ");
        // int choice = sc.nextInt();
        // System.out.print(choice);
        size = 0;
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addFirst(2);
        ll.addLast(8);
        ll.addMiddle(6,2);
        ll.addMiddle(9,6);
        ll.print();
        ll.removeFirst();
        ll.removeLast();
        ll.print();
        // int ans = ll.recSearch(8);
        // System.out.println(ans);
        // ll.Reverse();
        ll.deleteNthfromEnd(3);
        ll.print();



    }
}
