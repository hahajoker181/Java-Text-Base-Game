package textbase.hk.hahajoker181.monster;

import java.util.Random;
import java.util.Vector;

public class Monster {
	private static String name;
	private static int health;
	private static int level;
	
	public Monster(){
		this(getMonsterName(), 100, level);
	}

	public Monster(String name, int health, int level) {
		this.name = name;
		this.health = health;
		this.level = level;
	}
	
	public static String getMonsterName(){
		Vector<String> monsterlist = new Vector<String>();
		Random rand = new Random();
		int select = rand.nextInt(3);
		
		monsterlist.add("Skeleton");
		monsterlist.add("Spider");
		monsterlist.add("Snake");
		
		return monsterlist.get(select);
		
	}
	
	public void setMonsterName(String name){
		this.name = name;
	}
	
	public void setMonsterHealth(int health){
		this.health = health;
	}
	
	public int getMonsterHealth(){
		return health;
	}
	
	public void setMonsterLevel(int level){
		this.level = level;
	}
	
	public int getMonsterLevel(){
		return level;
	}
}
