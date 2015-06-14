package CH8_Recursion;

import java.util.ArrayList;

public class Q5_AllCombinationsOfNParentheses {

    public static ArrayList<String> allCombinationsOfNParentheses(int n) {
        return parenthesesIter(n,n,"");
    }

    static ArrayList<String> parenthesesIter(int l, int r, String combination) {
        ArrayList<String> list = new ArrayList<>();
        if (l == 0 && r == 0) {
            list.add(combination);
        }
        else {
            if (l > 0) {
                list.addAll(parenthesesIter(l-1, r, combination + '('));
            }
            if (r > l) {
                list.addAll(parenthesesIter(l, r-1, combination + ')'));
            }
        }
        return list;
    }

}
