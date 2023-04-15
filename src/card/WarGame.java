package card;
import java.util.Scanner;



public class WarGame {

		public void WarGame() {
			Player player1 = new Player();
			Player player2 = new Player();
			
			System.out.println("Welcome to War Card Game Simulator!");
			
			@SuppressWarnings("resource")
			Scanner kb = new Scanner(System.in);
				System.out.println("Press Enter to Simulate a game");
				@SuppressWarnings("unused")
				String input = kb.nextLine();
			
		

			player1.getHand1();
			player2.getHand2();
			
			
			
			int score1 = 0;
			int score2 = 0;
			int cardValueP1 = 0;
			int cardValueP2 = 0;
			
					
			for (int i = 1; i <= 26; i++) {
				
				System.out.println("Round = " + i);
				
				for (int a = 0; a <= 14; a++) {
					if (player1.getHand1().get(0).contains("Two")) {
						cardValueP1 = 2;
					} else if (player1.getHand1().get(0).contains("Three")) {
						cardValueP1 = 3;
					}
					else if (player1.getHand1().get(0).contains("Four")) {
						cardValueP1 = 4;
					}
					else if (player1.getHand1().get(0).contains("Five")) {
						cardValueP1 = 5;
					}
					else if (player1.getHand1().get(0).contains("Six")) {
						cardValueP1 = 6;
					}
					else if (player1.getHand1().get(0).contains("Seven")) {
						cardValueP1 = 7;
					}
					else if (player1.getHand1().get(0).contains("Eight")) {
						cardValueP1 = 8;
					}
					else if (player1.getHand1().get(0).contains("Nine")) {
						cardValueP1 = 9;
					}
					else if (player1.getHand1().get(0).contains("Ten")) {
						cardValueP1 = 10;
					}
					else if (player1.getHand1().get(0).contains("Jack")) {
						cardValueP1 = 11;
					}
					else if (player1.getHand1().get(0).contains("Queen")) {
						cardValueP1 = 12;
					}
					else if (player1.getHand1().get(0).contains("King")) {
						cardValueP1 = 13;
					}
					else if (player1.getHand1().get(0).contains("Ace")) {
						cardValueP1 = 14;
					}
				}
					
					for (int b = 0; b <= 14; b++) {
						if (player2.getHand2().get(0).contains("Two")) {
							cardValueP2 = 2;
						} else if (player2.getHand2().get(0).contains("Three")) {
							cardValueP2 = 3;
						}
						else if (player2.getHand2().get(0).contains("Four")) {
							cardValueP2 = 4;
						}
						else if (player2.getHand2().get(0).contains("Five")) {
							cardValueP2 = 5;
						}
						else if (player2.getHand2().get(0).contains("Six")) {
							cardValueP2 = 6;
						}
						else if (player2.getHand2().get(0).contains("Seven")) {
							cardValueP2 = 7;
						}
						else if (player2.getHand2().get(0).contains("Eight")) {
							cardValueP2 = 8;
						}
						else if (player2.getHand2().get(0).contains("Nine")) {
							cardValueP2 = 9;
						}
						else if (player2.getHand2().get(0).contains("Ten")) {
							cardValueP2 = 10;
						}
						else if (player2.getHand2().get(0).contains("Jack")) {
							cardValueP2 = 11;
						}
						else if (player2.getHand2().get(0).contains("Queen")) {
							cardValueP2 = 12;
						}
						else if (player2.getHand2().get(0).contains("King")) {
							cardValueP2 = 13;
						}
						else if (player2.getHand2().get(0).contains("Ace")) {
							cardValueP2 = 14;
						}
					
				}
				
				System.out.println("Player 1's card = " + player1.getHand1().get(0));
				System.out.println("Player 2's card = " + player2.getHand2().get(0));
				
				if (cardValueP1 > cardValueP2) {
					score1+=1;
				} else if (cardValueP1 < cardValueP2) {
					score2+=1;
				} else {
					score1+=0;
					score2+=0;
				}
				if (cardValueP1 > cardValueP2) {
					System.out.println("Player 1 Wins the turn!");
				} else if (cardValueP1 < cardValueP2) {
					System.out.println("Player 2 Wins the turn!");
				} else {
				System.out.println("The turn is a Draw...");
				}
				System.out.println("Player 1's score = " + score1);
				System.out.println("Player 2's score = " + score2);
				player1.getHand1().remove(0);
				player2.getHand2().remove(0);
				System.out.println();
				System.out.println("Press Enter to continue to next round");
				input = kb.nextLine();
			}
			System.out.println();
			
			System.out.println("Final Score: Player 1's score = " + score1 + " & " + "Player 2's score = " + score2);
			if (score1 > score2) {
				System.out.println("Player 1 Wins!");
			} else if (score1 < score2) {
				System.out.println("Player 2 Wins!");
			} else {
			System.out.println("The Game ended in a Draw...");
			}
		}

		
			
			
	
		
	
	
	
	
	
	
	
	
	
	
	
}
