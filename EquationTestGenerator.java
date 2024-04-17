import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class EquationTestGenerator {

    /**
     * Cette méthode lit un fichier texte et retourne son contenu sous forme d'une liste de tableaux de chaînes de caractères.
     * Chaque tableau représente une ligne du fichier, où chaque élément est un mot sans chiffres.
     * 
     * @param fileName Le nom du fichier à lire.
     * @return Une liste contenant les lignes du fichier, chaque ligne étant représentée par un tableau de mots sans chiffres.
     */
    public static ArrayList<String[]> readLines(String fileName) {
        // Crée une liste pour stocker les lignes lues
        ArrayList<String[]> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // Lit chaque ligne du fichier
            br.lines().forEach(line -> {
                // Divise la ligne en parties en utilisant l'espace comme délimiteur
                String[] parts = line.split(" ");
                for (int i = 0; i < parts.length; i++) {
                    // Supprime tous les chiffres de chaque partie
                    parts[i] = parts[i].replaceAll("\\d", "");
                }
                // Ajoute les parties traitées à la liste résultante
                result.add(parts);
            });
        } catch (IOException e) {
            // En cas d'erreur de lecture du fichier, affiche la trace de l'exception
            e.printStackTrace();
        }
        // Retourne la liste résultante contenant les lignes du fichier
        return result;
    }


    /**
     * Cette méthode prend une liste de tableaux de chaînes de caractères en entrée
     * et retourne une structure de données complexe contenant les valeurs mappées avec des étiquettes.
     * Chaque tableau de chaînes de caractères est traité comme une paire de valeurs représentant les coefficients d'une équation du second degré.
     * 
     * @param input La liste de tableaux de chaînes de caractères représentant les coefficients des équations du second degré.
     * @return Une liste de listes de mappages, où chaque mappage contient une valeur (val) et une étiquette (label) associée.
     */
    public ArrayList<ArrayList<HashMap<String, Object>>> mapVal(ArrayList<String[]> input) {
        // Initialisation du résultat
        ArrayList<ArrayList<HashMap<String, Object>>> result = new ArrayList<>();
        
        // Parcours de chaque paire de coefficients dans la liste d'entrée
        for (String[] pair : input) {
            double val = 0.0; // Valeur à mapper
            String label = ""; // Étiquette associée à la valeur
            ArrayList<HashMap<String, Object>> mappedPair = new ArrayList<HashMap<String, Object>>(); // Paire de valeurs mappées
            
            // Parcours des éléments de la paire
            for (int i = 0; i < pair.length; i++) {
                String pre; // Préfixe pour l'étiquette
                // Détermination du préfixe en fonction de la position dans la paire
                if (i == 0) {
                    pre = "a";
                } else if (i == 1) {
                    pre = "b";
                } else {
                    pre = "c";
                }
                
                // Création d'un mapping pour la valeur en fonction de la chaîne de caractères de la paire
                HashMap<String, Object> tmp = new HashMap<>();
                switch (pair[i]) {
                    // Mappage des valeurs en fonction des chaînes de caractères
                    case "a":
                        val = ThreadLocalRandom.current().nextDouble(-Math.pow(10, 9), -Math.pow(10, 5));
                        label = pre + "_negatif_grand";
                        break;
                    case "b":
                        val = ThreadLocalRandom.current().nextDouble(-Math.pow(10, 5), -Math.pow(10, 2));
                        label = pre + "_negatif_normal";
                        break;
                    case "c":
                        val = ThreadLocalRandom.current().nextDouble(-5, -1);
                        label = pre + "_negatif_proche_zero";
                        break;
                    case "d":
                        val = ThreadLocalRandom.current().nextDouble(-Math.pow(10, -3), -Math.pow(10, -4));
                        label = pre + "_negatif_tres_proche_zero";
                        break;
                    case "e":
                        val = 0;
                        label = pre + "_zero";
                        break;
                    case "f":
                        val = ThreadLocalRandom.current().nextDouble(Math.pow(10, -4), Math.pow(10, -3));
                        label = pre + "_positif_tres_proche_zero";
                        break;
                    case "g":
                        val = ThreadLocalRandom.current().nextDouble(1, 5);
                        label = pre + "_positif_proche_zero";
                        break;
                    case "h":
                        val = ThreadLocalRandom.current().nextDouble(Math.pow(10, 2), Math.pow(10, 5));
                        label = pre + "_positif_normal";
                        break;
                    case "i":
                        val = ThreadLocalRandom.current().nextDouble(Math.pow(10, 5), Math.pow(10, 9));
                        label = pre + "_positif_grand";
                        break;
                    default:
                        break;
                }
                // Ajout de la valeur mappée et de son étiquette au mappage temporaire
                tmp.put("val", val);
                tmp.put("label", label);
                // Ajout du mappage temporaire à la paire de valeurs mappées
                mappedPair.add(tmp);
            }
            // Ajout de la paire de valeurs mappées à la liste résultante
            result.add(mappedPair);
        }
        // Retourne la liste de listes de mappages résultante
        return result;
    }


    /**
     * Cette méthode génère une classe de test pour la résolution d'équations du second degré, basée sur les données fournies en entrée.
     * Chaque ensemble de données en entrée est traité comme une paire de coefficients d'une équation du second degré.
     * La classe de test utilise JUnit pour vérifier le comportement de la méthode de résolution d'équations `resoudre`.
     * 
     * @param input La liste de listes de mappages, représentant les coefficients des équations du second degré mappés avec leurs étiquettes.
     */
    public void generateTestClass(ArrayList<ArrayList<HashMap<String, Object>>> input) {
        try (PrintWriter out = new PrintWriter("EquationSecondDegreTestG.java")) {
            // Début de la génération de la classe de test
            out.println("import static org.junit.Assert.assertEquals;");
            out.println("import org.junit.Test;");
            out.println("import static org.junit.Assert.assertThrows;");
            out.println("import static org.junit.Assert.assertTrue;");
            out.println("");
            out.println("public class EquationSecondDegreTestG {");
            out.println("");
            
            // Parcours de chaque ensemble de coefficients
            for (ArrayList<HashMap<String, Object>> pair : input){
                // Calcul du discriminant
                double discriminant = (double) pair.get(1).get("val") * (double) pair.get(1).get("val") - 4 * (double) pair.get(0).get("val") * (double) pair.get(2).get("val");
                
                // Début de la méthode de test pour la paire de coefficients actuelle
                out.println("   @Test");
                out.println("   public void test_"+ pair.get(0).get("label")+"_"+pair.get(1).get("label")+"_"+pair.get(2).get("label")+"() {");
                out.println("       double[] coefficients = {"  + pair.get(0).get("val") + ", " + pair.get(1).get("val") +  ", " + pair.get(2).get("val") + "};");
                
                // Gestion des différents cas de test en fonction du discriminant
                if((double) pair.get(0).get("val") == 0.0){
                    // Si le coefficient a est nul, on vérifie que l'exception appropriée est levée
                    out.println("       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));");
                    out.println("       assertTrue(ill.getMessage().equals(\"coef_A_peut_pas_etre_zero\"));");
                }
                else if(discriminant < 0){
                    // Si le discriminant est négatif, on vérifie que l'exception appropriée est levée
                    out.println("       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));");
                    out.println("       assertTrue(ill.getMessage().equals(\"pas_equation_solutions_reelles\"));");
                }
                else if(discriminant > 0) {
                    // Si le discriminant est positif, on vérifie les solutions et leurs équations
                    out.println("       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);");
                    out.println("       // Insérez ici vos assertions pour tester les solutions.");
                    out.println("       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];");
                    out.println("       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];");
                    out.println("       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0");
                    out.println("       assertEquals(eq1, 0, 1e-4);");
                    out.println("       assertEquals(eq2, 0, 1e-4);");
                }
                else if(discriminant == 0) {
                    // Si le discriminant est nul, on vérifie la solution et son équation
                    out.println("       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);");
                    out.println("       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];");
                    out.println("       // Vérification que la valeur de l'équation pour la solution est proche de 0");
                    out.println("       assertEquals(eq1, 0, 1e-4);");
                }

                // Fin de la méthode de test pour la paire de coefficients actuelle
                out.println("   }");
            }

            // Fin de la classe de test
            out.println("}");
        } catch (FileNotFoundException e) {
            // En cas d'erreur de création du fichier, affiche la trace de l'exception
            e.printStackTrace();
        }
    }

    /**
     * Cette méthode exécute le processus complet en utilisant les méthodes `readLines`, `mapVal`, et `generateTestClass`.
     * Elle lit les données à partir d'un fichier texte, les traite pour mapper les coefficients avec des valeurs, puis génère une classe de test pour tester la résolution d'équations du second degré basées sur ces données.
     */
    public void run() {
        // Exécution du processus complet
        // Lecture des données à partir du fichier texte
        ArrayList<String[]> lines = readLines("jenny.txt");
        // Traitement des données pour mapper les coefficients avec des valeurs
        ArrayList<ArrayList<HashMap<String, Object>>> mappedValues = mapVal(lines);
        // Génération d'une classe de test pour tester la résolution d'équations du second degré basées sur les données mappées
        generateTestClass(mappedValues);
    }

}
