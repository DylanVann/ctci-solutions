package CH1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AreAllCharactersInAStringUnique {

    /**
     * Uses a boolean array to handle all ASCII characters.
     *
     * n = length of the string
     * ERROR: Space is not O(n),
     * the size of the boolean array is the same regardless of string length.
     * Space: O(1)
     * Time: O(n)
     *
     * @param string String to check.
     * @return Are all the characters unique?
     */
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


    /**
     * This version uses bits instead of an array of booleans.
     * Since it uses a 32 bit int it can only handle character sets with 32 or less characters.
     * This is coded for ASCII characters a-z.
     * Unicode has 1,112,064 possible characters.
     *
     * This same technique could be used with a BigInteger or some other larger array of bits,
     * this would allow larger character sets,
     * but the constant space could become large using this technique.
     * Using bits might cause us to end up with a 1 million bit object (0.125 MB).
     *
     * n = length of the string
     * Space: O(1)
     * Time: O(n)
     *
     * @param string String to check.
     * @return Are all the characters unique?
     */
    public static boolean isUniqueCharsBits(String string) {
        int charSet = 0;
        for (int i = 0 ; i < string.length() ; i++) {
            int val = string.charAt(i) - 'a';
            if ((charSet & (1 << val)) > 0) return false;
            charSet |= (1 << val);
        }
        return true;
    }


    /**
     * This uses a Set. Full unicode support.
     *
     * Space usage will likely be insignificant. It will depend on how many characters are actually used,
     * which likely will not be anywhere near the worst case of ~1 million.
     *
     * n = length of the string
     * Space: O(n)
     * Time: O(n)
     *
     * @param string String to check.
     * @return Are all the characters unique?
     */
    public static boolean isUniqueCharsSet(String string) {
        Set<Character> foundChars = new HashSet<Character>();
        for (char c : string.toCharArray()) {
            if (foundChars.contains(c)) return false;
            foundChars.add(c);
        }
        return true;
    }

}
