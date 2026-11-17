import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static String savedEmail;
    public static void saveEmail(String email) {
        try {
            FileWriter fw = new FileWriter("users.txt", true); // true = append
            fw.write(email + "\n"); // new line
            fw.close();
            System.out.println("Email saved");
        } catch (IOException e) {
            System.out.println("Error saving email");
        }
    }
    public static boolean emailSendAtStart(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println();
        System.out.print("Enter your email: ");
        savedEmail = sc.nextLine();
        saveEmail(savedEmail); 

        if(!savedEmail.contains("@") || !savedEmail.contains(".")){
            System.out.println("❌ Invalid email format!");
            return false;
        }

        // Welcome Mail
        Email.sendMail(
            savedEmail,
            "Welcome to KBC Game",
            "Hello!\n\nWelcome to the KBC Console Game.\nGet ready to play and win exciting prizes!\n\nAll the best!"
        );
        return true;
    }
    public static void main(String[] args) {
        Scanner choice=new Scanner(System.in);
        while(true){
            
            System.out.println();
            System.out.println("----****---- LET'S START ----****----");
            System.out.println();
            System.out.println("1. Register For the game");
            System.out.println("2. Exit");
            System.out.print("Enter Your choice(1/2):");
            
            int firstChoice=choice.nextInt();
            if(firstChoice==1){
                boolean ok = emailSendAtStart();

                if(!ok){
                    System.out.println("Returning to main menu...");
                    continue;   // goes back to 1/2 menu
                }

                //Here the  Questions asked
                GameEngine game=new GameEngine();
                game.start();

                System.out.println();
                System.out.println("------End of the Game------");
                System.out.println();
                while(true){
                    
                    System.out.print("------Would You like to start again?(Y/N)------ ");
                    String play=choice.next();

                    if(play.equals("N")){
                        System.out.println();
                        System.exit(0);
                    }else if(play.equals("Y")){
                        System.out.println();
                        break;
                    }else{
                        System.out.println();
                        System.out.println("Wrong Choice");
                    }
                }
            }else{
                System.out.println();
                return;
            }
        }
        
    }
}