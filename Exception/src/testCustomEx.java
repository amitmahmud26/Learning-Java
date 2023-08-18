import java.util.Scanner;

public class testCustomEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int number = scanner.nextInt();

            if (number >= 10){
//                Exception e = new Exception();
//                throw e;
                throw new myException("this is a custom message");
//                throw new Exception("this will print after printStackTrace");

            }
            System.out.println("the number is"+" " + number);
        }
        catch (myException e){
            e.printStackTrace();
//            System.out.println("Number is upper 10");
        }
//        catch (Exception e) {
//            System.out.println("The number should be under 10");
//        e.printStackTrace();
//        }
    }
}
class myException extends Exception{
    myException(String m){
        super(m); //this passes the string to the superclass and printStackTrace
        System.out.println("Number is upper 10(from constructor)");
    }
}
