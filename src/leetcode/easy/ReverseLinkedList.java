package leetcode.easy;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        //서로 긴밀하게 연결되어 있기 때문에
        //코드는 보기 쉬움
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

}
