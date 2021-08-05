package leetcode.easy;


/**
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
public class ConvertBinaryNumberLinkedListtoInteger {
    public int getDecimalValue(ListNode head) {
        int num = head.data;
        while(head.next != null) {
            num = num * 2 + head.next.data;
            head = head.next;
        }
        return num;
    }

}
