package card;


import java.util.ArrayList;
	import java.util.Collections;
	import java.util.LinkedHashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.TreeMap;


public class Card {

	
	
	

		//  these are my card lists values 
		private List <Integer> value = new ArrayList<>();
		private Map <Integer, String> name = new TreeMap<>();
		private List <String> suit = new ArrayList<>();
		private List <String> diamonds = new ArrayList<>();
		private List <String> hearts = new ArrayList<>();
		private List <String> spades = new ArrayList<>();
		private List <String> clubs = new ArrayList<>();
		private Map <String, Integer> deck = new LinkedHashMap<>();
		
//   i added value to my card class
		public Card() {
			
			value.add(2);
			value.add(3);
			value.add(4);
			value.add(5);
			value.add(6);
			value.add(7);
			value.add(8);
			value.add(9);
			value.add(10);
			value.add(11);
			value.add(12);
			value.add(13);
			value.add(14);
			
			name.put(2, "Two");
			name.put(3, "Three");
			name.put(4, "Four");
			name.put(5, "Five");
			name.put(6, "Six");
			name.put(7, "Seven");
			name.put(8, "Eight");
			name.put(9, "Nine");
			name.put(10, "Ten");
			name.put(11, "Jack");
			name.put(12, "Queen");
			name.put(13, "King");
			name.put(14, "Ace");
			
			suit.add("Diamonds");
			suit.add("Hearts");
			suit.add("Spades");
			suit.add("Clubs");
			
			// my for loops that iterate over my cards
			for (Integer i = 2; i <= 14; i++)
			{
				diamonds.add(getName().get(i) + " of " + getSuit().get(0));
			}
			
			
			for (Integer i = 2; i <= 14; i++)
			{
				hearts.add(getName().get(i) + " of " + getSuit().get(1));
			}
			
			
			for (Integer i = 2; i <= 14; i++)
			{
				spades.add(getName().get(i) + " of " + getSuit().get(2));
			}
			
			
			for (Integer i = 2; i <= 14; i++)
			{
				clubs.add(getName().get(i) + " of " + getSuit().get(3));
			}
			
			
			for (Integer i = 0; i < diamonds.size(); i++) 
			{
				deck.put(diamonds.get(i), value.get(i));
			}
			
			
			for (Integer i = 0; i < hearts.size(); i++) 
			{
				deck.put(hearts.get(i), value.get(i));
			}
			
			
			for (Integer i = 0; i < spades.size(); i++) 
			{
				deck.put(spades.get(i), value.get(i));
			}
			
			
			for (Integer i = 0; i < clubs.size(); i++) 
			{
				deck.put(clubs.get(i), value.get(i));
			}
		}



		public List<Integer> getValue() {
			return value;
		}



		public void setValue(List<Integer> value) {
			this.value = value;
		}



		public Map<String, Integer> getDeck() {
			return deck;
		}




		public void setDeck(Map<String, Integer> deck) {
			this.deck = deck;
		}




		public Map<Integer, String> getName() {
			return name;
		}




		public void setName(Map<Integer, String> name) {
			this.name = name;
		}




		public List<String> getSuit() {
			return suit;
		}




		public void setSuit(List<String> suit) {
			this.suit = suit;
		}
		
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public List shuffle()
		{
			List keys = new ArrayList(deck.keySet());
			Collections.shuffle(keys);
			for (Object key : keys) {
				deck.get(key);
			}
			return keys;
		}
		
		

		public void describe()
		{
			System.out.println(deck);
		}

		
		

	}

	
	
	
	

