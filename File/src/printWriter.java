import java.io.PrintWriter;

public class printWriter {
    public static void main(String[] args) throws Exception {
        int s = 666, n=555;
        PrintWriter printWriter = new PrintWriter("pritWWriter.txt");
        printWriter.println("vallagena ");
        printWriter.println(s);
        printWriter.println(n);
        printWriter.close();
    }


}
