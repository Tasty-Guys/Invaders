package engine;

import java.awt.*;
import java.awt.event.KeyEvent;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import screen.GameScreen;

public class DrawManagerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void drawPause() throws AWTException {
		//given
		final GameSettings SETTINGS_LEVEL_1 =
			new GameSettings(5, 4, 60, 2000);
		GameState gameState = new GameState(1, 0, 3, 0, 0);
		GameScreen gameScreen = new GameScreen(gameState, SETTINGS_LEVEL_1,
			false, 448, 520, 60);
		DrawManager drawManager = new DrawManager();
		Frame frame = new Frame(448,520);

		//when
		drawManager.setFrame(frame);
		drawManager.initDrawing(gameScreen);
		String a = drawManager.drawPause(gameScreen, true);

		//then
		Assertions.assertEquals("Paused Press space to continue", a);
	}
}