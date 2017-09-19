package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController
{
	public void start()
	{
		MarshmallowMonster basic = new MarshmallowMonster();
		System.out.println(basic);
		MarshmallowMonster fred = new MarshmallowMonster("Silly Fred Monster", 7, 3, 6.7, true);
		System.out.println(fred);
		System.out.println("I am feeling hungry, I am going to eat fred's: ");
		fred.setArmCount(fred.getArmCount() - 1);
		System.out.println(fred);
		
		interactWithMonster(fred);
	}
	private void interactWithMonster(MarshmallowMonster currentMonster)
	{
		Scanner myScanner = new Scanner(System.in);
		System.out.println(currentMonster.getName() + " wants to know how many eyes you want to eat, please type in how many");
		int consumedEyes = myScanner.nextInt();
		currentMonster.setEyeCount(currentMonster.getEyeCount() - consumedEyes);
		System.out.println(currentMonster);
		
		System.out.println(currentMonster.getName() + " wants to know how many tentacles you finna eat");
		int consumedTentacles = myScanner.nextInt();
		currentMonster.setTentacleAmount(currentMonster.getTentacleAmount() - consumedTentacles);
		System.out.println(currentMonster);
		
		System.out.println("How many arms are you interested in eating? I have " + currentMonster.getArmCount());
		//consumed = myScanner.nextInt();
		int armEat = myScanner.nextInt();
		if (armEat == 0)
		{
			System.out.println("Not hungry, so sad.");
		}
		else if (armEat < 0)
		{
			System.out.println("Math is hard for you, this is impossible.");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - armEat);
			System.out.println("Okay, now I have " + currentMonster.getArmCount());
		}
		
		myScanner.close();
	}

}
