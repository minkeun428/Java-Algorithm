package datastructure.que;

public class IntQueue {
    private int max;  //큐 용량
    private int front;  //맨 처음 요소의 인덱스
    private int rear;   //맨 끝 요소의 하나 뒤 인덱스 (다음 요소를 인큐할 위치 미리 지정)
    private int num;    //현재 데이터 수
    private int[] que;  //큐 본체

    // 실행할 때 예외 : 큐가 비어 있음
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {
        }
    }

    // 실행할 때 예외 : 큐가 가득 참
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {
        }
    }

    // 생성자
    public IntQueue(int capacity) {
        num = front = rear = 0;
        max = capacity;

        try {
            que = new int[max];   // 큐 본체용 배열 생성
        } catch (OutOfMemoryError e) {   // 생성할 수 없습니다.
            max = 0;
        }
    }

    // 인큐
    public int enque(int x) throws OverflowIntQueueException {
        if(num >= max) {
            throw new OverflowIntQueueException();   // 큐가 가득 참
        }

        que[rear++] = x;
        num++;
        if(rear == max) {
            rear = 0;
        }
        return x;
    }

    // 디큐
    public int deque() throws EmptyIntQueueException {
        if(num <= 0) {
            throw new EmptyIntQueueException();  //큐가 비어 있음
        }

        int x = que[front++];   // == que[front]를 꺼내고 front + 1 (front값이 비어 있으므로 뒤에 있는 애가 front가 되도록)
        num--;
        if(front == max) {
            front = 0;
        }
        return x;
    }
}
