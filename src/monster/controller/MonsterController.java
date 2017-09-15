package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController
{
	public void start()
	{
		MarshmallowMonster basic = new MarshmallowMonster();
		System.out.println(basic);
		MarshmallowMonster fred = new MarshmallowMonster("Silly Fred Monster", 7, 3, 6.7, true);
		System.out.println(fred);
		
	}

}
