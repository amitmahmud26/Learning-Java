import java.util.Scanner;

public class takeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        takeAString string1 = new takeAString("vallagena");
    }
}

class takeAString{
    String string;
    public takeAString(String string) {
        this.string = string;
    }
    void string_1() throws takeStringException{
        if(string.isEmpty() == true){
            throw new takeStringException("write something");
        }
    }
}
class takeStringException extends Exception{
    public takeStringException(String msz) {
        super(msz);
    }
}