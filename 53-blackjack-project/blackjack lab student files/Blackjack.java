// Class: Blackjack
// Purpose: Main class used to play the card game Blackjack
// @author TAS
// @version December 2020

import static java.lang.System.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Blackjack{
	// deck of cards used for this game
	private Deck deck = new Deck(); 

	// arrays to hold the dealer's and player's hands
	private Card[] player = new Card[12]; // largest hand you can have is 12 cards (1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3 = 24) 
	private Card[] dealer = new Card[12];

	// tracks the number of card player / dealer has in their hands. cnt[0] = player's and cnt[1] = dealer's
	// Since any for loop will only iterate to the size of their hands, null pointer exception won't happen
	private int[] cnt = new int[2];

	// win points for player and dealer
	private double playerwp = 0;
	private double dealerwp = 0;

	// number of rounds that have been played
	private int rounds = 1;

	// used to detect if ctrl z / c happened
	private boolean endearly = false;

	// scanner used for keyboard input
	Scanner s = new Scanner(System.in);

	// constructor
	public Blackjack(){
		System.out.println("Welcome to Blackjack! (this is only for fun, no betting!!)");
	}

	// "main" method in the class, used to play one complete round of Blackjack
	public void playRound(){
		// initializes player and dealer's hands
		cnt[0] = 0; cnt[1] = 0;

		// cards are given to dealer / player by assigning dealt card to this variable.
		// then the card will be assigned to the array's next empty index (cnt++)
		Card card;

		// shiffles card every 5 rounds.
		if(rounds % 5 == 0){
			System.out.println("\n\n@@@@@@ Wait a sec, shuffling deck @@@@@@");
			deck.shuffle();
		}
		rounds++;

		// give 2 cards to player / dealer
		for(int i = 0; i < 2; i++){
			player[cnt[0]++] = deck.dealCard();
			dealer[cnt[1]++] = deck.dealCard();
		}
		
		// outputs hand of dealer (1st card) and player's
		System.out.println("\nDealer: " + dealer[0]);
		outputHand(0, player);
		
		// if a blackjack happens, checkBlackJack will return true and output / add score, so code can be ended early
		if(checkBlackJack()){
			return;
		}
		
		// player's turn. continues dealing until the player decides to stand
		while(true){
			System.out.print("Player! What would you like to do? (H)it or (S)tand? ");
			Strint response;

			// only record the string when something got inputed. The code will terminate if hasNextLine() is false
			if(s.hasNextLine()){
				response = s.nextLine();
			}
			else{
				endearly = true;
				return;
			}
			
			if(response.equals("h") || response.equals("H")){ 
				// deals card & outputs hand when player chooses to hit
				card = deck.dealCard();
				System.out.println("\n*** " + card + " ***\n");
				player[cnt[0]++] = card;

				outputHand(0, player);
				
				// dealer automatically wins if player busts
				if(getHandValue(cnt[0], player) > 21){
					System.out.println("\n### Player busted! Dealer wins! ###");
					dealerwp += 1;
					return;
				}
			}
			else if(response.equals("s") || response.equals("S")){
				// player's turn ends when he chooses to stand
				break; 
			}
			else{
				// prevents code from being broken
				System.out.println("Please pick a valid response. Type h or s"); 
			}
		}
		
		// dealer's turn. Continues hitting until dealer reaches 17 or above.
		while(getHandValue(cnt[1], dealer) < 17){
			// deals a card, outputs it and assigns it to the dealer's hand array
			card = deck.dealCard();
			System.out.println("***" + card + "***");
			dealer[cnt[1]++] = card;

			// player automatically win if dealer busts
			if(getHandValue(cnt[1], dealer) > 21){
				outputHand(1, dealer);
				System.out.println("\n### Dealer busted! Player wins! ###");
				playerwp ++;
				return;
			}
		}

		outputHand(1, dealer); // output dealer's final hand
		checkWinner(); // determine the winner
	}

	// determine and outputs the winner
	public void checkWinner(){
		// finds hand value for player and dealer
		int plr = getHandValue(cnt[0], player);
		int dlr = getHandValue(cnt[1], dealer); 

		if(plr == dlr){ // draw if player == dealer
			System.out.println("\n^^^ Draw! ^^^");
		}
		else if(plr > dlr){ // player win if player > dealer
			System.out.println("\n$$$ Player wins! $$$");
			playerwp += 1;
		}
		else{ // dealer win if player > dealer
			System.out.println("\n### Dealer Wins! ###");
			dealerwp += 1;
		}

	}

	// detects a blackjack & do special operations if it happens
	public boolean checkBlackJack(){
		if(getHandValue(cnt[0], player) == 21 && getHandValue(cnt[1], dealer) != 21){ // player gets bj while dealer didn't
			System.out.println("\n!!! Player gets a blackjack and 1.5 points, nice! !!!");
			playerwp += 1.5; // player gets 1.5pt if he gets bj on first 2 cards
			return true;
		}
		else if(getHandValue(cnt[1], dealer) == 21 && getHandValue(cnt[0], player) != 21){ // dealer get bj and player didn't
			System.out.println("\n:( Dealer gets a blackjack, tough break! :(");
			dealerwp += 1;
			return true;
		}
		else if(getHandValue(cnt[1], dealer) == 21 && getHandValue(cnt[0], player) == 21){ // both player & dealer gets bj
			// the chance of this happening is about 3%, which is surprisingly high
			System.out.println("\n^^^ Draw! ^^^");
			return true;
		}

		return false;
	}

	// output hands for player / dealer by inputing hand. n is used to decide whether its player (0) or dealer (1)
	public int getHandValue(int n, Card[] cards){
	    int val = 0;
	 	int acecnt = 0;

	 	// calculates total (ace calculated as 11) and number of aces
	 	for(int i = 0; i < n; i++){
	 		if(cards[i].getValue() == 11){
	 			acecnt++;
	 		}
	 		val += cards[i].getValue();
	 	}

	 	// calculates number of aces and total (ace counted as 11)
	 	while(val > 21 && acecnt != 0){
	 		acecnt--;
	 		val -= 10;
	 	}

	 	return val;
	}

	// outputs hands for player / dealer. 0 == player and 2 == dealer
	public void outputHand(int n, Card[] cards){
		int val = 0, acecnt = 0, acereq = 0;

		// calculates number of aces and total (ace counted as 11)
		for(int i = 0; i < cnt[n]; i++){
			if(cards[i].getValue() == 11){
				acecnt++;
			}
			val += cards[i].getValue();
		}

		// "converts" aces from 11 to 1 if total is over 21. Number of aces converted is also tracked (acereq)
		while(val > 21 && acecnt != 0){
			acereq++;
			acecnt--;
			val -= 10;
		}

		// output Player: or Dealer: depending on the input (0 / 1)
		System.out.print(n == 0 ? "Player: [" : "Dealer: ");

		// outputs the hand by iterating through it with a for loop
		for(int i = 0; i < cnt[n]; i++){
			if(cards[i].getValue() == 11 && acereq > 0){
				// if the card is an ace and there are still aces to be converted, outputs ACE of (SUIT) (1) instead
				acereq--;
				System.out.print("ACE of " + cards[i].getSuit() + " (1)");
			}
			else{
				// else just ouput according to tostring
				System.out.print(cards[i]);
			}

			if(i != cnt[n]-1){
				// output , as long as its not the last element of the array
				System.out.print(", ");
			}
		}

		System.out.println("] : " + getHandValue(cnt[n], cards));
	}
	
	// outputs score for player and dealer
	public void outputScore(){
		System.out.println("\nScore is: P=" + playerwp + ", D=" + dealerwp);
	}

	// returns whether endEarly is true
	public boolean endEarly(){
		return endearly;
	}
}