public class Ex7 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Veuillez fournir un nombre en argument.");
            return;
        }
        int n = Integer.parseInt(args[0]);
        if (n < 2) {
            System.out.println(n + " n'est pas un nombre premier");
            return;
        }
        boolean estPremier = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
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
