# Memory Matching Game (Flip-Flop Game)

A Java Swing-based memory matching game where players flip tiles to find matching pairs.

## Features
- Color-based tile matching gameplay
- Score tracking system
- Smooth animations and visual feedback
- High score saving and ranking
- Reset and quit functionality

## How to Play
1. Click "PLAY" to start a new game
2. Tiles will briefly show their colors (memorize them!)
3. Click tiles to flip them and find matching pairs
4. Matching pairs earn +10 points, mismatches lose -5 points
5. Game ends when all pairs are found

## Technical Details
- Built with Java Swing for the GUI
- Uses multi-threading for smooth animations
- Implements Model-View-Controller pattern:
  - `TileControl.java` - Game logic controller
  - `ColorTileManager.java` - View/display management
  - `ScoreManager.java` - Score persistence
