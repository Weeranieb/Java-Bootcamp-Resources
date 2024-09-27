import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        //Task 3 – Wait for the user to press enter.
        scan.nextLine();
        //Task 4 – Get two random cards.
        //       – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>
        int card1 = drawRandomCard();
        int card2 = drawRandomCard();
        System.out.println("\n You get a \n" + cardString(card1) + "\n and a \n" + cardString(card2));

        //Task 5 – Print the sum of your hand value.
        //       – print: your total is: <hand value>
        int total = Math.min(card1, 10) + Math.min(card2, 10);
        System.out.println("your total is: " + total);

        
        //Task 6 – Get two random cards for the dealer.
        //       – Print: The dealer shows \n" + <first card> + "\nand has a card facing down \n" + <facedown card>
        //       – Print: \nThe dealer's total is hidden
        int dealerCard1 = drawRandomCard();
        int dealerCard2 = drawRandomCard();
        System.out.println("\n The dealer shows \n" + cardString(dealerCard1) + "\nand has a card facing down \n" + faceDown());
        int dealerTotal = Math.min(dealerCard1, 10) + Math.min(dealerCard2, 10);
        System.out.println("\nThe dealer's total is hidden");

       
        //Task 8 – Keep asking the player to hit or stay (while loop).
        //       1. Every time the player hits
        //             – draw a new card.
        //             – calculate their new total.
        //             – print: (new line) You get a (new line) <show new card>.
        //             - print: your new total is <total>

        //       2. Once the player stays, break the loop. 
        while (true) { 
            String option = hitOrStay();

            if (option.equals("stay")) {
                break;
            }

            int newCard = drawRandomCard();
            total += Math.min(newCard, 10);
            System.out.println("\nYou get a\n" + cardString(newCard));
            System.out.println("your total is " + total);

            if (total > 21) {
                System.out.println("Bust! Player loses");
                System.exit(0);
            }
        }

        System.out.println("\nDealer's turn");
        System.out.println("\n The dealer's cards are \n" + cardString(dealerCard1) 
        + "\n and a \n" + cardString(dealerCard2));
        System.out.println("Dealer's total is " + dealerTotal);

        while (dealerTotal < 17) {
            int newCard = drawRandomCard();

            dealerTotal += Math.min(newCard, 10);
            System.out.println("\n Dealer gets a \n" + cardString(newCard));
            System.out.println("Dealer's total is " + dealerTotal);
        }
        
        if (dealerTotal > 21) {
            System.out.println("Bust! Dealer loses.");
            System.exit(0);
        }

        if (total > dealerTotal) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Dealer wins!");
        }
        
        //For tasks 9 to 13, see the article: Blackjack Part II. 
         scan.close();

    }

    /** Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */
    public static int drawRandomCard() {
        return (int) (Math.random() * 13) + 1;
    }

    /** Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */

    public static String cardString(int cardNumber) {
        return switch(cardNumber) {
            case 1  ->   
                """
                _____
                |A _  |
                | ( ) |
                |(_'_)|
                |  |  |
                |____V|
                """;
            case 2 ->
                """
                _____
                |2    |
                |  o  |
                |     |
                |  o  |
                |____Z|
                """;
          
                  
            case 3 ->
                """
                _____
                |3    |
                | o o |
                |     |
                |  o  |
                |____E|
                """;
            case 4 ->

                """
                _____
                |4    |
                | o o |
                |     |
                | o o |
                |____h|
                """;
            case 5 ->
                """
                _____ 
                |5    |
                | o o |
                |  o  |
                | o o |
                |____S|
                """;
            case 6->
                """
                _____ 
                |6    |
                | o o |
                | o o |
                | o o |
                |____6|
                """;
            case 7->
                """
                _____ 
                |7    |
                | o o |
                |o o o|
                | o o |
                |____7|
                """;
            case 8->
                """
                _____ 
                |8    |
                |o o o|
                | o o |
                |o o o|
                |____8|
                """;
            case 9->
                """
                _____ 
                |9    |
                |o o o|
                |o o o|
                |o o o|
                |____9|
                """;
            case 10->
                """
                _____ 
                |10  o|
                |o o o|
                |o o o|
                |o o o|
                |___10|
                """;
            case 11->
                """
                _____
                |J    |
                | o   |
                |o o  |
                | o   |
                |____J|
                """;
            case 12->
                """
                _____
                |Q    |
                | o   |
                |o o  |
                | o   |
                |____Q|
                """;
            case 13->
                """
                _____
                |K    |
                | o   |
                |o o  |
                | o   |
                |____K|
                """;

             default -> "not possible";
        };
    }

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */
    public static String hitOrStay() {
        System.out.println("Would you like to hit or stay?");
        String response = scan.nextLine();

        while (!response.equals("hit") && !response.equals("stay")) {
            System.out.println("Please write 'hit' or 'stay'");
            response = scan.nextLine();
        }
        return response;
    }
}

