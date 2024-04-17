import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class EquationSecondDegreTestG {

   @Test
   public void test_a_negatif_grand_b_positif_grand_c_negatif_normal() {
       double[] coefficients = {-9.056757296046199E8, 9.141061658406802E8, -99846.9499530504};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_normal_b_negatif_normal_c_positif_grand() {
       double[] coefficients = {-33565.73375259127, -12166.697524213145, 7.477648472026349E8};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_proche_zero_b_positif_normal_c_negatif_grand() {
       double[] coefficients = {-1.2181424048058669, 41713.112898239175, -7.195577273973804E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_negatif_proche_zero_c_negatif_proche_zero() {
       double[] coefficients = {-1.5447202165825972E-4, -2.973440182179762, -1.886493036082301};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_zero_b_zero_c_positif_tres_proche_zero() {
       double[] coefficients = {0.0, 0.0, 9.298045151351442E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_positif_proche_zero_c_zero() {
       double[] coefficients = {9.83778740501924E-4, 2.1033180060714423, 0.0};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_proche_zero_b_negatif_grand_c_positif_normal() {
       double[] coefficients = {2.8087111050095057, -5.663726433828442E8, 94529.40609093635};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_normal_b_negatif_tres_proche_zero_c_negatif_tres_proche_zero() {
       double[] coefficients = {74848.71788470987, -4.553961885710013E-4, -6.630731227445014E-4};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_grand_b_positif_tres_proche_zero_c_positif_proche_zero() {
       double[] coefficients = {9.908436899826421E7, 6.927748815823684E-4, 1.5348349461977162};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_grand_b_negatif_grand_c_positif_grand() {
       double[] coefficients = {-9.639894018452697E8, -3.303010865364678E8, 4.836770932756526E8};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_normal_b_negatif_grand_c_negatif_tres_proche_zero() {
       double[] coefficients = {-30279.733499858834, -3.484053497873081E8, -8.462911862146625E-4};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_proche_zero_b_negatif_grand_c_zero() {
       double[] coefficients = {-1.1867591513924705, -9.51777291678206E8, 0.0};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_negatif_grand_c_negatif_normal() {
       double[] coefficients = {-1.2464046980420907E-4, -3.193668743952402E8, -73466.90025978997};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_zero_b_negatif_grand_c_negatif_grand() {
       double[] coefficients = {0.0, -1.2942028883240652E8, -6.327911579532202E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_negatif_grand_c_positif_tres_proche_zero() {
       double[] coefficients = {2.252557755631757E-4, -2.0510608857127833E8, 7.700510809087882E-4};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_proche_zero_b_negatif_normal_c_positif_proche_zero() {
       double[] coefficients = {4.9307820883872555, -57703.369200759706, 2.4496154430796993};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_normal_b_negatif_grand_c_negatif_proche_zero() {
       double[] coefficients = {17140.02173645646, -5.752243693183455E8, -2.1057659256670362};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_grand_b_negatif_grand_c_positif_tres_proche_zero() {
       double[] coefficients = {2.4780694144858128E8, -1.3620159739906383E8, 4.5008336727071275E-4};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_grand_b_negatif_proche_zero_c_negatif_grand() {
       double[] coefficients = {-9.953951785668281E8, -1.7016267323433127, -9.512612935851456E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_grand_b_negatif_tres_proche_zero_c_zero() {
       double[] coefficients = {-2.1121404857844496E8, -4.1459504180496934E-4, 0.0};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_grand_b_zero_c_negatif_tres_proche_zero() {
       double[] coefficients = {-3.98580123082515E7, 0.0, -4.092776960483005E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_grand_b_positif_tres_proche_zero_c_negatif_proche_zero() {
       double[] coefficients = {-7.452695683336897E8, 6.66945436621998E-4, -2.180741427501404};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_grand_b_positif_proche_zero_c_positif_proche_zero() {
       double[] coefficients = {-8.608299806762891E8, 3.721323601621814, 3.6175053302228384};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_grand_b_positif_normal_c_positif_normal() {
       double[] coefficients = {-2.226251828503934E8, 31149.92049668647, 88702.6967663629};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_normal_b_positif_grand_c_negatif_proche_zero() {
       double[] coefficients = {-73138.86707392913, 7.794316419678644E8, -3.6891955920952433};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_proche_zero_b_zero_c_positif_grand() {
       double[] coefficients = {-3.3123004830950107, 0.0, 2.1180471720543188E8};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_positif_grand_c_positif_grand() {
       double[] coefficients = {-4.8350026097669456E-4, 7.93592247463903E8, 1.9586608289144182E8};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_zero_b_negatif_proche_zero_c_positif_grand() {
       double[] coefficients = {0.0, -2.9744144241881654, 4838961.496557015};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_positif_normal_c_positif_grand() {
       double[] coefficients = {2.622592229836604E-4, 99040.21521195622, 1.538404261138708E7};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_proche_zero_b_negatif_tres_proche_zero_c_positif_grand() {
       double[] coefficients = {2.31113146183733, -9.809292241045031E-4, 4.004818353666171E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_positif_normal_b_positif_tres_proche_zero_c_positif_grand() {
       double[] coefficients = {2700.7159286518936, 4.7387967381985264E-4, 8.99789744676951E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_positif_grand_b_positif_proche_zero_c_positif_grand() {
       double[] coefficients = {3.038108819934599E8, 1.5025166355994886, 4.4649859245345634E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_grand_b_negatif_normal_c_positif_tres_proche_zero() {
       double[] coefficients = {-3.877352130145757E8, -31863.695614921613, 5.64316740039442E-4};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_normal_b_negatif_tres_proche_zero_c_negatif_normal() {
       double[] coefficients = {-1939.3278826006572, -1.6890748222363086E-4, -55813.97147463573};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_zero_b_positif_grand_c_positif_normal() {
       double[] coefficients = {0.0, 5.115199139947954E8, 58397.60898191204};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_proche_zero_b_positif_grand_c_positif_proche_zero() {
       double[] coefficients = {-2.2621426226321115, 3.94431683045433E7, 2.5301191300989823};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_negatif_tres_proche_zero_c_positif_proche_zero() {
       double[] coefficients = {-6.719659398164792E-4, -6.295975559409275E-4, 3.052947320849415};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_zero_c_positif_proche_zero() {
       double[] coefficients = {8.242687517826381E-4, 0.0, 2.955945646679226};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_positif_proche_zero_b_negatif_proche_zero_c_positif_tres_proche_zero() {
       double[] coefficients = {2.2846601601568293, -2.447949400771144, 7.454381377849701E-4};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_normal_b_positif_normal_c_positif_proche_zero() {
       double[] coefficients = {80964.62567673324, 44689.1670034412, 1.4350004584528562};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_grand_b_negatif_tres_proche_zero_c_positif_normal() {
       double[] coefficients = {6.288276376704367E7, -5.673383666610198E-4, 91607.07044832094};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_zero_b_negatif_normal_c_zero() {
       double[] coefficients = {0.0, -28052.81962963073, 0.0};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_normal_b_positif_tres_proche_zero_c_positif_tres_proche_zero() {
       double[] coefficients = {-88233.8260028965, 8.40988470554472E-4, 3.626334085365196E-4};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_normal_b_positif_proche_zero_c_positif_normal() {
       double[] coefficients = {11192.80882442463, 1.5052268304379366, 99131.64131614797};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_positif_tres_proche_zero_c_negatif_grand() {
       double[] coefficients = {4.1471899677567573E-4, 9.986340914683717E-4, -2.0178445771649802E8};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_proche_zero_b_positif_tres_proche_zero_c_negatif_normal() {
       double[] coefficients = {-1.3291685395288724, 5.94842226427257E-4, -89030.85093761818};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_proche_zero_b_positif_proche_zero_c_negatif_tres_proche_zero() {
       double[] coefficients = {-3.5916260629786843, 4.197844883895734, -3.545339691630872E-4};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_positif_normal_c_zero() {
       double[] coefficients = {-7.046677258423083E-4, 65750.17921700707, 0.0};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_proche_zero_b_positif_normal_c_negatif_tres_proche_zero() {
       double[] coefficients = {2.6612028461003727, 63158.96316442293, -7.780453761078482E-4};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_grand_b_positif_grand_c_negatif_tres_proche_zero() {
       double[] coefficients = {5.243385974230802E8, 3.222218919213404E8, -9.669351337721527E-4};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_negatif_normal_c_negatif_tres_proche_zero() {
       double[] coefficients = {2.196791788835908E-4, -49065.50764093672, -2.926935814117249E-4};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_normal_b_negatif_proche_zero_c_positif_proche_zero() {
       double[] coefficients = {-6490.795470409183, -3.70767048326311, 2.5253442467864606};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_normal_b_zero_c_positif_normal() {
       double[] coefficients = {-9919.46985624796, 0.0, 7995.750297927151};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_negatif_tres_proche_zero_c_negatif_grand() {
       double[] coefficients = {2.4830392836829317E-4, -9.956223666282447E-4, -5.37006559586978E8};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_grand_b_zero_c_negatif_normal() {
       double[] coefficients = {9.139660343280903E8, 0.0, -7009.048587971469};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_proche_zero_b_positif_proche_zero_c_negatif_proche_zero() {
       double[] coefficients = {1.773649418685232, 1.5414289874390326, -3.5974936534182773};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_negatif_normal_c_negatif_grand() {
       double[] coefficients = {-3.3456294699957213E-4, -95779.83212869224, -5.0431029265951544E8};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_zero_b_positif_tres_proche_zero_c_positif_proche_zero() {
       double[] coefficients = {0.0, 1.678558655014394E-4, 4.115192263237447};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_normal_b_positif_grand_c_zero() {
       double[] coefficients = {12278.207981117428, 4.353875421604542E8, 0.0};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_negatif_proche_zero_c_negatif_normal() {
       double[] coefficients = {2.315460284510214E-4, -4.250537864530663, -43271.92169426515};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_grand_b_negatif_normal_c_negatif_proche_zero() {
       double[] coefficients = {5.765414129582431E8, -95999.05307833632, -2.699478237354244};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_normal_b_positif_proche_zero_c_negatif_grand() {
       double[] coefficients = {-2898.419277490233, 3.0027127727524623, -8.672868107167673E7};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_positif_normal_c_positif_tres_proche_zero() {
       double[] coefficients = {-8.992914515442182E-4, 28073.571066136356, 8.938546096583414E-4};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_proche_zero_b_negatif_normal_c_positif_normal() {
       double[] coefficients = {-3.335743025483547, -55595.32431744388, 6614.267185528616};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_zero_b_positif_normal_c_negatif_tres_proche_zero() {
       double[] coefficients = {0.0, 58111.742746383126, -6.683631913441375E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_proche_zero_b_zero_c_negatif_normal() {
       double[] coefficients = {4.615121943261242, 0.0, -6552.045491782745};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_normal_b_zero_c_negatif_grand() {
       double[] coefficients = {10644.363502272245, 0.0, -8.308055426318607E8};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_grand_b_negatif_proche_zero_c_zero() {
       double[] coefficients = {9.49195507429304E7, -1.444820780563158, 0.0};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_proche_zero_b_negatif_tres_proche_zero_c_negatif_proche_zero() {
       double[] coefficients = {-4.581323680778985, -1.9650169070599497E-4, -1.4901243205009638};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_positif_tres_proche_zero_c_positif_normal() {
       double[] coefficients = {-8.142186985168451E-4, 9.121977530296902E-4, 97164.38438930953};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_normal_b_negatif_normal_c_negatif_normal() {
       double[] coefficients = {39019.132386216326, -78897.34899079104, -78845.11773950495};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_normal_b_positif_grand_c_positif_tres_proche_zero() {
       double[] coefficients = {55531.79109959118, 8.354319274633789E8, 7.915368132858431E-4};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_zero_b_positif_proche_zero_c_negatif_normal() {
       double[] coefficients = {0.0, 2.815586325349636, -37381.02694732302};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_proche_zero_b_positif_grand_c_negatif_grand() {
       double[] coefficients = {3.030364825806637, 9.10381047138704E8, -4.0210696014857936E8};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_normal_b_negatif_proche_zero_c_negatif_tres_proche_zero() {
       double[] coefficients = {63081.552886056495, -2.1852788633789597, -5.509269026710028E-4};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_normal_b_positif_normal_c_negatif_proche_zero() {
       double[] coefficients = {-95496.03459170819, 39871.21519079497, -3.601209664115305};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_proche_zero_b_positif_tres_proche_zero_c_zero() {
       double[] coefficients = {2.4084165107051714, 5.03234232805631E-4, 0.0};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_zero_c_zero() {
       double[] coefficients = {-3.391369304635626E-4, 0.0, 0.0};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       // Vérification que la valeur de l'équation pour la solution est proche de 0
       assertEquals(eq1, 0, 1e-4);
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_positif_grand_c_negatif_proche_zero() {
       double[] coefficients = {6.090263004579952E-4, 8.419763804966102E8, -3.875471244572387};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_proche_zero_b_negatif_tres_proche_zero_c_positif_tres_proche_zero() {
       double[] coefficients = {-3.069487396709289, -5.283712619250948E-4, 9.652157016500906E-4};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_positif_proche_zero_c_negatif_tres_proche_zero() {
       double[] coefficients = {-4.919805888735715E-4, 1.5137307422445812, -4.875709196039736E-4};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_zero_b_negatif_tres_proche_zero_c_negatif_proche_zero() {
       double[] coefficients = {0.0, -5.422495546633844E-4, -4.073234974108575};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_grand_b_positif_normal_c_negatif_grand() {
       double[] coefficients = {2.730070484615825E8, 15382.577945527546, -5.205627883769124E8};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_proche_zero_b_negatif_proche_zero_c_positif_normal() {
       double[] coefficients = {-1.54702914865078, -2.2128850908721116, 3188.3283624521937};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_normal_b_negatif_normal_c_zero() {
       double[] coefficients = {-56722.00620278784, -94236.19755260409, 0.0};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_negatif_grand_c_positif_normal() {
       double[] coefficients = {7.214037960520327E-4, -7.171922083038425E7, 91321.0170072726};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_positif_proche_zero_b_negatif_grand_c_positif_proche_zero() {
       double[] coefficients = {2.3108808685819, -6.34231501612103E7, 1.7192794529020725};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_zero_c_negatif_proche_zero() {
       double[] coefficients = {-9.309247984485392E-4, 0.0, -1.9943721424704708};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_normal_b_positif_tres_proche_zero_c_negatif_tres_proche_zero() {
       double[] coefficients = {-42331.02431401284, 1.6953392343404432E-4, -8.166849991845907E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_positif_proche_zero_c_positif_tres_proche_zero() {
       double[] coefficients = {1.9248290250483262E-4, 1.2257562416509238, 7.582227227798792E-4};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_positif_normal_c_negatif_normal() {
       double[] coefficients = {-1.0301842330552363E-4, 25930.64429925719, -29803.272603600824};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
}
