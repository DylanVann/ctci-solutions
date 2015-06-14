package CH6_BrainTeasers;

public class Q5_DroppingEggs {

    /**
     * ## Question 6.5
     *
     * There is a building of 100 floors.
     * If an egg drops from the Nth floor or above it will break.
     * If it’s dropped from any floor below, it will not break.
     * You’re given 2 eggs. Find N, while minimizing the number of drops for the worst case.
     */

    /**
     * ###Solution
     *
     * To minimize the worst case we should make it so that:
     *
     * egg1Drops + egg2Drops = aConstant
     *
     * For each additional drop of egg1, the maximum possible drops needed  by egg2 should decrease by 1.
     *
     * So egg1 fill be dropped at floors: x, 2x-1, 3x-2
     *
     * Eventually the next floor will be 1 floor up:
     *
     * x + (x-1) + (x-2) ... + 1 = 100
     *
     * = 1 + 2 + 3 ... n = 100
     *
     * This is the summation for triangular numbers:
     *
     * = n(n+1)/2 = 100
     *
     * n = 13.651
     *
     * If we drop from floor 14 first and egg1 breaks, then we need to drop egg2 a maximum of 13 times.
     * The worst case total number of drops will be 14.
     *
     *
     * The worst case total number of drops will be the same no matter which floor egg1 breaks on.
     */

}
