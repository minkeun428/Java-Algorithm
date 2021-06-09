package datastructure.stack;

public class IntStack {
    int max;     // 스택 용량 (스택에 쌓을 수 있는 최대 수)
    int ptr;     // 스택 포인터 (스택에 쌓여 있는 데이터 수)
    int[] stk;   // 배열 본체를 참조하는 배열 변수

    // 실행 시 예외 : 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() { }
    }

    // 실행 시 예외 : 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() { }
    }

    // 생성자
    public IntStack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = new int[max];     // 스택 본체용 배열을 생성
        } catch (OutOfMemoryError e) {  // 생성할 수 없음
            max = 0;
        }
    }

    // 스택에 x를 푸시
    public int push(int x) throws OverflowIntStackException {
        if(ptr >= max) {  // ptr 값이 잘못 입력되는 실수 방지 (ptr == max)로 해도 되지만..
            throw new OverflowIntStackException();
        }

        return stk[ptr++] = x;
    }

    // 스택에서 팝
    public int pop() throws EmptyIntStackException {
        if(ptr <= 0) {
            throw new EmptyIntStackException();
        }

        return stk[--ptr];
    }

    // 스택의 정상에 있는 데이터를 확인
    public int peek() throws EmptyIntStackException {
        if(ptr <= 0) {
            throw new EmptyIntStackException();
        }

        return stk[ptr - 1];
    }

    // 스택에서 x를 찾아 인덱스를 반환 (없으면 -1)
    public int indexOf(int x) {
        for(int i = ptr - 1; i >=0; i--) {  // 맨 위에서 부터 찾기
            if(stk[i] == x) {
                return i;   // 검색 성공
            }
        }
        return -1;      // 검색 실패
    }

    // 스택을 비움
    public void clear() {
        ptr = 0;
    }

    // 스택의 용량을 반환
    public int capacity() {
        return max;
    }

    // 스택에 쌓여 있는 데이터 수를 반환
    public int size() {
        return ptr;
    }

    // 스택이 비어 있는가?
    public boolean isEmpty() {
        return ptr <= 0;
    }

    // 스택이 가득 찼는가?
    public boolean isFull() {
        return ptr >= max;
    }

    // 스택 안의 모든 데이터를 바닥 -> 꼭대기 순으로 출력
    public void dump() {
        if(ptr <= 0) {
            System.out.println("스택이 비어 있습니다.");
        }
        else {
            for(int i = 0; i < ptr; i++) {
                System.out.println(stk[i] + " ");
            }
            System.out.println();
        }
    }

}
