package com.aginsun.ld.smelda.tiles;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Vector2f;

import com.aginsun.ld.smelda.world.Map;

public class TileCreator 
{
	public static Tile generateTile(Map map, int tileID, Vector2f vector2f) throws SlickException
	{
		switch(tileID)
		{
			case 0:
				return new Tile(vector2f, "res/aginsun/textures/green.png", true);
			case 1:
				return new Tile(vector2f, "res/aginsun/textures/red.png", true);
		}
		return null;
	}
}
