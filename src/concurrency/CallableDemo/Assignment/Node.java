package concurrency.CallableDemo.Assignment;

public class Node {
    Node left, right;
    int data;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
}
