package CH1;

public class ReplaceSpacesInString {

    /**
     * Replaces spaces with %02.
     *
     * Space: O(n)
     * Time: O(n)
     *
     * @param str The string.
     * @return The string with spaces replaced with %02.
     */
    public static String replaceStringSpaces(String str) {
        char[] chars = str.toCharArray();
        int spaces = 0;
        for (char c : chars) {
            if (c == ' ') spaces++;
        }
        // No spaces? Return the string unchanged.
        if (spaces == 0) return str;
        // New char[] with space to add %20 in place of spaces.
        char[] newChars = new char[chars.length + spaces * 2];
        // Index for next insertion of a char.
        int nextIndex = 0;
        // Huh, foreach execution order is guaranteed in java.
        for (char aChar : chars) {
            if (aChar == ' ') {
                // Space. Put in %20.
                newChars[nextIndex++] = '%';
                newChars[nextIndex++] = '2';
                newChars[nextIndex++] = '0';
            } else {
                // Not a space. Put the character in.
                newChars[nextIndex++] = aChar;
            }
        }
        return new String(newChars);
    }

    /**
     * The easy way.
     *
     * @param str The string.
     * @return The string with spaces replaced with %02.
     */
    public static String replaceStringSpaces_Easy(String str) {
        return str.replace(" ", "%20");
    }

}
