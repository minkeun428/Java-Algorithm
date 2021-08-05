package leetcode.easy;

/**
 * https://leetcode.com/problems/remove-linked-list-elements/submissions/
 */
public class RemoveElements {
    public ListNode removeElements(ListNode head, int data) {
        // 1. 예외케이스체크 -> [7,7,7,7]
        while(head != null && head.data == data) {
            head = head.next;
        }
        // 2. 위 반복문 다 돌면 head엔 7만 남게됨.

        // 3. 7만 남게되면 밑 반복문은 못 들어감.
        ListNode curr = head;
        while(curr != null && curr.next != null) {
            if(curr.next.data == data) {
                curr.next = curr.next.next;
                //4. 연속적으로 삭제해야 할 같은 수가 나올 수 있으므로,
                //5. 삭제 했다고 다음위치로 이동하지 않고, 그 자리에서 바로 옆을 체크함.
            } else {
                //6. 자리 이동
                curr = curr.next;
            }
        }

        return head;
    }
}
