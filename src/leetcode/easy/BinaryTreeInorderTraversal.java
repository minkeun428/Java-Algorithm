package leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/solution/
 * inorder(전위)순회
 * left self right
 */
public class BinaryTreeInorderTraversal {
    //트리 노드 클래스 정의
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
    }

    //Output 리스트 전역변수화
    List<Integer> rtn = new ArrayList<>();

    /**
     * 방법1 - 재귀
     * */
    public List<Integer> inorderTraversal1(TreeNode root) {
        if(root == null) return rtn;
        traverse(root);

        return rtn;
    }
    public void traverse(TreeNode self) {
        if(self == null) return;

        traverse(self.left);
        rtn.add(self.val);
        traverse(self.right);
    }

    /**
     * 방법2 - 스택
     * */
    public List<Integer> inorderTraversal2(TreeNode root) {
        //TreeNode클래스 타입의 stack 생성
        Stack<TreeNode> stack = new Stack();

        //현재 노드 값을 저장하는 객체 생성
        TreeNode curr = root;

        //현재 노드가 비어 있지 않거나, 스택이 비어 있지 않으면
        while (curr != null || !stack.isEmpty()) {
            //왼쪽에 있는 노드 모두 스택에 삽입
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();     //가장 밑에 있던 노드를 꺼내서 현재노드로
            rtn.add(curr.val);      //Output 리스트에 넣고,
            curr = curr.right;      //오른쪽 노드가 있으면 현재노드로, 없으면 null이 들어감
        }
        return rtn;
    }

    //테스트 main
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        BinaryTreeInorderTraversal b = new BinaryTreeInorderTraversal();
        b.inorderTraversal2(root);
    }

}
