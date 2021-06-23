package programmers1;

import java.util.HashMap;

public class NotCompleteMarathon {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hash = new HashMap();

        for (String parti : participant) {
            hash.put(parti, hash.getOrDefault(parti, 0) + 1); //동명이인 선수를 위해
        }

        for (String comp : completion) {
            hash.put(comp, hash.get(comp) - 1);     //순서 보장을 위해
        }

        for (String key : hash.keySet()) {
            if (hash.get(key) != 0) {
                return key;
            }
        }

        return null;
    }
}
