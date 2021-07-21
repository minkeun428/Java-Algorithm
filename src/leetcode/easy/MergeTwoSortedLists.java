package leetcode.easy;

// https://leetcode.com/problems/merge-two-sorted-lists/description/
public class MergeTwoSortedLists {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
        ListNode(){}
    }

    //l1 : [1, 2, 4]
    //l2 : [1, 3, 4]
    //승지니어 풀이
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode ret = null;   //마지막에 반환할 리스트
        ListNode cur = null;   //현재 위치 노드

        while(l1 != null || l2 != null) {
            //pick from l1
            if(l2 == null || (l1 != null && l1.val < l2.val)) {
                if(ret == null) {
                    ret = l1;
                }else {
                    //case:cur = 1, l1 = 2->4
                    //1. 1->2
                    cur.next = l1;
                }
                //2. cur:2
                cur = l1;
                //3. l1:4
                l1 = l1.next;
            }
            //pick from l2
            else {
                if(ret == null) {
                    ret = l2;
                }else {
                    cur.next = l2;
                }
                cur = l2;
                l2 = l2.next;
            }

        }
        return ret;
    }

    //다른 사람 풀이
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode result_node = new ListNode();
        ListNode curr_node = result_node;     //내가 지정한 갓이 head로

        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                //cur의 첫노드는 l1을 가리켜야 함
                curr_node.next = l1;
                //l1은 뒤로 이동
                l1 = l1.next;
            }
            else {
                curr_node.next = l2;
                l2 = l2.next;
            }
            //노드가 위 과정을 끝낸 현재와 같도록 뒤로 이동
            //바로 다음 노드를 삽입할 수 있도록.
            curr_node = curr_node.next;
        }

        if(l1 == null) {
            curr_node.next = l2;
        }
        if(l2 == null) {
            curr_node.next = l1;
        }

        return result_node.next;
    }

}
