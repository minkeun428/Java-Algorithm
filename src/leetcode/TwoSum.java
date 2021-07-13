package leetcode;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        //대안 1.이중for문 -> O(n^2)
//        for(int i = 0; i < nums.length; i++) {
//            for(int j = i + 1; j < nums.length; j++) {
//                if(nums[i] + nums[j] == target) {
//                    int[] rtn = new int[2];
//                    rtn[0] = i;
//                    rtn[1] = j;
//                    return rtn;
//                    break;
//                }
//            }
//        }

        //대안 2.해쉬맵 -> O(n)
        Map<Integer, Integer> map = new HashMap();  // 키 : 값 = nums[i] : i
        for(int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if(map.containsKey(target - cur)) {  // map의 해당 Key값이 존재하면
                int[] rtn = new int[2];
                rtn[0] = map.get(target - cur);     // 그 키의 값이 첫 번째 찾은 인덱스이고
                rtn[1] = i;                         // 현재 인덱스가 두 번로 찾은 인덱스이다.
                return rtn;
            }else {
                map.put(cur, i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;

        ts.twoSum(nums, target);
    }

}
