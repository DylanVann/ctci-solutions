package CH4_TreesAndGraphs;

import java.util.ArrayList;

public class Q2_Node {

    public ArrayList<Q2_Node> adjacent = new ArrayList<>();
    private String vertex;
    public Q2_State state = Q2_State.Univisited;

    public Q2_Node(String vertex) {
        this.vertex = vertex;
    }

}
