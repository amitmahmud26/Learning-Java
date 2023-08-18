class Area{
    private int length, width;
//    Area(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
    Area(){
        //Area(100);
    }
    int returnArea(){
        return length*width;
    }

}
public class rec {
    public static void main(String[] args) {
       // Area a = new Area(2,4);
        //System.out.println(a.returnArea());
        {
            System.out.println("The area A of a rectangle is given by the formula, A=lw, where l is the length and w is\n" +
                    "the width.");
        }
    }
}
