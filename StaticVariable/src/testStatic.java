class Student{
    String name;
    String id;
    static String universityName = "UIU";     //here static variable used

    Student(String name, String id){
        this.name = name;
        this.id = id;
    }
    void displayInfo(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(universityName);
    }
}
public class testStatic {
    public static void main(String[] args) {
        Student st1 = new Student("Sabbir", "011213078");
        st1.displayInfo();

        System.out.println();

        Student st2 = new Student("Amit", "011213070");
        st2.displayInfo();

        System.out.println(Student.universityName); // স্ট্যাটিক ভেরিয়েবল এর অবজেক্ট  ডিকলার করা লাগে না
                                                    // শুধু ক্লাস এর নাম.ভ্যারিয়েবল এর নাম লিখলেই হয়
                                                    //স্ট্যাটিক মেম্বার শুধু ক্লাস এর সাথে রিলেটেড. অবজেক্ট এর সাথে নয়
    }
}