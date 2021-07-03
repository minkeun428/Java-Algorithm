package programmers2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class FuncDevelop {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < progresses.length; i++) {
            q.add(
                (100 - progresses[i]) % speeds[i] == 0 ?
                (100 - progresses[i]) / speeds[i] :
                (100 - progresses[i]) / speeds[i] + 1
            );
        }

        ArrayList<Integer> list = new ArrayList();
        int prevFunc = q.poll();   // poll은 빼고 반환 , peek은 반환만
        int num = 1;
        while(!q.isEmpty()) {
            int curFunc = q.poll();
            if(prevFunc >= curFunc) {
                num++;
            } else {
                list.add(num);
                num = 1;            // num 초기화
                prevFunc = curFunc; // preFunc 갱신
            }
        }

        list.add(num);
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        FuncDevelop fd = new FuncDevelop();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        fd.solution(progresses, speeds);
    }
}
