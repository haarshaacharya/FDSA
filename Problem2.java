import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of borrow records: ");
        int n = sc.nextInt();

        int[] books = new int[n];

        System.out.println("Enter Book IDs:");
        for (int i = 0; i < n; i++) {
            books[i] = sc.nextInt();
        }

        System.out.println("Books borrowed more than once:");

        for (int i = 0; i < n; i++) {

            boolean printed = false;

            for (int k = 0; k < i; k++) {
                if (books[i] == books[k]) {
                    printed = true;
                    break;
                }
            }

            if (printed)
                continue;

            int count = 0;

            for (int j = 0; j < n; j++) {
                if (books[i] == books[j]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(books[i]);
            }
        }

        sc.close();
    }
}