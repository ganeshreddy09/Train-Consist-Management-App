import java.util.*;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * Description:
 * Demonstrates Linear Search for bogie ID.
 *
 * @version 18.0
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("====================================================\n");

        // Array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String searchKey = "BG309"; // change for testing

        System.out.println("Searching for Bogie ID: " + searchKey + "\n");

        boolean found = false;

        // LINEAR SEARCH
        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break; // early termination
            }
        }

        // OUTPUT
        if (found) {
            System.out.println("Bogie ID found in the train consist.");
        } else {
            System.out.println("Bogie ID NOT found in the train consist.");
        }

        System.out.println("\nUC18 search completed...");
    }
}