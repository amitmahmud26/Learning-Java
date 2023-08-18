interface A{
    public void print();
//    void hsvah(){
//        System.out.println();
//    }
}

interface B{
    public void print2();
}

class C implements A,B{
    @Override
    public void print() {
        System.out.println("Print anything.");
    }

    @Override
    public void print2() {
        System.out.println("habijabi");
    }
}

public class testMultipleInheritance {
    public static void main(String[] args) {
        C test = new C();
        test.print();
        test.print2();
    }
}
