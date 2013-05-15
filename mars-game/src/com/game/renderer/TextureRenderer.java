package com.game.renderer;

import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.glutils.FrameBuffer;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.utils.Disposable;


public class TextureRenderer extends Renderer implements Disposable{

	
	  private FrameBuffer frameBuffer;
	   private ShaderProgram shader;
	   private Texture texture;
	   private Mesh quad;

	   public TextureRenderer(int width, int height, ShaderProgram shader) {
	      this(width, height, shader, true);
	   }
	   public TextureRenderer(int width, int height, ShaderProgram shader, boolean inverted) {
		      this.shader = shader;
		      frameBuffer = new FrameBuffer(Format.RGBA8888, width, height, true);
		      texture = frameBuffer.getColorBufferTexture();
		      texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		     // quad = Shapes.makeQuad(inverted);
		   }
	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void begin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Texture getTexture() {
		// TODO Auto-generated method stub
		return null;
	}

}
