package com.jtsay.monsterpop;

import screens.GameScreen;

import com.badlogic.gdx.Game;
import com.jtsay.monsterpop.util.Assets;

public class MonsterPop extends Game {
	
	@Override
	public void create() {		
		Assets.load();
		setScreen(new GameScreen(this));
	}

	@Override
	public void dispose() {

	}

	@Override
	public void render() {		

	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}