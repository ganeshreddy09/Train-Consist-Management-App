import java.util.*;

public class TrainConsistManagementApp {

    // Search Method with Fail-Fast Validation
    public static boolean searchBogie(String[] bogieIds, String key) {

        // Step 1: Validate state (Fail-Fast)
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in the train.");
        }

        // Step 2: Perform Linear Search (can also reuse Binary Search)
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // Example 1: Empty bogie list (to trigger exception)
        String[] bogieIds = {};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        try {
            boolean found = searchBogie(bogieIds, key);

            if (found) {
                System.out.println("Bogie ID " + key + " FOUND ✔");
            } else {
                System.out.println("Bogie ID " + key + " NOT FOUND ❌");
            }

        } catch (IllegalStateException e) {
            // Handle fail-fast exception
            System.out.println("ERROR: " + e.getMessage());
        }

        sc.close();
    }
}