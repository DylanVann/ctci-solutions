package CH8_Recursion;

import java.util.ArrayList;

public class Q3_AllSubsetsOfSet {

    /**
     * Returns a list of all subsets of a set.
     *
     * All sets can be either included or not included. So we will have space and time of 2^n.
     *
     * https://en.wikipedia.org/wiki/Power_set
     *
     * Space: O(2^n)
     * Time: O(2^n)
     *
     * @param set
     * @return
     */
    public static ArrayList<ArrayList<Integer>> allSubsetsOfSet(ArrayList<Integer> set) {
        ArrayList<ArrayList<Integer>> allSubsets = new ArrayList<>();
        int max = 1 << set.size();
        for (int i = 0 ; i < max ; i++) {
            ArrayList<Integer> subSet = new ArrayList<>();
            int k = i;
            int index = 0;
            while (k > 0) {
                if ((k & 1) > 0) {
                    subSet.add(set.get(index));
                }
                k >>= 1;
                index++;
            }
            allSubsets.add(subSet);
        }
        return allSubsets;
    }

}
