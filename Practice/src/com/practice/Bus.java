package com.practice;

public class Bus {
	
	private int busNo;
	private String travelsName; 
	private int passengerCount;
	private int busStop;
	
	
	
	public Bus(int busNo, String travelsName, int passengerCount, int busStop) {
		super();
		this.busNo = busNo;
		this.travelsName = travelsName;
		this.passengerCount = passengerCount;
		this.busStop = busStop;
	}
	
	public int getBusNo() {
		return busNo;
	}
	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}
	public String getTravelsName() {
		return travelsName;
	}
	public void setTravelsName(String travelsName) {
		this.travelsName = travelsName;
	}
	public int getPassengerCount() {
		return passengerCount;
	}
	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}
	public int getBusStop() {
		return busStop;
	}
	public void setBusStop(int busStop) {
		this.busStop = busStop;
	}

	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", travelsName=" + travelsName + ", passengerCount=" + passengerCount
				+ ", busStop=" + busStop + "]";
	}
	
	

}
