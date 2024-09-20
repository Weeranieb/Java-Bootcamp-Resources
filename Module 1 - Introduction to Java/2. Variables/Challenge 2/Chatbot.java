import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions. 

        
        //set up scanner. 
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String name = scan.nextLine();

                           
        //add new a line before asking next question. 
        System.out.printf("Hi %s! I'm Javabot. Where are you from?\n", name);
        String home = scan.nextLine();

        //add new a line before asking next question.
        System.out.printf("I hear it's beautiful at %s! I'm from a place called Oracle\n", home);
        System.out.println("How old are you?");
        int age = scan.nextInt();
        scan.nextLine();

        //add new a line before asking next question.
        System.out.printf("So you're %d, cool! I'm 400 years old.\n", age);
        System.out.printf("This means I'm %f times older than you.\n", 400/(double)age);
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        String lang = scan.nextLine();

        //add new a line here.
        System.out.printf("%s, that's great! Nice chatting with you %s. I have to log off now. See ya!\n", lang, name);
        
        //close scanner. 
        scan.close();
        
    }
}
