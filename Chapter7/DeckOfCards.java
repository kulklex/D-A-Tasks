import java.security.SecureRandom;

public class DeckOfCards {
    private Card[] deck;
    private int currentCard;
    private static final int NUMBERS_OFCARDS = 52;

    private static final SecureRandom randomNumbers = new SecureRandom();

    public DeckOfCards()
     {  String[] faces = {"Ace", "Deuce", "Three", "Four", "five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card[NUMBERS_OFCARDS];
        currentCard = 0;

        for(int count = 0; count < deck.length; count++){
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }

    public void Shuffle(){
        currentCard =0; 

        for(int first = 0; first < deck.length; first++){
            int second = randomNumbers.nextInt(NUMBERS_OFCARDS);

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard(){
        if (currentCard < deck.length){
            return deck[currentCard++];
        }
        else 
            return null;
    }
}
