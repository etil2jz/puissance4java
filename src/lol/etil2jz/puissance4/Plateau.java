package lol.etil2jz.puissance4;

public class Plateau {

    private int hauteur;
    private int largeur;
    private int[][] tableau;

    // Constructeur
    public Plateau(int hauteur, int largeur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.tableau = new int[hauteur][largeur];
    }

    /*public void affichage() {
        
    }*/

    
    public void affichage() {

        System.out.print(Couleur.palette("cyan")+"+--");
        for (int i = 1; i <= largeur; i++) {
            System.out.print(i + "--");
        }
        System.out.println("+"+Couleur.palette(""));
    
        for (int i = 0; i < hauteur; i++) {
            System.out.print(Couleur.palette("cyan")+"|  "+ Couleur.palette(""));
            for (int j = 0; j < largeur; j++) {
                System.out.print(tableau[i][j] + "  ");
            }
            System.out.println(Couleur.palette("cyan")+"|"+ Couleur.palette(""));
        }
        System.out.print(Couleur.palette("cyan")+"+--");
        for (int i = 1; i <= largeur; i++) {
            System.out.print(i + "--");
        }
        System.out.println("+"+Couleur.palette(""));
    }
    
    
}
