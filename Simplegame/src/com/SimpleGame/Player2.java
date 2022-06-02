package com.SimpleGame;

//Extended call

public class Player2 extends Player1{
	private int health; 
	private boolean armor;

	//Super() call
	
	public Player2(String name, String weapon, int health, boolean armor) {
		super(name, weapon, health);
		this.health=health;
		this.armor=armor;
	}
	
	//Overridding method with 'if' block
	
	public void damageByGun1()
	{
		if(armor) 
		{
			this.health -= 20;
			if(this.health <= 0) 
			
				this.health = 0;
			
			System.out.println("Armor is on. Got hit by gun1. Health is reduced by 20. New health is "+ this.health);  //this.health is working here because health is private property of this class
		}
		
		if(!armor) 
		{
			this.health -= 30;
			if(this.health <= 0)
			
				this.health = 0;
				System.out.println("Armor is not off. Got hit by gun2. Health is reduced by 30. New health is "+this.health);
			
		}
		if(this.health == 0) 
		{
			System.out.println(getName()+"is dead.");    //this.name is not working here because it is a private property of Player1 class and we cal call this property by using getter and setter method
		}
	}
	
	//Overriding method with 'if' block
	
	public void damageByGun2()
	{
		if(armor) 
		{
			this.health -= 40;
			if(this.health <= 0)
				this.health = 0;
			System.out.println("Armor is on. Got hit by gun1. Health is reduced by40. New health is "+this.health);
			
		}
		if(!armor) 
		{
			this.health -= 50;
			if(this.health <= 0)
				this.health = 0;
			System.out.println("Armor is not off. Got hit by gun2. Health is reduced to 50. New health is "+this.health);
		}
		if(this.health == 0) 
		{
			System.out.println(getName() + " is dead");
		}
		
	}
	public void heal() 
	{
		if(this.health <= 0)
		{
			System.out.println(getName() + " is dead. Healing is not possible");
		}
		else
		{
			this.health = 100;
			System.out.println("Healing of "+ getName() + " is in procees. New health is " + this.health + ".");
		}
	}

}
