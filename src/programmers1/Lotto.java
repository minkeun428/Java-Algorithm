package programmers1;


// 원랜, sort를 사용해서 탐색을 더 빨리할 수 있을거라 생각했지만,
// 더 오래걸렸으므로 제외시켰다.
public class Lotto {
    public int[] solution1(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int zeroCnt = 0;
        int match = 0;

        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                if(lottos[i] == 0) {
                    zeroCnt++;
                    break;
                }
                else if(lottos[i] == win_nums[j]) {
                    match++;
                    break;
                }
            }
        }

        int max = zeroCnt + match;
        int min = match;

        answer[0] = rank1(max);
        answer[1] = rank1(min);

        return answer;
    }

    public int rank1(int n) {
        int rtn = 0;
        if(n == 6) rtn = 1;
        if(n == 5) rtn = 2;
        if(n == 4) rtn = 3;
        if(n == 3) rtn = 4;
        if(n == 2) rtn = 5;
        if(n < 2) rtn = 6;

        return rtn;
    }

    // switch를 쓰는 방법이 더 좋은 것 같다.
    public int rank2(int score) {
        switch (score){
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }

}
