import java.util.*;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * Description:
 * Demonstrates sorting using Bubble Sort algorithm.
 *
 * @version 16.0
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC16 - Bubble Sort for Passenger Bogie Capacities");
        System.out.println("====================================================\n");

        // Array of capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Original Capacities:");
        printArray(capacities);

        // BUBBLE SORT
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (capacities[j] > capacities[j + 1]) {

                    // SWAP
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // OUTPUT
        System.out.println("\nSorted Capacities:");
        printArray(capacities);

        System.out.println("\nUC16 sorting completed...");
    }

    // Helper method
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}