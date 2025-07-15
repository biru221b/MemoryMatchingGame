package matchinggame;

// Java AWT imports
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Java IO imports
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Java Util imports
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

// Swing imports
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.GroupLayout;

public class GameBoardGUI extends javax.swing.JFrame {
    
    // Your field declarations here
    private Timer flipBackTimer;
    private final ColorTileManager colorManager = new ColorTileManager();
    private final ScoreManager scoreManager = new ScoreManager();
    private final TileControl tileControl = new TileControl();
    
    // Constructor
    public GameBoardGUI() {
        initComponents();  // This is fine - private methods can be called within same class
        // Rest of your initialization
        flipBackTimer = new Timer(500, (e) -> {
            hideSelectedTile(PrevID_Guess1);
            hideSelectedTile(PrevID_Guess2);
            flipBackTimer.stop();
        });
        getContentPane().setLayout(new BorderLayout());
    }


 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tile11 = new javax.swing.JButton();
        Tile14 = new javax.swing.JButton();
        Tile12 = new javax.swing.JButton();
        Tile13 = new javax.swing.JButton();
        Tile22 = new javax.swing.JButton();
        Tile23 = new javax.swing.JButton();
        Tile21 = new javax.swing.JButton();
        Tile24 = new javax.swing.JButton();
        Tile31 = new javax.swing.JButton();
        Tile32 = new javax.swing.JButton();
        Tile33 = new javax.swing.JButton();
        Tile34 = new javax.swing.JButton();
        ScoreScreen = new javax.swing.JTextField();
        ScoreScreenLabel = new javax.swing.JLabel();
        startGameButton = new javax.swing.JButton();
        QuitButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("4x4 Memory Game");
        setResizable(false);

        Tile11.setEnabled(false);
        Tile11.setFocusable(false);
        Tile11.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile11.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile11.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile11ActionPerformed(evt);
            }
        });

        Tile14.setEnabled(false);
        Tile14.setFocusable(false);
        Tile14.setName(""); // NOI18N
        Tile14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile14ActionPerformed(evt);
            }
        });

        Tile12.setEnabled(false);
        Tile12.setFocusable(false);
        Tile12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile12ActionPerformed(evt);
            }
        });

        Tile13.setEnabled(false);
        Tile13.setFocusable(false);
        Tile13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile13ActionPerformed(evt);
            }
        });

        Tile22.setEnabled(false);
        Tile22.setFocusable(false);
        Tile22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile22ActionPerformed(evt);
            }
        });

        Tile23.setEnabled(false);
        Tile23.setFocusable(false);
        Tile23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile23ActionPerformed(evt);
            }
        });

        Tile21.setEnabled(false);
        Tile21.setFocusable(false);
        Tile21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile21ActionPerformed(evt);
            }
        });

        Tile24.setEnabled(false);
        Tile24.setFocusable(false);
        Tile24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile24ActionPerformed(evt);
            }
        });

        Tile31.setEnabled(false);
        Tile31.setFocusable(false);
        Tile31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile31ActionPerformed(evt);
            }
        });

        Tile32.setEnabled(false);
        Tile32.setFocusable(false);
        Tile32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile32ActionPerformed(evt);
            }
        });

        Tile33.setEnabled(false);
        Tile33.setFocusable(false);
        Tile33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile33ActionPerformed(evt);
            }
        });

        Tile34.setEnabled(false);
        Tile34.setFocusable(false);
        Tile34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile34ActionPerformed(evt);
            }
        });

        ScoreScreen.setEditable(false);
        ScoreScreen.setBackground(new java.awt.Color(204, 204, 255));
        ScoreScreen.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        ScoreScreen.setText("0");
        ScoreScreen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ScoreScreen.setEnabled(false);
        ScoreScreen.setFocusable(false);

        ScoreScreenLabel.setFont(new java.awt.Font("FreeSerif", 1, 18)); // NOI18N
        ScoreScreenLabel.setText("SCORE:");

        startGameButton.setText("PLAY");
        startGameButton.setFont(new java.awt.Font("Dialog", 0, 18));
        startGameButton.setBackground(Color.BLACK);
        startGameButton.setForeground(Color.RED); // Set text color to white
        setTitle("FLIP FLOP GAME -- NOUMAN");
        startGameButton.setToolTipText("");
        startGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameButtonActionPerformed(evt);
            }
        });

        QuitButton.setText("QUIT");
        QuitButton.setFont(new java.awt.Font("Dialog", 0, 18));

        QuitButton.setBackground(Color.BLACK);
        QuitButton.setForeground(Color.RED);
        QuitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitButtonActionPerformed(evt);
            }
        });

        resetButton.setText("RESET");
        resetButton.setFont(new java.awt.Font("Dialog", 0, 18));
        resetButton.setBackground(Color.BLACK);
        resetButton.setForeground(Color.RED); // Set text color to red
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel1.setText("Matching Game");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ScoreScreenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ScoreScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(QuitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Tile21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Tile31, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(Tile11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Tile12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Tile13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Tile14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Tile32, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(Tile22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(Tile23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Tile24, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(Tile33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Tile34, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(startGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startGameButton)
                        .addGap(23, 23, 23)
                        .addComponent(resetButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Tile13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tile12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tile14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tile11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tile22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tile24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tile21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tile23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tile33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ScoreScreenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ScoreScreen))
                        .addGap(71, 71, 71))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(QuitButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void startGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameButtonActionPerformed

        PrevID_Guess1 = 100;
        PrevID_Guess2 = 100;
        ID_Guess1 = 100;
        ID_Guess2 = 100;
        match = false;
        count = 0;
        score = 0;

        ScoreScreen.setText(Integer.toString(score));

        //Re-Enable the buttons.
        Tile11.setEnabled(true);
        Tile12.setEnabled(true);
        Tile13.setEnabled(true);
        Tile14.setEnabled(true);
        Tile21.setEnabled(true);
        Tile22.setEnabled(true);
        Tile23.setEnabled(true);
        Tile24.setEnabled(true);
        Tile31.setEnabled(true);
        Tile32.setEnabled(true);
        Tile33.setEnabled(true);
        Tile34.setEnabled(true);
      

        //Set the icons to be Blank.
        wipeBoard();

        //generate random #'s and assign them to shapes as IDs.
        tileControl.shuffle_tiles();

        //let the user see the board for a second.  Then they match by memory.
        flashColors();
    }//GEN-LAST:event_startGameButtonActionPerformed

    //Tile 1,1 | ID 0 - Press
    private void Tile11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile11ActionPerformed
        int ID = 0;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile11ActionPerformed

    //Tile 1,2 | ID 1 - Press
    private void Tile12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile12ActionPerformed
        int ID = 1;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile12ActionPerformed

    //Tile 1,3 | ID 2 - Press
    private void Tile13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile13ActionPerformed
        int ID = 2;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile13ActionPerformed

    //Tile 1,4 | ID 3 - Press
    private void Tile14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile14ActionPerformed
        int ID = 3;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile14ActionPerformed

    //Tile 2,1 | ID 4 - Press
    private void Tile21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile21ActionPerformed
        int ID = 4;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile21ActionPerformed

    //Tile 2,2 | ID 5 - Press
    private void Tile22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile22ActionPerformed
        int ID = 5;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile22ActionPerformed

    //Tile 2,3 | ID 6 - Press
    private void Tile23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile23ActionPerformed
        int ID = 6;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile23ActionPerformed

    //Tile 2,4 | ID 7 - Press
    private void Tile24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile24ActionPerformed
        int ID = 7;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile24ActionPerformed

    //Tile 3,1 | ID 8 - Press
    private void Tile31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile31ActionPerformed
        int ID = 8;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile31ActionPerformed

    //Tile 3,2 | ID 9 - Press
    private void Tile32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile32ActionPerformed
        int ID = 9;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile32ActionPerformed

    //Tile 3,3 | ID 10 - Press
    private void Tile33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile33ActionPerformed
        int ID = 10;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile33ActionPerformed

    //Tile 3,4 | ID 11 - Press
    private void Tile34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile34ActionPerformed
        int ID = 11;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile34ActionPerformed

    //Quit Button, Reset the board as if it had never been opened, and close it.  doesn't quit program.
    private void QuitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitButtonActionPerformed

        System.exit(0);
    }//GEN-LAST:event_QuitButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        wipeBoard();
        PrevID_Guess1 = 100;
        PrevID_Guess2 = 100;
        ID_Guess1 = 100;
        ID_Guess2 = 100;
        match = false;
        count = 0;
        score = 0;
        sScore = "0";
        ScoreScreen.setText(sScore);

        buttonEnabledSwitch(false, 0);
        buttonEnabledSwitch(false, 1);
        buttonEnabledSwitch(false, 2);
        buttonEnabledSwitch(false, 3);
        buttonEnabledSwitch(false, 4);
        buttonEnabledSwitch(false, 5);
        buttonEnabledSwitch(false, 6);
        buttonEnabledSwitch(false, 7);
        buttonEnabledSwitch(false, 8);
        buttonEnabledSwitch(false, 9);
        buttonEnabledSwitch(false, 10);
        buttonEnabledSwitch(false, 11);
        buttonEnabledSwitch(false, 12);
        buttonEnabledSwitch(false, 13);
        buttonEnabledSwitch(false, 14);
        buttonEnabledSwitch(false, 15);
    }//GEN-LAST:event_resetButtonActionPerformed

 private void showTileShape(int ID, int type) {
    JButton button = getButtonById(ID);
    if (button != null) {
        colorManager.showTile(button, type);
    }
}
    //Sets the icons to all of the buttons to BlankTile.png. Doesn't reset the actual game.
   private void wipeBoard() {
    for (int i = 0; i < 12; i++) {
        hideSelectedTile(i);
    }
}

    //do the 2 buttons chosen have matching shapes?
    private boolean testMatch(int type1, int type2) {
        boolean same = false;

        if (type1 == type2) {
            same = true;
        }

        return same;
    }

    //Hide the shape and set icon to blank a particular button/Tile.
 private void hideSelectedTile(int ID) {
    JButton button = getButtonById(ID);
    if (button != null) {
        colorManager.hideTile(button);
    }
}

private JButton getButtonById(int ID) {
    switch (ID) {
        case 0: return Tile11;
        case 1: return Tile12;
        case 2: return Tile13;
        case 3: return Tile14;
        case 4: return Tile21;
        case 5: return Tile22;
        case 6: return Tile23;
        case 7: return Tile24;
        case 8: return Tile31;
        case 9: return Tile32;
        case 10: return Tile33;
        case 11: return Tile34;
        default: return null;
    }
}

    private void buttonEnabledSwitch(boolean state, int ID) {
        switch (ID) {
            case 0:
                Tile11.setEnabled(state);
                break;
            case 1:
                Tile12.setEnabled(state);
                break;
            case 2:
                Tile13.setEnabled(state);
                break;
            case 3:
                Tile14.setEnabled(state);
                break;
            case 4:
                Tile21.setEnabled(state);
                break;
            case 5:
                Tile22.setEnabled(state);
                break;
            case 6:
                Tile23.setEnabled(state);
                break;
            case 7:
                Tile24.setEnabled(state);
                break;
            case 8:
                Tile31.setEnabled(state);
                break;
            case 9:
                Tile32.setEnabled(state);
                break;
            case 10:
                Tile33.setEnabled(state);
                break;
            case 11:
                Tile34.setEnabled(state);
                break;
            
        }
    }

    //Check for a win or loss - if all buttons are pressed and tellin user rank
  private void checkEndGame() {
    // Fixed if condition with proper closing parenthesis
    if (!Tile11.isEnabled() && !Tile12.isEnabled() && !Tile13.isEnabled() && !Tile14.isEnabled()
        && !Tile21.isEnabled() && !Tile22.isEnabled() && !Tile23.isEnabled() && !Tile24.isEnabled()
        && !Tile31.isEnabled() && !Tile32.isEnabled() && !Tile33.isEnabled() && !Tile34.isEnabled()) {
        
        System.out.println("Game Over - All tiles matched!"); // Debug message
        
        // Step 1: Read existing scores from the file
        List<Integer> scores = new ArrayList<>();
        String filePath = System.getProperty("user.dir") + "/src/memorygame/scores.txt";
        System.out.println("Loading scores from: " + filePath); // Debug path

        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextInt()) {
                int scoreValue = scanner.nextInt();
                scores.add(scoreValue);
                System.out.println("Loaded score: " + scoreValue); // Debug loaded scores
            }
        } catch (FileNotFoundException e) {
            System.out.println("No existing scores file found, creating new one.");
        }

        // Step 2: Add current score
        scores.add(score);
        System.out.println("Added current score: " + score);

        // Step 3: Sort scores
        Collections.sort(scores, Collections.reverseOrder());
        System.out.println("Sorted scores: " + scores);

        // Step 4: Save scores
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (int s : scores) {
                writer.println(s);
            }
            System.out.println("Scores saved successfully");
        } catch (IOException e) {
            System.err.println("Error saving scores: " + e.getMessage());
        }

        // Step 5: Determine rank
        int userRank = scores.indexOf(score) + 1;
        System.out.println("User rank: " + userRank);

        // Step 6: Show message
        String message;
        if (score > 0) {
            message = String.format("Congratulations!\nYou Win!\nYour final score: %d\nYour rank: %d", 
                                  score, userRank);
        } else {
            message = String.format("You Lose!\nYour score: %d\nTry again!\nYour rank: %d", 
                                  score, userRank);
        }
        
        JOptionPane.showMessageDialog(rootPane, message, "Game Over", JOptionPane.INFORMATION_MESSAGE);
    }
}

    //every tile that is pressed on the board uses this in order to make decisions in the game.
    private void buttonPress(int ID, int type) {
        if (count == 0) {

//gameTimer.start();
            showTileShape(ID, type);
            ID_Guess1 = ID;
            type_Guess1 = type;
            count++;

            // clear the 2 wrong tiles 
            if (!match) {
                hideSelectedTile(PrevID_Guess1);
                hideSelectedTile(PrevID_Guess2);
            }

        } else if (count == 1) {

            showTileShape(ID, type);
            ID_Guess2 = ID;
            type_Guess2 = type;
            PrevID_Guess1 = ID_Guess1;
            PrevID_Guess2 = ID_Guess2;

            //before matching test if the same tile was pressed twice.  that's cheating.
            if (ID_Guess1 == ID_Guess2) {
                JOptionPane.showMessageDialog(
                        rootPane,
                        "You cannot pick the same tile twice.\n",
                        "Invalid Move", WIDTH, null
                );
                hideSelectedTile(ID_Guess1);
                ID_Guess1 = 100;
                ID_Guess2 = 100;
                PrevID_Guess1 = 100;
                PrevID_Guess2 = 100;
                buttonEnabledSwitch(true, ID_Guess1);
            } else {
                match = testMatch(type_Guess1, type_Guess2);

                if (!match) {

                    score = score - 5;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);
                    //hideSelectedTile(PrevID_Guess1);
                    flipBackTimer.start(); // Start the timer to delay hiding the tiles

                } else {

                    score = score + 10;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);

                    buttonEnabledSwitch(false, ID_Guess1);
                    buttonEnabledSwitch(false, ID_Guess2);

                    checkEndGame();
                }

            }
            count = 0;
        }
    }
  private void flashColors() {
    Thread thread = new Thread() {
        @Override
        public void run() {
            try {
                // Show all colors
                for (int i = 0; i < 12; i++) {
                    int type = tileControl.get_type_of_tile(i);
                    showTileShape(i, type);
                }
                Thread.sleep(2000); // Show for 2 seconds
                
                // Hide all colors
                wipeBoard();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    };
    thread.start();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton QuitButton;
    private javax.swing.JTextField ScoreScreen;
    private javax.swing.JLabel ScoreScreenLabel;
    private javax.swing.JButton Tile11;
    private javax.swing.JButton Tile12;
    private javax.swing.JButton Tile13;
    private javax.swing.JButton Tile14;
    private javax.swing.JButton Tile21;
    private javax.swing.JButton Tile22;
    private javax.swing.JButton Tile23;
    private javax.swing.JButton Tile24;
    private javax.swing.JButton Tile31;
    private javax.swing.JButton Tile32;
    private javax.swing.JButton Tile33;
    private javax.swing.JButton Tile34;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton startGameButton;
    // End of variables declaration//GEN-END:variables

    //GLOBALS
//    TileControl tileControl = new TileControl();


    int count = 0;                              //0 for first tile flipped, 1 for second. 
    int ID_Guess1 = 100, ID_Guess2 = 100;       //the locations 
    int type_Guess1, type_Guess2;               //the ShapeCodes for the 2 guesses.   
    boolean match;                              //catches the result from testMatch sub.
    int score;                                  //saves the player's score
    String sScore;
    int PrevID_Guess1;                          //these 2 are used to store the 2 tiles from 
    int PrevID_Guess2;                          //return to blanks when a new matching has started.


    
    
       public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameBoardGUI().setVisible(true);
            }
        });
    }
}
