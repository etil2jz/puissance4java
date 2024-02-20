package lol.etil2jz.puissance4;

public class Puissance4 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello Word!");

        Plateau plateau = new Plateau(6, 7);
        
        Thread.sleep(3000);
        Utils.clearScreen();
        System.out.println("Ceci est un test");
        plateau.affichage();
        //Thread.sleep(3000);
        //Utils.clearScreen();

    }
}
