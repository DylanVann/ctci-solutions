import java.util.HashSet;
import java.util.Set;

public class Q3 {


    /**
     * Remove duplicates means if you're reading the string left to right,
     * remove a character if you've come across it before.
     *
     * ERROR: Question is a bit unclear.
     * What the question wants you to do, remove duplicates without copying to a new string/array,
     * can only be done on a mutable string, or a char[] in java.
     *
     * Time: O(n^2)
     * Space: O(1)
     *
     * @param str The character array to remove duplicates from.
     * @return The new character array, with duplicate characters removed.
     */
    public static String removeDuplicateCharacters(String str) {
        // I would not add a check for null.
        char[] chars = str.toCharArray();
        int length = chars.length;
        // Definitely no duplicates if length < 2.
        if (length < 2) return str;

        int end = 1;
        for (int i = 1 ; i < length ; i++) {
            int j;
            // Check all previous chars.
            for (j = 0 ; j < end ; j++) {
                if (chars[i] == chars[j]) {
                    // Break if duplicate is encountered. In the next loop we look at the next character.
                    // If it's unique then it will be added in the place of this duplicate.
                    break;
                }
            }
            // If no duplicate was encountered.
            if (j == end) {
                // Set the current end of the string to the newly encountered char.
                chars[end] = chars[i];
                // Increment the end of the string.
                // If no new unique char is encountered this will be the length of the returned string.
                end++;
            }
        }

        // There's no way to trim the char[] without copying in java.
        // You could set the end to a null character,
        // but that wouldn't do anything unless you added handling for it elsewhere.
        // Trim the char[] to make a new string.
        return new String(chars, 0, end);
    }

    /**
     * We can use the same method used in {@link Q1#isUniqueCharsSet(String)} to get O(n) time.
     *
     * Time: O(n)
     * Space: O(n)
     *
     * @param str The character array to remove duplicates from.
     * @return The new character array, with duplicate characters removed.
     */
    public static String removeDuplicateCharacters_Set(String str) {
        char[] chars = str.toCharArray();
        int length = chars.length;
        // Definitely no duplicates if length < 2.
        if (length < 2) return str;

        Set<Character> set = new HashSet<Character>();
        int end = 0;
        for (int i = 0 ; i < length ; i++) {
            char c = chars[i];
            if (!set.contains(c)) {
                set.add(c);
                chars[end] = chars[i];
                end++;
            }
        }

        return new String(chars, 0, end);
    }

}
