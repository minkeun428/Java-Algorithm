package programmers2;

import java.util.Collections;
import java.util.PriorityQueue;

public class Printer {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int print : priorities) {
            pq.offer(print);
        }

        while(!pq.isEmpty()) {  // 큐가 비어있을 때까지 반복한다
            for(int i = 0; i < priorities.length; i++) {
                if(pq.peek() == priorities[i]) {
                    pq.poll();      //높은 우선순위대로 출력한다
                    answer++;
                    if(location == i) { //인덱스와 같은 숫자를 찾으면 해결 끝. 큐를 다 삭제한다.
                        pq.clear();
                        break;
                    }
                }
            }
        }

        return answer;
    }
}
