package matchinggame;

import java.util.ArrayList;
import java.util.Collections;

public class TileControl {
    private ArrayList<Integer> tileTypes;
    private final int TOTAL_TILES = 12; // For 3x4 grid
    private final int TOTAL_PAIRS = 6;  // 12 tiles = 6 pairs

    public TileControl() {
        tileTypes = new ArrayList<>();
        shuffle_tiles();
    }

    public void shuffle_tiles() {
        tileTypes.clear();
        // Add pairs of tile types (0-5 for 6 pairs)
        for (int i = 0; i < TOTAL_PAIRS; i++) {
            tileTypes.add(i);
            tileTypes.add(i);
        }
        // If odd number of tiles, add one more to make even
        if (TOTAL_TILES % 2 != 0) {
            tileTypes.add(TOTAL_PAIRS);
        }
        Collections.shuffle(tileTypes);
    }

    public int get_type_of_tile(int ID) {
        if (ID >= 0 && ID < tileTypes.size()) {
            return tileTypes.get(ID);
        }
        return -1; // Invalid ID
    }
}