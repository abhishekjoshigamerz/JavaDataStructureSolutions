package LinkedList.FindANodeINLLRecursion;

public class findANode {

    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }

    public static int helper(Node<Integer> head, int index, int n) {
        if (head == null) {
            return -1;
        }
        if (head.data == n) {
            return index;
        }
        int ans = helper(head.next, index + 1, n);
        return ans;
    }

    public static int returnNodeIndex(Node<Integer> head, int n) {

        return helper(head, 0, n);
    }

    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();

        System.out.println(returnNodeIndex(head, 0));
    }
}
