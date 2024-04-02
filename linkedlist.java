import java.util.*;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ls=new LinkedList<Integer>();
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            ls.add(i);
        }
        for(int i=0;i<n;i++){
            
        }

        
    }
    
}
public class linkedlist {
    class Node {
        int data;// data
        Node next;// address
    }
    Node Head = null; // Head store the address of the first node // Head is null so list is empty
    Node Tail = null; // Tail stores the address of the last node // Tail is null so list is empty
    void insertBegining(int value) {
        Node newNode = new Node();
        newNode.data = value;
        if (Head == null) {
            Head = newNode;
            Tail = newNode;
        } else {
            newNode.next = Head;
            Head = newNode;
        }
    }

    void printList() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    void printListV2(Node temp) {
        if (temp == null) {
            return;
        }
        System.out.print(temp.data + " ");
        printListV2(temp.next);
    }

    void printListReverse(Node temp) {
        if (temp == null) {
            return;
        }
        printListReverse(temp.next);
        System.out.print(temp.data + " ");
    }

    void insertAtEnd(int value) {
        Node newNode = new Node();
        newNode.data = value;
        if (Head == null) {
            Head = newNode;
        } else {
            Node Last = Head;
            while (Last.next != null) {
                Last = Last.next;
            }
            Last.next = newNode;
        }
    }

    void insertAtEndV2(int value) {
        Node newNode = new Node();
        newNode.data = value;
        if (Head == null) {
            Head = newNode;
            Tail = newNode;
        } else {
            Tail.next = newNode;
            Tail = newNode;
        }

    }

    void insertAt(int position, int value) {
        Node newNode = new Node();
        newNode.data = value;

        Node curr = Head;
        Node prev = null;

        if (position == 1) {
            insertBegining(value);
            return;
        }
        while (position != 1) {
            if (curr == null) {
                System.out.println("Invalid Position");
                return;
            }
            prev = curr;
            curr = curr.next;
            position--;
        }
        prev.next = newNode;
        newNode.next = curr;
    }

    void reverseList() {
        Node Prev = null;
        Node Current = Head;
        Node Next = null;

        while(Current != null) {
            // Move the Next to Current.next
            Next = Current.next;
            // Make current to store the address of previous
            Current.next = Prev;

            Prev = Current;

            Current = Next;
        }
        Head = Prev;
    }

    Node getMiddleNode() {
        Node fast = Head;
        Node slow = Head;
        while (fast.next != null && fast != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    void deleteValue(int value) {
        if (Head.data == value) {
            Head = Head.next;
        } else {
            Node current = Head.next;
            Node prev = Head;
            while (current != null) {
                if (current.data == value) {
                    break;
                }
                prev = current;
                current = current.next;
            }
            prev.next = current.next;
        }
    }

    public static void main(String[] args) {
        linkedlist myList = new linkedlist();
        myList.insertBegining(10);
        myList.insertBegining(20);
        myList.insertBegining(30);
        myList.insertBegining(40);
        myList.insertBegining(50);
        myList.printList();
        myList.printListV2(myList.Head);
        myList.printListReverse(myList.Head);
        myList.insertAtEndV2(60);
        myList.insertAtEndV2(70);
        myList.insertAt(3, 99);
        myList.reverseList();
        System.out.println(myList.getMiddleNode().data);
        myList.deleteValue(30);
        myList.printList();
        myList.deleteValue(50);
        myList.printList();
    }
}
