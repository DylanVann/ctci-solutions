package CH4.Q2;

import java.util.ArrayList;

public class Node {

    public ArrayList<Node> adjacent = new ArrayList<>();
    private String vertex;
    public State state = State.Univisited;

    public Node(String vertex) {
        this.vertex = vertex;
    }

}
