import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.HashMap;

public class Main {
    static class Node {
        char left, right;
        Node(char left, char right) {
            this.left = left;
            this.right = right;
        }
    }
    static Map<Character, Node> tree = new HashMap<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            char root = input[0].charAt(0);
            char left = input[1].charAt(0);
            char right = input[2].charAt(0);
            tree.put(root, new Node(left, right));
        }
        preorder('A');
        sb.append('\n');
        inorder('A');
        sb.append('\n');
        postorder('A');
        sb.append('\n');
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    static void preorder(char node) {
        if (node == '.') return;
        sb.append(node);
        preorder(tree.get(node).left);
        preorder(tree.get(node).right);
    }
    static void inorder(char node) {
        if (node == '.') return;
        inorder(tree.get(node).left);
        sb.append(node);
        inorder(tree.get(node).right);
    }
    static void postorder(char node) {
        if (node == '.') return;
        postorder(tree.get(node).left);
        postorder(tree.get(node).right);
        sb.append(node);
    }
}