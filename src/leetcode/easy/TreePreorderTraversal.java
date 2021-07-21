package leetcode.easy;


import java.util.ArrayList;
import java.util.List;


// https://leetcode.com/problems/n-ary-tree-preorder-traversal/
// pre : self children
// post : children self
public class TreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList();
        traverse(root, list);

        return list;
    }

    //return List 들고 다니기
    public void traverse(Node root, List<Integer> list) {
        if(root == null) return;

        list.add(root.val);             //self 넣기
        for(Node c : root.children) {   //재귀함수로 root에 children 반복 넣기
            traverse(c, list);
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
