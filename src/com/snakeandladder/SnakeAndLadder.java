package com.snakeandladder;
import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder {
 static int dice;
	public static void main(String[] args) {
           System.out.println("Welcome in SnakeAndLadder Game");
           System.out.println();
          
           int dicerole=0;
           int player=-1;
           int player1=0;
           int player2=0;
           int checkPlay;
           /*
            * random value for dice
            */
           Random random= new Random ();
           Scanner sc=new Scanner(System.in);
               
            	   Object str;
            	   /*
            	    * use do while loop for countines upto winning point
            	    */
            	   do {
				do {
					System.out.print("enter 'r' for dice roll & press enter :: ");
            		   str = sc.next();
            		   
            	   switch(player)
            	   {
            	   case -1:
            		   System.out.println("Position of player1 is "+player1);
            		   checkPlay=random.nextInt(2);
                	   if(checkPlay==0)
                	   {
                		   System.out.println("NoPlay");
//                		   player1=player1+0;
//                		   System.out.println("player1 "+player1);
                		   System.out.println();
                		   
                	   }
                	   else
                	   {
               		   dice=random.nextInt(5+1)+1; //((max-min)+1)+min;
//                		   System.out.println("Play");
//                		   System.out.println(dice);
                		   player1=player1+dice;
                		   if(player1==7||player1==28||player1==42||player1==63||player1==86)
                           {    
                			   if(player1==7)
                				   player1+=7;
                			   else if(player1==28)
                				   player1+=12;
                			   else if(player1==42)
                				   player1+=35;
                			   else if(player1==63)
                				   player1+=20;
                			   else if(player1==86)
                			   { player1+=9;}
                			   player=(-1)*player;
                			   System.out.println("Use Ladder"+player);
                			   System.out.println("player1 "+player1);
                        	   
                           }
                           else if(player1==19||player1==35||player1==58||player1==88||player1==96)
                           {  if(player1==19)
            				   player1-=14;
            			      else if(player1==35)
            				   player1-=28;
            			      else if(player1==58)
            				   player1-=15;
            			      else if(player1==88)
            				   player1-=60;
            			      else if(player1==96)
            			          { player1-=40;}
                           }
                		   /*
                		    * Exact Position 100 otherwise stay on current position
                		    */
                           else
                           { 
                        	//   player1=player1+dice;
                           
                        	   if(player1>100)
                        	   {
                        		   player1=player1-dice;
                        	   }
                        	   else if(player1< 0)
                        	   {
                        		   player1=0;
                        	   }
                        	   
//                    		   System.out.println("player1 "+player1);
                    		   dicerole++;
                           }
                	   }
                	   System.out.println();
                		 break  ;
            	   //switch case 1.
            	   
                	   case 1:
                		   System.out.println("Position of player2 is "+player1);
                		   checkPlay=random.nextInt(2);
                    	   if(checkPlay==0)
                    	   {
                    		   System.out.println("NoPlay");
//                    		   player2=player2+0;
//                    		   System.out.println(player2);
                    		   System.out.println();
                    		   
                    	   }
                    	   else
                    	   {
                    		   dice=random.nextInt(5+1)+1; //((max-min)+1)+min;
//                    		   System.out.println("Play");
//                    		   System.out.println(dice);
                    		   player2=player2+dice;
                    		   if(player2==7||player2==28||player2==42||player2==63||player2==86)
                               {    
                    			   if(player2==7)
                    				   player2+=7;
                    			   else if(player2==28)
                    				   player2+=12;
                    			   else if(player2==42)
                    				   player2+=35;
                    			   else if(player2==63)
                    				   player2+=20;
                    			   else if(player2==86)
                    			   { player2+=9;}
                    			   player=(-1)*player;
                    			   System.out.println("use ladder"+player);
                    			   System.out.println("player2 "+player2);
                            	   
                               }
                    		   else if(player2==19||player2==35||player2==58||player2==88||player2==96)
                               {  if(player2==19)
                				   player2-=14;
                			      else if(player2==35)
                				   player2-=28;
                			      else if(player2==58)
                				   player2-=15;
                			      else if(player2==88)
                				   player2-=60;
                			      else if(player2==96)
                			          { player2-=40;}
                               }
                    		   /*
                    		    * Exact Position 100 otherwise stay on current position
                    		    */
                               else
                               {    //player2=player2+dice;
                            	   if(player2>100)
                            	   {
                            		   player2=player2-dice;
                            	   }
                            	   else if(player2< 0)
                            	   {
                            		   player2=0;
                            	   }
                            	   
//                        		   System.out.println("player2 "+player2);
                        		   dicerole++;
                               }
                    		   System.out.println(); 
                	   break;
            	     }
                    	                  	   
            	   } 
            	   player=(-1)*player;//switch break.

            	   }while("r".equals(str));
            	   }
				while(player1<100&&player2<100);
                 
            	   if(player1==100)
            	   {
            		   System.out.println("Player1 is win!!");
            	   }
            	   if(player2==100)
            	   {
            		   System.out.println("Player2 is win!!");
            	   }
            	   else if(player1==100&&player2==100)
            	   {
            		   System.out.println("Match are Tie");
            	   }
               System.out.println(dicerole+" Times Dice are role");
               //System.out.println("end "+i);
               System.out.println("****************************");
               
          
	}

}