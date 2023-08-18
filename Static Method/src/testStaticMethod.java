class staticMethod{
    int x = 1;

    {
        System.out.println("a");
    }
    void display1(){
        display2(); System.out.println(x); // can be called as non-static methods has no restriction like this.

        System.out.println("This is a non static method");
    }

    static {  // static blocks executes at the very beginning
        System.out.println("b");
    }

    static void display2(){
//        display1(); System.out.println(x);  **can't be called. go to restriction no 1

        System.out.println("This is a static method");
    }
}
public class testStaticMethod {
    public static void main(String[] args) {
        staticMethod st = new staticMethod();
        st.display1(); // এখানে অবজেক্ট বানানোর পরে নন স্ট্যাটিক মেথড কে কল করা হইছে

        staticMethod.display2(); // এখানে স্ট্যাটিক মেথড কল করতে অবজেক্ট বানাতে হয়নাই. ডাইরেক্ট ক্লাস.মেথড এর নাম দিলেই হইছে

    }
}

// Restrictions for non-static methods:

//1. static method cant access non-static member.
//2. this and super keyword cant be used here.

//but any static method can call any other static method or variable easily.


//*** static block will always be executed at the first and normal blocks are executed sequentially