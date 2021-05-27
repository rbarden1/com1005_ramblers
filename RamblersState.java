import java.util.ArrayList;
import java.util.List;

public class RamblersState extends SearchState {

    private int[][] state;

    /* goalPredicate checks if a node is a goal node, and returns a boolean for the result.
    I call the getSuccessors method which I have implemented below. If there are no successors, the
    node must be a goal node, which I check with isEmpty().
     */
    boolean goalPredicate(Search searcher) {
        return (getSuccessors(searcher).isEmpty());
    }

    /* getSuccessors iterates through all of the successor nodes in the Search object and adds their
    state to a list which is then returned
     */
    ArrayList<SearchState> getSuccessors(Search searcher) {
        ArrayList<SearchState> successorList = new ArrayList<>();
        for (SearchNode node : searcher.successorNodes) {
            successorList.add(node.get_State());
        }
        return successorList;
    }

    /* checks if the superclass state is equal to the provided state
     */
    boolean sameState(SearchState n2) {
        return (super.toString().equals(n2.toString()));
    }
}
