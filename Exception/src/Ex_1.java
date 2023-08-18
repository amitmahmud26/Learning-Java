import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        int x, y = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            x = scanner.nextInt();
            y = 100 / x;
        }
        catch (InputMismatchException e){
            x = 1;
            y = 1;
        }
        catch (ArithmeticException e){
            y = 100;
        }
        catch ( Exception e){
            System.out.println("This is the parent class");
        }
        finally {
            System.out.println("This will surely be executed");
        }
        System.out.println(y);
    }
}

//runtime exception e throws deya lage