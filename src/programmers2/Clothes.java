package programmers2;

import java.util.HashMap;

public class Clothes {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap();

        for(int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 1) + 1);
            System.out.println("map::" + map.values());
        }

        for(int i : map.values()) {
            System.out.println("i test::" + i);
            answer *= i;
        }

        //아무 것도 입지 않은 상태는 빼야 함.
        answer--;;

        return answer;
    }

    public static void main(String[] args) {
        Clothes cl = new Clothes();
        String[][] param = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        cl.solution(param);
    }
}
