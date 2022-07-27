package LinkedList.InsertLinkedListByRecursion;

public class InsertRecursionLinkedList {
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

    static Node<Integer> insertInto(Node<Integer> head, int pos, int elem) {

        if (head == null && pos > 0) {
            return head;
        }

        if (pos == 0) {
            // create linked list
            Node<Integer> nodeToBeInserted = new Node<Integer>(elem);
            nodeToBeInserted.next = head;
            return nodeToBeInserted;
        } else {
            head.next = insertInto(head.next, pos - 1, elem);
            return head;

        }

    }

    public static void printR(Node<Integer> head) {
        if (head == null) {
            return;
        }

        System.out.print(head.data + " ");
        printR(head.next);
    }

    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        head = insertInto(head, 5, 200); // second argument is 0
        printR(head);
    }
}
