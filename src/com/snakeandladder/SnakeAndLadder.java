package com.snakeandladder;
import java.util.Random;

public class SnakeAndLadder {
 static int dice;
	public static void main(String[] args) {
           System.out.println("Welcome in SnakeAndLadder Game");
           System.out.println();
           int start=0;
           int player1=0;
           System.out.println("Start position of player is "+start);
           Random random= new Random ();
               int checkPlay;
               for(int i=0;i<3;i++) {
               while(player1<100) 
               { 
            	   
            	   checkPlay=random.nextInt(2);
            	   if(checkPlay==0)
            	   {
            		   System.out.println("NoPlay");
            		   player1=player1+0;
            		   System.out.println(player1);
            		   
            	   }
            	   else
            	   {
            		   dice=random.nextInt(5+1)+1; //((max-min)+1)+min;
            		   System.out.println("Play");
            		   System.out.println(dice);
            		   
            		   if(player1==7||player1==21||player1==28||player1==42||player1==63)
                       {
                    	   player1=player1+7;
                       }
                       else if(player1==12||player1==24||player1==48||player1==72||player1==86)
                       {
                    	   player1=player1+10;
                       }
                       else if(player1==25||player1==50||player1==75)
                       {
                    	   player1=player1+12;
                       }
                       else if(player1==19||player1==26||player1==36||player1==60||player1==84)
                       {
                    	   player1=player1-8;
                       }
                       else if(player1==23||player1==55||player1==44||player1==78||player1==96)
                       {
                    	   player1=player1-12;
                       }
                       else
                       {    player1=player1+dice;
                    	   if(player1>100)
                    	   {
                    		   player1=player1-dice;
                    	   }
                    	   else if(player1< 0)
                    	   {
                    		   player1=0;
                    	   }
                    	   
                		   System.out.println(player1);
                       }
            	   }  
                   
               }
               System.out.println("end "+i);
               player1=0;
               System.out.println("****************************");
               
          }   
	}

}