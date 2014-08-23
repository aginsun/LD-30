package com.aginsun.ld.smelda;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

import com.aginsun.ld.smelda.gamestates.GameRunningState;

public class OneHope extends StateBasedGame
{
	private GameState gameRunningState = new GameRunningState();
	
	public OneHope() 
	{
		super("OneHope");
	}
	
	public static void main(String[] args) throws SlickException
	{
		AppGameContainer app = new AppGameContainer(new OneHope());
		
		//app.setDisplayMode TODO: set this

		app.setShowFPS(true);
		
		app.setVSync(true);
		
		app.start();
	}

	@Override
	public void initStatesList(GameContainer container) throws SlickException 
	{
		this.addState(gameRunningState);
	}
}
