package codingInterview.linkedList;

public class DeleteNode {
    class Node {
        int data;
        Node next = null;
        public Node(int d) {
            this.data = d;
        }
    }

    Node deleteNode(Node head, int d) {
        Node n = head;
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
