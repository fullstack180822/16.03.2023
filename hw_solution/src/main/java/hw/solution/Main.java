package hw.solution;

public class Main {

    public static void main(String[] args) {

        MyNode<Integer> current = new MyNode<>(1);

        MyLinkedList<Integer> ints = new MyLinkedList<>(current);

        for (int i = 2; i <= 4; i++) {
            current.next = new MyNode<>(i);
            current = current.next;
        }

        ints.print();

        System.out.println("\n== reverse\n");

        ints.reverse();

        ints.print();


    }

}
