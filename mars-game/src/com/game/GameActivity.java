package com.game;



import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.utils.Disposable;


public abstract class GameActivity extends Resources implements ApplicationListener,InputProcessor {

	
	   
	/** Ustawienia Kamery Gracza */
	private float zoom = 1.0f;
	protected boolean perspective;
	protected Camera camera;
	
	private float aspectRatio;
	/** Konstruktor parametryczny */
	public GameActivity(boolean perspective) {
	      this.perspective = perspective;
	   }
	public GameActivity() {
	      this.perspective = perspective;
	   }
	 public abstract void init();
	 
	 public abstract void draw(float delta);
	 
	 public void create() {
	      init();
	      Gdx.input.setInputProcessor(this);
	      Gdx.graphics.setVSync(true);
	   }
	 
	 public void render() {
	      draw(Gdx.graphics.getDeltaTime());
	   }
	 
	 public void resetCamera() {
	      camera = createCamera();
	   }
	  
	 public Camera createCamera() {
	      if (perspective) {
	         return new PerspectiveCamera(45, 2.0f * aspectRatio * zoom, 2.0f * zoom);
	      } else {
	         return new OrthographicCamera(2.0f * aspectRatio * zoom, 2.0f * zoom);
	      }
	   }
	 public float getZoom() {
	      return zoom;
	   }

	 public void setZoom(float zoom) {
	      this.zoom = zoom;
	      resetCamera();
	   }

	 public boolean keyDown(int keycode) {
	      return false;
	   }

	   @Override
	   public boolean keyUp(int keycode) {
	      return false;
	   }

	   @Override
	   public boolean keyTyped(char character) {
	      return false;
	   }

	   @Override
	   public boolean touchDown(int x, int y, int pointer, int button) {
	      return false;
	   }

	   @Override
	   public boolean touchUp(int x, int y, int pointer, int button) {
	      return false;
	   }

	   @Override
	   public boolean touchDragged(int x, int y, int pointer) {
	      return false;
	   }

	   @Override
	   public boolean mouseMoved(int screenX, int screenY) {
		 
	      return false;
	   }

	   @Override
	   public boolean scrolled(int amount) {
	      return false;
	   }

	   @Override
	   public void resize(int width, int height) {
	      aspectRatio = (float) width / (float) height;
	      resetCamera();
	   }

	   @Override
	   public void pause() {
	   }

	   @Override
	   public void resume() {
	   }

	   @Override
	   public void dispose() {
	      for (Disposable disposable : dyspozytor) {
	         disposable.dispose();
	      }
	     // Textures.dispose();
	   }
	}
	 

