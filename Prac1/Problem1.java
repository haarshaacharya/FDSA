import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] items = new String[n];

        for (int i = 0; i < n; i++) {
            items[i] = sc.next();
        }

        int h = sc.nextInt();
        int k = h % n;

        for (int i = 0; i < n; i++) {
            System.out.print(items[(i + k) % n] + " ");
        }
    }
} 

