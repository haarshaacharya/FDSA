package prac4;

import java.util.LinkedList;

public class HospitalQueueProblem2 {

    public static void main(String[] args) {

        LinkedList<Integer> queue = new LinkedList<>();

        // Adding patient tokens
        queue.add(101);
        queue.add(102);
        queue.add(103);
        queue.add(104);

        // Forward traversal
        System.out.println("Queue from Front to Back:");
        for (int token : queue) {
            System.out.print(token + " ");
        }

        // Delete patient by value
        int patientToRemove = 102;
        queue.remove(Integer.valueOf(patientToRemove));

        System.out.println("\n\nAfter removing " + patientToRemove + ":");
        System.out.println(queue);

        // Reverse printing
        System.out.println("\nQueue from Last to First:");

        for (int i = queue.size() - 1; i >= 0; i--) {
            System.out.print(queue.get(i) + " ");
        }

        // Forward traversal again
        System.out.println("\n\nQueue from Front to Back:");

        for (int token : queue) {
            System.out.print(token + " ");
        }
    }
}