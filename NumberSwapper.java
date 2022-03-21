package src;

public class NumberSwapper {
    private int value;

    public NumberSwapper(Integer value) {
        this.value = value;
    }

    public String toString() {
        return (String.format("%d", this.value));
    }

  // Swap method
    public void swapToLowHighOrder(NumberSwapper check) {
        if (this.value > check.value) {
            int temp_var = this.value;
            this.value = check.value;
            check.value = temp_var;
        }
    }

  // Output
    public static void swapper(int n0, int n1) {
        NumberSwapper a = new NumberSwapper(n0);
        NumberSwapper b = new NumberSwapper(n1);

      // Print before and after
        System.out.println("Before: " + a + " " + b);
        a.swapToLowHighOrder(b); 
        System.out.println("After: " + a + " " + b);
        System.out.println();
    }

  // Test cases
    public static void main(String[] ags) {
        NumberSwapper.swapper(21, 16);
        NumberSwapper.swapper(16, 21);
        NumberSwapper.swapper(16, -1);
    }

}