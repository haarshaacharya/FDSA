package Prac2;

import java.util.Scanner;

public class LinearSearchint {

    static int recursiveSearch(int arr[], int x, int index) {

        if (index == arr.length)
            return -1;

        if (arr[index] == x)
            return index + 1;

        return recursiveSearch(arr, x, index + 1);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter sorted book codes: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter book code to search: ");
        int x = sc.nextInt();

        int loopPosition = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                loopPosition = i + 1;
                break;
            }
        }

        int recursivePosition = recursiveSearch(arr, x, 0);

        System.out.println("Loop method position: " + loopPosition);
        System.out.println("Recursive method position: " + recursivePosition);

        sc.close();
    }
}