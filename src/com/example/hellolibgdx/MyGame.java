package com.example.hellolibgdx;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle;

public class MyGame implements ApplicationListener {
	Stage stage;
	ScrollPane pane;//定义一个ScrollPane类对象
	ScrollPaneStyle style;//ScrolPaneStyle指的是ScrollPane的风格
	Group group;
	Image images[];
	@Override
	public void create() {
		stage = new Stage(480, 800, false);
		group = new Group();
		group.setSize(256*30, 256);//横向滚动条
//		group.setSize(256, 512*30);//纵向滚动条
		images = new Image[30];
		int i;
		for(i = 0 ; i < 30 ; ++i){
			images[i] = new Image(new Texture(Gdx.files.internal("data/lengjiao.png")));
//			images[i] = new Image(new Texture(Gdx.files.internal("data/test1.jpg")));
			images[i].setPosition(i*256, 0);//横向滚动条
//			images[i].setPosition(0, i*512);//纵向滚动条
			group.addActor(images[i]);
 		}
		style = new ScrollPaneStyle();//初始化一个ScrollPaneStyle
		style.background = null;//把背景设成null,即这个滚动条不需要背景
		pane = new ScrollPane(group, style);
		pane.setSize(480, 256);//横向滚动条
//		pane.setScrollingDisabled(false, true);//设置是否可上下、左右移动..这里设置了横向可移动、纵向不可移动..  
//		pane.setSize(256,800);
		stage.addActor(pane);
		Gdx.input.setInputProcessor(stage);
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}
	@Override
	public void pause() {
		// TODO Auto-generated method stub
	}
	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 1, 1, 1);// 设置背景为白色
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);// 清屏
		stage.act();
		stage.draw();
	}
	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub
	}
	@Override
	public void resume() {
		// TODO Auto-generated method stub
	}
}
