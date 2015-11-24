package CH9_SortingAndSearching;

import java.io.*;
import java.util.*;

public class Q4_LargeFileSort {

    /**
     * We have a 2GB text file with one string per line. How do we sort this file?
     *
     * Procedure:
     *
     * 1. Divide the file into reasonably sized chunks.
     * 2. Sort the chunks individually, saving back to the file.
     * 3. Merge the chunks.
     */
    public static void sortLargeFile(String inputFileName, String outputFileName) throws IOException {
        File inputFile = new File(inputFileName);
        File outputFile = new File(outputFileName);

        List<File> splitFiles = splitFile(inputFile, 2000);
        for (File f : splitFiles) sortFile(f);
    }

    /**
     * @param file
     * @param blockSize
     * @return
     * @throws IOException
     */
    public static List<File> splitFile(File file, long blockSize) throws IOException {
        List<File> files = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            long currentBlockSize = 0;
            while ((currentBlockSize < blockSize)) {
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
        reader.close();
        return files;
    }

    /**
     * 1. Create a bufferedReader for each file.
     * 2. Fill an array with the last line of each file.
     * 3. Find the min string in that array.
     * 4. Add the next line from the file that contained that string to the array.
     * 5. Repeat steps 3 and 4 until all files have been read completely.
     *
     * @param files
     * @param blockSize
     * @return
     * @throws IOException
     */
    public static File mergeSortFiles(List<File> files, int blockSize) throws IOException {
        File output = File.createTempFile("MergeSort", ".file");
        BufferedWriter outputWriter = new BufferedWriter(new FileWriter(output));

        // 1. Create readers.
        ArrayList<BufferedReader> readers = new ArrayList<>();
        for (File f : files) {
            BufferedReader reader = new BufferedReader(new FileReader(f));
            readers.add(reader);
        }

        // 2. Fill array with the last line of each file.
        ArrayList<String> lines = new ArrayList<>();
        for (BufferedReader reader : readers) {
            String line = reader.readLine();
            if (line == null) {
                readers.remove(reader);
            }
            else {
                lines.add(line);
            }
        }

        while (readers.size() > 0) {
            // 3. Find the min string in the array.
            ArrayList<BufferedReader> emptyReaders = new ArrayList<>();
            BufferedReader minReader = readers.get(0);
            String minLine = minReader.readLine();
            for (int i = 0 ; i < lines.size() ; i++) {
                BufferedReader lineReader = readers.get(i);
                String line = lines.get(i);
                if (line == null) {
                    emptyReaders.add(lineReader);
                }
                else if (line.compareTo(minLine) > 0) {
                    minReader = lineReader;
                    minLine = line;
                }
            }

            // Remove empty readers.
            readers.removeAll(emptyReaders);
            emptyReaders.clear();

            // 4. Add the next line from the file that contained the minString to the array.
            lines.add(minReader.readLine());
        }

        BufferedReader minStringReader = readers.get(0);
        String minString = minStringReader.readLine();
        assert minString != null;
        for (BufferedReader reader : readers) {
            String s = reader.readLine();
            if (s == null) {
                readers.remove(reader);
            }
            else if (s.compareTo(minString) > 0) {
                minStringReader = reader;
                minString = s;
            }
        }

        return output;
    }

    /**
     * @param file
     * @throws IOException
     */
    public static void sortFile(File file) throws IOException {
        List<String> lines = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        File tmpFile = File.createTempFile("SortedFile", "file");
        BufferedWriter writer = new BufferedWriter(new FileWriter(tmpFile));
        for (String s : lines) {
            writer.write(s);
            writer.newLine();
        }
        reader.close();
    }
}
