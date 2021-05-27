import java.util.Random;
// Branch and bound is default strategy if depth or breadth first not specified in strat
public class RunRamblersBB {
    static Random rand = new Random();
    public static void main(String[] args) {
        TerrainMap tm = new TerrainMap("tmc.pgm");
        for (int i = 0; i < 50; i++) {
            // Create a new random coordinate based on map dimensions for start and goal
            Coords start = new Coords((rand.nextInt(tm.getDepth())), (rand.nextInt(tm.getHeight())));
            Coords goal = new Coords((rand.nextInt(tm.getDepth())), (rand.nextInt(tm.getHeight())));
            Search bandb = new Search.runSearch();
        }
    }
}
