package matchinggame;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class ScoreManager {
    private static final String SCORE_FILE = "scores.txt";

    public void saveScore(int score) {
        List<Integer> scores = loadScores();
        scores.add(score);
        Collections.sort(scores, Collections.reverseOrder());
        saveScoresToFile(scores);
    }

    private List<Integer> loadScores() {
        List<Integer> scores = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(SCORE_FILE))) {
            while (scanner.hasNextInt()) {
                scores.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            // File doesn't exist yet
        }
        return scores;
    }

    private void saveScoresToFile(List<Integer> scores) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(SCORE_FILE))) {
            for (int s : scores) {
                writer.println(s);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving scores: " + e.getMessage());
        }
    }
}