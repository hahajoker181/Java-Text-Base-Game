package textbase.hk.hahajoker181.combat;

import textbase.hk.hahajoker181.player.Player;

public class Potions extends Player{
	private int weak_potion = 10;
	private int strong_potion = 20;
	private int super_potion = 50;
	
	public void setWeakPotion(int weak_potion){
		this.weak_potion = weak_potion;
	}
	
	public void setStrongPotion(int strong_potion){
		this.strong_potion = strong_potion;
	}
	
	public void setSuperPotion(int super_potion){
		this.super_potion = super_potion;
	}
	
	public int getWeakPotion(){
		return weak_potion;
	}
	
	public int getStrongPotion(){
		return strong_potion;
	}
	
	public int getSuperPotion(){
		return super_potion;
	}
}
