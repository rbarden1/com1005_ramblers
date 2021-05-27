public class RamblersSearch extends Search {
    static Search runSearch = new Search() {
        public String runSearch(SearchState initState, String strat) {
            return(super.runSearch(initState, strat));
        }
    };

}
