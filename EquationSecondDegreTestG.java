import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class EquationSecondDegreTestG {

   @Test
   public void test_a_negatif_grand_b_positif_grand_c_negatif_normal() {
       double[] coefficients = {-4.562316837302635E8, 9.27638538664789E8, -32417.267275813225};
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
       double[] coefficients = {-61739.335399432435, -59251.100542998545, 6.51270714263757E8};
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
       double[] coefficients = {-3.9858680375147153, 42211.825400586575, -2.9184242844366777E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_negatif_proche_zero_c_negatif_proche_zero() {
       double[] coefficients = {-5.771676100539994E-4, -2.3482126485604478, -1.7343695590132682};
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
       double[] coefficients = {0.0, 0.0, 9.656874364506883E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_positif_proche_zero_c_zero() {
       double[] coefficients = {4.616779478299058E-4, 4.525099082636613, 0.0};
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
       double[] coefficients = {1.0119881535765392, -4.3133197647487724E8, 74734.95442328334};
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
       double[] coefficients = {7580.4741235995325, -3.7515968812518847E-4, -7.818186104869408E-4};
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
       double[] coefficients = {7.064139631967491E8, 1.0816255098287605E-4, 1.710702862743454};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_grand_b_negatif_grand_c_positif_grand() {
       double[] coefficients = {-1.8678549845193672E8, -8.18606890248204E8, 3.162794207870909E8};
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
       double[] coefficients = {-10233.874037955262, -6.34043740913681E8, -6.721419096940532E-4};
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
       double[] coefficients = {-1.06091687444591, -9.564976733359058E8, 0.0};
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
       double[] coefficients = {-9.913372905380122E-4, -6.885415485146164E8, -10408.995918094122};
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
       double[] coefficients = {0.0, -8.280828071127701E7, -4.691194943895112E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_negatif_grand_c_positif_tres_proche_zero() {
       double[] coefficients = {1.9720377076557866E-4, -8.59773385285209E8, 4.544663507677264E-4};
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
       double[] coefficients = {1.1484932545693485, -25896.064642240482, 3.2723552744564848};
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
       double[] coefficients = {77651.76617825766, -2.2782352755154002E8, -4.362886586139353};
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
       double[] coefficients = {2.669339887658461E8, -1.9681833319843853E8, 8.804258362838567E-4};
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
       double[] coefficients = {-8.25525772488371E8, -4.877036953529258, -8.08405803330692E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_grand_b_negatif_tres_proche_zero_c_zero() {
       double[] coefficients = {-7.682777583072468E8, -3.749274943495078E-4, 0.0};
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
       double[] coefficients = {-1.3017492836295128E7, 0.0, -9.801303496177578E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_grand_b_positif_tres_proche_zero_c_negatif_proche_zero() {
       double[] coefficients = {-9.567757906668854E8, 8.670386888663709E-4, -1.2063742032563547};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_grand_b_positif_proche_zero_c_positif_proche_zero() {
       double[] coefficients = {-9.160618021122015E8, 3.9358730605441385, 1.6836562075496655};
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
       double[] coefficients = {-8.916489713468876E8, 79876.47541069244, 19255.534828013897};
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
       double[] coefficients = {-4897.74260271911, 5.954761761815825E7, -4.9521060911773365};
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
       double[] coefficients = {-2.0007976224739865, 0.0, 9.993096531720783E8};
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
       double[] coefficients = {-3.372636890879334E-4, 7.437949227885803E8, 6.476625879525819E8};
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
       double[] coefficients = {0.0, -3.6321776973012914, 3.652564527926537E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_positif_normal_c_positif_grand() {
       double[] coefficients = {1.5826312699861373E-4, 8191.699796465368, 1.7763801968176952E8};
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
       double[] coefficients = {2.7442494270924125, -1.0602323640132398E-4, 3.756816941189962E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_positif_normal_b_positif_tres_proche_zero_c_positif_grand() {
       double[] coefficients = {17942.21288151231, 7.528028804288837E-4, 5.867534795658236E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_positif_grand_b_positif_proche_zero_c_positif_grand() {
       double[] coefficients = {3.2359128978331184E8, 4.2216919759908365, 6.658599864292275E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_grand_b_negatif_normal_c_positif_tres_proche_zero() {
       double[] coefficients = {-5.848894871716721E8, -4938.415940929757, 2.710254380164973E-4};
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
       double[] coefficients = {-18286.87882994335, -7.883376638637913E-4, -67668.77074682295};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_zero_b_positif_grand_c_positif_normal() {
       double[] coefficients = {0.0, 7.11921434650584E8, 75554.57865856763};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_proche_zero_b_positif_grand_c_positif_proche_zero() {
       double[] coefficients = {-4.269248122548863, 5.534985196925015E8, 2.7044371485097813};
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
       double[] coefficients = {-7.61755958261559E-4, -8.964811305013809E-4, 3.182849868683828};
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
       double[] coefficients = {1.0656885573582327E-4, 0.0, 3.739761095236641};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_positif_proche_zero_b_negatif_proche_zero_c_positif_tres_proche_zero() {
       double[] coefficients = {1.4499352569939439, -1.961112962727321, 9.30913045148383E-4};
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
       double[] coefficients = {78620.52027293481, 26848.052307559894, 3.9953143097905657};
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
       double[] coefficients = {9.818168325775741E8, -9.095135339063563E-4, 69507.79809787172};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_zero_b_negatif_normal_c_zero() {
       double[] coefficients = {0.0, -77457.36837196717, 0.0};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_normal_b_positif_tres_proche_zero_c_positif_tres_proche_zero() {
       double[] coefficients = {-66498.47026377318, 7.297773589390238E-4, 1.3076647769587918E-4};
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
       double[] coefficients = {22161.899414359523, 1.9461092863507345, 28011.185345769158};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_positif_tres_proche_zero_c_negatif_grand() {
       double[] coefficients = {6.212629436147153E-4, 5.784157485809442E-4, -7.378332878750029E8};
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
       double[] coefficients = {-1.6799661170108067, 6.204528214671784E-4, -73989.6745107577};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_proche_zero_b_positif_proche_zero_c_negatif_tres_proche_zero() {
       double[] coefficients = {-2.1348322315373687, 2.784883861930643, -2.3804666218213161E-4};
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
       double[] coefficients = {-5.827850106226E-4, 71013.9518563141, 0.0};
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
       double[] coefficients = {2.7770786466276287, 25433.656095588547, -4.949970205557394E-4};
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
       double[] coefficients = {5.108767755214905E8, 7.509219084032514E8, -7.526755272939565E-4};
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
       double[] coefficients = {9.401508944313047E-4, -38764.566165006385, -6.869780475724858E-4};
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
       double[] coefficients = {-26472.210432920678, -2.7114196398690673, 4.439238356473782};
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
       double[] coefficients = {-9049.552698105603, 0.0, 49936.23544253206};
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
       double[] coefficients = {3.2193068602764057E-4, -9.998005372742482E-4, -4.577950709677175E8};
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
       double[] coefficients = {8.432895833024912E8, 0.0, -85953.11374321798};
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
       double[] coefficients = {3.0012736630359953, 1.5838014042087685, -4.348425031437171};
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
       double[] coefficients = {-8.407842318705686E-4, -89223.24547918735, -1.2329718809125364E8};
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
       double[] coefficients = {0.0, 8.236035453209686E-4, 2.486958595980016};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_normal_b_positif_grand_c_zero() {
       double[] coefficients = {50208.88287851912, 6.25614245263599E8, 0.0};
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
       double[] coefficients = {4.268382216875592E-4, -2.475139763437445, -2472.5450695425534};
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
       double[] coefficients = {2.851253873825214E7, -73904.71542867682, -4.966708229328109};
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
       double[] coefficients = {-69254.65624300073, 3.921540307522407, -9.7048512202577E7};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_positif_normal_c_positif_tres_proche_zero() {
       double[] coefficients = {-9.530829348805964E-4, 53903.93470729956, 1.7167492085944932E-4};
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
       double[] coefficients = {-4.272485626749664, -54993.04932922029, 20196.53569547364};
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
       double[] coefficients = {0.0, 50836.78051913986, -2.9709277104610435E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_proche_zero_b_zero_c_negatif_normal() {
       double[] coefficients = {3.1469693293991154, 0.0, -86955.40399023877};
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
       double[] coefficients = {59142.9886418358, 0.0, -5.67198159623467E8};
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
       double[] coefficients = {4.555691205224727E8, -3.5653239645863226, 0.0};
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
       double[] coefficients = {-4.1837344835409045, -7.454098033778582E-4, -4.16751506925972};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_positif_tres_proche_zero_c_positif_normal() {
       double[] coefficients = {-7.111079015898479E-4, 4.1932997959425453E-4, 51958.8934238009};
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
       double[] coefficients = {22766.538567369116, -42819.39481615999, -94599.62444074402};
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
       double[] coefficients = {47618.211070377634, 8.540138662426108E7, 7.600254394250283E-4};
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
       double[] coefficients = {0.0, 3.610917042352631, -11839.7307129057};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_proche_zero_b_positif_grand_c_negatif_grand() {
       double[] coefficients = {4.143932900547014, 9.230566339586949E8, -5.688510556215389E8};
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
       double[] coefficients = {10707.500428459032, -4.334243207122691, -9.113682537056911E-4};
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
       double[] coefficients = {-40708.721814233875, 86482.68179995242, -1.7215015731940246};
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
       double[] coefficients = {3.9766021099890967, 7.185359506443494E-4, 0.0};
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
       double[] coefficients = {-6.835856937538916E-4, 0.0, 0.0};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       // Vérification que la valeur de l'équation pour la solution est proche de 0
       assertEquals(eq1, 0, 1e-4);
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_positif_grand_c_negatif_proche_zero() {
       double[] coefficients = {2.733479246951354E-4, 1.2086728193774875E8, -3.167633432765202};
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
       double[] coefficients = {-1.287950222262574, -3.1818235375198297E-4, 4.611846475484568E-4};
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
       double[] coefficients = {-4.0171441837118433E-4, 4.786762003620493, -3.484173219417294E-4};
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
       double[] coefficients = {0.0, -8.874888714726142E-4, -3.671442605382496};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_grand_b_positif_normal_c_negatif_grand() {
       double[] coefficients = {9.788192877738042E8, 77561.81133054092, -8.940643793524454E8};
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
       double[] coefficients = {-1.6070420255102702, -1.9363663593167724, 55365.41635161683};
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
       double[] coefficients = {-49111.53124338224, -83069.85115006253, 0.0};
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
       double[] coefficients = {1.1360519526406403E-4, -4.009993565764613E8, 82740.33471163106};
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
       double[] coefficients = {2.9906687936044993, -1.5970861894619417E8, 1.7226632922242935};
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
       double[] coefficients = {-6.877386120054546E-4, 0.0, -2.7493294643726864};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_normal_b_positif_tres_proche_zero_c_negatif_tres_proche_zero() {
       double[] coefficients = {-52095.88939498767, 4.1308703207991514E-4, -4.87647767939294E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_positif_proche_zero_c_positif_tres_proche_zero() {
       double[] coefficients = {5.189504330307081E-4, 1.2722801992513024, 4.0475424855803104E-4};
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
       double[] coefficients = {-5.284894051404815E-4, 85085.42725143026, -97511.51259817788};
       double[] solutions = Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]);
       // Insérez ici vos assertions pour tester les solutions.
       double eq1 = coefficients[0] * solutions[0] * solutions[0] + coefficients[1] * solutions[0] + coefficients[2];
       double eq2 = coefficients[0] * solutions[1] * solutions[1] + coefficients[1] * solutions[1] + coefficients[2];
       // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
       assertEquals(eq1, 0, 1e-4);
       assertEquals(eq2, 0, 1e-4);
   }
}
