package hw.solution.test;

import hw.solution.MyLinkedList;
import hw.solution.MyNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MyLinkedListTest {

    static Random random = new Random();
    @Test
    public void testReverse_1000() {
        // Arrange
        int max = 1000;
        int[] numbers = new int[max];

        MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>(new MyNode<>(random.nextInt(100000)));

        numbers[0] = linkedList.getRoot().getData();
        MyNode<Integer> current = linkedList.getRoot();

        for (int i = 1; i < max; i++) {
            numbers[i] = random.nextInt(100000);
            current.setNext(new MyNode<>(numbers[i]));
            current = current.getNext();
        }

        // Activate
        linkedList.reverse();

        // Assert
        current = linkedList.getRoot();
        int i = max - 1;
        while (i >= 0) {
            int expected = numbers[i];
            int actual = current.getData();
            Assert.assertEquals(expected , actual);
            current = current.getNext();
            i--;
        }

    }
}
