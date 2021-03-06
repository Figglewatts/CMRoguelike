package uk.uncodedstudios.CMRoguelike.UI;

import uk.uncodedstudios.CMRoguelike.CMRoguelike;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

public class PlayerHealth {
	private PlayerHealth() { }
	
	private static final int fontSize = 32;
	public static BitmapFont font;
	
	public static void Initialize() {
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("font/8-bit Madness.ttf"));
		font = generator.generateFont(fontSize);
	}
	
	public static void Draw(SpriteBatch batch) {
		font.draw(batch, "HP: " + CMRoguelike.player.getHealth() + "/" + CMRoguelike.player.getMaxHealth(), 10, font.getLineHeight()*1);
		font.draw(batch, "Kills: " + CMRoguelike.numberOfKills + "/" + CMRoguelike.numberOfMonsters, 10, font.getLineHeight()*2);
	}
}
