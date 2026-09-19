import java.util.*;

public class LibraryHash {

    static ArrayList<Integer>[] shelves = new ArrayList[10];

    static void insert(int code) {
        int shelf = code % 10;

        if (shelves[shelf] == null) {
            shelves[shelf] = new ArrayList<>();
        }

        shelves[shelf].add(code);
    }

    public static void main(String[] args) {

        int[] books = {123, 456, 789, 102, 345, 678, 901, 234};

        for (int book : books) {
            insert(book);
        }

        System.out.println("Final Shelf Contents:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Shelf " + i + ": ");

            if (shelves[i] != null) {
                for (int book : shelves[i]) {
                    System.out.print(book + " ");
                }
            }

            System.out.println();
        }
    }
}