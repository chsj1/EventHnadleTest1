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
	ScrollPane pane;//����һ��ScrollPane�����
	ScrollPaneStyle style;//ScrolPaneStyleָ����ScrollPane�ķ��
	Group group;
	Image images[];
	@Override
	public void create() {
		stage = new Stage(480, 800, false);
		group = new Group();
		group.setSize(256*30, 256);//���������
//		group.setSize(256, 512*30);//���������
		images = new Image[30];
		int i;
		for(i = 0 ; i < 30 ; ++i){
			images[i] = new Image(new Texture(Gdx.files.internal("data/lengjiao.png")));
//			images[i] = new Image(new Texture(Gdx.files.internal("data/test1.jpg")));
			images[i].setPosition(i*256, 0);//���������
//			images[i].setPosition(0, i*512);//���������
			group.addActor(images[i]);
 		}
		style = new ScrollPaneStyle();//��ʼ��һ��ScrollPaneStyle
		style.background = null;//�ѱ������null,���������������Ҫ����
		pane = new ScrollPane(group, style);
		pane.setSize(480, 256);//���������
//		pane.setScrollingDisabled(false, true);//�����Ƿ�����¡������ƶ�..���������˺�����ƶ������򲻿��ƶ�..  
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
		Gdx.gl.glClearColor(1, 1, 1, 1);// ���ñ���Ϊ��ɫ
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);// ����
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
