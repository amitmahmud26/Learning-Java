class countStudent{
    static int count = 0;// এখানে স্ট্যাটিক থাকার কারণে একটা ভেরিয়েবল সব অবজেক্ট এর জন্য কাজ করছে. নয়তো প্রত্যেক ভেরিয়েবেল এর জন্য  এই কাউন্ট
                            // ভেরিয়েবেল আলাদা আলাদা হত. তাই প্রত্যেকবার 1 প্রিন্ট হইত.

    countStudent(){
        count++;
    }

    void totalStudent(){
        System.out.println(count);
    }
}

public class testCountStudent {
    public static void main(String[] args) {
        countStudent st1 = new countStudent();
        st1.totalStudent();

        countStudent st2 = new countStudent();
        st2.totalStudent();

        countStudent st3 = new countStudent();
        st3.totalStudent();
    }
}
