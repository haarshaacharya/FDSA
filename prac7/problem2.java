package prac7;

public class problem2 {

    class Node {
        String patient;
        Node next;

        Node(String patient) {
            this.patient = patient;
        }
    }

    Node front = null;
    Node rear = null;

    void arrive(String patient) {
        Node newNode = new Node(patient);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        display();
    }

    void attend() {
        if (front == null) {
            System.out.println("Error: Ward is empty");
            return;
        }

        System.out.println("Attended: " + front.patient);

        front = front.next;

        if (front == null)
            rear = null;

        display();
    }

    void display() {
        if (front == null)
            System.out.println("Front patient: Empty");
        else
            System.out.println("Front patient: " + front.patient);

        System.out.println();
    }

    public static void main(String[] args) {

        problem2 q = new problem2();

        q.arrive("Rahul");
        q.arrive("Amit");
        q.arrive("Priya");
        q.attend();
        q.attend();
        q.arrive("Neha");
        q.attend();
        q.attend();
        q.attend();
    }
}