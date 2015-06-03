package CH4.Q2;

import java.util.LinkedList;

public class Question {

    public static boolean nodesAreConnected(Graph graph, Node start, Node end) {
        LinkedList<Node> linkedList = new LinkedList<>();

        start.state = State.Visiting;
        linkedList.add(start);
        Node u;
        while (!linkedList.isEmpty()) {
            u = linkedList.removeFirst();
            if (u != null) {
                for (Node v : u.adjacent) {
                    if (v.state == State.Univisited) {
                        if (v == end) {
                            return true;
                        }
                        else {
                            v.state = State.Visiting;
                            linkedList.add(v);
                        }
                    }
                }
                u.state = State.Visited;
            }
        }
        return false;
    }

}
