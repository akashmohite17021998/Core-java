package com.SimpleGame;

public class Player1 {
	private String name;
	private String weapon;
	private int health;
	
	
	//Constructor
	
	public Player1(String name, String weapon, int health)
	{
		this.name=name;
		this.weapon=weapon;
		if(health<0 || health>100) {
			this.health=100;
		}
		else
		{
			this.health = 100;
		}
	}
	
	//Empty constructor for good programming practice.
	
	public Player1() {}
	
	//Simple gun1 method
	
	public void damageByGun1()
	{
		
		this.health -= 30;
		if(this.health <= 0)
		{
			this.health = 0;
		}
		
		System.out.println("Got hit by gun 1. Health is reduced by 30. New health is " + this.health);
		if(this.health == 0) {
			System.out.println(this.name + " is dead");
		}
		
	}
	
	//Simple gun2 method
	
	public void damageByGun2(){
		this.health -= 50;
		if(this.health <= 0) {
			this.health = 0;
		}
		System.out.println("Got hit by gun 2. Health is reduced by 50. new health is " + this.health);
		if(this.health == 0) {
			System.out.println(this.name + " is dead");
		}	
	}
	
	//Simple heal method
	
	public void heal() 
	{
		
		if(this.health <= 0) 
		{
			System.out.println(this.name + " is dead. Healing is not possible.");
		}
		else 
		{
			this.health = 100;
			System.out.println("Healing of "+ this.name + " is in procees. New health is " + this.health + ".");
		}
	}
	
	//Getter and setter method
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getWeapon() {
		return weapon;
	}
	
	public void setWeapon(String weapon) {
		this.weapon=weapon;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health=health;
	}

}
