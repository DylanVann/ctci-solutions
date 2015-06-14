package CH8.Q7;

public class MakeChange {

    public static int makeChange(int n, int[] denominations) {
        return makeChange(n, 0, denominations);
    }

    static int makeChange(int n, int denominationIndex, int[] denominations) {
        if (denominationIndex == denominations.length - 1) return 1;
        int waysToMakeChange = 0;
        for (int i = 0 ; i * denominations[denominationIndex] <= n ; i++) {
            waysToMakeChange += makeChange(n - i * denominations[denominationIndex], denominationIndex + 1, denominations);
        }
        return waysToMakeChange;
    }

}
