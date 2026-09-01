package prac4;
import java.util.LinkedList;

public class HospitalQueueProblem1 {

    public static void main(String[] args) {

        LinkedList<Integer> queue = new LinkedList<>();

        // Routine patient added at the end
        queue.addLast(101);
        System.out.println("Queue: " + queue);

        queue.addLast(102);
        System.out.println("Queue: " + queue);

        // Critical patient added at the front
        queue.addFirst(100);
        System.out.println("Queue: " + queue);

        // Insert priority patient at specific position
        int position = 2;
        int patientToken = 105;

        if (position <= queue.size()) {
            queue.add(position, patientToken);
        } else {
            // If position is greater than queue length,
            // add patient at the end
            queue.addLast(patientToken);
        }

        System.out.println("Queue: " + queue);
    }
}