package CH9_SortingAndSearching;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Q4_LargeFileSort {

    /**
     * We have a 2GB text file with one string per line. How do we sort this file?
     *
     * Procedure:
     *
     * 1. Divide the file into reasonably sized chunks.
     * 2. Sort the chunks individually, saving back to the file.
     * 3. Merge the chunks.
     *
     * Testing
     *
     * To actually test this we're first going to need a big text file.
     *
     * 1. Using a word list from http://app.aspell.net/.
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

    public static void test() throws IOException {
        duplicateLines("Q4_word_list_original.txt", 300, "Q4_word_list_expected_output.txt");
        scrambleFile("Q4_word_list_expected_output.txt", "Q4_word_list_scrambled.txt");
        sortLargeFile("Q4_word_list_scrambled.txt", "Q4_word_list_output.txt");
    }

    public static void duplicateLines(String inputFileName, int times, String outputFileName) {
        File input = new File(inputFileName);
        File output = new File(outputFileName);
    }

    public static void scrambleFile(String inputFileName, String outputFileName) {
        File input = new File(inputFileName);
        File output = new File(outputFileName);
    }

    public static void sortLargeFile(String inputFileName, String outputFileName) throws IOException {
        File inputFile = new File(inputFileName);
        File outputFile = new File(outputFileName);

        List<File> splitFiles = splitFile(inputFile, 2000);
        for (File f : splitFiles) sortFile(f);
    }

    public static List<File> splitFile(File file, long blockSize) throws IOException {
        List<File> files = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        try {
            List<String> lines = new ArrayList<>();
            String line = "";
                while (line != null) {
                    long currentBlockSize = 0;
                    while ((currentBlockSize < blockSize)) {
                        line = reader.readLine();
                        if (line == null) break;
                        lines.add(line);
                        currentBlockSize += line.length();
                    }
                    File tmpFile = File.createTempFile("SplitFile", "file");
                    BufferedWriter writer = new BufferedWriter(new FileWriter(tmpFile));
                    for (String s : lines) {
                        writer.write(s);
                        writer.newLine();
                    }
                    files.add(tmpFile);
                    lines.clear();
                }
        }
        finally {
            reader.close();
        }
        return files;
    }

    public static void sortFile(File file) throws IOException {
        List<String> lines = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        try {
            String line = reader.readLine();
            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }
            File tmpFile = File.createTempFile("SplitFile", "file");
            BufferedWriter writer = new BufferedWriter(new FileWriter(tmpFile));
            for (String s : lines) {
                writer.write(s);
                writer.newLine();
            }
        }
        finally {
            reader.close();
        }
    }
}
