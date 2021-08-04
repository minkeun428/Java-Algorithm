package leetcode.easy;


/**
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
public class ConvertBinaryNumberLinkedListtoInteger {
    public int getDecimalValue(ListNode head) {
        int num = head.val;
        while(head.next != null) {
            num = num * 2 + head.next.val;
            head = head.next;
        }
        return num;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int val) {
          this.val = val;
      }
   }

}
