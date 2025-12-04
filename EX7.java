public class Ex7 {
    public static void main(String[] args) {

        // Vérifier qu'un argument est fourni
        if (args.length == 0) {
            System.out.println("Veuillez fournir un nombre en argument.");
            return;
        }
nvertir l'argument en entier
        int n = Integer.parseInt(args[0]);
        if (n < 2) {
            System.out.println(n + " n'est pas un nombre premier");
            return;
        }
        boolean estPremier = true;
        for (int i = 2; i <= Math.sqrt(n); i++) { // optimisation jusqu'à sqrt(n)
            if (n % i == 0) {
                estPremier = false;
                break;
            }
        }
        //////////////////////Affichage 
        if (estPremier) {
            System.out.println(n + " est un nombre premier");
        } else {
            System.out.println(n + " n'est pas un nombre premier");
        }
    }
}