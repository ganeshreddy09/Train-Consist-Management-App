import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistApp {

    // Bogie class
    static class Bogie {
        private String id;
        private int capacity;

        public Bogie(String id, int capacity) {
            this.id = id;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        public String getId() {
            return id;
        }
    }

    public static void main(String[] args) {

        // Step 1: Create dataset
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            bogies.add(new Bogie("B" + i, (int)(Math.random() * 100)));
        }

        // -------------------------------
        // LOOP-BASED FILTERING
        // -------------------------------
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // -------------------------------
        // STREAM-BASED FILTERING
        // -------------------------------
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // -------------------------------
        // OUTPUT
        // -------------------------------
        System.out.println("Loop Result Count: " + loopResult.size());
        System.out.println("Stream Result Count: " + streamResult.size());

        System.out.println("Loop Time (ns): " + loopTime);
        System.out.println("Stream Time (ns): " + streamTime);

        // Verify results match
        if (loopResult.size() == streamResult.size()) {
            System.out.println("Results are consistent");
        } else {
            System.out.println("Results mismatch");
        }
    }
}