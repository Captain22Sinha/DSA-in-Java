import java.util.ArrayList;
import java.util.Stack;

class Node {
    int val;
    Node left;
    Node right;
    Node(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

class Pair {
    Node node;
    int data;
    Pair(Node node, int data) {
        this.node = node;
        this.data = data;
    }
}

class Solution {
    public ArrayList<ArrayList<Integer>> preInPostTraversal(Node root) {
        ArrayList<Integer> pre = new ArrayList<>();
        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> post = new ArrayList<>();

        if (root == null) {
            return new ArrayList<>();
        }

        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1));

        while (!st.isEmpty()) {
            Pair it = st.pop();

            if (it.data == 1) {
                pre.add(it.node.val);
                it.data = 2;
                st.push(it);

                if (it.node.left != null) {
                    st.push(new Pair(it.node.left, 1));
                }
            } else if (it.data == 2) {
                in.add(it.node.val);
                it.data = 3;
                st.push(it);

                if (it.node.right != null) {
                    st.push(new Pair(it.node.right, 1));
                }
            } else {
                post.add(it.node.val);
            }
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result.add(pre);
        result.add(in);
        result.add(post);
        return result;
    }

    public void printList(ArrayList<Integer> list) {
        for (int val : list) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

public class preInpost {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(7);
        root.right = new Node(4);
        root.left.right = new Node(9);
        root.right.left = new Node(2);
        root.left.left = new Node(3);

        Solution sol = new Solution();
        ArrayList<ArrayList<Integer>> traversal = sol.preInPostTraversal(root);

        ArrayList<Integer> pre = traversal.get(0);
        ArrayList<Integer> in = traversal.get(1);
        ArrayList<Integer> post = traversal.get(2);

        System.out.print("Preorder traversal: ");
        sol.printList(pre);

        System.out.print("Inorder traversal: ");
        sol.printList(in);

        System.out.print("Postorder traversal: ");
        sol.printList(post);
    }
}