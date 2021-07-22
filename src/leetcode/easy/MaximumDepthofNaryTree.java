package leetcode.easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumDepthofNaryTree {
    public int maxDepth(Node root) {
        int rtn = 0;
        if(root == null) return rtn;

        Queue<Node> que = new LinkedList<>();
        que.offer(root);    //1. 처음엔 최상단 루트 1이 들어온다.

        while(!que.isEmpty()) {
            rtn++;  //큐가 생성될 때마다 레벨 상승

            int size = que.size();
            for(int i = 0; i < size; i++) {
                Node node = que.poll();	//2. que에 빼준 1node를 node객체에 넣기(==current node)

                //3. 1node의 자식들을 비어 있는 큐에 다 넣어준다.
                for(Node child : node.children) {
                    //4. 큐가 채워졌다.
                    que.offer(child);
                }
                /* 1node의 자식들은 3,2,4이므로 3번 반복하면서 각 노드를 빼고 그 자식 노드들을 큐에 다시 넣어주는걸 반복한다. */
            }
        }

        return rtn;
    }

    // Definition for a Node.
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
