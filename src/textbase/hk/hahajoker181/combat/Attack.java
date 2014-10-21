package textbase.hk.hahajoker181.combat;

import java.util.Random;

public class Attack {
	private final int PLAYERATTACK = 10;
	private final int MONSTERATTACK = 5;
	private int special_attack = 50;
	
	Random rand = new Random();
	
	public int  playerDamage(int monster_health){
		int player_dmg = rand.nextInt(PLAYERATTACK);
		monster_health -= player_dmg;
		return monster_health;
	}
	
	public int playerSpecialDamage(int monster_health){
		int player_dmg = rand.nextInt(PLAYERATTACK) + 15;
		monster_health -= player_dmg;	
		return monster_health;
	}
	
	public int monsterDamage(int player_health){
		int monster_dmg = rand.nextInt(MONSTERATTACK);
		player_health -= monster_dmg;
		return player_health;
	}
	
	public void setSepcialAttack(int special_attack){
		this.special_attack = special_attack;
	}
	
	public int getSepcialAttack(){
		return special_attack;
	}
}
