package lol.etil2jz.puissance4;

public class Utils {

    // Vider le terminal
    public static final void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
