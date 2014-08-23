package com.aginsun.ld.smelda.entities;

import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Vector2f;

import com.aginsun.ld.smelda.world.World;

public abstract class Entity 
{
	public Image texture;
	public Vector2f location = new Vector2f(0, 0);
	public Vector2f facing = new Vector2f(0, 0); 
	public World world;
	
	public Entity(World world)
	{
		this.world = world;
	}
	
	public void update(int delta)
	{
		Vector2f v = facing.copy().scale(delta * 0.1F); //spaces moved based on gametime TODO: possibly add a speed factor (example: facing is 2, 0. Location is 100, 5. location becomes 102, 5)
		Vector2f pos = location.copy().add(v); //adding spaces moved to location
		
		//Check collisions
		//if(pos.getX() >= 0 && pos.getY() >= 0 && (pos.getX() + this.getWidth()) <= world.size.getX() && (pos.getY() + this.getHeight()) <= world.size.getY())
		{
			//4 options, no colliding, only colliding with X, only colliding with Y or both
			//Setting final location based on collisions
			location.add(v);
		}
	}
	
	public void addFacing(Vector2f v)
	{
		facing.add(v);
	}
	
	public void setFacing(Vector2f v)
	{
		facing.set(v);
	}
	
	public abstract int getWidth();
	
	public abstract int getHeight();
}
