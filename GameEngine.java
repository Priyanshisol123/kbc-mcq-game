import java.util.Scanner;
import java.util.Collections;
import java.io.FileWriter;
import java.io.IOException;
public class GameEngine{
    public static void saveAnswer(int n,boolean answer){
        try {
            FileWriter fw = new FileWriter("users.txt", true); // true = append
            if(answer==true){
                fw.write("Answer " + n + " is correct \n"); // new line
            }else{
                fw.write("Answer " + n + " is incorrect \n"); // new line
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Error saving Answer");
        }
    }
    public static void savePrize(int prize){
        try {
            FileWriter fw = new FileWriter("users.txt", true); // true = append
            fw.write("Current prize " + prize + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error saving Answer");
        }
    }
    public static void sendFinalEmail(String email, int prize, boolean wonGame) {
        String subject = "KBC Game Result";

        String message;

        if (wonGame) {
            message = "🎉 Congratulations!\n\nYou completed the game and won ₹" + prize +
                    "\n\nThanks for playing KBC Console Game!";
        } else {
            if (prize > 0) {
                message = "😔 Sorry for the loss!\n\nCongratulations! You won ₹" + prize +
                        "\n\nBetter luck next time!";
            } else {
                message = "😔 Game Over!\n\nYou did not win any prize.\n\nTry again!";
            }
        }
        Email.sendMail(email, subject, message);
    }
    public static int getPrize(int qNo){
        if(qNo < 10){
            return 2000;
        }else if(qNo < 20){
            return 5000;
        }else if(qNo < 30){
            return 10000;
        }else if(qNo < 40){
            return 20000;
        }else{
            return 50000;
        }
    }
    public void start(){
        QuestionBank qb=new QuestionBank();
        qb.addQuestion();
        
        Collections.shuffle(qb.questions);

        //Welcome
        System.out.println();
        System.out.println("------START THE GAME!------");
        System.out.println();
            
        //get user info
        
        //start quiz
        Scanner ans=new Scanner(System.in);
        boolean gameWon = true;
        int prize = 0;
        int[] sectionReward = {2000, 5000, 10000, 20000, 50000};
        boolean[] answerArray = new boolean[50];

        for(int i = 0; i < qb.questions.size(); i++){

            int section = i / 10;

            qb.questions.get(i).getQuestion();
            qb.questions.get(i).getOptions();

            System.out.println("Enter Option (A/B/C/D): ");
            String answer = ans.next();

            boolean a = qb.questions.get(i).checkAnswer(answer);

            answerArray[i] = a;

            if(!a){
                System.out.println("Wrong Answer! Game Over");
                saveAnswer(i, false);
                gameWon=false;
                System.out.println("Game Over!");
                System.out.println("Returning to main menu...");
                break;
            }else{
                System.out.println("Correct Answer!");
                saveAnswer(i, true);
            }

            // SECTION COMPLETION
            if(i % 10 == 9){
                prize += (sectionReward[section]*10);

                System.out.println("Section " + (section+1) + " Cleared!");
                System.out.println("Prize Won: " + sectionReward[section]);

                savePrize(prize);
            }
        }
        int finalPrize = prize;
        String email = Main.savedEmail; // or pass email properly
        sendFinalEmail(email, finalPrize, gameWon);
    }
}