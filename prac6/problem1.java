package prac6;

public class problem1 {

    int stack[];
    int top = -1;

    problem1(int n) {
        stack = new int[n];
    }

    void place(int tray) {
        if (top == stack.length - 1) {
            System.out.println("Error: Stack is full");
            return;
        }

        top++;
        stack[top] = tray;

        System.out.println("Placed: " + tray);
        display();
    }

    void take() {
        if (top == -1) {
            System.out.println("Error: Stack is empty");
            return;
        }

        System.out.println("Taken: " + stack[top]);
        top--;
        display();
    }

    void display() {
        if (top == -1)
            System.out.println("Top tray: Empty");
        else
            System.out.println("Top tray: " + stack[top]);

        System.out.println();
    }

    public static void main(String[] args) {

        problem1 s = new problem1(3);

        s.take();
        s.place(10);
        s.place(20);
        s.place(30);
        s.place(40);
        s.take();
        s.take();
        s.take();
        s.take();
    }
}

