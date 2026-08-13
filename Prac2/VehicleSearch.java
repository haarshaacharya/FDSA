package Prac2;

import java.util.Scanner;

public class VehicleSearch {

    static int recursiveSearch(int[] arr, int x, int index) {

        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == x) {
            return index + 1;
        }

        return recursiveSearch(arr, x, index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of vehicles parked: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the Vehicle Plate Numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the Plate Number you want to search: ");
        int x = sc.nextInt();

        int iterativePosition = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                iterativePosition = i + 1;
                break;
            }
        }

        int recursivePosition = recursiveSearch(arr, x, 0);

        System.out.println("Iterative search position: " + iterativePosition);
        System.out.println("Recursive search position: " + recursivePosition);

        sc.close();
    }
}