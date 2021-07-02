package programmers2;

import java.util.HashMap;

public class PhoneBookList {
    public boolean solution(String[] phoneBook) {
        boolean answer = true;

        HashMap<String, Integer> map = new HashMap();

        for(int i = 0; i < phoneBook.length; i++) {
            map.put(phoneBook[i], i);
        }

        for(int i = 0; i < phoneBook.length; i++) {
            for(int j = 1; j < phoneBook[i].length(); j++) {
                if(map.containsKey(phoneBook[i].substring(0, j)))                 {
                    answer = false;
                }
            }
        }

        return answer;
    }
}
