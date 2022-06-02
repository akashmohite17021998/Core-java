package com.SimpleGame;


public class main {
	
	public static void main(String[] args) {
		Player1 player= new Player1("Krathos","Flaming Sword",100);
		
		System.out.println(player.getName());
		System.out.println(player.getWeapon());
		System.out.println(player.getHealth());
		
//		player.damageByGun1();
//		player.damageByGun2();
//		player.heal();
		
		Player2 armorplayer=new Player2("Price", "M16", 100, true);
		
		
		armorplayer.damageByGun1();
//		armorplayer.damageByGun2();
//		armorplayer.heal();
//		armorplayer.damageByGun2();
//		armorplayer.damageByGun2();
//		armorplayer.damageByGun2();
//		armorplayer.heal();
//				
		
	}

}
