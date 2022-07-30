package LinkedList.deleteEveryNNodes;

public class deleteEveryNNode {

    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(4);
        Node<Integer> n4 = new Node<>(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }

    public static void print(Node<Integer> head) {
        if (head == null) {
            return;
        }
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node<Integer> deletefun(Node<Integer> head, int M, int N) {
        if (head == null || M == 0) {
            return null;
        }

        if (N == 0) {
            return head;
        }
        Node<Integer> current = head, temp = null;
        while (current != null) {
            int take = 0, skip = 0;
            while (current != null && take < M) {
                if (temp == null) {
                    temp = current;

                } else {
                    temp.next = current;
                    temp = current;
                }
                current = current.next;
                take += 1;
            }
            while (current != null && skip < N) {
                current = current.next;
                skip += 1;
            }
        }
        if (temp != null) {
            temp.next = null;
        }

        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        head = deletefun(head, 1, 2);
        print(head);
    }
}
