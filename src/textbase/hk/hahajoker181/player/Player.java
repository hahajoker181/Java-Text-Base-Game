package textbase.hk.hahajoker181.player;

public class Player {
	private String name;
	private int health;
	private int special;
	
	public Player(String name, int health, int special){
		this.name = name;
		this.health = health;
		this.special = special;
	}
	
	public Player(String name){
		this(name, 100, 50);
	}
	
	public Player(){
		this("No Name", 100, 50);
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setHealth(int health){
		this.health = health;
	}
	
	public int getHealth(){
		return health;
	}
	
	public void setSpecial(int special){
		this.special = special;
	}
	
	public int getSpecial(){
		return special;
	}
}
