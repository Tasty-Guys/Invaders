package screen;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

import engine.GameSettings;
import engine.GameState;
import engine.InputManager;
import jdk.internal.util.xml.impl.Input;

class GameScreenTest {
	@org.junit.jupiter.api.Test
	void keyPressed() throws AWTException {
		//given
		final GameSettings SETTINGS_LEVEL_1 =
			new GameSettings(5, 4, 60, 2000, "./music/superMario.wav");
		GameState gameState = new GameState(1, 0, 3, 0, 0);
		GameScreen gameScreen = new GameScreen(gameState, SETTINGS_LEVEL_1,
			false, 448, 520, 60);

		assertTrue(gameScreen.keyPressed(KeyEvent.VK_ESCAPE));
		//when

		//then
	}
}