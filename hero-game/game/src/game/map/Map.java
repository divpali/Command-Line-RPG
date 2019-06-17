package game.map;

import game.util.GameUtil;

public class Map {
	
	public static void startGame() {
		System.out.println("Game has been started...\n");
		GameUtil.load();
	}

	public static void history() {
		System.out.println(" O ... Hey you, yes you!!");
		System.out.println("/|\\ ");
		System.out.println("/ \\ ");
		GameUtil.loadStory();
		System.out.println(" O ... I am sending you on a mission little buddy!");
		System.out.println("/|\\ ");
		System.out.println("/ \\ ");
		GameUtil.loadStory();
		System.out.println(" O ... You have to save our princess who is going to rule as a Queen soon. She is in the fourth house.");
		System.out.println("/|\\ ");
		System.out.println("/ \\ ");
		GameUtil.loadStory();
		System.out.println(" O ... You will have to explore the forest and find all the previews three houses.");
		System.out.println("/|\\ ");
		System.out.println("/ \\ ");
		GameUtil.loadStory();
		System.out.println(" O ... Each house has the key for the next one.");
		System.out.println("/|\\ ");
		System.out.println("/ \\ ");
		GameUtil.loadStory();
		System.out.println(" O ... However, the keys are protected by an enigma that you must answer correct to get the key!");
		System.out.println("/|\\ ");
		System.out.println("/ \\ ");
		GameUtil.loadStory();
		System.out.println(" O ... Now move!!");
		System.out.println("/|\\ ");
		System.out.println("/ \\ ");
		GameUtil.loadStory();
	}
	
	public static Florest showflorest() {
		System.out.println("[...] You're in the forest. Seems you have to move fast and find the next House. \n");
		System.out.println("[...] Type n (North), s (South), e (East), w (West) or p (Save Game) \n");
		return new Florest();
	}
	
	public static House findFirstHouse() {
		System.out.println("[...] You're in the first House. Seems you have a safe and a secret to solve. \n");
		return new HouseOne();
	}
	
	public static House findSecondHouse() {
		System.out.println("[...] You're in the second House. Seems you have a safe and a secret to solve. \n");
		return new HouseTwo();
			
	}
	
	public static House findThirdHouse() {
		System.out.println("[...] You're in the third House. Seems you have a safe and a secret to solve. \n");
		return new HouseThree();
		
	}
	
	public static House findFourthHouse() {
		System.out.println("[...] You're in the fourth House. Seems you have a safe and a secret to solve. \n");
		return new HouseFour();
	}
	
	public static void drawHouse() {
		System.out.println("   **");
		System.out.println("  /  \\");
		System.out.println(" /    \\");
		System.out.println("/______\\");
		System.out.println("| _    |");
		System.out.println("||_|   |");
		System.out.println("|   |o||");
	}
	
	public static void drawCharacter() {
		System.out.println(" O ");
		System.out.println("/|\\ ");
		System.out.println("/ \\ ");
	}
	
	public static void drawCharacterAttack() {
		System.out.println(" O  ");
		System.out.println("/|\\ ooooooooooo");
		System.out.println("/ \\ ");
		System.out.println(" ");
	}
	
	public static void drawMonster() {
		System.out.println("  (ooo) ");
		System.out.println("/(     )\\");
		System.out.println(" (     )");
		System.out.println("/ (   ) \\");
		System.out.println(" ");
	}
	
	public static void drawMonsterAttack() {
		System.out.println("  (ooo) ");
		System.out.println("/(     )\\ oooooooo");
		System.out.println(" (     )");
		System.out.println("/ (   ) \\");
		System.out.println(" ");
	}
	
	//firsthouse, house, monstro, nda
}
