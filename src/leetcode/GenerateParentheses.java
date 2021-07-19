package leetcode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/generate-parentheses/
public class GenerateParentheses {
    //backtracking
    //recursion + termination check
    public List<String> generateParentheses(int n) {
        List<String> ret = new ArrayList<>();
        process(n, 0, 0, "", ret);  //recurse
        return ret;
    }

    //numClosed > numOpen -> invalid
    public void process(int n, int numOpen, int numClosed, String str, List<String> ret) {
        //termination check
        if(numOpen == n && numClosed == n) {
            ret.add(str);
            return;
        }

        //recurse next
        if(numOpen < n) {
            process(n, numOpen + 1, numClosed, str + "(", ret);  //add open bracket
        }
        if(numOpen > numClosed) {
            process(n, numOpen, numClosed + 1, str + ")", ret);  //add closed bracket
        }
    }
}
