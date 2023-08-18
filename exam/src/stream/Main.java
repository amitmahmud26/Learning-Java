package stream;


import java.util.Scanner;

class C1{
    public String uName;
    public int uId;
    private double uBalance;
    private int numberOfElements;

    public double get_uBalance() {
        return uBalance;
    }

    public void set_uBalance(double uBalance) {
        this.uBalance = uBalance;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public C1(String uName, int uId, double uBalance, int numberOfElements) {
        this.uName = uName;
        this.uId = uId;
        this.uBalance = uBalance;
        this.numberOfElements = numberOfElements;
    }

    void updateID(int uId){
        this.uId = uId;
    }

    void updateName(String uName){ ////
        this.uName = uName;
    }
    void watchID(){
        uBalance = uBalance - 50;
        numberOfElements = numberOfElements + 1;
    }
}

class C2 extends C1{
    public C2(String uName, int uId, double uBalance, int numberOfElements) {
        super(uName, uId, uBalance, numberOfElements);
    }

    void watchID(){
        super.get_uBalance();
        super.getNumberOfElements();
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        C2[] c2 = new C2[n];
        for(int i=0;i<=c2.length;i++){
            c2[i]= new C2("Ham",12,1300,2);

        C1 c1 = new C1("Sabbir",213078,500,2);

        c1.updateName("Sabbirrr");
        c1.updateID(213078);
        c1.watchID();

        C2 c3 =new C2("Amit",213055,300,2);

        c3.updateName("Amittt");
        c3.updateID(213077);
        c3.watchID();

    }
}
}
