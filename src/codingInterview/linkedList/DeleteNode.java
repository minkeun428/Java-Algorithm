package codingInterview.linkedList;

import leetcode.easy.ListNode;

public class DeleteNode {

    ListNode deleteNode(ListNode head, int d) {
        ListNode n = head;
        if(n.data == d) {
            return head.next;       //head를 움직인다.
        }
        while(n.next != null) {
            if(n.next.data == d) {
                n.next = n.next.next;
                return head;    //head는 변하지 않는다.
            }
            n = n.next;
        }
        return head;
    }

}
