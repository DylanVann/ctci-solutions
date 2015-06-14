package CH1.Q8;

public class IsRotation {

    /**
     * Concatenates a copy of a to a, then checks if b is a substring.
     * In java isSubstring is String.contains().
     *
     * Time: O(n)
     * Space: O(n)
     *
     * @param a String a.
     * @param b String b.
     * @return Is a a rotation of b?
     */
    public static boolean isRotation_Contains(String a, String b) {
        if (a.length() != b.length()) return false;
        return (a+a).contains(b);
    }

    /**
     * Determines if a string is a rotation of another string.
     *
     * Finds a common letter,
     * then checks the rest of the letters using that as the start of checking both strings.
     *
     * Doesn't use isSubstring, but also doesn't use extra space.
     *
     * Time: O(n)
     *
     * Space: O(1)
     * Technically O(n), since the strings are copied to char arrays.
     * The function could be rewritten to take char arrays as inputs though.
     *
     * @param a String a.
     * @param b String b.
     * @return Is a a rotation of b?
     */
    public static boolean isRotation(String a, String b) {
        if (a.length() != b.length()) return false;

        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        for (int i = 0 ; i < charsA.length ; i++) {
            if (charsB[i] == charsA[0]) {
                int j = 0;
                while (j < charsA.length) {
                    char aChar = charsA[j];
                    char bChar = charsB[(i + j) % charsA.length];
                    if (aChar != bChar) break;
                    j++;
                }
                if (j == charsA.length) return true;
            }
        }
        return false;
    }

}
