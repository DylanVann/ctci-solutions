import java.lang.reflect.Array;
import java.util.Arrays;

public class Q4 {


    /**
     * Determines if two strings are anagrams.
     *
     * Does this by sorting both strings and checking for equality.
     *
     * @param a String a.
     * @param b String b.
     * @return Are string a and string b anagrams?
     */
    public static boolean areAnagrams_Sort(String a, String b) {
        // Strings must be the same length.
        if (a.length() != b.length()) return false;
        if (a.equals(b)) return true;
        char[] sortedA = a.toCharArray();
        Arrays.sort(sortedA);
        char[] sortedB = b.toCharArray();
        Arrays.sort(sortedB);
        return (Arrays.equals(sortedA, sortedB));
    }

    /**
     * Determines if two strings are anagrams.
     *
     * Uses an array that stores the number of times each character is encountered.
     *
     * @param a String a.
     * @param b String b.
     * @return Are string a and string b anagrams?
     */
    public static boolean areAnagrams_Array(String a, String b) {
        if (a.length() != b.length()) return false;
        if (a.equals(b)) return true;
        // Assuming ASCII only.
        // Index is char value, value is number of times found.
        int[] foundChars = new int[128];
        for (char c : a.toCharArray()) {
            foundChars[c]++;
        }
        // Decrement each found char.
        // If the number in each string is the same, the value will end up being 0.
        for (char c : b.toCharArray()) {
            foundChars[c]--;
            // More of this character in string b.
            if (foundChars[c] < 0) return false;
        }
        for (int times : foundChars) {
            // Number of instances of the char are not equal.
            if (times != 0) return false;
        }
        return true;
    }

}
