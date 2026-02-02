import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal2 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binary {
        static int i = -1;

        public static Node buildBinary(int nodes[]) {
            i++;
            if (nodes[i] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[i]);
            newNode.left = buildBinary(nodes);
            newNode.right = buildBinary(nodes);
            return newNode;
        }

        public static List<List<Integer>> levelOrder(Node root) {
            List<List<Integer>> result = new ArrayList<>();
            if (root == null) {
                return result;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()) {
                int size = q.size();
                List<Integer> ans = new ArrayList<>();

                for (int j = 0; j < size; j++) {
                    Node curr = q.remove();
                    ans.add(curr.data);

                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }

                result.add(0, ans); // bottom-up: add at front
            }

            return result;
        }

        public static void main(String[] args) {
            int nodes[] = {1, 2, 5, -1, -1, -1, 8, -1, -1};
            Binary b = new Binary();
            Node root = b.buildBinary(nodes);

            List<List<Integer>> bottomUp = b.levelOrder(root);
            for (List<Integer> level : bottomUp) {
                System.out.println(level);
            }
        }
    }
}