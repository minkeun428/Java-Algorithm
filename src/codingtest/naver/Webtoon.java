package codingtest.naver;

import java.util.*;

public class Webtoon {

    class Solution1 {
        public int solution(int[] prices, int[] discounts) {
            int answer = 0;
            double per = 0.01;  // 퍼센트 계산용 변수

            // 가격 및 할인 내림차순 정렬
            // int형은 Integer클래스로 변환해야 내림차순 가능
            Integer[] sortPrices = Arrays.stream(prices).boxed().toArray(Integer[]::new);
            Arrays.sort(sortPrices, Collections.reverseOrder());

            Integer[] sortDiscounts = Arrays.stream(discounts).boxed().toArray(Integer[]::new);
            Arrays.sort(sortDiscounts, Collections.reverseOrder());

            // 가격 배열 기준으로 할인을 다 받고,
            // 못 받은 가격에 대해선 원가를 합산한다.
            for(int i = 0; i < sortPrices.length; i++) {
                if(i >= sortDiscounts.length) {
                    answer += sortPrices[i];
                }else {
                    answer += Math.round(sortPrices[i] * (1 - (sortDiscounts[i] * per)));
                }
            }

            return answer;
        }
    }

    public class Solution2 {
        public int solution(String s, String t) {
            int result = 0;

            // t문자열이 포함될 때까지 반복하며 카운팅
            while(s.contains(t)) {
                s = s.replace(t, "");
                result++;
            }

            return result;
        }
    }

    static class Solution3 {
        public void solution(String s) {
            int leng = s.length();
            ArrayList<String> list = new ArrayList();

            // 앞에서 하나씩, 뒤에서 하나씩 자르며, 같은 문자열을 발견하면 list에 넣는다.
            // list에 넣어진 원소의 마지막 글자 + 1, 첫 글자 까지의 인덱스를 자르면
            // 매칭이 안된 문자열을 찾을 수 있다.
            // answer 배열에는 list의 원소들을 한 번 넣고, 매칭 안된 문자열이 있으면 삽입 후,
            // 그 뒤에 다시 list의 원소들을 한 번 더 넣어준다.
            int idx = 0;
            for (int i = 0; i < (leng + 1) / 2; i++) {
                if (s.substring(idx, i + 1).equals(s.substring(leng - (i + 1)))) {
                    list.add(s.substring(idx, i + 1));
                    idx = i + 1;
                }
            }

            for(int i = 0; i < list.size(); i++) {
                System.out.println("list.get(i) = " + list.get(i));
            }

        }

        public static void main(String[] args) {
            Solution3 solu = new Solution3();
            String s = "abcxyqwertyxyabc";
            solu.solution(s);

        }
    }

}
