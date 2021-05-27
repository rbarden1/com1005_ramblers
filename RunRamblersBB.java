import java.util.Random;
// Branch and bound is default strategy if depth or breadth first not specified in strat
public class RunRamblersBB {
    static Random rand = new Random();
    public static void main(String[] args) {
        TerrainMap tm = new TerrainMap("tmc.pgm");
        RamblersSearch ramblers = new RamblersSearch();
        for (int i = 0; i < 50; i++) {
            int[] start = {rand.nextInt(tm.getHeight()),tm.getWidth()};
            int[] goal = {rand.nextInt(tm.getHeight()),tm.getWidth()};
            ramblers.runSearch(new RamblersState(0, start, goal),"branch and bound");
        }
    }
}
