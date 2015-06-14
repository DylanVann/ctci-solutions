package CH6_BrainTeasers;

public class Q6_TogglingLockers {

    /**
     * There are 100 closed lockers in a hallway.
     *
     * 1. All lockers are opened.
     * 2. Every second locker is toggled.
     * 3. Every third locker is toggled.
     * ...
     * 100. The 100th locker is toggled.
     *
     * Which lockers will be open?
     */

    /**
     * **When is a door toggled?**
     *
     * The nth door is toggled once for each factor of n.
     *
     * ex. Door 15 is toggled on rounds: 1,3,5,15.
     *
     * In the end doors that are toggled an even number of times will be closed.
     * So doors with an even number of factors (ex. 15) will be closed.
     * So doors with an odd number of factors will be open.
     *
     * Which doors have an odd number of factors?
     *
     * Doors that are perfect squares.
     * ex. 16, with factors: (1,16),(2,8),(4,4)
     * That's 5 factors.
     *
     * Perfect squares that are less than 100:
     * 10*10,9*9,8*8,...,1
     */
    public static void toggleLockers(boolean[] lockers) {
        for (int i = 1 ; i <= 100 ; i++) {
            for (int j = i ; j <= 100 ; j += i) {
                lockers[j-1] = !lockers[j-1];
            }
            System.out.println();
        }
    }

}
