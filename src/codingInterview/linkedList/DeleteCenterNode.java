package codingInterview.linkedList;

public class DeleteCenterNode {
    class Node {
        int data;
        Node next = null;

        public Node(int d) {
            this.data = d;
        }
    }

    boolean deleteNode(Node n) {
        if(n == null || n.next == null) {
            return false;
        }
        Node next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }
}
