package datastructure;

//https://yaboong.github.io/data-structures/2018/02/08/linked-list-1-basic/
public class LinkedList {
    Node head;      //맨 앞 참조 변수(포인터), linkedList의 진입점
    Node current;   //현재 선택한 노드를 가리킴

    //LinkedList 객체내부적으로만 조작하게 private선언
    private class Node {
        Node next;      //다음 값을 가리킬 참조 변수
        int data;       //자신의 값
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //1. 맨 뒤에 추가하는 메소드
    public void addLast(int data) {
        //현재 head가 null이면 head에 넣어준다.
        //아니라면, 현재 head를 current라는 변수로 받고 가장 끝으로 옮긴다.
        //current를 마지막 node로 옮긴다.
        if(head == null) {
            head = new Node(data);
            return;
        }

        //현재 current는 head에 위치함
        current = head;
        while(current.next != null) {
            //current가 current.next로 이동중
            current = current.next;
        }
        //이동이 끝나면 넣어줄 노드를 next에 삽입.
        current.next = new Node(data);
    }

    //2. head 앞에 추가하는 메소드
    //여기서 중요한건 head는 맨 앞 노드를 가리키고 있는 포인터임.(참조 객체)
    public void addFirst(int data) {
        Node newHead = new Node(data);
        newHead.next = head; //삽입 전의 기존 head의 포인터를 newHead.next에 넣는다.
        head = newHead;      //head의 포인터를 newHead로 바꿔준다 (head -> newHead노드를 참조하게 됨)
    }

    //3. 지정한 값을 가지고 있는 node를 삭제하는 메소드
    public void deleteValue(int data) {
        if(head == null) return; //비어 있으면 리턴

        Node current = head;     //head부터 시작한다.

        //찾는 값이 current(맨 앞)에 있으면 head 삭제
        if(current.data == data) {
            head = head.next;   //head자리엔 head.next만 있다.
            return;
        }
        while(current.next != null) {
            if(current.next.data == data) {
                //current.next는 지우려는 노드를 가리키고 있으므로,
                //그 다음 노드를 가리키게끔 하여 current가
                //지우려는 노드 다음의 노드를 가리키끔 한다.
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

}
