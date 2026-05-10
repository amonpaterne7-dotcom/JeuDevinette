import java.util.Random;
import java.util.Scanner;

public class jeuDevinette {
    public static void main(String[] args) {
        // Génère un nombre aléatoire entre 1 et 100
        int nombreSecret = new Random().nextInt(100) + 1;

        // Prépare la lecture des entrées clavier
        Scanner sc = new Scanner(System.in);

        // Message d'accueil
        System.out.println("Devinez un nombre entre 1 et 100 (10 essais max)");

        // Boucle pour les 10 essais
        for (int i = 1; i <= 10; i++) {
            System.out.print("Essai " + i + " : ");
            int proposition = sc.nextInt(); // Lecture du nombre proposé

            // Vérifie si la proposition est correcte
            if (proposition == nombreSecret) {
                System.out.println("Bravo ! Le nombre était " + nombreSecret);
                return; // Arrête le programme si gagné
            } else if (proposition < nombreSecret) {
                System.out.println("Trop petit !");
            } else {
                System.out.println("Trop grand !");
            }
        }

        // Si les 10 essais sont épuisés sans succès
        System.out.println("Perdu ! Le nombre était " + nombreSecret);

        // Ferme le scanner
        sc.close();
    }
}
