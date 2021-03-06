package com.jtsay.monsterpop.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jtsay.monsterpop.GameInstance;
import com.jtsay.monsterpop.util.Renderer;

public class GameScreen implements Screen {

  Game game;
  Renderer renderer;
  SpriteBatch batcher;

  public GameScreen(Game game) {
    this.game = game;
  }

  @Override
  public void render(float delta) {
    update(delta);
    draw();
  }

  private void update(float delta) {
    GameInstance.getInstance().update(delta);
  }

  private void draw() {
    renderer.render();
    batcher.begin();
    batcher.end();
  }

  @Override
  public void resize(int width, int height) {
    // TODO Auto-generated method stub

  }

  @Override
  public void show() {
    // TODO Auto-generated method stub

  }

  @Override
  public void hide() {
    // TODO Auto-generated method stub

  }

  @Override
  public void pause() {
    // TODO Auto-generated method stub

  }

  @Override
  public void resume() {
    // TODO Auto-generated method stub

  }

  @Override
  public void dispose() {
    // TODO Auto-generated method stub

  }

}