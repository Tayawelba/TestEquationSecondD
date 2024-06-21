import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class EquationSecondDegreTestG {

   @Test
   public void test_a_negatif_grand_b_positif_grand_c_negatif_normal() {
       double[] coefficients = {-3.313030703285799E8, 4.9364965586192095E8, -29570.451151648143};
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
       double[] coefficients = {-17092.3173246348, -15626.121350007597, 3.1976083543429524E8};
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
       double[] coefficients = {-4.954028667206274, 29639.58310254772, -6.221797928521702E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_negatif_proche_zero_c_negatif_proche_zero() {
       double[] coefficients = {-5.023033939400202E-4, -4.8180045547046735, -3.216675605559132};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_zero_b_zero_c_positif_tres_proche_zero() {
       double[] coefficients = {0.0, 0.0, 4.88677252232402E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_positif_proche_zero_c_zero() {
       double[] coefficients = {7.616673168274484E-4, 3.186014650345135, 0.0};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_proche_zero_b_negatif_grand_c_positif_normal() {
       double[] coefficients = {2.2645351302005206, -7.31137671117269E8, 1786.5069983670214};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_normal_b_negatif_tres_proche_zero_c_negatif_tres_proche_zero() {
       double[] coefficients = {56749.1328749599, -5.41668748728468E-4, -1.0730890106260601E-4};
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
       double[] coefficients = {6.240717801266577E8, 8.745686601868186E-4, 1.4706991987102698};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_grand_b_negatif_grand_c_positif_grand() {
       double[] coefficients = {-2.041804959364593E7, -7.658215828071024E8, 6.901489914364169E8};
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
       double[] coefficients = {-95799.21042237648, -4.053772414633734E8, -3.1252063189785126E-4};
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
       double[] coefficients = {-4.892812929599761, -6.491989274082046E8, 0.0};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_negatif_grand_c_negatif_normal() {
       double[] coefficients = {-8.707214547153398E-4, -2.5530916972877574E8, -26344.95574358075};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_zero_b_negatif_grand_c_negatif_grand() {
       double[] coefficients = {0.0, -1.8384604785538268E8, -1.5020146156226587E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_negatif_grand_c_positif_tres_proche_zero() {
       double[] coefficients = {8.989698390454272E-4, -8.825225411998713E7, 1.3528134797358496E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_proche_zero_b_negatif_normal_c_positif_proche_zero() {
       double[] coefficients = {4.749972405079694, -63521.302045274846, 2.146644537036218};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_normal_b_negatif_grand_c_negatif_proche_zero() {
       double[] coefficients = {31517.653074837828, -6.495290166929003E8, -2.15542887968808};
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
       double[] coefficients = {9.469677213677349E8, -7.849009741315936E8, 1.9099571781427873E-4};
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
       double[] coefficients = {-3.8326126957460284E7, -1.7191000200306763, -6.792942618821726E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_grand_b_negatif_tres_proche_zero_c_zero() {
       double[] coefficients = {-4.385826179114369E8, -6.412509317803234E-4, 0.0};
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
       double[] coefficients = {-1.8095553928235674E8, 0.0, -9.097649525196623E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_grand_b_positif_tres_proche_zero_c_negatif_proche_zero() {
       double[] coefficients = {-8.514195857804639E8, 1.9567649851234288E-4, -2.7218685087944983};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_grand_b_positif_proche_zero_c_positif_proche_zero() {
       double[] coefficients = {-3.3084531928652287E8, 1.05610469702057, 4.893428695471117};
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
       double[] coefficients = {-3.3333611184127855E8, 99199.36189559159, 70766.27844381685};
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
       double[] coefficients = {-22195.1028128311, 4.147373440670605E8, -3.7443720428473237};
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
       double[] coefficients = {-2.96220510591147, 0.0, 9.799739132607931E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_positif_grand_c_positif_grand() {
       double[] coefficients = {-4.314085807694464E-4, 4.1844010381369936E8, 1.1381672898172188E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_zero_b_negatif_proche_zero_c_positif_grand() {
       double[] coefficients = {0.0, -4.225606236081694, 4.0995321723104334E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_positif_normal_c_positif_grand() {
       double[] coefficients = {7.123474312891593E-4, 47054.22668226553, 3.3046297691504735E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_proche_zero_b_negatif_tres_proche_zero_c_positif_grand() {
       double[] coefficients = {3.2783272384851805, -2.1732005462511022E-4, 4.1427877795520735E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_normal_b_positif_tres_proche_zero_c_positif_grand() {
       double[] coefficients = {55934.77006148316, 4.0979414771873546E-4, 7.460399973198663E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_positif_grand_b_positif_proche_zero_c_positif_grand() {
       double[] coefficients = {8.522344294921046E8, 4.743943012372598, 3.323934700877977E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_grand_b_negatif_normal_c_positif_tres_proche_zero() {
       double[] coefficients = {-8.124189390263085E8, -37310.29194484897, 8.565333391771262E-4};
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
       double[] coefficients = {-13840.92625801453, -1.826180883358398E-4, -68680.91281467264};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_zero_b_positif_grand_c_positif_normal() {
       double[] coefficients = {0.0, 7.386400800856756E8, 84595.72200295121};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_proche_zero_b_positif_grand_c_positif_proche_zero() {
       double[] coefficients = {-4.2323260623100545, 9.425675773239375E8, 3.628812664397326};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_negatif_tres_proche_zero_c_positif_proche_zero() {
       double[] coefficients = {-9.289338222338795E-4, -7.769556142540164E-4, 2.7541450422569413};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_zero_c_positif_proche_zero() {
       double[] coefficients = {9.965034779875841E-4, 0.0, 1.0043166273935311};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_proche_zero_b_negatif_proche_zero_c_positif_tres_proche_zero() {
       double[] coefficients = {3.832594536132947, -3.2392709370664114, 7.674617144113692E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_normal_b_positif_normal_c_positif_proche_zero() {
       double[] coefficients = {67095.42936079248, 68851.3616585686, 1.2508856868803142};
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
       double[] coefficients = {2.1141529351449162E8, -6.874358458123495E-4, 53293.25819920377};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_zero_b_negatif_normal_c_zero() {
       double[] coefficients = {0.0, -95873.04853246377, 0.0};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_normal_b_positif_tres_proche_zero_c_positif_tres_proche_zero() {
       double[] coefficients = {-38476.92622831042, 9.4258773174855E-4, 4.473768005576836E-4};
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
       double[] coefficients = {39254.5409281549, 2.778162492539873, 24569.100656531577};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_positif_tres_proche_zero_c_negatif_grand() {
       double[] coefficients = {8.060554342473901E-4, 5.992487312954882E-4, -9.393243971686428E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_proche_zero_b_positif_tres_proche_zero_c_negatif_normal() {
       double[] coefficients = {-3.8412495348609084, 8.769141748965288E-4, -49237.8607215574};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_proche_zero_b_positif_proche_zero_c_negatif_tres_proche_zero() {
       double[] coefficients = {-1.2297845529827875, 1.460837919456353, -9.508630908748844E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_positif_normal_c_zero() {
       double[] coefficients = {-5.903421770531393E-4, 73752.73475766709, 0.0};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_proche_zero_b_positif_normal_c_negatif_tres_proche_zero() {
       double[] coefficients = {3.420401629803624, 12159.917078911081, -4.0073523474718343E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_grand_b_positif_grand_c_negatif_tres_proche_zero() {
       double[] coefficients = {3.5072716096803415E8, 7.633786421610391E8, -6.091409417994056E-4};
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
       double[] coefficients = {6.791474769843995E-4, -47123.403942843586, -6.640713700721433E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_normal_b_negatif_proche_zero_c_positif_proche_zero() {
       double[] coefficients = {-79967.22184761435, -2.7173919968722675, 2.2722379691412877};
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
       double[] coefficients = {-56232.62766749073, 0.0, 31144.381239570634};
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
       double[] coefficients = {5.684049888384512E-4, -1.9816079092850223E-4, -1.9125646537006378E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_grand_b_zero_c_negatif_normal() {
       double[] coefficients = {2.5861384351771623E8, 0.0, -56303.5045337309};
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
       double[] coefficients = {4.839072821510089, 3.5921377067740434, -2.9528952873048344};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_negatif_normal_c_negatif_grand() {
       double[] coefficients = {-5.663790763596134E-4, -44283.40942318565, -6.484023705314522E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_zero_b_positif_tres_proche_zero_c_positif_proche_zero() {
       double[] coefficients = {0.0, 1.6887765279715504E-4, 1.2172188459928677};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_normal_b_positif_grand_c_zero() {
       double[] coefficients = {28202.31277532336, 7.418304501102678E8, 0.0};
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
       double[] coefficients = {7.787979235054839E-4, -4.806441242035459, -31034.037092265105};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_grand_b_negatif_normal_c_negatif_proche_zero() {
       double[] coefficients = {8.078515491905003E8, -54244.00692710567, -4.613403628127234};
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
       double[] coefficients = {-2092.7248842147674, 2.6085306187182287, -3.132555852058815E8};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_positif_normal_c_positif_tres_proche_zero() {
       double[] coefficients = {-3.6601852282923354E-4, 80244.84358159828, 1.888626800340513E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_proche_zero_b_negatif_normal_c_positif_normal() {
       double[] coefficients = {-2.8104235866738883, -35491.01841085451, 76132.47525747868};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_zero_b_positif_normal_c_negatif_tres_proche_zero() {
       double[] coefficients = {0.0, 34022.14175806839, -3.5042042163245556E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_proche_zero_b_zero_c_negatif_normal() {
       double[] coefficients = {3.657163622140873, 0.0, -7541.206143995529};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_normal_b_zero_c_negatif_grand() {
       double[] coefficients = {84807.71527783836, 0.0, -9.595582802074964E8};
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
       double[] coefficients = {8.603778037855064E8, -2.7304628787442216, 0.0};
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
       double[] coefficients = {-3.1827935829471143, -1.3167049444506689E-4, -3.651540077275135};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_positif_tres_proche_zero_c_positif_normal() {
       double[] coefficients = {-2.1846128736295882E-4, 8.766279888428296E-4, 83159.01745001794};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_normal_b_negatif_normal_c_negatif_normal() {
       double[] coefficients = {92548.21578811982, -20097.93351965514, -29345.0379480305};
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
       double[] coefficients = {24260.309707865774, 3.4987609201170516E8, 8.86493693200645E-4};
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
       double[] coefficients = {0.0, 4.360167392583849, -58902.06658603619};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_proche_zero_b_positif_grand_c_negatif_grand() {
       double[] coefficients = {4.969360392827068, 8.635884381567935E8, -2.50027165579859E7};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_normal_b_negatif_proche_zero_c_negatif_tres_proche_zero() {
       double[] coefficients = {92731.79105510983, -2.0470614564734237, -4.061366378914433E-4};
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
       double[] coefficients = {-76132.89295886741, 90929.16544074324, -1.0564520850013372};
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
       double[] coefficients = {3.3218162030800107, 5.908734856290196E-4, 0.0};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_zero_c_zero() {
       double[] coefficients = {-4.113612755090309E-4, 0.0, 0.0};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_positif_grand_c_negatif_proche_zero() {
       double[] coefficients = {7.554271345597295E-4, 2.0879458509580237E8, -1.168480154715545};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_proche_zero_b_negatif_tres_proche_zero_c_positif_tres_proche_zero() {
       double[] coefficients = {-4.968134285754399, -1.9483325516080714E-4, 6.300350175897112E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_positif_proche_zero_c_negatif_tres_proche_zero() {
       double[] coefficients = {-5.251414493152023E-4, 3.6257760601267544, -3.0009647178664254E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_zero_b_negatif_tres_proche_zero_c_negatif_proche_zero() {
       double[] coefficients = {0.0, -7.115334537390026E-4, -1.9563815978960544};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_grand_b_positif_normal_c_negatif_grand() {
       double[] coefficients = {4.945161853239201E8, 60871.24016368711, -7.837039679812715E8};
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
       double[] coefficients = {-3.3816481426004827, -4.089319455821975, 12245.077597295867};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_normal_b_negatif_normal_c_zero() {
       double[] coefficients = {-70513.74760036056, -96301.29305274154, 0.0};
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
       double[] coefficients = {8.730381903263694E-4, -3.314564451938249E8, 11132.742466453039};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_positif_proche_zero_b_negatif_grand_c_positif_proche_zero() {
       double[] coefficients = {4.439255640984889, -4.7059783782916087E8, 3.293207032553866};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_zero_c_negatif_proche_zero() {
       double[] coefficients = {-1.4462305414634504E-4, 0.0, -1.9247658585892085};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_normal_b_positif_tres_proche_zero_c_negatif_tres_proche_zero() {
       double[] coefficients = {-22944.38871699646, 1.63564219921331E-4, -9.076196382122125E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("pas_equation_solutions_reelles"));
   }
   @Test
   public void test_a_positif_tres_proche_zero_b_positif_proche_zero_c_positif_tres_proche_zero() {
       double[] coefficients = {7.981373359302631E-4, 4.672189753559806, 5.944650843579007E-4};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
   @Test
   public void test_a_negatif_tres_proche_zero_b_positif_normal_c_negatif_normal() {
       double[] coefficients = {-1.6015830603606767E-4, 75480.30908306781, -87584.85199267846};
       IllegalArgumentException ill = assertThrows(IllegalArgumentException.class, ()->Resoudre.resoudre(coefficients[0], coefficients[1], coefficients[2]));
       assertTrue(ill.getMessage().equals("coef_A_peut_pas_etre_zero"));
   }
}
