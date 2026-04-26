import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("====================================================\n");

        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        String searchKey = "BG205";

        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        System.out.println("\nSearching for Bogie ID: " + searchKey + "\n");

        boolean found = binarySearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID found in the train consist.");
        } else {
            System.out.println("Bogie ID NOT found in the train consist.");
        }

        System.out.println("\nUC19 search completed...");
    }

    public static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = arr[mid].compareTo(key);

            if (cmp == 0) {
                return true;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}