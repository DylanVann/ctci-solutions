package CH1.Q2;

public class Question {

    /**
     * Reverses a string in place.
     * It has to create a new string object to return anyways though.
     * Reversing a string in place is a useful technique if your string representation is mutable.
     * @param string The string to be reversed.
     * @return The reversed string.
     */
    public static String reverseString(String string) {
        char[] chars = string.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        char tmp;
        while (end > start) {
            tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;
            end--;
            start++;
        }
        return new String(chars);
    }

    /**
     * The easy way.
     *
     * @param string The string to be reversed.
     * @return The reversed string.
     */
    public static String reverseString_Builder(String string) {
        StringBuilder builder = new StringBuilder(string);
        return builder.reverse().toString();
    }

}