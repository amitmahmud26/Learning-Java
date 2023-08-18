import java.util.ArrayList;

public class arrayListObject {
    public static void main(String[] args) {
        person p1 = new person("Sabbir","078");
        person p2 = new person("Naim","057");
        ArrayList<person> personArrayList = new ArrayList<>();

        personArrayList.add(p1);
        personArrayList.add(p2);

        System.out.println(personArrayList.get(0).name);
        System.out.println(personArrayList.get(0).id);
        System.out.println(personArrayList.get(1).name);
        System.out.println(personArrayList.get(1).id);
    }
}

class person{
    String name, id;

    public person(String name, String id) {
        this.name = name;
        this.id = id;
    }
}
