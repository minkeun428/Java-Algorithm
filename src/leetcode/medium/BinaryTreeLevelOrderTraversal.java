package leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if(root == null) return ret;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);  //root는 3

        while(!queue.isEmpty()) {
            List<Integer> traver_val = new ArrayList<>();   //ret에 담을 List 변수
            int size = queue.size();    //첫번째 사이즈는 1

            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();   //BFS이므로 큐에 one level 넣은 것을 빼준다.
                traver_val.add(node.val);       //큐를 클래스 타입으로 받았기 때문에 .val로 값을 얻는다.

                System.out.println("node.val = " + node.val);

                //TreeNode의 다음 레벨로 넘어간다.
                //이진트리이기 때문에 left or right만 존재한다.
                if(node.left != null) {
                    queue.offer(node.left); //있으면 새롭게 queue에 저장, 9넣고
                }
                if(node.right != null) {
                    queue.offer(node.right);    //20넣는다.
                }
            }
            //9,20이 들어갔기 때문에, queue size는 2로 됨.

            ret.add(0, traver_val); //BottomUp Order를 위해 0번째에 계속 넣어줘서 이전에 넣은 값이 뒷 인덱스로 밀려나게끔 한다.
        }

        return ret;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);        //root엔 3을 넣고
        root.left = new TreeNode(9);            //root의 왼쪽 자식 노드에겐 9를 넣고
        root.right = new TreeNode(20);          //root의 오른쪽 자식 노드에겐 20을 넣고
        root.right.left = new TreeNode(15);     //root의 오른쪽 자식 노드의 왼쪽 자식 노드에는 15을 넣고
        root.right.right = new TreeNode(7);     //root의 오른쪽 자식 노드의 오른쪽 자식 노드에는 7을 넣는다.

        List<List<Integer>> list = new ArrayList<>();
        list = levelOrderBottom(root);      //root객체를 보낸다. 이 객체 안에는 자식 노드들의 객체가 참조 되어 있다.

        for(List<Integer> i : list) {
            System.out.println(i);
        }

    }

    /**
     * Definition for a binary tree node.
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
