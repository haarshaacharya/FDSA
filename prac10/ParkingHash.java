public class ParkingHash {

    static int[] parking = new int[10];

    static void insert(int registration) {
        int slot = registration % 10;

        int start = slot;

        while (parking[slot] != 0) {
            slot = (slot + 1) % 10;

            if (slot == start) {
                System.out.println("Parking Full");
                return;
            }
        }

        parking[slot] = registration;
    }

    public static void main(String[] args) {

        int[] vehicles = {123, 456, 789, 102, 345, 678, 901, 234};

        for (int vehicle : vehicles) {
            insert(vehicle);
        }

        System.out.println("Final Parking Slots:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Slot " + i + ": " + parking[i]);
        }
    }
}