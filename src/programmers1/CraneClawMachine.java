package programmers1;

import java.util.Stack;

public class CraneClawMachine {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack();
        stack.push(0);

        for(int i = 0; i < moves.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[j][moves[i] - 1] != 0) {
                    if(stack.peek() != board[j][moves[i] - 1]) {
                        stack.push(board[j][moves[i] - 1]);
                    }
                    else {              // 맨 위의 요소와 넣을려는게 같다면
                        stack.pop();    // 맨 위의 요소 제거
                        answer += 2;
                    }

                    board[j][moves[i] - 1] = 0; //해당 위치에 0넣고 턴 넘기기. 그래야 해당 인덱스 탐색을 또 안하니깐.
                    break;
                }
            }
        }

        return answer;
    }
}
