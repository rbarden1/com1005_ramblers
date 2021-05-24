import java.util.ArrayList;
import java.util.List;

public class RamblersState extends SearchState {

    private int[][] tile;

    boolean goalPredicate(Search searcher) {
        return (getSuccessors(searcher).isEmpty());
    }

    ArrayList<SearchState> getSuccessors(Search searcher) {
        ArrayList<SearchState> successorList = new ArrayList<>();
        for (SearchNode node : searcher.successorNodes) {
            successorList.add(node.get_State());
        }
        return successorList;
    }

    boolean sameState(SearchState n2) {
        n2.
    }
}
