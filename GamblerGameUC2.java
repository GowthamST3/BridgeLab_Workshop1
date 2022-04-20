package com.BridgeLabz_GamblerGame;

public class GamblerGameUC2 {

	 static final int STAKEPERDAY=100;
     static final int BETPERGAME=1;
     
        public static void main(String[] args) {
        	int GamblerEarn =0;
        	int GamblerLoss=0;
		    System.out.println("Stake per day is "+ STAKEPERDAY );
	        System.out.println("Bet per Game is "+ BETPERGAME );
	        
	        int bet = (int) Math.floor(Math.random() * 10) % 2;
	        
	        if(bet==1){
	        	System.out.println("Gambler win the game");
	        	GamblerEarn=STAKEPERDAY+BETPERGAME;
	        	System.out.println("Gambler earn the Amount and amount is "+ GamblerEarn );
	        	
	        }
	        
	        else{
	        	System.out.println("Gambler loss the game");
	        	GamblerLoss=STAKEPERDAY-BETPERGAME;
	        	System.out.println("Gambler Loss the Amount and amount is "+ GamblerLoss );
	        }
	        
	        
	}

}
