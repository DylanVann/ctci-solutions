package CH8_Recursion;

import java.util.ArrayList;

public class Q4_AllPermutationsOfAString {

    /**
     * There are n! permutations.
     *
     * Time: O(n!)
     * Space: O(n!)
     *
     * @param in
     * @return
     */
    public static ArrayList<String> allPermutationsOfAString(String in) {
        ArrayList<String> permutations = new ArrayList<String>();
        if (in == null) {
            return null;
        }
        else if (in.length() == 0) {
            permutations.add("");
            return permutations;
        }

        char firstChar = in.charAt(0);
        String remainder = in.substring(1);
        ArrayList<String> words = allPermutationsOfAString(remainder);
        for (String word : words) {
            for (int j = 0 ; j <= word.length() ; j++) {
                permutations.add(insertCharAt(word,firstChar,j));
            }
        }
        return permutations;
    }

    static String insertCharAt(String word, char c, int i) {
        String start = word.substring(0,i);
        String end = word.substring(i);
        return start + c + end;
    }
}
