public class Resoudre {

  /**
   * Cette méthode résout une équation du second degré de la forme ax² + bx + c = 0.
   * 
   * @param a Le coefficient du terme en x².
   * @param b Le coefficient du terme en x.
   * @param c Le coefficient du terme constant.
   * @return Un tableau contenant les deux racines de l'équation, ou lève une exception 
   *         IllegalArgumentException si le coefficient a est nul ou si l'équation n'a pas de solutions réelles.
   * @throws IllegalArgumentException Si le coefficient a est nul ou si l'équation n'a pas de solutions réelles.
   */
  public static double[] resoudre(double a, double b, double c) throws IllegalArgumentException {

      // Vérifie que le coefficient a n'est pas nul
      if (a == 0) {
          throw new IllegalArgumentException("coef_A_peut_pas_etre_zero");
      }

      // Calcule le discriminant (b² - 4ac)
      double discriminant = b * b - 4 * a * c;

      // Détermine le nombre de solutions en fonction du discriminant
      if (discriminant < 0) {
          throw new IllegalArgumentException("pas_equation_solutions_reelles");
      } else if (discriminant == 0) {
          // Une seule solution réelle
          return new double[] { -b / (2 * a) };
      } else {
          // Deux solutions réelles distinctes
          double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
          double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
          return new double[] { x1, x2 };
      }
  }
}
