package programmers2;

import java.util.HashMap;

public class Clothes {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap();

        // getOrDefault(Object key, V defaultValue)
        // 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환한다.
        for(int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 1) + 1);
        }

        for(int i : map.values()) {
            answer *= i;
        }

        //아무 것도 입지 않은 상태는 빼야 함.
        answer--;;

        return answer;
    }

}
