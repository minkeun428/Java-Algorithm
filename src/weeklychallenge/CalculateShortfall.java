package weeklychallenge;

//https://programmers.co.kr/learn/courses/30/lessons/82612
public class CalculateShortfall {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long result = 0;
        for(int i = 1; i < count + 1; i++) {
            result += (price * i);
        }

        //금액이 부족하지 않은 경우
        if(result <= money) {
            answer = 0;
            return answer;
        }
        answer = money - result;

        return Math.abs(answer);
    }
}
