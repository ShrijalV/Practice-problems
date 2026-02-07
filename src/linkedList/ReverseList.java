package linkedList;

class Node {
    int val;
    Node next;

    Node(int v) {
        val = v;
    }
}

class ReverseList {

    Node reverse(Node head) {
        Node prev = null;

        while (head != null) {
            Node next = head.next; // save next
            head.next = prev;      // reverse link
            prev = head;           // move prev
            head = next;           // move head
        }
        return prev;
    }

    void print(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseList obj = new ReverseList(); // object

        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);

        System.out.print("Original: ");
        obj.print(head);

        head = obj.reverse(head);

        System.out.print("Reversed: ");
        obj.print(head);
    }
}


