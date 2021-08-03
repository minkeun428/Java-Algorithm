package codingInterview.linkedList;

import java.util.HashSet;

public class DeleteDups {
    class Node {
        int data;
        Node next = null;

        public Node(int d) {
            this.data = d;
        }
    }

    //해법 1
    void deleteDups(Node n) {
        HashSet set = new HashSet();
        Node current = null;    //현재 위치 참조 객체

        while(n != null) {
            if(set.contains(n.data)) {
                current.next = n.next;      //current가 head라는 이름이어도 되도 상관 없다.
            } else {
                set.add(n.data);    //중복 원소 없으면 set에 넣고
                current = n;        //현재 위치 갱신해주고
            }
            n = n.next;     //한 칸 이동
        }
    }

    //해법2
    void deleteDupsWithRunner(Node head) {
        Node current = head;
        while(current != null) {
            Node runner = current;
            while(runner.next != null) {
                if(runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
                current = current.next;
            }
        }
    }

}
