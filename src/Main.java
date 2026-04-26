import java.util.*;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * Description:
 * Demonstrates safe cargo assignment using try-catch-finally.
 *
 * @version 15.0
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC15 - Safe Cargo Assignment");
        System.out.println("====================================================\n");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // SAFE assignment
        b1.assignCargo("Petroleum");

        System.out.println();

        // UNSAFE assignment
        b2.assignCargo("Petroleum");

        System.out.println("\nUC15 cargo handling completed...");
    }
}

/**
 * CLASS - GoodsBogie
 */
class GoodsBogie {

    String shape;
    String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargo) {

        try {
            // VALIDATION
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Petroleum cannot be stored in Rectangular bogie");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + shape + " -> " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment attempt completed for " + shape);
        }
    }
}

/**
 * CUSTOM RUNTIME EXCEPTION
 */
class CargoSafetyException extends RuntimeException {

    public CargoSafetyException(String message) {
        super(message);
    }
}