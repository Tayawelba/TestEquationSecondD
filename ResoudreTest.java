import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ResoudreTest {

    @Test
    public void test_resoudre() {
        double a = 1.0;
        double b = -3.0;
        double c = 2.0;

        double[] solutions = Resoudre.resoudre(a, b, c);

        // Calcul de la valeur de l'équation pour les solutions obtenues
        double eq1 = a * solutions[0] * solutions[0] + b * solutions[0] + c;
        double eq2 = a * solutions[1] * solutions[1] + b * solutions[1] + c;

        // Vérification que les valeurs de l'équation pour les solutions sont proches de 0
        assertEquals(eq1, 0, 1e-4);
        assertEquals(eq2, 0, 1e-4);
    }
}
