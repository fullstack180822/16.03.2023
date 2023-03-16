package hw.solution;

import lombok.Getter;

import java.util.ArrayList;

public class MyLinkedList<T> {

    @Getter
    MyNode<T> root;

    public MyLinkedList(MyNode<T> root) {
        this.root = root;
    }

    public int getSize() {

        int counter = 0;

        MyNode<T> current = root;

        while (current != null ){
            counter++;
            current = current.next;
        }

        return counter;
    }

    public void print() {
        MyNode<T> current = root;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
    }

    public void reverse() {

        if (this.root == null || this.root.next == null ){
            return;
        }

        MyNode<T> previous = null;
        MyNode<T> current = this.root;
        MyNode<T> next;

        while (current != null) {
            next = current.next; // save who is next in line
            current.next = previous; // putting next in line as previous

            previous = current; // saving previous
            current = next; // moving forward
        }

        this.root = previous;
    }

}