import java.util.Scanner;

interface superhero{
    abstract void initialGeneration();
    abstract void powerPlus() throws maxPower;

}
class Marvel implements superhero{
    String name;
    int power;

//    public void initial

    public Marvel(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public void initialGeneration() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String fullName = reader.nextLine();

        System.out.print(getInitials(fullName));
    }

    public static String getInitials(String fullName) {
        return fullName.substring(0,1).toUpperCase();
    }


    @Override
    public void powerPlus() throws maxPower{
        if (Marvel.called){
        power++;
        if (power > 5){
            throw new maxPower("Max Power Reached");
        }
        }

        if (DC){   //
            power = power + 2;
            if (power > 5){
                throw new maxPower("Max Power Reached");
            }
        }

    }
}

class DC{
    String name;
    int power;

    public DC(String name, int power) {
        this.name = name;
        this.power = power;
    }
}


public class Main {
    public static void main(String[] args) throws maxPower {

        superhero m = new Marvel("peter parker",3);
        m.powerPlus(); //output 4
        m.powerPlus();// output 5
        m.powerPlus(); // max power reached --exception
        m.powerPlus(); // max power reached -- exception
        m. initialGeneration(); // pp
        superhero d = (superhero) new DC("Clark Kent", 2);
        d.powerPlus(); // 4
        d.powerPlus();// max power reached --exception
        d.powerPlus(); // max power reached --exception
        d.powerPlus(); // max power reached -exception
        d. initialGeneration();// CK
    }
}

class maxPower extends Exception{
    public maxPower(String message) {
        super(message);
    }
}


