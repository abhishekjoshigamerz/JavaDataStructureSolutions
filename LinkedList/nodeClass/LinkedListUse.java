package LinkedList.nodeClass;

public class LinkedListUse {

    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(1);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(3);
        Node<Integer> n4 = new Node<>(4);
        Node<Integer> n5 = new Node<>(5);
        Node<Integer> n6 = new Node<>(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        return n1;
    }

    public static void print(Node<Integer> head) {
        // System.out.println("Print " + head);
        // System.out.println(head.data);
        // // System.out.println(head.next);
        // System.out.println(head.next.data);
        // System.out.println(head.next.next.data);
        // System.out.println(head.next.next.next.data);
        // Node<Integer> temp = head;
        // while (temp != null) {
        // System.out.println(temp.data + " ");
        // temp = head.next;
        // }
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void fun(Node start) {
        if (start == null)
            return;
        System.out.print(start.data + " ");

        if (start.next != null)
            fun(start.next.next);
        System.out.print(start.data + " ");
    }

    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        fun(head);
    }
}
