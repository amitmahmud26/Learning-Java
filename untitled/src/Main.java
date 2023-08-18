
class myClass{
     private int id;
     private String name;

     void setId(int id){
         this.id = id;
     }

     int getId(){
         return id;
     }

}

public class Main {
    public static void main(String[] args){
        myClass Sabbir = new myClass();


        Sabbir.setId(2345);
        int x = Sabbir.getId();
        System.out.println(x);
//        System.out.println(Sabbir.name);
    }
}

