package monster.controller;

import monster.view.MonsterDisplay;
import monster.model.MarshmallowMonster;
import java.util.Scanner;



public class MonsterController
{
	private MonsterDisplay popup;
	
	public MonsterController()
	{
		popup = new MonsterDisplay();
	}
	
	public void start()
	{
		int count = 0;
//		while(count < 10)
//		{
//			popup.displayText("Am I not the coolest??!");
//			count +=2;
//			
//		}
		for(int loop = 0; loop < 10; loop += 1)
		{
			popup.displayText("This is loop # " + (loop + 1) + " of ten");
		}

		
		MarshmallowMonster basic = new MarshmallowMonster();
//		System.out.println(basic);
		popup.displayText(basic.toString());
		MarshmallowMonster fred = new MarshmallowMonster("Silly Fred Monster", 7, 3, 6.7, true);
//		System.out.println(fred);
		popup.displayText(fred.toString());
//		System.out.println("I am feeling hungry, I am going to eat fred's: ");
		popup.displayText("I am feeling hungry, I am going to eat fred's: ");
		fred.setArmCount(fred.getArmCount() - 1);
//		System.out.println(fred);
		popup.displayText(fred.toString());
		
		interactWithMonster(fred);
	}
	
	private void interactWithMonster(MarshmallowMonster currentMonster)
	{
		Scanner myScanner = new Scanner(System.in);
//		System.out.println(currentMonster.getName() + " wants to know how many eyes you want to eat, please type in how many");
		int consumed = 0;
		String response = popup.getResponse(currentMonster.getName() + " wants to know how many eyes you want to eat, please type in how many");
		
		while(!isValidInteger(response))
		{
			popup.displayText("Grr type in a better answer");
			response = popup.getResponse("Type in an integer value");
		}
		
		if(isValidInteger(response))
		{
		consumed = Integer.parseInt(response);
		}
	
//		int consumedEyes = myScanner.nextInt();
		currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
//		System.out.println(currentMonster);
		popup.displayText(currentMonster.toString());
//		System.out.println(currentMonster.getName() + " wants to know how many tentacles you finna eat");
//		double consumedTentacles = myScanner.nextDouble();
		double consumedTentacles = 0;
		String response1 = popup.getResponse(currentMonster.getName() + " wants to know how many tentacles you finna eat");
		if(isValidDouble(response1))
		{
			consumedTentacles = Double.parseDouble(response1);
		}
		if(consumedTentacles == currentMonster.getTentacleAmount())
		{
//			System.out.println("You ate all my tentacles");
			popup.displayText("You ate all my tentacles");
		}
		else
		{
			currentMonster.setTentacleAmount(currentMonster.getTentacleAmount() - consumedTentacles);
//			System.out.println(currentMonster);
			popup.displayText(currentMonster.toString());
		}
		
		
//		System.out.println("How many arms are you interested in eating? I have " + currentMonster.getArmCount());
//		consumed = myScanner.nextInt();
		int armEat = 0;
		String response2 = popup.getResponse("How many arms are you interested in eating? I have " + currentMonster.getArmCount());
		if(isValidInteger(response2))
		{
			armEat = Integer.parseInt(response2);
		}
		
		if (armEat == 0)
		{
//			System.out.println("Not hungry, so sad.");
			popup.displayText("Not hungry, so sad");
		}
		else if (armEat < 0)
		{
//			System.out.println("Math is hard for you, this is impossible.");
			popup.displayText("Math is hard for you, this is impossible.");
		}
		else if (armEat > currentMonster.getArmCount())
		{
//			System.out.println("You can't eat more arms than I have");
			popup.displayText("You can't eat more arms than I have");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - armEat);
//			System.out.println("Okay, now I have " + currentMonster.getArmCount());
			popup.displayText("Okay, now I have " + currentMonster.getArmCount());
		}
		
		popup.displayText("Hi there ready to play???");
		String answer = popup.getResponse("What is the air speed of a coconut laden swallow?");
		System.out.println(answer);
		
		myScanner.close();
	}
	private boolean isValidInteger(String sample)
	{
		boolean valid = false;
		
		try
		{
			Integer.parseInt(sample);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("You need to input an integer, " + sample + "is not valid.");
		}
		
		return valid;
	}

	private boolean isValidDouble(String sampleDouble)
	{
		boolean valid = false;
		
		try
		{
			Double.parseDouble(sampleDouble);
			valid = true;
			
		}
		catch(NumberFormatException error)
		{
			popup.displayText("You need to type in a double - " + sampleDouble + " is not a valid answer.");
		}
		
		return valid;
	}
	
	private boolean isValidBoolean(String sampleBoolean)
	{
		boolean valid = false;
		
		try
		{
			Boolean.parseBoolean(sampleBoolean);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("You need to type in a boolean value - " + sampleBoolean + " is not a valid answer");
		}
		return valid;
	}
}
