import java.util.ArrayList;
import java.util.Collections;

public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(9);
        arrayList.add(-7);
        arrayList.add(0);
        // before sorting
        System.out.println(arrayList);

        Collections.sort(arrayList);
        //afters sorting
        System.out.println(arrayList);

        Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println(arrayList);


    }
}
