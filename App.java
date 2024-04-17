/**
 * La classe principale de l'application.
 * Elle contient le point d'entrée `main`, qui initialise et exécute le générateur de tests pour les équations du second degré.
 */
public class App {
    /**
     * Le point d'entrée de l'application.
     * Il initialise et exécute le générateur de tests pour les équations du second degré.
     * @param args Les arguments de la ligne de commande (non utilisés dans cette application).
     */
    public static void main(String[] args) {
        // Initialisation du générateur de tests pour les équations du second degré
        EquationTestGenerator etg = new EquationTestGenerator();
        // Exécution du générateur de tests
        etg.run();
    }
}

