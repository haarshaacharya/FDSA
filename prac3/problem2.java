package prac3;

import java.util.Scanner;

public class problem2 {

    static void sortColors(int[] a) {
        int low = 0;
        int mid = 0;
        int high = a.length - 1;

        while (mid <= high) {
            if (a[mid] == 0) {
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements (0, 1, 2):");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        sortColors(a);

        System.out.println("Sorted array:");
        for (int x : a) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}