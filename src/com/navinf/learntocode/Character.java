package com.navinf.learntocode;

import java.awt.*;
import java.awt.image.*;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;


public abstract class Character extends Mobile
{
	protected int health;
	Player player;
	protected BufferedImage image;
	protected boolean flipped;
	
	public Character( int x, int y, int health, ArrayList<Element> elements )
	{
		super(x,y,32,32, elements);
		setHealth(health);
		
		for( int i = 0; i < elements.size() - 1; i++ )
		{
			if( elements.get( i ) instanceof Player )
				player = (Player) elements.get( i );
		}
	}
	
	
	public void setHealth( int a )
	{
		health = a >= 0 ? a : 0;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public void damage(int damage){
		if(damage >= 0){
			setHealth(getHealth() - damage);
		}
	}
	
	public abstract void draw(Graphics g);

}
