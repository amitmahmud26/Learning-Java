public class DemoClass{

    private final double PI = 3.1416;
    class innerClass{
        void calculateArea(double radius){
            double area = PI*radius*radius;
            System.out.println("Area: " + area);
        }
    }
    public static void main(String [] args) {
        DemoClass demoClass = new DemoClass();
        DemoClass.innerClass ic = demoClass.new innerClass();
        ic.calculateArea(5.0);
    }
}