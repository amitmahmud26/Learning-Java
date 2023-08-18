package Abstract;
 abstract class SendMessage {
    abstract void sendMessage();
}

class Rahim extends SendMessage{
    @Override
    void sendMessage() {
        System.out.println("I am Rahim");
    }
}

class Karim extends SendMessage{
    @Override
    void sendMessage() {
        System.out.println("I am Karim");
    }
}

public class Message{
    public static void main(String[] args) {
        SendMessage SM = new Rahim();
        SM.sendMessage();

        SendMessage SM2 = new Karim();
        SM2.sendMessage();
    }

}
