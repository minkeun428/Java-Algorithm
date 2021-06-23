package programmers1;

public class TrainingClothes {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        //여벌 있는데, 도난 당한 애들 걸러내기
        for(int i = 0; i < reserve.length; i++) {
            for(int j = 0; j < lost.length; j++) {
                if(lost[j] == -10 || reserve[i] == -10) continue;

                if(reserve[i] == lost[j]) {
                    reserve[i] = lost[j]= -10;
                    answer++;
                    break;
                }
            }
        }


        for(int i = 0; i < reserve.length; i++) {
            for(int j = 0; j < lost.length; j++) {
                if(reserve[i] == -10 || lost[j] == -10) continue;

                if(reserve[i] - 1 == lost[j] || reserve[i] + 1 == lost[j]) {
                    reserve[i] = lost[j]= -10;    //한 번 빌려준 학생, 받은 학생은 제외
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
