package com.aginsun.ld.smelda.entities;

import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Vector2f;

import com.aginsun.ld.smelda.world.World;

public class Player extends Entity
{
	public Player(World world, String name) throws SlickException
	{
		super(world);
		texture = new Image(name);
	}
	
	@Override
	public void update(int delta)
	{
		super.update(delta);
	}
	
	@Override
	public int getWidth()
	{
		return 32;
	}

	@Override
	public int getHeight() 
	{
		return 32;
	}

	public void onKeyPressed(int key) 
	{
		switch(key)
		{
			case Input.KEY_UP:
				this.addFacing(new Vector2f(0, -1.0F));
			case Input.KEY_DOWN:
				this.addFacing(new Vector2f(0, 1.0F));
			case Input.KEY_LEFT:
				this.addFacing(new Vector2f(-1.0F, 0));
		 	case Input.KEY_RIGHT:
				this.addFacing(new Vector2f(1.0F, 0));
		}		
	}

	public void onKeyReleased(int key) 
	{
		switch(key)
		{
			case Input.KEY_UP:
				this.addFacing(new Vector2f(0, 1.0F));
			case Input.KEY_DOWN:
				this.addFacing(new Vector2f(0, -1.0F));
			case Input.KEY_LEFT:
				this.addFacing(new Vector2f(1.0F, 0));
		 	case Input.KEY_RIGHT:
				this.addFacing(new Vector2f(-1.0F, 0));
		}
	}
}
