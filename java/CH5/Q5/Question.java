package CH5.Q5;

public class Question {

    public static int numberOfBitsDifferent(int a, int b) {
        int count = 0;
        for (int c = a ^ b ; c != 0 ; c = c >> 1) {
            count += c & 1;
        }
        return count;
    }

}
