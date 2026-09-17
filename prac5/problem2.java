package prac5;

public class problem2 {

    static class SinglyCircular {
        class Node {
            String name;
            Node next;

            Node(String name) {
                this.name = name;
            }
        }

        Node head = null;
        Node tail = null;

        void add(String name) {
            Node newNode = new Node(name);

            if (head == null) {
                head = tail = newNode;
                newNode.next = head;
            } else {
                newNode.next = head;
                tail.next = newNode;
                tail = newNode;
            }

            display();
        }

        void remove(String name) {
            if (head == null)
                return;

            Node current = head;
            Node previous = tail;

            do {
                if (current.name.equals(name)) {
                    if (current == head && current == tail) {
                        head = tail = null;
                    } else {
                        previous.next = current.next;

                        if (current == head)
                            head = current.next;

                        if (current == tail)
                            tail = previous;
                    }
                    break;
                }

                previous = current;
                current = current.next;

            } while (current != head);

            display();
        }

        void display() {
            if (head == null) {
                System.out.println("Circle is empty");
                return;
            }

            Node temp = head;

            System.out.print("Singly Circle: ");

            do {
                System.out.print(temp.name + " ");
                temp = temp.next;
            } while (temp != head);

            System.out.println();
        }
    }

    static class DoublyCircular {
        class Node {
            String name;
            Node prev, next;

            Node(String name) {
                this.name = name;
            }
        }

        Node head = null;

        void add(String name) {
            Node newNode = new Node(name);

            if (head == null) {
                head = newNode;
                newNode.next = head;
                newNode.prev = head;
            } else {
                Node tail = head.prev;

                newNode.next = head;
                newNode.prev = tail;
                tail.next = newNode;
                head.prev = newNode;
            }

            display();
        }

        void remove(String name) {
            if (head == null)
                return;

            Node current = head;

            do {
                if (current.name.equals(name)) {
                    if (current.next == current) {
                        head = null;
                    } else {
                        current.prev.next = current.next;
                        current.next.prev = current.prev;

                        if (current == head)
                            head = current.next;
                    }
                    break;
                }

                current = current.next;

            } while (current != head);

            display();
        }

        void display() {
            if (head == null) {
                System.out.println("Circle is empty");
                return;
            }

            Node temp = head;

            System.out.print("Doubly Circle: ");

            do {
                System.out.print(temp.name + " ");
                temp = temp.next;
            } while (temp != head);

            System.out.println();
        }
    }

    public static void main(String[] args) {

        SinglyCircular s = new SinglyCircular();

        System.out.println("SINGLY CIRCULAR LINKED LIST");

        s.add("A");
        s.add("B");
        s.add("C");
        s.remove("B");
        s.add("D");
        s.remove("A");

        System.out.println();

        DoublyCircular d = new DoublyCircular();

        System.out.println("DOUBLY CIRCULAR LINKED LIST");

        d.add("A");
        d.add("B");
        d.add("C");
        d.remove("B");
        d.add("D");
        d.remove("A");
    }
}