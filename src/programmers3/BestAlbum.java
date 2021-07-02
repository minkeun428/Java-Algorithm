package programmers3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        int leng = genres.length;
        ArrayList<Integer> arrAnswer = new ArrayList<Integer>();
        HashMap<String, Integer> map = new HashMap();

        //1. 가장 많이 재생된 장르 찾기
        for(int i = 0; i < leng; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        //2. 장르별 가장 많은 재생횟수를 구하기 위해, ArrayList<String>에 keySet을 넣어주고 ArrayList를 내림차순 sort
        // entrySet() 메서드는 key, value 추출
        // keySet() 메서드는 key 추출
        List<String> keySetList = new ArrayList<>(map.keySet());
        Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
        System.out.println("keySetList::" + keySetList);


        //3. 장르 배열을 돌려서 장르가 keySetList의 key와 일치하면 그 인덱스와 재생횟수를 또 다른 Map에 저장
        for(String key : keySetList) {
            HashMap<Integer, Integer> hs = new HashMap();

            for(int i = 0; i < genres.length; i++) {
                if(key.equals(genres[i])) {
                    hs.put(i, plays[i]);
                }
            }

            //4. hs의 key값으로 만들어진 keyLists도 내림차순 정렬(장르별 재생횟수 파악)
            List<Integer> keyLists = new ArrayList<>(hs.keySet());
            keyLists.sort((s1, s2)->hs.get(s2).compareTo(hs.get(s1)));  //내림차순 정렬

            //5. 장르별 2개씩 수록하기
            int j = 0;
            for (Integer c : keyLists) {
                if(j > 1) {
                    break;
                }
                arrAnswer.add(c);
                j++;
            }
        }


        //6. List를 배열에 담기
        answer = new int[arrAnswer.size()];
        for( int i = 0; i < arrAnswer.size(); i++) {
            answer[i] = arrAnswer.get(i);
            System.out.println(answer[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        BestAlbum ba = new BestAlbum();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        ba.solution(genres, plays);
    }

}
