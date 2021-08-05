package codingInterview.linkedList;

import leetcode.easy.ListNode;

public class DeleteCenterNode {

    boolean deleteNode(ListNode n) {
        if(n == null || n.next == null) {
            return false;
        }
        ListNode next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }
}
