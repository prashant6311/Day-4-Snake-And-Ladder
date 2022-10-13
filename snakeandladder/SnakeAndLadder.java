package snakeandladder;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {

		System.out.println("Welcome to Snake and Ladder Program on Master Branch");
		System.out.println("Inintial position of the player1 is at 0");
		
		Random random = new Random();
        int dice= random.nextInt(6)+1;
        System.out.println("Player is rolling dice and get "+dice);
	}

}
