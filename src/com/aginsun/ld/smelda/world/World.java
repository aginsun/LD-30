package com.aginsun.ld.smelda.world;

import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;

import com.aginsun.ld.smelda.entities.Player;
import com.aginsun.ld.smelda.render.GameRender;

public class World 
{
	Player player;
	GameRender render;
	StateBasedGame game;
	public Vector2f size = new Vector2f(1000, 1000);
	
	public World(GameRender render, StateBasedGame game)
	{
		this.render = render;
		this.game = game;
	}
	
	public void load()
	{
		
	}
	
	public void update()
	{
		
	}
	
	public void addPlayer(Player player)
	{
		
	}
}
