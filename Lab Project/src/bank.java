import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class bank {
    private String name;
    private int nid;
    private int password;
    private int acc_no;
    private float balance;
    private int log_in=0;
    Scanner input=new Scanner(System.in);

    ArrayList arrayList = new ArrayList<>();

    public void register(){
        System.out.println("Enter information for registration: ");
        System.out.println("Enter user name: ");

        this.name=input.nextLine();
        System.out.print("Enter your NID: ");
        try{
            this.nid=input.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Enter numbers only, NID number can't be character!");
        }
        this.acc_no=121+this.nid;
        try{
            System.out.println("Enter register fee: ");
            this.balance=input.nextFloat();
        }

        catch(ArithmeticException e){
            this.balance=00;
            System.out.println("Enter registration fee 500 "+ "You have "+this.balance);
        }
        catch(InputMismatchException e ){
            System.out.println("You have to pay registration fee, you can't use characters ");
        }
        System.out.println("Enter password: ");
        try{
            this.password=input.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("You can't use character");
        }

        System.out.println("Register successful");
    }
    void log_in() {
        int ac = 0;
        try {
            System.out.println("Enter account number for login: ");
            ac = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter integer");
        }
        try {
            System.out.println("Enter password for login: ");
            int pass = input.nextInt();
            if (this.nid == nid && this.acc_no == ac && this.password == pass) {
                System.out.print("Login successful");
                this.log_in = 1;
            } else {
                System.out.println("login failed");
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter accurate password");
        }
    }
    void logout(){
        this.log_in=0;
    }

    void deposit(){
        int amount = 0;
        System.out.println("Enter amount for deposit: ");
        try{
            amount=input.nextInt();

        }
        catch(InputMismatchException e ){
            e.getMessage();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        if(100<=amount){
            this.balance=this.balance+amount;
        }
        System.out.println("You have total amount: " + this.balance);

    }
    void accountInformation(){
        System.out.println(this.name);
        System.out.println(this.nid);
        System.out.println(this.acc_no);
        System.out.println(this.balance);

    }
    void interest(){
        int year;
        int total=0;
        System.out.println("Enter year of interest");
        year=input.nextInt();
        this.balance=this.balance-(float) (this.balance * 0.07);

        System.out.println("After 7 % interest you have balance : "+this.balance);

    }
    void search() throws IOException {
        System.out.println("Enter user id ");
        int suid=input.nextInt();
        System.out.println("Enter password ");
        int pas=input.nextInt();

        File file = new File("bankIdPass.txt");
        FileWriter fileWriter = new FileWriter(file,false);
        fileWriter.write(String.valueOf(suid)+" "+String.valueOf(pas));
        fileWriter.close();

        if(this.acc_no==suid && this.password==pas){
            System.out.println("User name : " + this.name);
            System.out.println("User account number "+ this.acc_no);
            System.out.println("Balance "+ this.balance);
        }
        else{
            System.out.println("You put the wrong password and account number .");
            System.out.println("Please try again ! with right account number and password");
        }
    }
    void withdraw(){
        int amount;
        System.out.println("Enter amount for withdraw :");
        amount=input.nextInt();
        if(this.balance>=amount){
            this.balance=this.balance-amount;
            System.out.println("After withdraw you have total amount : " + this.balance);
        }
        else{
            System.out.println("You don't have much money to withdraw");
            System.out.println("You have total amount :"+this.balance);
        }
    }


    public static void main(String[]args) throws IOException {
        Scanner in=new Scanner(System.in);
        bank bank[]=new bank[100];
        int count=0;
        for(int i=0;i<=bank.length;i++){
            bank[i]= new bank();
            count++;



            System.out.println("Enter an option for creating a bank account");
            while(true){
                System.out.println("Enter option");
                System.out.println("Enter 1 for register");
                System.out.println("Enter 2 for login");
                System.out.println("Enter 3 for deposit");
                System.out.println("Enter 4 for withdraw");
                System.out.println("Enter 5 for logout");
                System.out.println("Enter 6 for show user information");
                System.out.println("Enter 7 for show balance after interest : ");
                System.out.println("Enter 8 for search a persons information ");

                int option=in.nextInt();
                if(option==1){
                    bank[i].register();
                }
                else if(option==2){
                    bank[i].log_in();
                }
                else if (option==3){
                    bank[i].deposit();
                }
                else if(option==4){
                    bank[i].withdraw();
                }
                else if (option==5){
                    bank[i].logout();
                }
                else if (option==6){
                    bank[i].accountInformation();
                }
                else if (option==7){
                    bank[i].interest();
                }
                else if (option==8){
                    bank[i].search();
                }
                else {
                    System.out.println("Please choose a valid option! Try again!");
                }
            }
        }
    }
}