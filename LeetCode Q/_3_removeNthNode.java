/*
// r    Leetcode 19. Remove Nth Node From End of List (Medium) 
//      Given the head of a linked list, remove the nth node from the end of the list and return its head.
//      url : https://leetcode.com/problems/remove-nth-node-from-end-of-list/

    Solution summary
    1 👉 Two pointers, right and left, are set at the head node.
    2 👉 Move the right pointer n steps forward.
    3 👉 If right reaches NULL, return head's next node.
    4 👉 Move both right and left pointers forward till right reaches the last node.
    5 👉 Relink the left node to the node at left's next to the next node.
    6 👉 Return head.

    TC - O(n) , SC - O(1)
 */

import java.util.LinkedList;

public class _3_removeNthNode {
    public static void main(String[] args) {
        ListNode head = new _3_removeNthNode().new ListNode(1);
        head.next = new _3_removeNthNode().new ListNode(2);
        head.next.next = new _3_removeNthNode().new ListNode(3);
        head.next.next.next = new _3_removeNthNode().new ListNode(4);
        head.next.next.next.next = new _3_removeNthNode().new ListNode(5);

        //nth node from end
        int n = 2;
        ListNode result = removeNthFromEnd(head, n);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode right = head;
        ListNode left = head;
        for (int i = 0; i < n; i++) {
            right = right.next;
        }
        if (right == null) {
            return head.next;
        }
        while (right.next != null) {
            right = right.next;
            left = left.next;
        }
        // what this line does is assign the next node of left to the next.next i.e skipping the nth node it does breaks the link
        //  as we will Update left.next to skip the node we want to remove
        left.next = left.next.next;
        return head;
    }

    void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    // using Java Collections  but TC is O(n) and SC is O(n)
    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        LinkedList<ListNode> list = new LinkedList<>();
        ListNode current = head;

        // Populate the LinkedList with nodes
        while (current != null) {
            list.add(current);
            current = current.next;
        }

        // If n is equal to the size of the list, remove the head
        if (n == list.size()) {
            return head.next;
        }

        // Get the node before the one we want to remove
        ListNode prev = list.get(list.size() - n - 1);
        prev.next = prev.next.next;

        return head;

    }
}
