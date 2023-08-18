class Marks{
    String id;
    double quizMark;
    double midMark;
    double finalMark;

    Marks(String id, double quizMark, double midMark, double finalMark){
        this.id = id;
        this.quizMark = quizMark;
        this.midMark = midMark;
        this.finalMark = finalMark;
    }

    void passedOrNot(){
        if (quizMark+midMark+finalMark <= 55){
            System.out.println("failed");
        }
        else
        {
            System.out.println("passed");
        }
    }

}
public class Run{
        public static void main(String[] args){
            Marks mark = new Marks("011213078", 20.7, 30.0, 35);
             mark.passedOrNot();

    }
}