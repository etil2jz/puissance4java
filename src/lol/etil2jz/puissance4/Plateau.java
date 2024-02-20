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
        //initialiserTableau();
    }

    // Méthode pour initialiser le tableau
   /*  private void initialiserTableau() {
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < longueur; j++) {
                tableau[i][j] = i * longueur + j + 1;
            }
        }
    }*/

    public void affichage() {
        
    }

    /*
    public void affichage() {
        // Affichage de la première ligne avec les numéros de colonnes
        System.out.print("+--");
        for (int i = 1; i <= longueur; i++) {
            System.out.print(i + "--");
        }
        System.out.println("+\u001B[0m");
    
        // Affichage du reste du plateau avec les séparateurs et les valeurs
        for (int i = 0; i < hauteur; i++) {
            System.out.print("|  ");
            for (int j = 0; j < longueur; j++) {
                System.out.print(tableau[i][j] + "  ");
            }
            System.out.println("\u001B[36m|\u001B[0m");
        }
    
        // Affichage de la dernière ligne avec les séparateurs
        System.out.print("+--");
        for (int i = 1; i <= longueur; i++) {
            System.out.print(i + "--");
        }
        System.out.println("+ \u001B[0m");
    }
    */
}
