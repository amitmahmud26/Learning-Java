public class constructor {
    String name;
    int id;

    constructor(){
    }
    constructor(String name,int id){
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(name);
        System.out.println(id);
    }
    int display(int x){

        System.out.println(x);
        return x;
    }

    public static void main(String[] args) {
        constructor cn = new constructor();
        constructor cn1 = new constructor("sabbir",2001);
        cn1.display();
        cn1.display(888);
        baire b1 = new baire(28);
        b1.display1();

    }
}
class baire extends constructor{
    int age;
    baire(int age){
        this.age = age;
    }
    void display1(){
        display(678);
        System.out.println(age);
    }
}
