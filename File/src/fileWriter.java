import java.io.FileWriter;
public class fileWriter {
    public static void main(String args[]){
        int s = 100;
        try{
            FileWriter fw=new FileWriter("testOut2.txt",true);
            fw.write(String.valueOf(s));
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }
}