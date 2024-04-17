import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class EquationTestGenerator {
    public static ArrayList<String[]> readLines(String fileName) {
        ArrayList<String[]> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            br.lines().forEach(line -> {
                String[] parts = line.split(" ");
                for (int i = 0; i < parts.length; i++) {
                    parts[i] = parts[i].replaceAll("\\d", "");
                    
                }
                System.err.println(parts[0] +" "+ parts[1]+" "+ parts[2]);
                result.add(parts);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }



    public ArrayList< ArrayList<HashMap<String, Object>>> mapVal(ArrayList<String[]> input) {
        ArrayList< ArrayList<HashMap<String, Object>>> result = new ArrayList<>();
        for (String[] pair : input) {
            double val = 0.0;
            String label = "";
            ArrayList<HashMap<String, Object>> mappedPair = new ArrayList<HashMap<String, Object>>();
            System.err.println(pair[0]+" "+pair[1]+" "+pair[2] );
            for (int i = 0; i < pair.length; i++) {
                String pre;
                if (i == 0) {
                    pre = "a";
                } else if (i == 1) {
                    pre = "b";
                } else {
                    pre = "c";
                }
                HashMap<String, Object> tmp = new HashMap<>();
                switch (pair[i]) {
                    case "a":
                        val = ThreadLocalRandom.current().nextDouble(-Math.pow(10, 9), -Math.pow(10, 5));
                        label = pre +"_negatif_grand";
                        break;
                    case "b":
                        val = ThreadLocalRandom.current().nextDouble(-Math.pow(10, 5), -Math.pow(10, 2));
                        label = pre +"_negatif_normal";
                        break;
                    case "c":
                        val = ThreadLocalRandom.current().nextDouble(-5, -1);
                        label = pre +"_negatif_proche_zero";
                        break;
                    case "d":
                        val = ThreadLocalRandom.current().nextDouble(-Math.pow(10, -3), -Math.pow(10, -4));
                        label = pre +"_negatif_tres_proche_zero";
                        break;
                    case "e":
                        val = 0;
                        label = pre +"_zero";
                        break;
                    case "f":
                        val = ThreadLocalRandom.current().nextDouble(Math.pow(10, -4), Math.pow(10, -3));
                        label = pre +"_positif_tres_proche_zero";
                        break;
                    case "g":
                        val = ThreadLocalRandom.current().nextDouble(1, 5);
                        label = pre +"_positif_proche_zero";
                        break;
                    case "h":
                        val = ThreadLocalRandom.current().nextDouble(Math.pow(10, 2), Math.pow(10, 5));
                        label = pre +"_positif_normal";
                        break;
                    case "i":
                        val = ThreadLocalRandom.current().nextDouble(Math.pow(10, 5), Math.pow(10, 9));
                        label = pre +"_positif_grand";
                        break;
                    default:

                        break;
                }
                tmp.put("val", val);
                tmp.put("label", label);
                mappedPair.add(tmp);
            }
            result.add(mappedPair);
        }
        return result;
    }


        public void generateTestClass(ArrayList< ArrayList<HashMap<String, Object>>> input) {
    
            try (PrintWriter out = new PrintWriter("EquationSecondDegreTestG.java")) {
                out.println("import static org.junit.Assert.assertEquals;");
                out.println("import org.junit.Test;");
                out.println("import static org.junit.Assert.assertThrows;");
                out.println("import static org.junit.Assert.assertTrue;");
                out.println("");
                out.println("public class EquationSecondDegreTestG {");
                out.println("");
    
                for (ArrayList<HashMap<String, Object>> pair : input) {
                    out.println("   @Test");
                    out.println("   public void test_"+ pair.get(0).get("label")+"_"+pair.get(1).get("label")+"_"+pair.get(2).get("label")+"() {");
                    out.println("       double[] coefficients = {"  + pair.get(0).get("val") + ", " + pair.get(1).get("val") +  ", " + pair.get(2).get("val") + "};");
                    double[] coefficients = {(double) pair.get(0).get("val"), (double) pair.get(1).get("val"), (double) pair.get(2).get("val")};
                    double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
                    if(pair.get(0).get("val").equals(new Double(0.0))){
                        out.println("       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);");
                        out.println("       assertTrue(ill.getMessage().equals(\"coef_A_peut_pas_etre_zero\"));");
                    }
                    else if (solutions != null){
                        out.println("       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);");
                        out.println("       if (solutions.length == 2) {");
                        out.println("           // Insérez ici vos assertions pour tester les solutions.");
                        out.println("           double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];");
                        out.println("           double eq2 = coefficients[0] * solutions[1] * solutions[0] + coefficients[1] * solutions[1] + coefficients[2];");
                        out.println("           // Vérification que les valeurs de l'équation pour les solutions sont proches de 0");
                        out.println("           assertEquals(eq1, 0, 1e-4);");
                        out.println("           assertEquals(eq2, 0, 1e-4);");
                        out.println("       }");
                        out.println("       else if (solutions.length == 1) {");
                        out.println("           double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];");
                        out.println("           // Vérification que la valeur de l'équation pour la solution est proche de 0");
                        out.println("           assertEquals(eq1, 0, 1e-4);");
                        out.println("       }");
                    }
                    else {
                        out.println("       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);");
                        out.println("       if (ill.getMessage().equals(\"pas_equation_solutions_reelles\")) {");
                        out.println("           assertTrue(ill.getMessage().equals(\"pas_equation_solutions_reelles\"));");
                        out.println("       } else {");
                        out.println("           fail(\"Exception non attendue : \" + e.getMessage());");
                        out.println("       }");
                    }
                out.println("   }");
                }
            out.println("}");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        
    public void run(){
        this.generateTestClass(mapVal(readLines("jenny.txt")));
    }
}
