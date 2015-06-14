package CH4_TreesAndGraphs;

import java.util.LinkedList;

public class Q2_AreNodesConnected {

    public static boolean nodesAreConnected(Q2_Graph graph, Q2_Node start, Q2_Node end) {
        LinkedList<Q2_Node> linkedList = new LinkedList<>();

        start.state = Q2_State.Visiting;
        linkedList.add(start);
        Q2_Node u;
        while (!linkedList.isEmpty()) {
            u = linkedList.removeFirst();
            if (u != null) {
                for (Q2_Node v : u.adjacent) {
                    if (v.state == Q2_State.Univisited) {
                        if (v == end) {
                            return true;
                        }
                        else {
                            v.state = Q2_State.Visiting;
                            linkedList.add(v);
                        }
                    }
                }
                u.state = Q2_State.Visited;
            }
        }
        return false;
    }

}
