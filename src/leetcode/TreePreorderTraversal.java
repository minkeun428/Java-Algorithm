package leetcode;


import java.util.ArrayList;
import java.util.List;


// https://leetcode.com/problems/n-ary-tree-preorder-traversal/
// pre : self children
// post : children self
public class TreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        List<Integer> ret = new ArrayList();
        traverse(root, ret);

        return ret;
    }

    public void traverse(Node root, List<Integer> ret) {
        if(root == null) return;

        ret.add(root.val);
        for(Node child : root.children) {
            traverse(child, ret);
        }
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
