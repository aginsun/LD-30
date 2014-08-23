package com.aginsun.ld.smelda.render;

import java.util.ArrayList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.state.StateBasedGame;

import com.aginsun.ld.smelda.entities.Player;
import com.aginsun.ld.smelda.tiles.Tile;

public class GameRender 
{
	public ArrayList<Tile> tiles = new ArrayList<Tile>();
	public Player player;
	
	public GameRender()
	{
		
	}
	
	public void render(GameContainer gc, StateBasedGame state, Graphics g)
	{
		renderTiles(gc, state, g);
		renderPlayer(gc, state, g);
	}
	
	private void renderTiles(GameContainer gc, StateBasedGame state, Graphics g)
	{
		for(Tile tile : tiles)
		{
			if(tile != null)
			{
				float x = tile.getLocation().copy().scale(64).x;
				float y = tile.getLocation().copy().scale(64).y;
				g.drawImage(tile.getTexture(), x, y);
			}
		}
	}
	
	private void renderPlayer(GameContainer gc, StateBasedGame state, Graphics g)
	{
		g.drawImage(player.texture, player.location.getX(), player.location.getY());
	}
}
