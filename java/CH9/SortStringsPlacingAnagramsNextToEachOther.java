package CH9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortStringsPlacingAnagramsNextToEachOther {

    /**
     * Sorts the arrays of strings, placing anagrams next to each other.
     *
     * This is done by converting each string to a char array, sorting it,
     * and then comparing char arrays to sort the string.
     *
     * @param array
     */
    public static void sortStringsPlacingAnagramsNextToEachOther(ArrayList<String> array) {
        Collections.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char[] charsO1 = o1.toCharArray();
                Arrays.sort(charsO1);
                o1 = new String(charsO1);
                char[] charsO2 = o2.toCharArray();
                Arrays.sort(charsO2);
                o2 = new String(charsO2);
                return o1.compareTo(o2);
            }
        });
    }

}
