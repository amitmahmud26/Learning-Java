abstract class Employee{
    String name;
    float salary;

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void printSalary();

}
class SuperStarEmployee extends Employee{
    public SuperStarEmployee(String name, float salary) {
        super(name, salary);
    }

    @Override

    void printSalary(){
        System.out.println("Name : " + name);
        System.out.println("with bonus amount "+ salary+salary*0.1);

    }
}
class StarEmployee extends Employee{

    public StarEmployee(String name, float salary) {
        super(name, salary);
    }


    @Override
    void printSalary() {
        System.out.println("Name : " + name);
        System.out.println("with bonus amount "+ salary+salary*0.05);
    }
}

public class testEmployee {
        public static void main (String[]args){
            Employee em1 = new SuperStarEmployee("Sabbir", 30000);
            em1.printSalary();
            Employee em2= new StarEmployee("Amit",25000);
            em2.printSalary();
        }
}