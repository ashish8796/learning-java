package inheritance;

public class Main {
    public static void main(String[] args) {
        Nexon nexon = new Nexon(2, "round");
        nexon.isElectric = true;
        Client client = new Client();

        client.defaultMethod();
        Car harier = new TataHarier(4, "rectangle");


        System.out.println(nexon.toString());
    }
}
