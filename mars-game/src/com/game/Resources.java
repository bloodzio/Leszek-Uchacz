package com.game;

import java.util.ArrayList;
import java.util.List;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.utils.Disposable;
import com.game.renderer.TextureRenderer;

//** Shadery Muzyka fonty , textury  */
public class Resources {
	
	public static Resources getInstance() {
		if (instance == null) {
			instance = new Resources();
		}
		return instance;
	}
	protected List<Disposable> dyspozytor = new ArrayList<Disposable>();

	   protected <T extends Disposable> T Container(T disposable) {
	      dyspozytor.add(disposable);
	      return disposable;
	   }
	public static Resources instance;
	
	private ShaderProgram  defaultShader;
	private ShaderProgram simpleShader;
	private TextureRenderer textureRender;
	
	
	private Texture rockTexture;
	public Resources() {
		reInit();
	}

	public void reInit() {				
		initShader();
	}
	
	public void initShader() {
		
		//defaultShader = Container(new ShaderProgram(Gdx.files.internal("data/shaders/light.vsh").readString(),Gdx.files.internal("shaders/light.fsh").readString()));
		//simpleShader = Container(new ShaderProgram(Gdx.files.internal("data/shaders/simple.vsh").readString(), Gdx.files.internal("shaders/simple.fsh").readString()));
		//textureRender = Container(new TextureRenderer(1920, 800, simpleShader));
		//Texture  textura = new Texture(Gdx.files.internal("data/rock.png"), true);
		
	}
	
	public void initTexture() {
		
		rockTexture = Container(new Texture(Gdx.files.internal("data/rock.png"), true));
		Texture  textura = new Texture(Gdx.files.internal("data/rock.png"), true);
		
	}
}
