import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        int li = 0;
        int hi = arr.length - 1;

        while (li <= hi) {
            int mi = (li + hi) / 2;

            if (arr[mi] == x) {
                System.out.println("Element found at index " + mi);
                return;
            } else if (arr[mi] < x) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
        }

        System.out.println("Element not found");
    }
}