import java.util.*;

public class DoubleHashing {

    static int[] table = new int[10];

    static void insert(int id) {
        int h1 = id % 10;
        int h2 = 7 - (id % 7);

        int index = h1;

        for (int i = 0; i < 10; i++) {
            index = (h1 + i * h2) % 10;

            if (table[index] == 0) {
                table[index] = id;
                return;
            }
        }

        System.out.println("Table Full");
    }

    public static void main(String[] args) {

        int[] ids = {123, 456, 789, 102, 345, 678, 901, 234};

        for (int id : ids) {
            insert(id);
        }

        System.out.println("Final Hash Table:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Slot " + i + ": " + table[i]);
        }
    }
}