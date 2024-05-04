package inheritance;

public class Main {
    public static void main(String[] args) {
        Nexon nexon = new Nexon(2, "round");
        nexon.isElectric = true;

//        TataHarier harier = new TataHarier(4, "rectangle");
//        harier.isElectric = false;

        System.out.println(nexon.toString());
//        System.out.println(harier.toString());
    }
}
