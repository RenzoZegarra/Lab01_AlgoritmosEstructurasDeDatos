package Lab01_AlgoritmosEstructurasDeDatos.Actividad1;
public class Verificador {
    // Caso 1: ¿Los rectángulos se sobreponen?
    public boolean seSobreponen(Rectangulo r1, Rectangulo r2) {
        return (r1.getX1() < r2.getX2() && r1.getX2() > r2.getX1()) &&
           (r1.getY1() < r2.getY2() && r1.getY2() > r2.getY1());
    }

    // Caso 2: ¿Los rectángulos están juntos? (tienen un borde en común pero no se sobreponen)
    public boolean estanJuntos(Rectangulo r1, Rectangulo r2) {
        boolean juntosVerticalmente = (r1.getX2() == r2.getX1() || r1.getX1() == r2.getX2()) &&
            (r1.getY1() < r2.getY2() && r1.getY2() > r2.getY1());

        boolean juntosHorizontalmente = (r1.getY2() == r2.getY1() || r1.getY1() == r2.getY2()) &&
            (r1.getX1() < r2.getX2() && r1.getX2() > r2.getX1());

        return juntosVerticalmente || juntosHorizontalmente;
    }
}
