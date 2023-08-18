class Shape{
    int x;
    int y;

    Shape(int x){
        this.x = x;
    }

    Shape(int x, int y){
        this.x = x;
        this.y = y;
    }

    void Show(){
        System.out.println();
    }

    void getInfo(){
        System.out.println("This is the info");
    }
}

class Square extends Shape{
    Square(int x){
        super(x);
    }
    void Show(){
        System.out.println("Square:");
    }
    void area(){
        System.out.println(x*x);
    }
}

class Rectangle extends Shape{
    Rectangle(int x, int y){
        super(x,y);
    }
    void Show(){
        System.out.println("Rectangle:");
    }
    void area(){
        System.out.println(x*y);
    }
}
public class Main {
    public static void main(String[] args) {
        Square s = new Square(5);
        s.Show();
        s.getInfo();
        s.area();

        Rectangle r = new Rectangle(4,5);
        r.Show();
        r.getInfo();
        r.area();
    }
}