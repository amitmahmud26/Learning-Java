import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class cricketer {
    public static void main(String[] args) throws Exception{
        String run1, run2, run3;
        FileWriter fileWriter = new FileWriter("cricketer.txt");
        fileWriter.write("Sakib" +" "+ "100" +" " + "5" + "\n");
        fileWriter.write("Tonmay"+" " + "10"+" " + "-2"+ "\n");
        fileWriter.write("Mushfique"+ " " + "55"+ " " + "0");

        fileWriter.close();

        try {
            File file = new File("cricketer.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {

                System.out.println(scanner.nextLine());

            }

        }
        catch (Exception e){

        }
        System.out.println();
        try {
            File file = new File("cricketer.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                scanner.next();
                run1 = scanner.next();
                scanner.next();
                scanner.next();
                run2 = scanner.next();
                scanner.next();
                scanner.next();
                run3 = scanner.next();

                int sum = Integer.parseInt(run1)+Integer.parseInt(run2)+Integer.parseInt(run3);
                System.out.println(sum);
            }
        }
        catch (Exception e){

        }
    }
}
