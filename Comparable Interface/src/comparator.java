//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class comparator {
//    public static void main(String[] args) {
//        ArrayList<student> students = new ArrayList<>();
//        students.add(new student("Sabbir","19"));
//        students.add(new student("Naim","99"));
//        students.add(new student("Fahad","69"));
//
//        students.sort(new Comparator<student>(){
//            @Override
//            public int compare(student s1, student s2) {
//                if (s1.marks < s2.marks) return -1;
//                else if (s1.marks > s2.marks) return 1;
//                return 0;
//            }
//        });
////        Collections.sort(students,(s1,s2) -> {
////            return s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0;
////        });
//        for(student s : students){
//            System.out.println(s);
//        }
//    }
//}
//
//class student{
//    String name, marks;
//
//    public student(String name, String marks) {
//        this.name = name;
//        this.marks = marks;
//    }
//}
