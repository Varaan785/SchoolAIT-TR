package example_01.entity;

/**
 * @author Valerian
 * @version begin 27.08.24 -
 */

public class Gerüst_Meereswesen {
    boolean meereswesen;
    public void schwimmen() {
        if (meereswesen) {
            for (int i = 1; i < 5; i++) {
                System.out.println("Swimming " + i);

            }
        }
    }
}
