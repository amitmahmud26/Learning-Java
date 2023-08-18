import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class multipleUserDefined {
    public static void main(String[] args) {
        String id, name;

        try {
            Formatter formatter = new Formatter("person/students.txt");

            Scanner scanner = new Scanner(System.in);
            System.out.println("How many students?");
            int num = scanner.nextInt();

            for(int i = 0; i<num; i++){
                System.out.println("Enter ID:");
                id = scanner.next();
                System.out.println("Enter Name:");
                name = scanner.next();

                formatter.format("%s %s\n",id,name);
            }
            formatter.close();
            System.out.println("input finished!");
        }
        catch (Exception e){
            System.out.println("file not found");
        }
    }
}
