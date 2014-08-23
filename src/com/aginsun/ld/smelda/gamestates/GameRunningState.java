package com.aginsun.ld.smelda.gamestates;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import com.aginsun.ld.smelda.entities.Player;
import com.aginsun.ld.smelda.render.GameRender;
import com.aginsun.ld.smelda.tiles.Tile;
import com.aginsun.ld.smelda.world.Map;
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
		Map map = new Map("mainarea");
		render = new GameRender();
		world = new World(render, game);
		player = new Player(world, "res/aginsun/textures/player.png");
		for(Tile[] tiles : map.grid)
		{
			for(Tile tile : tiles)
			{
				render.tiles.add(tile);
			}
		}
		render.player = player;
//		world.load();
//		world.addPlayer(player);
	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException 
	{
		render.render(container, game, g);
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta)	throws SlickException 
	{
		//world.update();
		player.update(delta);
	}

	@Override
	public int getID() 
	{
		return 0;
	}
	
	public void keyPressed(int key, char c) 
	{
		player.onKeyPressed(key);
	}

	public void keyReleased(int key, char c) 
	{
		player.onKeyReleased(key);
	}
}
