package CH8_Recursion;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Q3_AllSubsetsOfSetTest {

    @Test
    public void testAllSubsetsOfSet() throws Exception {

        int[][] expectedResult = {
                {},
                {1},{2},{3},
                {1,2}, {1,3}, {2,3},
                {1,2,3}
        };
        ArrayList<ArrayList<Integer>> expectedResultList = toArrayList(expectedResult);

        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);

        ArrayList<ArrayList<Integer>> resultList = Q3_AllSubsetsOfSet.allSubsetsOfSet(input);

        // The elements in the result might not be in the same order as in expectedResult.
        assertEquals(true, expectedResultList.size() == resultList.size());
        assertEquals(true, expectedResultList.containsAll(resultList));
    }

    public ArrayList<ArrayList<Integer>> toArrayList(int[][] array) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        for (int[] i : array) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j : i) {
                row.add(j);
            }
            ret.add(row);
        }
        return ret;
    }

    public int[][] toArray(ArrayList<ArrayList<Integer>> list) {
        int[][] r = new int[list.size()][];
        for (int i = 0 ; i < list.size() ; i ++) {
            ArrayList<Integer> row = list.get(i);
            int[] rowInt = new int[row.size()];
            for (int j = 0 ; j < row.size() ; j++) {
                rowInt[j] = row.get(j);
                System.out.print(row.get(j) + ", ");
            }
            r[i] = rowInt;
            System.out.println();
        }
        return r;
    }

}
