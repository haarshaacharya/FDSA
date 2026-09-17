package prac6;

public class problem2 {

    class Node {
        String page;
        Node next;

        Node(String page) {
            this.page = page;
        }
    }

    Node top = null;

    void visit(String page) {
        Node newNode = new Node(page);
        newNode.next = top;
        top = newNode;

        System.out.println("Visited: " + page);
        display();
    }

    void back() {
        if (top == null) {
            System.out.println("Error: No history available");
            return;
        }

        System.out.println("Back from: " + top.page);
        top = top.next;
        display();
    }

    void display() {
        if (top == null)
            System.out.println("Current page: No page");
        else
            System.out.println("Current page: " + top.page);

        System.out.println();
    }

    public static void main(String[] args) {

        problem2 browser = new problem2();

        browser.visit("Google");
        browser.visit("YouTube");
        browser.visit("GitHub");
        browser.back();
        browser.back();
        browser.back();
        browser.back();
    }
}
