import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class EquationSecondDegreTestG {

   @Test
   public void test_a_negatif_grand_b_positif_grand_c_negatif_normal() {
       double[] coefficients = {-4.994133944528136E8, 8.309192877753614E8, -16721.334619984147};
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
       double[] coefficients = {-44176.94247436999, -21456.81711490084, 6.786066691768022E8};
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
       double[] coefficients = {-3.1502062423289545, 70641.11459071498, -1.6886330628591585E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_negatif_proche_zero_c_negatif_proche_zero() {
       double[] coefficients = {-2.3215085213397295E-4, -3.964994821908755, -2.08171424269317};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_zero_b_zero_c_positif_tres_proche_zero() {
       double[] coefficients = {0.0, 0.0, 3.935692435145746E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_positif_proche_zero_c_zero() {
       double[] coefficients = {4.374798065293992E-4, 4.079107551730395, 0.0};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_proche_zero_b_negatif_grand_c_positif_normal() {
       double[] coefficients = {2.530894942999679, -2.29234355610623E8, 79655.0663026219};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_normal_b_negatif_tres_proche_zero_c_negatif_tres_proche_zero() {
       double[] coefficients = {72015.14050498343, -9.491726096736821E-4, -5.146972516356532E-4};
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
       double[] coefficients = {1.557594341304043E8, 6.848616468762468E-4, 1.8863312344930554};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_grand_b_negatif_grand_c_positif_grand() {
       double[] coefficients = {-7.317872939783113E8, -2.6022735936148906E8, 9.467929065887522E8};
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
       double[] coefficients = {-62779.20978350989, -7.991874016851465E8, -9.304118432411952E-4};
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
       double[] coefficients = {-1.7993054238105977, -6.309760761161635E8, 0.0};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_negatif_grand_c_negatif_normal() {
       double[] coefficients = {-4.043134080311811E-4, -5.1175426101080114E8, -69321.84583480346};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_zero_b_negatif_grand_c_negatif_grand() {
       double[] coefficients = {0.0, -3.965845676641743E8, -7.084282051545424E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_negatif_grand_c_positif_tres_proche_zero() {
       double[] coefficients = {4.1226546547641955E-4, -3.5907632922201884E8, 9.645678071809521E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_proche_zero_b_negatif_normal_c_positif_proche_zero() {
       double[] coefficients = {4.4702626927086015, -49291.28150431713, 2.879755142715168};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_normal_b_negatif_grand_c_negatif_proche_zero() {
       double[] coefficients = {41483.73236058994, -2.8015272135006785E7, -3.5332622995499525};
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
       double[] coefficients = {2.6348483603095558E8, -8.239690922075021E8, 7.554823641528872E-4};
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
       double[] coefficients = {-6.483095979463792E8, -1.985793196704662, -4.1608327783610284E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_grand_b_negatif_tres_proche_zero_c_zero() {
       double[] coefficients = {-9.355821145430101E8, -9.820035266434298E-4, 0.0};
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
       double[] coefficients = {-5.356902164145958E8, 0.0, -2.6164945577813624E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_grand_b_positif_tres_proche_zero_c_negatif_proche_zero() {
       double[] coefficients = {-3.816675780040407E8, 6.899684698279685E-4, -2.6048368901191385};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_grand_b_positif_proche_zero_c_positif_proche_zero() {
       double[] coefficients = {-7.724123773602879E8, 3.793682113729918, 4.64330776229988};
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
       double[] coefficients = {-2.201452338738389E8, 37982.701554349114, 11743.129547506414};
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
       double[] coefficients = {-411.426051160146, 2.081546116349279E8, -1.7807004108151703};
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
       double[] coefficients = {-3.3328943245364933, 0.0, 8.582201493201331E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_positif_grand_c_positif_grand() {
       double[] coefficients = {-3.648893052310331E-4, 5.2818711089553607E8, 8.049322278693106E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_zero_b_negatif_proche_zero_c_positif_grand() {
       double[] coefficients = {0.0, -3.321002832994733, 4.3432749898302E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_positif_normal_c_positif_grand() {
       double[] coefficients = {3.7194225823874793E-4, 37750.42276739227, 5.1653392857443404E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_proche_zero_b_negatif_tres_proche_zero_c_positif_grand() {
       double[] coefficients = {1.7955605243304102, -3.821028484042757E-4, 8.708204763332268E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_normal_b_positif_tres_proche_zero_c_positif_grand() {
       double[] coefficients = {20466.754042477743, 2.9304092507253783E-4, 2.6694136551782057E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_positif_grand_b_positif_proche_zero_c_positif_grand() {
       double[] coefficients = {8.354300759140958E8, 1.1545259511641395, 7.784103880686309E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_grand_b_negatif_normal_c_positif_tres_proche_zero() {
       double[] coefficients = {-5.1770628949459296E8, -68322.98506498148, 2.2699208548297413E-4};
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
       double[] coefficients = {-10008.161091000875, -6.128213167744175E-4, -84509.20853895499};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_zero_b_positif_grand_c_positif_normal() {
       double[] coefficients = {0.0, 6.060407064276716E8, 32247.111611686596};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_proche_zero_b_positif_grand_c_positif_proche_zero() {
       double[] coefficients = {-3.098043628075995, 3.098616872286171E8, 4.09899160687639};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_negatif_tres_proche_zero_c_positif_proche_zero() {
       double[] coefficients = {-2.3964600607761697E-4, -1.4536186399790858E-4, 2.469668543676773};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_zero_c_positif_proche_zero() {
       double[] coefficients = {2.654135637572031E-4, 0.0, 4.308314319402835};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_proche_zero_b_negatif_proche_zero_c_positif_tres_proche_zero() {
       double[] coefficients = {3.320899647983504, -4.060499732907997, 6.259294137816785E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_normal_b_positif_normal_c_positif_proche_zero() {
       double[] coefficients = {47013.24211666889, 51722.77094187382, 4.454718946570926};
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
       double[] coefficients = {9.58492164379763E8, -7.538773640624625E-4, 64122.31982201929};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_zero_b_negatif_normal_c_zero() {
       double[] coefficients = {0.0, -99358.0562363201, 0.0};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_normal_b_positif_tres_proche_zero_c_positif_tres_proche_zero() {
       double[] coefficients = {-47457.591818790555, 4.40839049081385E-4, 6.383511210456701E-4};
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
       double[] coefficients = {12374.043419884982, 3.6180462920065017, 97809.89551056542};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_positif_tres_proche_zero_c_negatif_grand() {
       double[] coefficients = {9.174332983422159E-4, 1.4259454580418132E-4, -3.1366417025835574E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_proche_zero_b_positif_tres_proche_zero_c_negatif_normal() {
       double[] coefficients = {-4.967129780588095, 2.740528492519739E-4, -67946.79829082056};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_proche_zero_b_positif_proche_zero_c_negatif_tres_proche_zero() {
       double[] coefficients = {-4.981073428010717, 4.657803584159737, -6.855114839229765E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_positif_normal_c_zero() {
       double[] coefficients = {-2.9924038260321646E-4, 87284.53141700594, 0.0};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_proche_zero_b_positif_normal_c_negatif_tres_proche_zero() {
       double[] coefficients = {4.997876274435718, 92692.43320376996, -1.792021576056456E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_grand_b_positif_grand_c_negatif_tres_proche_zero() {
       double[] coefficients = {5434228.922457698, 5.2934354711439437E8, -4.6534532458913425E-4};
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
       double[] coefficients = {2.09292941887184E-4, -65771.49685532885, -7.232169926089963E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_normal_b_negatif_proche_zero_c_positif_proche_zero() {
       double[] coefficients = {-80714.1982721618, -4.141265543267014, 1.2393721022372244};
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
       double[] coefficients = {-41722.862929856514, 0.0, 34811.96733246576};
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
       double[] coefficients = {3.7043543067895947E-4, -8.203803037245607E-4, -9.343352362255619E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_grand_b_zero_c_negatif_normal() {
       double[] coefficients = {7.054135623535726E8, 0.0, -8084.35467972458};
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
       double[] coefficients = {3.2521801799744594, 2.9863698061003032, -4.284154425126882};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_negatif_normal_c_negatif_grand() {
       double[] coefficients = {-9.861191239340984E-4, -97300.58420213468, -2.919576114023448E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_zero_b_positif_tres_proche_zero_c_positif_proche_zero() {
       double[] coefficients = {0.0, 7.975712417888757E-4, 2.2879258720000784};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_normal_b_positif_grand_c_zero() {
       double[] coefficients = {85715.28358807658, 5.870431411521211E8, 0.0};
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
       double[] coefficients = {9.300900973627673E-4, -4.500499080655281, -27825.1271559686};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_grand_b_negatif_normal_c_negatif_proche_zero() {
       double[] coefficients = {6.186968491358122E8, -72599.82759982202, -1.903847317788009};
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
       double[] coefficients = {-53403.004572198384, 2.9441574340788246, -6.534845096095016E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_positif_normal_c_positif_tres_proche_zero() {
       double[] coefficients = {-4.333108358660413E-4, 52423.307760413256, 3.7482745603588933E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_proche_zero_b_negatif_normal_c_positif_normal() {
       double[] coefficients = {-2.873988736748309, -94226.32652748651, 64805.45522982559};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_zero_b_positif_normal_c_negatif_tres_proche_zero() {
       double[] coefficients = {0.0, 88491.00549281345, -3.204735758901708E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_proche_zero_b_zero_c_negatif_normal() {
       double[] coefficients = {1.916528356593599, 0.0, -66440.22861033381};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_normal_b_zero_c_negatif_grand() {
       double[] coefficients = {11738.12870574861, 0.0, -9.21301741051912E8};
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
       double[] coefficients = {3.407210494422179E8, -4.248426468054131, 0.0};
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
       double[] coefficients = {-1.0216627002373486, -6.907323887912815E-4, -2.7433010486892};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_positif_tres_proche_zero_c_positif_normal() {
       double[] coefficients = {-8.245134428169322E-4, 6.828932013340071E-4, 69331.12339994848};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_normal_b_negatif_normal_c_negatif_normal() {
       double[] coefficients = {96658.5511341533, -61237.01454428759, -35546.31576225171};
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
       double[] coefficients = {345.8000652681924, 1.2894546980491382E8, 7.787031221056605E-4};
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
       double[] coefficients = {0.0, 1.177169683308049, -43082.8803797824};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_proche_zero_b_positif_grand_c_negatif_grand() {
       double[] coefficients = {3.372328539592846, 7.015293785637871E8, -8.921473117529583E7};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_normal_b_negatif_proche_zero_c_negatif_tres_proche_zero() {
       double[] coefficients = {40018.47420451237, -4.009494647619844, -6.551770387843629E-4};
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
       double[] coefficients = {-2322.0061896909174, 80771.07093021141, -2.875599617275055};
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
       double[] coefficients = {4.288870401355501, 4.833247050884656E-4, 0.0};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_zero_c_zero() {
       double[] coefficients = {-1.0149790831560142E-4, 0.0, 0.0};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_positif_grand_c_negatif_proche_zero() {
       double[] coefficients = {3.354552585716976E-4, 4.670165649587662E8, -4.979770072019605};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_proche_zero_b_negatif_tres_proche_zero_c_positif_tres_proche_zero() {
       double[] coefficients = {-4.546586732419129, -3.700020191400303E-4, 5.181183318831934E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_positif_proche_zero_c_negatif_tres_proche_zero() {
       double[] coefficients = {-2.7760769707330015E-4, 1.0567865151652502, -6.641380659047527E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_zero_b_negatif_tres_proche_zero_c_negatif_proche_zero() {
       double[] coefficients = {0.0, -5.22819390179413E-4, -3.368859578503482};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_grand_b_positif_normal_c_negatif_grand() {
       double[] coefficients = {9.560113098404952E8, 56269.3611427255, -6.690367178066847E8};
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
       double[] coefficients = {-3.9915682045187157, -2.9110512662085775, 11924.851612179722};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_normal_b_negatif_normal_c_zero() {
       double[] coefficients = {-58943.36519709083, -7198.593209988161, 0.0};
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
       double[] coefficients = {9.901400265829867E-4, -2.4397812323328722E8, 83997.12758670817};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_proche_zero_b_negatif_grand_c_positif_proche_zero() {
       double[] coefficients = {4.814049233800024, -1.0140668438289237E8, 3.0681949346557413};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_zero_c_negatif_proche_zero() {
       double[] coefficients = {-8.040344504687655E-4, 0.0, -1.6808547918019037};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_normal_b_positif_tres_proche_zero_c_negatif_tres_proche_zero() {
       double[] coefficients = {-96254.65208870146, 4.3352757768685957E-4, -7.096909918364906E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_positif_proche_zero_c_positif_tres_proche_zero() {
       double[] coefficients = {4.132309880981963E-4, 3.81612092011255, 5.941115497344654E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_positif_normal_c_negatif_normal() {
       double[] coefficients = {-2.0314388353387858E-4, 85287.25102502125, -18476.26603425546};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
}
