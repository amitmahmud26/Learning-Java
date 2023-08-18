interface Animal{
    public abstract void eat();
}

class Dog implements Animal{
    public void eat(){
        System.out.println("dog is eating");
    }
}

class Cat implements Animal{
    public void eat(){
        System.out.println("cat is eating");
    }
}

public class testInterface {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();

        Animal cat = new Cat();
        cat.eat();
    }
}