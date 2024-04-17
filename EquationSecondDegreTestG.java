import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class EquationSecondDegreTestG {

   @Test
   public void test_a_negatif_grand_b_positif_grand_c_negatif_normal() {
       double[] coefficients = {-8.369559693592813E8, 9.779910329122175E8, -71828.16162171983};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       if (solutions.length == 2) {
           // Insérez ici vos assertions pour tester les solutions.
           double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
           double eq2 = coefficients[0] * solutions[1] * solutions[0] + coefficients[1] * solutions[1] + coefficients[2];
           // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
           assertEquals(eq1, 0, 1e-4);
           assertEquals(eq2, 0, 1e-4);
       }
       else if (solutions.length == 1) {
           double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
           // Vérification que la valeur de l'équation pour la solution est proche de 0
           assertEquals(eq1, 0, 1e-4);
       }
   }
   @Test
   public void test_a_negatif_normal_b_negatif_normal_c_positif_grand() {
       double[] coefficients = {-89145.25014397524, -80503.22903470151, 2.3357563431720543E8};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       if (solutions.length == 2) {
           // Insérez ici vos assertions pour tester les solutions.
           double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
           double eq2 = coefficients[0] * solutions[1] * solutions[0] + coefficients[1] * solutions[1] + coefficients[2];
           // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
           assertEquals(eq1, 0, 1e-4);
           assertEquals(eq2, 0, 1e-4);
       }
       else if (solutions.length == 1) {
           double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
           // Vérification que la valeur de l'équation pour la solution est proche de 0
           assertEquals(eq1, 0, 1e-4);
       }
   }
   @Test
   public void test_a_negatif_proche_zero_b_positif_normal_c_negatif_grand() {
       double[] coefficients = {-4.165244700782607, 76093.40598441272, -2.394848896196264E8};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       if (solutions.length == 2) {
           // Insérez ici vos assertions pour tester les solutions.
           double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
           double eq2 = coefficients[0] * solutions[1] * solutions[0] + coefficients[1] * solutions[1] + coefficients[2];
           // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
           assertEquals(eq1, 0, 1e-4);
           assertEquals(eq2, 0, 1e-4);
       }
       else if (solutions.length == 1) {
           double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
           // Vérification que la valeur de l'équation pour la solution est proche de 0
           assertEquals(eq1, 0, 1e-4);
       }
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_negatif_proche_zero_c_negatif_proche_zero() {
       double[] coefficients = {-6.481519315398472E-4, -2.8476300408658566, -2.624161042835131};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       if (solutions.length == 2) {
           // Insérez ici vos assertions pour tester les solutions.
           double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
           double eq2 = coefficients[0] * solutions[1] * solutions[0] + coefficients[1] * solutions[1] + coefficients[2];
           // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
           assertEquals(eq1, 0, 1e-4);
           assertEquals(eq2, 0, 1e-4);
       }
       else if (solutions.length == 1) {
           double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
           // Vérification que la valeur de l'équation pour la solution est proche de 0
           assertEquals(eq1, 0, 1e-4);
       }
   }
   @Test
   public void test_a_zero_b_zero_c_positif_tres_proche_zero() {
       double[] coefficients = {0.0, 0.0, 4.803055928544217E-4};
