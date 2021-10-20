package com.bl;

public class Gambler{
	public static int StakePerDay = 100;
	public static int BetsPerGame = 1;
	public static void main(String [] args){
		Gambler g1 = new Gambler();
		System.out.println("Welcome Gambler");
		System.out.println("The user can start for day is:" +g1.StakePerDay);
		System.out.println("Minimum amount user can bet every game is:" +g1.BetsPerGame);
	}
}
	

