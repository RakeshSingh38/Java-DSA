/**
 * _2_Floyd_cyle_algorithm
 */
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class _2_Floyd_cyle_algorithm {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        n1.next = n2;
        // this causes the infinite loop as it keeps calling the same node again and again
        //n2.next = n2;

        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n6;
        // infinite loop in the linked list why because n2.next = n2
        //printLinkedList(n1);
        Node res = detectCycle(n1);
        System.out.println(res.val);
    }

    static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    static Node detectCycle(Node head) {
        Node s = head;
        Node f = head;
        while (f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
            // if the slow and fast pointer meet then there is a cycle
            // there's a 100% chance that they will meet at some point
            // as the fast pointer is moving 2x the speed of the slow pointer so it will eventually meet the slow pointer
            if (s == f) {
                f = head;
                while (f != s) {
                    //System.out.print(s.next.val + " -> ");
                    s = s.next;
                    f = f.next;
                }
                return f;  // either return s or f as they are at the same position
            }
        }
        return null;
    }
}