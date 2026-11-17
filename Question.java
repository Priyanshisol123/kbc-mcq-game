public class Question{
    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    String correctOption;
    public void getQuestion(){
        System.out.println(question);
    }
    public void getOptions(){
        System.out.println("A. "+optionA);
        System.out.println("B. "+optionB);
        System.out.println("C. "+optionC);
        System.out.println("D. "+optionD);
    }
    public boolean checkAnswer(String answer){
        return answer.equals(correctOption);
    }
}