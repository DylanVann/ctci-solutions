package CH6_BrainTeasers;

public class Q3_Pour4QuartsUsing3QuartAnd5QuartJugs {

    /**
     * 1. Fill 5 quart jug.
     * 2. Pour 3 quarts into 3 quart jug.
     * 3. Empty 3 quart jug.
     * 4. Pour remaining 2 quarts in the 5 quart jug into the 3 quart jug.
     * 5. Fill 5 quart jug.
     * 6. Top off 3 quart jug using 1 quart from the 5 quart jug.
     * 7. There are now 4 quarts in the 5 quart jug.
     *
     * Function cannot create any new jugs, and must only use Jug methods.
     *
     * @return A jug containing 4 quarts.
     */
    public static Q3_Jug jugWith4Quarts(Q3_Jug q5, Q3_Jug q3) {
        q5.fill();
        // q5 = 5, q3 = 0
        q5.pourInto(q3);
        // q5 = 2, q3 = 3
        q3.empty();
        // q5 = 2, q3 = 0
        q5.pourInto(q3);
        // q5 = 0, q3 = 2
        q5.fill();
        // q5 = 5, q3 = 2
        q5.pourInto(q3);
        // q5 = 4, q3 = 3
        return q5;
    }

}
