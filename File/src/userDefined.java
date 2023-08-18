import java.util.Formatter;
import java.util.Scanner;

public class userDefined {
    public static void main(String[] args) {
        String id, name;
        Scanner scanner =  new Scanner(System.in);
        System.out.print("enter your id:");
        id = scanner.next();
        System.out.print("enter your name:");
        name = scanner.next();
        try {
            Formatter formatter = new Formatter("person/Teacher.txt");
            formatter.format("%s,%s\n",id,name);

            formatter.close();
        }
        catch (Exception e){
            System.out.println("file not found");
        }
    }
}
