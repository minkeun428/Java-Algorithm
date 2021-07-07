package programmers2;

import java.util.PriorityQueue;

public class MoreSpicy {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        //최소힙으로 구성된 큐 (우선순위가 낮은 순)
        PriorityQueue<Integer> pq = new PriorityQueue();
        // 우선순위가 높은 순
        // PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : scoville) {
            pq.offer(i);
        }

        while(pq.peek() < K) {
            if(pq.size() == 1) {
                answer = -1;
                break;
            }

            int idx1 = pq.poll();
            int idx2 = pq.poll();
            pq.offer(idx1 + (idx2 * 2));
            answer++;
        }

        return answer;
    }
}
