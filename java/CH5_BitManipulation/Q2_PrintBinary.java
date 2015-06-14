package CH5_BitManipulation;

public class Q2_PrintBinary {

    public static String printBinary(String decimal) {
        int intPart = Integer.parseInt(decimal.substring(0, decimal.indexOf('.')));
        double decPart = Double.parseDouble(decimal.substring(decimal.indexOf('.', decimal.length())));

        String intString = "";
        while (intPart > 0) {
            int r = intPart % 2;
            intPart >>= 1;
            intString = r + intString;
        }

        String decString = "";
        while (decPart > 0) {
            if (decString.length() > 32) return "ERROR";

            if (decPart == 1) {
                decString += "1";
            }

            double r = decPart * 2;
            if (r >= 1) {
                decString += "1";
                decPart = r - 1;
            }
            else {
                decString += "0";
                decPart = r;
            }
        }

        return intString + "." + decString;
    }

}
