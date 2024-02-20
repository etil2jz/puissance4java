package lol.etil2jz.puissance4;

public class Plateau {
    public static void build(){
        int hauteur = 6; // NB lignes
        int longeur = 7;//NB colonnes

        int[][] tableau = new int[hauteur][longeur];
    }
   public static void Affichage(Plateau p){ 

    int hauteur = 6; // NB lignes
    int longeur = 7;//NB colonnes

    for(int i = 0; i < hauteur; i++){
        for(int j = 0; j < longeur; j++) {
            p.tableau[i][j] = i*longeur + j +1;
        }
    }

    for(int i = 0; i < hauteur; i++){
        for(int j = 0; j < longeur; j++) {
            System.out.print(p.tableau[i][j] + "\t");
        }
        System.out.println();
    }
   }
}
