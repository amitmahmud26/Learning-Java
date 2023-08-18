class A{
    int a;
    String b;

    A(){
        a = 213078;
        b = "Sabbir";

        System.out.println(a+" "+b);
    }

    A(A ref){
        this.a = ref.a;
        this.b = ref.b;

        System.out.println(a+" "+b);
    }

}
public class testCopyConstructor {
    public static void main(String[] args) {
        A p = new A();
        A q = new A();
    }
}
