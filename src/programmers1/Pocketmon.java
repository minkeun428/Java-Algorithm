package programmers1;

import java.util.HashSet;

public class Pocketmon {
    public int solution(int[] nums) {
        int answer = 0;

        HashSet set = new HashSet();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        if(set.size() > nums.length / 2) {
            answer = nums.length / 2;
        } else {
            answer = set.size();
        }

        return answer;
    }

}
