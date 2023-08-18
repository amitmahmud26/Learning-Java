abstract class Animal{
    public int legs;
    public Animal(int legs){
        this.legs = legs;
    }

    abstract void eat();

    void walk(){
        System.out.println("walk with "+legs+" legs");
    }
}

class Spider extends Animal{
    Spider(){
        super(8);
        System.out.println("All spiders have" +legs+ " legs");
    }
    void eat(){
        System.out.println("eat");
    }
}
public class testAnimal {
    public static void main(String[] args) {
        Animal ob;
        ob = new Spider();
        ob.walk();
    }
}
