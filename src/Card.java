
public class Card implements Comparable<Card> {
	private String suit, value;
	private int rank;
	
	public Card (String suit, String value){
		this.setSuit(suit);
		this.setValue(value);
		
		switch(value){
			case "2":
				setRank(1);
				break;
			case "3":
				setRank(2);
				break;
			case "4":
				setRank(3);
				break;
			case "5":
				setRank(4);
				break;
			case "6":
				setRank(5);
				break;
			case "7":
				setRank(6);
				break;
			case "8":
				setRank(7);
				break;
			case "9":
				setRank(8);
				break;
			case "10":
				setRank(9);
				break;
			case "Jack":
				setRank(10);
				break;
			case "Queen":
				setRank(11);
				break;
			case "King":
				setRank(12);
				break;
			case "Ace":
				setRank(13);
				break;
		}
			
		
	}

	private void setRank(int i) {
		this.rank = i;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public String toString(){
		return value + " of " + suit;
	}

	public int compareTo(Card c) {
		
		return this.getRank() - c.getRank();

	}

	public int getRank() {
		return rank;
	}


}
