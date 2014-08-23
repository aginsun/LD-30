package com.aginsun.ld.smelda.gamestates;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import com.aginsun.ld.smelda.entities.Player;
import com.aginsun.ld.smelda.render.GameRender;
import com.aginsun.ld.smelda.world.World;

public class GameRunningState extends BasicGameState
{
	private Player player;
	private World world;
	private StateBasedGame game;
	private GameRender render;
	
	@Override
	public void init(GameContainer container, StateBasedGame game) throws SlickException 
	{
		this.game = game;
		render = new GameRender();
		world = new World(render, game);
		world.load();
		player = new Player("name");
		world.addPlayer(player);
	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException 
	{
		render.render(container, game, g);
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta)	throws SlickException 
	{
		world.update();
	}

	@Override
	public int getID() 
	{
		return 0;
	}
}
