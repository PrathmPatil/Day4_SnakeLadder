package com.snakeandladder;
import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
           System.out.println("Welcome in SnakeAndLadder Game");
           System.out.println();
           int start=0;
           int player1;
           System.out.println("Start position of player is "+start);
           Random random= new Random ();
        	   int dice=random.nextInt(5+1)+1; //((max-min)+1)+min;
               System.out.println(dice);          
	}

}
