import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
//This note is to test github syncing capabilities 
public class TextWar {
	public static void main(String args[]) throws IOException{
	
		ArrayList<Card> list = new ArrayList<Card>();
		Random r = new Random();
		int p1Score = 0, p2Score = 0;
		Card p1Card, p2Card;
		for(int i = 0; i < 4; i++){		
				String suit = null;
				if(i == 0){
					suit = "Spade";
				}else if(i == 1){
					suit = "Heart";
				}else if(i == 2){
					suit = "Club";
				}else if(i == 3){
					suit = "Diamond";
				}
		
				list.add(new Card(suit,"2"));
				list.add(new Card(suit,"3"));
				list.add(new Card(suit,"4"));
				list.add(new Card(suit,"5"));
				list.add(new Card(suit,"6"));
				list.add(new Card(suit,"7"));
				list.add(new Card(suit,"8"));
				list.add(new Card(suit,"9"));
				list.add(new Card(suit,"10"));
				list.add(new Card(suit,"Jack"));
				list.add(new Card(suit,"Queen"));
				list.add(new Card(suit,"King"));
				list.add(new Card(suit,"Ace"));
		}
		
		while(list.size() > 0){
			int num;
			num = r.nextInt(list.size());
			p1Card = new Card(list.get(num).getSuit(), list.get(num).getValue());
			list.remove(num);
			
			num = r.nextInt(list.size());
			p2Card = new Card(list.get(num).getSuit(), list.get(num).getValue());
			list.remove(num);
			
			System.out.println(p1Card + " vs " + p2Card);
			
			if(p1Card.compareTo(p2Card)>0){
				System.out.println("Player 1 Win!");
				p1Score++;
			}else if(p1Card.compareTo(p2Card)<0){
				System.out.println("Player 2 Win!");
				p2Score++;
			}else{
				System.out.println("TIE");
			}
		}
		
		System.out.println("\nFinal Score:");
		System.out.println("Player 1: " + p1Score);
		System.out.println("Player 2: " + p2Score);
		
	}
}
