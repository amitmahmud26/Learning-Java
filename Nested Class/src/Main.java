 class outerClass{
    int x;
    void print(){
        System.out.println("Shit!");
    }
//    outerClass oc = new outerClass();
    abstract class innerClass{
        int y;
    }
}
public class Main {
    public static void main(String[] args) {
        outerClass oc = new outerClass();
//        outerClass.innerClass ic = oc.new innerClass();

    }
}

// inner class er object banate hole age outer class er object banate hobe
// pore sei object er reference e inner class er object banate hobe


