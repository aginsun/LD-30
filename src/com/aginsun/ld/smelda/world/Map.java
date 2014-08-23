package com.aginsun.ld.smelda.world;

import java.io.File;
import java.util.Scanner;

import org.newdawn.slick.geom.Vector2f;

import com.aginsun.ld.smelda.tiles.Tile;
import com.aginsun.ld.smelda.tiles.TileCreator;

public class Map
{
	public Tile[][] grid;
	private int tileWidth, tileHeight;
	
	
	public Map(String fileLocation)
	{
		load(fileLocation);
	}
	
	public void load(String fileLoc)
	{
		Scanner scanner = null;
		
		try
		{
			File file = new File(fileLoc);
			
			scanner = new Scanner(file);
			
			tileWidth = scanner.nextInt();
			tileHeight = scanner.nextInt();
//			mapWidth = tileWidth * 64;
//			mapHeight = tileHeight * 64;
			
			grid = new Tile[tileHeight][tileWidth];
			
			for(int i = 0; i < tileHeight; i++)
			{
				for(int j = 0; j < tileWidth; j++)
				{
					int tileID = scanner.nextInt();
					
					Tile tile = TileCreator.generateTile(this, tileID, new Vector2f(j, i));
					grid[i][j] = tile;
				}
			}
		}
		catch(Exception e)
		{
			
		}
	}
}
