//package PACKAGE_NAME;
//
//import java.util.Scanner;
//
//public class wrongNumber {
//    public static void main(String[] args) {
//        int num;
//        Scanner scanner = new Scanner(System.in);
//        num = scanner.nextInt();
//
//        takeNumber() tn = new takeNumber(num);
//
//        try {
//            tn.check();
//        }
//        catch (wrongNumEx ex){
//            ex.printStackTrace();
//        }
//    }
//}
//
//class takeNumber{
//    int num;
//    takeNumber(int num){
//        this.num = num;
//    }
//    void check() throws wrongNumEx{
//        if(num > 10){
//            throw wrongNumEx("put a number less than 10");
//        }
//        else {
//            System.out.println("number has been taken");
//        }
//    }
//}
//
//class wrongNumEx extends Exception{
//    wrongNumber(String message){
//        super(message);
//    }
//}