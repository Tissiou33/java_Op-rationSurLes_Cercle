public class TestCercle {
    public static void main(String[] args) {
        Point centre = new Point(0.0, 0.0);
        Cercle cercle = new Cercle(centre, 7.0);
        cercle.afficher();

        Point p = new Point(3.0, 21.0);
        cercle.testAppartenance(p);
    }
}