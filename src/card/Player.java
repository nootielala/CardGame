package card;


import java.util.ArrayList;
import java.util.List;

public class Player {
	
	

	private String name; 
	private List<String> hand1 = new ArrayList<>(); 
	private List<String> hand2 = new ArrayList<>();
	
	public Player() {
		Deck cards = new Deck();
		for (String card : cards.getShuffledDeck()) {
			hand1.add(card);
			hand2.add(card);
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getHand1() {
		return hand1;
	}

	public void setHand1(List<String> hand1) {
		this.hand1 = hand1;
	}

	public List<String> getHand2() {
		return hand2;
	}

	public void setHand2(List<String> hand2) {
		this.hand2 = hand2;
	}
	
	
	
	
	
	
	
	
	
	

}
