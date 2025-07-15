package matchinggame;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;

public class ColorTileManager {
    private static final Color DEFAULT_COLOR = new Color(240, 240, 240);
    private static final Color CORRECT_MATCH_COLOR = new Color(0, 200, 0); // Green for correct matches
    private final Map<Integer, Color> colorMap;

    public ColorTileManager() {
        colorMap = new HashMap<>();
        initializeColors();
    }

    private void initializeColors() {
        colorMap.put(0, Color.RED);
        colorMap.put(1, Color.BLUE);
        colorMap.put(2, Color.GREEN);
        colorMap.put(3, Color.YELLOW);
        colorMap.put(4, Color.ORANGE);
        colorMap.put(5, Color.MAGENTA);
        colorMap.put(6, Color.CYAN);
        colorMap.put(7, Color.PINK);
    }

    public void showTile(JButton button, int type) {
        button.setBackground(colorMap.getOrDefault(type, DEFAULT_COLOR));
        button.setOpaque(true);
        button.setBorderPainted(false);
    }

    public void hideTile(JButton button) {
        button.setBackground(DEFAULT_COLOR);
        button.setOpaque(true);
        button.setBorderPainted(true);
    }

    public void highlightCorrect(JButton button) {
        button.setBackground(CORRECT_MATCH_COLOR);
        button.setOpaque(true);
        button.setBorderPainted(false);
    }
}