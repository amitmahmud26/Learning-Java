abstract  class Shape {
    double dim1;
    double dim2;
    Shape(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    abstract void Area();
    void vallagena(){
        System.out.println("sghlfa");
    }
}

class Rectangle extends Shape{
    //dim1, dim2

    Rectangle(double dim1, double dim2){
        super(dim1,dim2);
    }
    void Area(){
        double result = dim1*dim2;
        System.out.println(result);
    }

}

class Triangle extends Shape{
    //dim1, dim2
    Triangle(double dim1, double dim2){
        super(dim1,dim2);
    }
    void Area(){
        double result = 0.5*dim1*dim2;
        System.out.println(result);
    }
}

class Circle extends Shape{
    //dim1,dim2
    Circle(double dim1){
        super(dim1,dim1);
    }
    void Area(){
        double result = dim1*dim2;
        System.out.println(result);
    }
}

public class testShape{
    public static void main(String[] args) {

        Shape rec = new Rectangle(3,5);
        rec.Area();

        Shape tri = new Triangle(3,5);
        tri.Area();

        Shape cir = new Circle(3);
        cir.Area();
    }
}


