import java.util.*;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * Description:
 * Demonstrates sorting bogie names using Arrays.sort().
 *
 * @version 17.0
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC17 - Sort Bogie Names using Arrays.sort()");
        System.out.println("====================================================\n");

        // Array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Display original
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // SORT using built-in method
        Arrays.sort(bogieNames);

        // Display sorted
        System.out.println("\nSorted Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nUC17 sorting completed...");
    }
}