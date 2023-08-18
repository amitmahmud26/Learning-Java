import javax.swing.text.Style;
import java.util.Scanner;

public class testCT_3 {
    String words = "vallagena";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input_1 = scanner.nextLine();
        String input_2 = scanner.nextLine();

        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        Class3 class3 = new Class3();

        class1.camelCase();
        class2.camelCase();
        class3.distinctVowelCount();
        class3.concatenatedString();
    }
}
interface Case{
    void camelCase();
}

class Class1 implements Case{
    String words = "vallagena";
    @Override
    public void camelCase() {
        for (int i=0; i < words.length(); i++){
            if (i%2 == 0){
                words.toLowerCase();
            }
            if (i%2 != 0){
                words.toUpperCase();
            }
        }
    }
}
class Class2 implements Case{
    String words = "vallagena";
    @Override
    public void camelCase() {
        for (int i=0; i < words.length(); i++){
            if (i%2 != 0){
                words.toLowerCase();
            }
            if (i%2 == 0){
                words.toUpperCase();
            }
        }
    }
}


class Class3{
    int distinctVowelCount(){
        String words = "vallagena";
        words = words.toLowerCase();
        int count = 0;
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == 'a' || words.charAt(i) == 'e' || words.charAt(i) == 'i'
                    || words.charAt(i) == 'o' || words.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
     void concatenatedString(){
            try {
                Scanner input2 = new Scanner(System.in);
                int in = input2.nextInt();
                String [] str = new String[in];
                if(in % 2 == 1){
                    throw new Exception();
                }
            } catch(StringIndexOutOfBoundsException e){
                System.out.println("Operation not possible");

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
     }
}
