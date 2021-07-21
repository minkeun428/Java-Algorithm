package leetcode.easy;


//https://leetcode.com/problems/middle-of-the-linked-list/

//워커 러너 테크닉
//walker : 한번에 한칸씩
//runner : 한번에 두칸씩
//runner가 끝나면 walker는 중간에 와있음
//while loop마다 러너 1칸 전진, 워커 1칸 전진, 러너 1칸 전진
public class MiddleOftheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode walker = head; //walker의 현재 위치 값 == head
        ListNode runner = head; //runner의 현재 위치 값 == head

        while(runner != null) {
            runner = runner.next;   //runner 1칸 전진
            if(runner != null) {    //runner가 끝까지 가야 끝나니깐
                walker = walker.next;   //walker 1칸 전진
                runner = runner.next;   //runner 1칸 또 전진
            }
        }
        return walker;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}


