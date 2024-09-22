import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*Task 2: Explain the rules

        >>Let's play Pokerito. Type anything when you're ready.
        |
        >>It's like Poker, but a lot simpler.
        >> (new line)
        >> • There are two players, you and the computer.
        >> • The dealer will give each player one card.
        >> • Then, the dealer will draw five cards (the river)
        >> • The player with the most river matches wins!
        >> • If the matches are equal, everyone's a winner!
        >> (new line)
        >> • Ready? Type anything if you are.
        |
        */
        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        scan.nextLine();
        System.out.println("It's like Poker, but a lot simpler.\n");
        System.out.println(" • There are two players, you and the computer.");
        System.out.println(" • The dealer will give each player one card.");
        System.out.println(" • Then, the dealer will draw five cards (the river)");
        System.out.println(" • The player with the most river matches wins!");
        System.out.println(" • If the matches are equal, everyone's a winner!\n");
        System.out.println(" • Ready? Type anything if you are.");
        scan.nextLine();
        


        /*Task 3: Present the user with a card
         println 'Here's your card:'
         <show card>
         <new line>
         println 'Here's the computer's card:'
         <show computer's card>
        */
        String yourCard = randomCard();
        String computerCard = randomCard();
        System.out.println("Here's your card:");
        System.out.println(yourCard+"\n");
        System.out.println("Here's the computer's card:");
        System.out.println(computerCard);


        int yourMatches = 0;
        int computerMatches =0;

        /** Task 4 - Draw five cards
         * 
         * • print:  Now, the dealer will draw five cards. Press enter to continue.
         * • The dealer will draw a card every time the user presses enter.
         * • Before you draw a card, print the order it was drawn in:
         *      Card 1 
         *      <2 new lines>
         *      <print card>
         *      Card 2
         *      <2 new lines>
         *      <print card>
         *      ...
         */
        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        for (int i = 1; i <= 5; i++) {
            scan.nextLine();
            String draw = randomCard(); 
            
            if (yourCard.equals(draw)){
                yourMatches++;
            }
            if (computerCard.equals(draw)) {
                computerMatches++;
            }

            System.out.println("Card " + i + "\n");
            System.out.println(draw);
        }


        /** Task 5 - Get the winner
         * 
         * • Count your number of matches.
         * • Count the computer's number of matches.
         * • print: Your number of matches: <yourMatches>
         * • print: Computer number of matches:  <computerMatches>
         * 
         * • If you have more matches, print: You win!. 
         * • If the computer has more matches, print: The computer wins! 
         * • If the matches are equal, print: everyone wins!.
         */
        System.out.println("Your number of matches: " + yourMatches);
        System.out.println("Computer number of matches: " + computerMatches);
        if (yourMatches > computerMatches) {
            System.out.println("You win!");
        } else if (computerMatches > yourMatches) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("everyone wins!");
        }

         scan.close();
    }

    /** Task 1
     * 
     * Function name – randomCard
     * @return (String)
     * 
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card that matches the random number (get the String values from cards.text).   
     */
    public static String randomCard() {
        int card = (int) ((Math.random() * 13) + 1);
        return switch (card) {
            case 1 -> """
               _____
              |A _  |
              | ( ) |
              |(_'_)|
              |  |  |
              |____V|
            """;
            case 2 -> """
               _____
              |2    |
              |  o  |
              |     |
              |  o  |
              |____Z|
            """;
            case 3 -> """
               _____
              |3    |
              | o o |
              |     |
              |  o  |
              |____E|
            """;
            case 4 -> """
               _____
              |4    |
              | o o |
              |     |
              | o o |
              |____h|
            """;
            case 5 -> """
               _____ 
              |5    |
              | o o |
              |  o  |
              | o o |
              |____S|
            """;
            case 6 -> """
               _____ 
              |6    |
              | o o |
              | o o |
              | o o |
              |____6|
            """;
            case 7 -> """
               _____ 
              |7    |
              | o o |
              |o o o|
              | o o |
              |____7|
            """;
            case 8 -> """
               _____ 
              |8    |
              |o o o|
              | o o |
              |o o o|
              |____8|
            """;
            case 9 -> """
               _____ 
              |9    |
              |o o o|
              |o o o|
              |o o o|
              |____9|
            """;
            case 10 -> """
               _____ 
              |10  o|
              |o o o|
              |o o o|
              |o o o|
              |___10|
            """;
            case 11 -> """
               _____
              |J  ww|
              | o {)|
              |o o% |
              | | % |
              |__%%[|
            """;
            case 12 -> """
               _____
              |Q  ww|
              | o {(|
              |o o%%|
              | |%%%|
              |_%%%O|
            """;
            case 13 -> """
               _____
              |K  WW|
              | o {)|
              |o o%%|
              | |%%%|
              |_%%%>|
            """;
            default -> "This shouldn't get called.";
        };
    }
}
