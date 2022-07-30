package LinkedList.EvenafterOddLinkedList;

public class EvenafterOddLinkedList {
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

    public static Node<Integer> evenAfterOddSorting(Node<Integer> head) {
        if (head == null) {
            return head;
        }
        Node<Integer> evenHead = null, evenTail = null, oddHead = null, oddTail = null;
        while (head != null) {
            if (head.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = head;
                    evenTail = head;
                } else {
                    evenTail.next = head;
                    evenTail = evenTail.next;
                }
            } else {
                if (oddHead == null) {
                    oddHead = head;
                    oddTail = head;
                } else {
                    oddTail.next = head;
                    oddTail = oddTail.next;
                }
            }
            head = head.next;

        }
        if (oddHead == null) {
            return evenHead;
        } else {
            oddTail.next = evenHead;
        }

        if (evenHead != null) {
            evenTail.next = null;
        }

        return oddHead;
    }

    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        head = evenAfterOddSorting(head);
        print(head);
    }
}
