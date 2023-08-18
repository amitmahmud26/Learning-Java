public class StaticBlock {
    public static int a = 5, b;
    public static int c;
    static {
        b = c * 4;
    }
    static {
        c = 5;
    }
    public static void main(String[] args) {
        new StaticBlock();
    }
}