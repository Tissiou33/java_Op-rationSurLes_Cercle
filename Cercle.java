public class Cercle {
    private Point centre;
    private Double rayon;

    public Cercle(Point centre, Double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public Double getRayon() {
        return rayon;
    }

    public void setRayon(Double rayon) {
        this.rayon = rayon;
    }

    public Double perimetre() {
        return 2 * Math.PI * rayon;
    }

    public Double surface() {
        return Math.PI * Math.pow(rayon, 2);
    }

    public void testAppartenance(Point p) {
        Double distance = Math.sqrt(Math.pow(p.getAbscisse() - centre.getAbscisse(), 2) + Math.pow(p.getOrdonnee() - centre.getOrdonnee(), 2));
        System.out.println(distance);
        if (distance <= rayon) {
            System.out.println("Le point appartient au cercle.");
        } else {
            System.out.println("Le point n'appartient pas au cercle.");
        }
    }

    public void afficher() {
        System.out.println("Périmètre: " + perimetre() + ", Surface: " + surface());
    }
}