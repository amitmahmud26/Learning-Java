import java.util.Scanner;

public class AboutException{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num = scanner.nextInt();
        takeNumbers tn = new takeNumbers(num);

        try {
            tn.check();
        }
        catch (wrong_number_exception e){
            System.out.println(e);
        }

    }
}

class takeNumbers{
    int num;
    public takeNumbers(int num) {
        this.num = num;
    }

    void check() throws wrong_number_exception{
        if (num > 10){
            throw new wrong_number_exception("Input a number less than 10");
        }
        else {
            System.out.println("number has been taken");
        }
    }
}

class wrong_number_exception extends Exception{
    public wrong_number_exception(String message) {
        super(message);
    }
}