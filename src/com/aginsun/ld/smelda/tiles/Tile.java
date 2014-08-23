package com.aginsun.ld.smelda.tiles;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Vector2f;

public class Tile 
{
	Vector2f location;
	Image img;
	boolean passable;
	
	public Tile(Vector2f location, String texture, boolean passable) throws SlickException
	{
		this.location = location;
		this.img = new Image(texture);
		this.passable = passable;
	}
	
	public Rectangle getBB()
	{
		return new Rectangle(location.x * 64, location.y * 64, 64, 64);
	}
	
	public Vector2f getLocation()
	{
		return location;
	}
	
	public Image getTexture()
	{
		return img;
	}
	
	public boolean getPassable()
	{
		return passable;
	}
}
