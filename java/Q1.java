public class Q1 {

    // n = length of the string
    // Time: O(n)
    // ERROR: Space is not O(n), 
    // the size of the boolean array is the same regardless of string size.
    // Space: O(1)
    public static boolean isUniqueChars(String string) {
        // Assuming ASCII, 128 unique chars.
        boolean[] charSet = new boolean[128];
        for (int i = 0 ; i < string.length() ; i++) {
            int val = string.charAt(i);
            if (charSet[val]) return false;
            charSet[val] = true;
        }
        return true;
    }

    // This version uses bits instead of an array of booleans.
    // It can check if all the letters are unique in any unicode string.
    // Unicode has 1,112,064 possible characters.
    // So we probably don't want to create a boolean array for this.
    // UTF-16 uses a maximum of two 16 bit code units to store chars.
    // So we could store all the information we need in a 32 bit int.
    // Each bit representing whether that char has been encountered.
    // n = length of the string
    // Space: O(1)
    // Time: O(n)
    public static boolean isUniqueCharsBits(String string) {
        /* byte[] charSet = new byte[4]; */
        int charSet = 0;
        for (int i = 0 ; i < string.length() ; i++) {
            int val = string.charAt(i);
            if ((charSet & (1 << val)) > 0) return false;
            charSet |= (1 << val);
        }
        return true;
    }

}
