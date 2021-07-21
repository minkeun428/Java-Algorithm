package leetcode.easy;


/**
 * https://leetcode.com/problems/single-number/submissions/
 * 비어있지 않은 정수 배열에서, 하나를 뺀 모든 요소들은 두개씩 들어있다. 하나뿐인 요소를 찾아라.
 * 알고리즘은 선형시간의 복잡도(O(n))를 가져야 한다. 추가적인 메모를 사용하지 않고 가능한가?
 * Array.sort 정렬을 하면 최대 O(nlogn) 시간이 들므로 문제의 요구사항인 선형시간 O(n)을 초과한다.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int ret = 0;
        for(int num : nums) {
            ret = ret ^ num;
        }
        return ret;
    }

    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        int[] arr = {4,1,2,1,2};

        sn.singleNumber(arr);
    }
}
