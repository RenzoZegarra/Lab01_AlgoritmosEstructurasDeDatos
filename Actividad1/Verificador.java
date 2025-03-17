package Lab01_AlgoritmosEstructurasDeDatos.Actividad1;
public class Verificador {
    // Cuando los rectangulos se sobreponen
    public boolean seSobreponen(Rectangulo r1, Rectangulo r2) {
        return (r1.getX1() < r2.getX2() && r1.getX2() > r2.getX1()) &&
           (r1.getY1() < r2.getY2() && r1.getY2() > r2.getY1());
    }

    //Cuando los rectangulos estan juntos
    public boolean estanJuntos(Rectangulo r1, Rectangulo r2) {
        boolean juntosVerticalmente = (r1.getX2() == r2.getX1() || r1.getX1() == r2.getX2()) &&
            (r1.getY1() < r2.getY2() && r1.getY2() > r2.getY1());

        boolean juntosHorizontalmente = (r1.getY2() == r2.getY1() || r1.getY1() == r2.getY2()) &&
            (r1.getX1() < r2.getX2() && r1.getX2() > r2.getX1());

        return juntosVerticalmente || juntosHorizontalmente;
    }
}
