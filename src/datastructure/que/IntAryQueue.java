package datastructure.que;

// int형 큐 - 링 버퍼를 사용하지 않음
public class IntAryQueue {
    private int max;    // 큐 용량
    private int num;    // 현재 데이터 수
    private int[] que;  // 큐 본체

    // 실행할 때 예외 : 큐가 비어 있음
    public class EmptyIntAryQueueException extends RuntimeException {
        public EmptyIntAryQueueException() {

        }
    }

    // 실행할 때 예외 : 큐가 가득 참
    public class OverflowIntAryQueueException extends RuntimeException {
        public OverflowIntAryQueueException() {

        }
    }

    // 생성자
    private IntAryQueue(int capacity) {
        num = 0;
        max = capacity;
        try {
            que = new int[max];     // 큐 본체용 배열을 생성
        } catch (OutOfMemoryError e) {  // 생성할 수 없습니다.
            max = 0;
        }
    }

    // 인큐
    public int enque(int x) throws OverflowIntAryQueueException {
        if(num >= max) {
            throw new OverflowIntAryQueueException();  //큐가 가득 참
        }
        que[num++] = x;

        return x;
    }

    // 디큐
    public int deque() throws EmptyIntAryQueueException {
        if(num <= 0) {
            throw new EmptyIntAryQueueException();   //큐가 비어 있음
        }
        int x = que[0];

        for(int i = 0; i < num - 1; i++) {
            que[i] = que[i + 1];            //맨 앞 원소 빼고 원소들 하나씩 앞으로 밀기
        }
        num--;      //현재 데이터수 줄이기

        return x;   //맨 앞 원소 반환
    }

    // 큐에서 데이터를 피크
    public int peek() throws EmptyIntAryQueueException {
        if(num <= 0) {
            throw new EmptyIntAryQueueException();   // 큐가 비어 있음
        }

        return que[num - 1];
    }

    // 큐에서 x를 검색하여 index(찾지 못하면 -1)를 반환
    public int indexOf(int x) {
        for(int i = 0; i < num; i++) {
            if(que[i] == x) {
                return i;   // 검색 성공
            }
        }

        return -1;  // 검색 실패
    }

}
