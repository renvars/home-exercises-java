package io.codelex.blackjack;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

//------------------------------------------------------------------------------------------
//GAME MADE FROM A CUSTOM API (VERY SIMPLE), MOCK API CONTAINING ALL THE CARDS IN A DECK
//------------------------------------------------------------------------------------------

public class blackjackGame {
    private static final int DECK_AMOUNT = 6;
    private static int BALANCE = 1000;
    private static int GAMES_PLAYED = 0;
    private static int WINS = 0;
    private static int BALANCE_CHANGE = 0;

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("<><><><><><><><><><><><><><><>");
        System.out.println("<><><Welcome to BLACKJACK><><>");
        System.out.println("<><><><><><><><><><><><><><><>");
        play(random, in);

    }

    private static void play(Random random, Scanner in) throws InterruptedException {

        boolean playAnother = true;
        List<Card> deckOfCards = shuffleCards(deckOfCards(), random);
        while (playAnother || deckOfCards.size() > deckOfCards.size() / 2) {
            System.out.print("What's your bet size?: ");
            int betSize = in.nextInt();
            in.nextLine();
            List<Card> playerCards = new ArrayList<>();
            List<Card> dealerCards = new ArrayList<>();
            int[] initialDeal = setupFistDeal(deckOfCards, random);
            playerCards.add(deckOfCards.get(initialDeal[0]));
            announceCard("Player", deckOfCards.get(initialDeal[0]), random);
            playerCards.add(deckOfCards.get(initialDeal[2]));
            announceCard("Dealer", deckOfCards.get(initialDeal[1]), random);
            dealerCards.add(deckOfCards.get(initialDeal[1]));
            announceCard("Player", deckOfCards.get(initialDeal[2]), random);
            deckOfCards.remove(initialDeal[0]);
            deckOfCards.remove(initialDeal[2]);
            deckOfCards.remove(initialDeal[1]);
            int playerValue = calculateValue(playerCards);
            int dealerValue = calculateValue(dealerCards);
            System.out.println("--------------------------------");
            System.out.println("Players value is: " + playerValue);
            System.out.println("Dealers value is: " + dealerValue);
            System.out.println("--------------------------------");

            System.out.print("Do you want to hit or stands (H,S): ");
            String decision = in.nextLine();
            boolean continueDraw = decision.equals("H");
            while (continueDraw) {
                int cardIndex = drawCardIndex(deckOfCards, random);
                playerCards.add(deckOfCards.get(cardIndex));
                announceCard("Player", deckOfCards.get(cardIndex), random);
                deckOfCards.remove(cardIndex);
                playerValue = calculateValue(playerCards);
                System.out.println("--------------------------------");
                System.out.println("Players value is: " + playerValue);
                System.out.println("--------------------------------");
                if (playerValue > 21) {
                    System.out.println("That's a BUST");
                    BALANCE -= betSize;
                    GAMES_PLAYED++;
                    BALANCE_CHANGE -= betSize;
                    break;
                }
                System.out.print("Do you want to hit or stands (H,S): ");
                continueDraw = in.nextLine().equals("H");
            }
            if (playerValue > 21) {
                continue;

            } else if (playerValue == 21) {
                System.out.println("IT'S A BLACKJACK!");
                BALANCE += betSize * 1.5;
                GAMES_PLAYED++;
                BALANCE_CHANGE += betSize * 1.5;
                WINS++;
                break;

            } else {
                while (!(dealerValue >= 17)) {
                    int cardIndex = drawCardIndex(deckOfCards, random);
                    dealerCards.add(deckOfCards.get(cardIndex));
                    announceCard("Dealer", deckOfCards.get(cardIndex), random);
                    deckOfCards.remove(cardIndex);
                    dealerValue = calculateValue(dealerCards);

                }
                System.out.println("--------------------------------");
                System.out.println("Dealer final value is: " + dealerValue);
                System.out.println("--------------------------------");
                if (dealerValue > 21) {
                    System.out.println("Dealer BUSTS");
                    System.out.println("CONGRATS YOU WON!");
                    BALANCE += betSize;
                    GAMES_PLAYED++;
                    WINS++;
                    BALANCE_CHANGE += betSize;
                } else {
                    determineWinner(playerValue, dealerValue, betSize);
                }

            }
            if (GAMES_PLAYED % 5 == 0) {
                System.out.print("Do you want to play another Hand (yes/no): ");
                if (in.hasNextLine()) {
                    playAnother = in.nextLine().equals("yes");
                    if (!playAnother) {
                        System.out.println("Thanks for playing!");
                    }
                }
            }
            if (GAMES_PLAYED % 6 == 0) {
                System.out.print("Do you want to see your stats? (yes/no):");
                if (in.hasNextLine()) {
                    boolean res = in.nextLine().equals("yes");
                    if (res) {
                        showStats();
                    }
                }

            }


        }


    }

    private static void showStats() {
        System.out.println("====================================");
        System.out.println("You have played : " + GAMES_PLAYED + " games");
        System.out.println("You have won : " + WINS + " of them");
        System.out.println("Your balance now is : " + BALANCE + "$");
        System.out.println("Your balance change is : " + BALANCE_CHANGE + "$");
        System.out.println("====================================");
    }

    private static void determineWinner(int player, int dealer, int betSize) {
        if (player > dealer) {
            System.out.println("Congrats you WON!");
            BALANCE += betSize;
            GAMES_PLAYED++;
            WINS++;
            BALANCE_CHANGE += betSize;
        } else if (dealer > player) {
            System.out.println("Dealer WON!");
            GAMES_PLAYED++;
            BALANCE -= betSize;
            BALANCE_CHANGE -= betSize;
        } else {
            System.out.println("It's a TIE");
            GAMES_PLAYED++;
        }
    }

    private static void announceCard(String whoDrew, Card card, Random random) throws InterruptedException {
        Thread.sleep(random.nextInt(800, 3000));
        System.out.println(whoDrew + " drew a/an " + card.getName() + " of " + card.getSuit().name() + "s");
    }

    private static int calculateValue(List<Card> cards) {
        boolean containsAnAce = containsAce(cards);
        int value = 0;

        for (int i = 0; i < cards.size(); i++) {
            value += cards.get(i).getBlackjackValue();
            if (containsAnAce && value > 21 && i < 4) {
                value -= 10;
            }
        }

        return value;
    }

    private static boolean containsAce(List<Card> cards) {
        for (Card card : cards) {
            if (card.getName().equals("ACE")) {
                return true;
            }
        }
        return false;
    }

    private static int[] setupFistDeal(List<Card> cards, Random random) {
        int[] res = new int[3];
        for (int i = 0; i < res.length; i++) {
            int randomDraw = random.nextInt(cards.size());
            for (int j = 0; j < res.length; j++) {
                if (randomDraw == res[j]) {
                    randomDraw = random.nextInt(cards.size());
                }
            }
            res[i] = randomDraw;
        }
        return res;
    }

    private static int drawCardIndex(List<Card> cards, Random random) {
        return random.nextInt(cards.size());
    }

    private static List<Card> shuffleCards(List<Card> cards, Random random) {
        List<Card> shuffledCards = new ArrayList<>();

        while (cards.size() != 0) {
            int randomCard = random.nextInt(cards.size());
            shuffledCards.add(cards.get(randomCard));
            cards.remove(randomCard);
        }
        return shuffledCards;
    }

    private static List<Card> deckOfCards() {
        JSONArray cardArray = callApi();
        List<Card> cardList = new ArrayList<>();
        for (int i = 0; i < Objects.requireNonNull(cardArray).length(); i++) {
            JSONObject object = (JSONObject) cardArray.get(i);
            Suit suit = Suit.returnSuitValue((String) object.get("suit"));
            JSONArray r = (JSONArray) object.get("blackjackValue");
            int bjValue = r.length() == 2 ? 11 : (int) r.get(0);
            String name = (String) object.get("stringName");
            Card card = new Card(suit, bjValue, name.toUpperCase());
            for (int j = 0; j < DECK_AMOUNT; j++) {
                cardList.add(card);
            }

        }
        return cardList;
    }

    private static JSONArray callApi() {
        try {
            URL url = new URL("https://6339dc57d6ef071af8176266.mockapi.io/deckOfcards/cards");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder inputData = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                inputData.append(inputLine);
            }
            return new JSONArray(inputData.toString());
        } catch (IOException e) {
            System.out.println("Something went wrong!");

        }
        return null;
    }


}
