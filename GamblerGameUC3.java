package com.BridgeLabz_GamblerGame;

public class GamblerGameUC3 {

	static final int STAKEPERDAY=100;
    static final int BETPERGAME=1;
    public static void main(String[] args) {
    	int gamblerEarn =STAKEPERDAY;
       	int gamblerLoss=STAKEPERDAY;
        System.out.println("Stake per day is "+ STAKEPERDAY );
	    System.out.println("Bet per Game is "+ BETPERGAME );
	    
	    int bet = (int) Math.floor(Math.random() * 10) % 2;
	        
	        if(bet==1){
	        	while(gamblerEarn<150){
	            gamblerEarn++;
	              if(gamblerEarn==150){
	        	    System.out.println("Gambler win the game");
	        	    System.out.println("Gambler end the game and he has left with amount"+ gamblerEarn );
	              }
	        	}
	        	
	        	//System.out.println("Gambler end the game and he has left with amount"+ gamblerEarn );
	        }
	        	else{
	        	while(gamblerLoss>50){
		            gamblerLoss--;
		              if(gamblerLoss==50){
	                    System.out.println("Gambler loss the game");
	                    System.out.println("Gambler end the game and he has left with amount"+ gamblerLoss );
		            }
	        	  }
	        	  //System.out.println("Gambler end the day and he left with the amount "+ gamblerLoss );
	        	  
	        }
	        		
	       }
    }

	    



