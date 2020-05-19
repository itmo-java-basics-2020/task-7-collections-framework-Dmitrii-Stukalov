package ru.ifmo.collections;

import java.util.PriorityQueue;

/**
 * Design a class to find the kth largest element in a stream. k is from 1 to numbers.length.
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * <p>
 * Constructor accepts an integer k and an integer array numbers, which contains initial elements from the stream.
 * For each call to the method KthLargest.add(), return the element representing the kth largest element in the stream.
 */
public class KthLargest {
    private static final PriorityQueue<Integer> queue = new PriorityQueue<>();
    public static int K;

    public KthLargest(int k, int[] numbers) {
        K = k;
        for (int number : numbers) {
            this.add(number);
        }
    }

    public int add(int val) {
        queue.add(val);
        if (queue.size() > K) {
            queue.remove();
        }
        return queue.element();
    }
}