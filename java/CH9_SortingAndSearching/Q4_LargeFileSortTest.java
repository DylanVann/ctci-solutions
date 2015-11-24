package CH9_SortingAndSearching;

import org.junit.Test;

import java.io.*;
import java.util.List;

public class Q4_LargeFileSortTest {

    /**
     * To actually test this we're first going to need a big text file.
     *
     * 1. Using a word list from [http://app.aspell.net/](http://app.aspell.net/).
     * word_list_original.txt
     *
     * 2. Duplicate each line in the file 300 times to get the file size from ~7mb up to 2GB.
     * word_list_expected_output.txt
     * At this point the word list is already sorted.
     *
     * 3. Create a new file that is a scrambled version of this list, with the lines rearranged randomly.
     * word_list_scrambled.txt
     *
     * 4. Apply the sorting algorithm to this new file.
     * word_list_output.txt
     *
     * 5. Compare word_list_expected_output.txt to word_list_output.txt
     * to determine if the algorithm produced the correct output.
     */
    @Test
    public void sortLargeFileTest() throws Exception {
        duplicateLines("Q4_word_list_original.txt", 300, "Q4_word_list_expected_output.txt");
        scrambleFile("Q4_word_list_expected_output.txt", "Q4_word_list_scrambled.txt");
        Q4_LargeFileSort.sortLargeFile("Q4_word_list_scrambled.txt", "Q4_word_list_output.txt");
    }

    public static void duplicateLines(String inputFileName, int times, String outputFileName) {
        File input = new File(inputFileName);
        File output = new File(outputFileName);
    }

    public static void scrambleFile(String inputFileName, String outputFileName) {
        File input = new File(inputFileName);
        File output = new File(outputFileName);
    }

}
