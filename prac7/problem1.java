package prac7;

public class problem1 {

    int queue[];
    int front = -1;
    int rear = -1;
    int size = 0;

    problem1(int n) {
        queue = new int[n];
    }

    void join(int token) {

        if (size == queue.length) {
            System.out.println("Error: Queue is full");
            return;
        }

        if (front == -1)
            front = 0;

        rear = (rear + 1) % queue.length;
        queue[rear] = token;
        size++;

        display();
    }

    void serve() {

        if (size == 0) {
            System.out.println("Error: Queue is empty");
            return;
        }

        System.out.println("Served: " + queue[front]);

        front = (front + 1) % queue.length;
        size--;

        if (size == 0)
            front = rear = -1;

        display();
    }

    void display() {

        if (size == 0) {
            System.out.println("Front token: Empty");
        } else {
            System.out.println("Front token: " + queue[front]);
        }

        System.out.println();
    }

    public static void main(String[] args) {

        problem1 q = new problem1(3);

        q.join(101);
        q.join(102);
        q.join(103);
        q.join(104);

        q.serve();
        q.serve();

        q.join(104);
        q.join(105);

        q.serve();
        q.serve();
        q.serve();
        q.serve();
    }
}
