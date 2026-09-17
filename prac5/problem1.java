package prac5;

public class problem1 {

    class Node {
        String song;
        Node prev, next;

        Node(String song) {
            this.song = song;
        }
    }

    Node head, tail;
    int count = 0;

    void addFirst(String song) {
        Node newNode = new Node(song);

        if (head == null)
            head = tail = newNode;
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        count++;
        display();
    }

    void addLast(String song) {
        Node newNode = new Node(song);

        if (tail == null)
            head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        count++;
        display();
    }

    void insertAfter(String song, String newSong) {
        Node temp = head;

        while (temp != null && !temp.song.equals(song))
            temp = temp.next;

        if (temp == null) {
            System.out.println("Song not found");
            display();
            return;
        }

        Node newNode = new Node(newSong);

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null)
            temp.next.prev = newNode;
        else
            tail = newNode;

        temp.next = newNode;

        count++;
        display();
    }

    void removeFirst() {
        if (head == null) {
            System.out.println("Playlist is empty");
            return;
        }

        head = head.next;

        if (head == null)
            tail = null;
        else
            head.prev = null;

        count--;
        display();
    }

    void display() {
        Node temp = head;

        System.out.print("Playlist: ");

        while (temp != null) {
            System.out.print(temp.song + " ");
            temp = temp.next;
        }

        System.out.println("\nCount: " + count);
        System.out.println();
    }

    public static void main(String[] args) {

        problem1 p = new problem1();

        p.addFirst("Song A");
        p.addLast("Song C");
        p.insertAfter("Song A", "Song B");
        p.addFirst("Song X");
        p.removeFirst();
        p.insertAfter("Song Z", "Song D");
    }
}