public class arrayIndexOutOfBounds {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            a[10] = 10;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This array index doesn't exists");
        }
    }
}
