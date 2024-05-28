public class CoinChange {

    // Array of Pakistani currency denominations
    private static final int[] DENOMINATIONS = {5000, 1000, 500, 100, 50, 20, 10, 5, 2, 1};

    // Method to find the minimum denominations
    public static void findMinDenominations(int amount) {
        int[] count = new int[DENOMINATIONS.length];

        // Calculate the count of each denomination required
        for (int i = 0; i < DENOMINATIONS.length; i++) {
            if (amount >= DENOMINATIONS[i]) {
                count[i] = amount / DENOMINATIONS[i];
                amount = amount % DENOMINATIONS[i];
            }
        }

        // Print the result
        System.out.println("Currency count for Rs. 1988:");
        for (int i = 0; i < DENOMINATIONS.length; i++) {
            if (count[i] != 0) {
                System.out.println(DENOMINATIONS[i] + " : " + count[i]);
            }
        }
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        int amount = 1988;
        findMinDenominations(amount);
    }
}