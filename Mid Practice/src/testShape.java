class Shape {
    void print() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape{
        void print(){
            System.out.println("This is rectangular shape");
        }
    }
class Circle extends Shape{
    void print(){
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle{
    void print(){
        System.out.println("Square is a rectangle");
    }
}

public class testShape {
    public static void main(String[] args) {
        Square ob1 = new Square();
        ob1.print();

        Rectangle ob2 = new Square();
        ob2.print();
    }
}