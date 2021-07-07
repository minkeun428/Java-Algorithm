package programmers2;

import java.util.LinkedList;
import java.util.Queue;

public class BridgeTruck {
    class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            int answer = 0;
            Queue<Integer> q = new LinkedList<>();
            int qSum = 0;
            // 7,4,5,6
            for(int truck : truck_weights) {
                while(true) {
                    if(q.isEmpty()) {   //큐가 비어있을 때,
                        q.offer(truck);
                        qSum += truck;
                        answer++;
                        break;
                    }
                    else if(q.size() == bridge_length) {   //큐가 다리 길이랑 같게 되면 하나 빼주기
                        qSum -= q.poll();
                    }
                    else {  //아직 다리에 들어올 여유가 된다면,
                        if(qSum + truck > weight) { //들어올 트럭과 큐에 있는 트럭이 다리 무게보다 크다면,
                            //0을 넣어서 큐에 있는 트럭이 혼자 지나가도록 해준다.
                            q.offer(0);
                            answer++;
                        }else { // 다음 트럭이 들어올 수 있다면,
                            q.offer(truck);
                            qSum += truck;
                            answer++;
                            break;
                        }
                    }
                }
            }
            // 모든 트럭들이 다리에 진입하고 이 다리를 모두 지나가야하기 때문에 다리의 길이만큼 더해줘야 한다.
            return answer + bridge_length;
        }
    }

}
