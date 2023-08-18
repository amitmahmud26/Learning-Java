import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class throwsKeyword{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text");
        String input;
        Scanner scanner = new Scanner(file);
        input = scanner.nextLine();

        System.out.println(input);

        test t = new test();
        try { // it gives error if we don't put it in try catcha
            t.print1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        t.print2(); //no error because it throws runtimeException
    }
}

class test{
    void print1() throws Exception {

    }
    void print2() throws RuntimeException{

    }
}

// throws keyword just ignores compile time errors. but in run time the compiler ultimately shows the error.
