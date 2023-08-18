class Box{
    double width, height, depth;

    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    void displayVol(){
        System.out.println(width*height*depth);
    }
}
public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10,10,10);
        box1.displayVol();

        Box box2 = new Box(30,20,10);
        box2.displayVol();

    }
}