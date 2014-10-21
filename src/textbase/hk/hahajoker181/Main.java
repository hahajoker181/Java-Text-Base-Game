package textbase.hk.hahajoker181;

import textbase.hk.hahajoker181.monster.*;
import textbase.hk.hahajoker181.player.*;
import textbase.hk.hahajoker181.combat.*;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String args[]){
		Player player = new Player();
		int player_health = player.getHealth();
		
		Monster monster = new Monster();
		int monster_health = monster.getMonsterHealth();
		
		Attack attack = new Attack();
		int special_attack = attack.getSepcialAttack();
		
		//Game loop
		boolean running = true;
		
		//User Options
		String user_option = "";
		String attack_option = "";
		String potion_option = "";
		String restart_option = "";
		
		//Potions
		Potions potions = new Potions();
		int weak_potion = potions.getWeakPotion();
		int weak_count = 5;
		
		int strong_potion = potions.getStrongPotion();
		int strong_count = 3;
		
		int super_potion = potions.getSuperPotion();
		int super_count = 1;
		
		while(running){
			System.out.println("1 --> Attack Monster!\n"
					         + "2 --> Run Away like a chicken!\n"
					         + "3 --> QUIT THE DAMN GAME!!!");
			user_option = input.nextLine();
			
			if (user_option.equals("1")){
				while(player_health > 0 || monster_health > 0){
					System.out.println("1 --> Attack\n"
							         + "2 --> Special Attack\n"
							         + "3 --> Drink Health Potion");
					attack_option = input.nextLine();
					
					if (attack_option.equals("1")){
						//Attack
						player_health = attack.monsterDamage(player_health);
						monster_health = attack.playerDamage(monster_health);
						System.out.printf("Player Health: %d\n"
								        + "Monster Health: %d\n", attack.monsterDamage(player_health), attack.playerDamage(monster_health));
						
					}
					
					else if (attack_option.equals("2")){
						//Special Attack
						if (special_attack > 0){
							special_attack -= 25;
							
							player_health = attack.monsterDamage(player_health);
							monster_health = attack.playerSpecialDamage(monster_health);
							
							System.out.printf("Player Health: %d\n"
							        + "Monster Health: %d\n", player_health, monster_health);
						}
						
						else {
							System.out.println("Let your special attack recharge!");
						}
					}
					
					//Potion Option
					else if (attack_option.equals("3")){
						System.out.println("1 --> Weak Health Potion (Restore 10 health)\n"
								         + "2 --> Strong Health Potion (Restore 20 health)\n"
								         + "3 --> Super Health Potion (Restore 50 health)\n"
								         + "4 --> Quit");
						potion_option = input.nextLine();
						
						while (!potion_option.equals("4")){
							
							if (potion_option.equals("1")){
								//Weak Health Potion
								if (weak_count > 0){
									weak_count -= 1;
									
									player_health += weak_potion;
									System.out.println(player_health);
									break;
								}
								
								else {
									System.out.println("You have run out of Weak Health Potion");
									break;
								}
							}
							
							else if (potion_option.equals("2")){
								//Strong Health Potion
								if (strong_count > 0){
									strong_count -= 1;
									
									player_health += strong_potion;
									System.out.println(player_health);
									break;
								}
								
								else {
									System.out.println("You have run out of Strong Health Potion.");
									break;
								}
							}
							
							else if (potion_option.equals("3")){
								//Super Health Potion
								if (super_count > 0){
									super_count -= 1;
									
									player_health += super_potion;
									System.out.println(player_health);
									break;
								}
								
								else {
									System.out.println("You have run out of Super Health Potion.");
									break;
								}
							}
							
							else if (potion_option.equals("4")){
								break;
							}
							
							else {
								System.out.println("1 --> Weak Health Potion (10)\n"
								         + "2 --> Strong Health Potion (20)\n"
								         + "3 --> Super Health Potion (50)\n"
								         + "4 --> Quit");
								potion_option = input.nextLine();
							}	
						}
						if (monster_health < 0 || player_health < 0){
							break;
						}
					} // End of User Option 3
					
					//Restart the game
					if (monster_health < 0){
						System.out.println("You Won! Would you like to restart?\n"
								         + "1 --> Yes\t2 --> No");
						restart_option = input.nextLine();
						
						if (restart_option.equals("1")){
							//Yes
							player_health = 100;
							player.setHealth(player_health);
							
							monster_health = 100;
							monster.setMonsterHealth(monster_health);
							
							weak_count = 5;
							strong_count = 3;
							super_count = 1;
							
							attack.setSepcialAttack(50);
						}
						
						else if (restart_option.equals("2")){
							//No
							System.out.println("Thank you for playing an awesome game!");
							running = false;
							break;
						}
						
						else {
							//If user does not enter valid text
							System.out.println("You Won! Would you like to restart?\n"
							         + "1 --> Yes\t2 --> No");
							restart_option = input.nextLine();
						}
					}
					
					else if (player_health < 0){
						System.out.println("You Lost! Would you like to restart?\n"
								         + "1 --> Yes\t2 --> No");
						restart_option = input.nextLine();
						
						if (restart_option.equals("1")){
							//Yes
							player_health = 100;
							player.setHealth(player_health);
							
							monster_health = 100;
							monster.setMonsterHealth(monster_health);
							
							weak_count = 5;
							strong_count = 3;
							super_count = 1;
							
							attack.setSepcialAttack(50);
						}
						
						else if(restart_option.equals("2")){
							System.out.println("Thank you for playing an awesome game!");
							running = false;
							break;
							
						}
					}
				} // End of Combat Loop
			}	
		
		else if (user_option.equals("2")){
			//Run away like a chicken
			System.out.println("You run away like a chiekn!");
			running = false;
		}
		
		else if (user_option.equals("3")){
			System.out.println("You successfully closed the game!");
			running = false;
		}
			
			else {
				System.out.println("1 --> Attack Monster!\n"
				         + "2 --> Run Away like a chicken!\n"
				         + "3 --> QUIT THE DAMN GAME!!!");
				user_option = input.nextLine();
				
			}
		}
	}
}
