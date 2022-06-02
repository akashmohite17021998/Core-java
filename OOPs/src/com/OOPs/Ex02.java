package com.OOPs;

public class Ex02 {
	private double balance;
	private int accountNumber;

	public Ex02(double balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		Ex02 e = new Ex02(1000.5);
		Ex02 e2 = new Ex02(500.0);
		
		Double d2 = e2.getBalance();
		
		

		double d = 	e.getBalance();
		System.out.println(d + d2);
		System.out.println(d);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
