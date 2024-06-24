package com.sunbeam;

public class main {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(10);

        pq.insert(10);
        pq.insert(15);
        pq.insert(20);
        pq.insert(17);

        System.out.println("Min element: " + pq.peek());  // Should print 10

        System.out.println("Extracted min element: " + pq.extractMin());  // Should print 10
        System.out.println("Extracted min element: " + pq.extractMin());  // Should print 15

        pq.insert(8);
        System.out.println("Min element: " + pq.peek());  // Should print 8

        System.out.println("Extracted min element: " + pq.extractMin());  // Should print 8
        System.out.println("Extracted min element: " + pq.extractMin());  // Should print 17
        System.out.println("Extracted min element: " + pq.extractMin());  // Should print 20
    }
}
