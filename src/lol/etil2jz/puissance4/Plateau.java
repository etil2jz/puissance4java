package lol.etil2jz.puissance4;

public class Plateau {
    private int hauteur; // Nombre de lignes
    private int longueur; // Nombre de colonnes
    private int[][] tableau;

    // Constructeur
    public Plateau(int hauteur, int longueur) {
        this.hauteur = hauteur;
        this.longueur = longueur;
        this.tableau = new int[hauteur][longueur];
    }

    public void affichage() {
        // Affichage de la première ligne avec les numéros de colonnes
        System.out.print("\u001b[36m+--");
        for (int i = 1; i <= longueur; i++) {
            System.out.print(i + "--");
        }
        System.out.println("+\u001B[0m");
    
        // Affichage du reste du plateau avec les séparateurs et les valeurs
        for (int i = 0; i < hauteur; i++) {
            System.out.print("\u001B[36m|  \u001B[0m");
            for (int j = 0; j < longueur; j++) {
                System.out.print(tableau[i][j] + "  ");
            }
            System.out.println("\u001B[36m|\u001B[0m");
        }
    
        // Affichage de la dernière ligne avec les séparateurs
        System.out.print("\u001b[36m+--");
        for (int i = 1; i <= longueur; i++) {
            System.out.print(i + "--");
        }
        System.out.println("+ \u001B[0m");
    }
    
}
