package Lab01_AlgoritmosEstructurasDeDatos.Actividad1;
import java.util.*;

public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;

    public Rectangulo(Coordenada c1, Coordenada c2) {
        setEsquina1(c1);
        setEsquina2(c2);
    }

    public void setEsquina1(Coordenada coo) {
        this.esquina1 = new Coordenada(coo);
    }

    public void setEsquina2(Coordenada coo) {
        this.esquina2 = new Coordenada(coo);
    }

    public Coordenada getEsquina1() {
        return new Coordenada(esquina1);
    }

    public Coordenada getEsquina2() {
        return new Coordenada(esquina2);
    }

    public String toString() {
        return "Esquina 1 = " + esquina1 + ", Esquina 2 = " + esquina2;
    }

    // Obtener coordenadas necesarias para los cálculos
    public double getX1() {
        return Math.min(esquina1.getX(), esquina2.getX());
    }

    public double getY1() {
        return Math.min(esquina1.getY(), esquina2.getY());
    }

    public double getX2() {
        return Math.max(esquina1.getX(), esquina2.getX());
    }

    public double getY2() {
        return Math.max(esquina1.getY(), esquina2.getY());
    }

    // Método para calcular el área del rectángulo
    public double calcularArea() {
        double base = getX2() - getX1();
        double altura = getY2() - getY1();
        return base * altura;
    }

    // Método para verificar si se sobrepone con otro rectángulo
    public boolean seSobrepone(Rectangulo otro) {
        return (this.getX1() < otro.getX2() && this.getX2() > otro.getX1()) &&
               (this.getY1() < otro.getY2() && this.getY2() > otro.getY1());
    }

    // Método para verificar si está junto con otro rectángulo (adyacencia)
    public boolean estanJuntos(Rectangulo otro) {
        boolean juntosVerticalmente = (this.getX2() == otro.getX1() || this.getX1() == otro.getX2()) &&
                                      (this.getY1() < otro.getY2() && this.getY2() > otro.getY1());

        boolean juntosHorizontalmente = (this.getY2() == otro.getY1() || this.getY1() == otro.getY2()) &&
                                        (this.getX1() < otro.getX2() && this.getX2() > otro.getX1());

        return juntosVerticalmente || juntosHorizontalmente;
    }

    // Método para calcular el área de intersección si hay sobreposición
    public double calcularAreaInterseccion(Rectangulo otro) {
        if (!seSobrepone(otro)) return 0;

        double x1Inter = Math.max(this.getX1(), otro.getX1());
        double y1Inter = Math.max(this.getY1(), otro.getY1());
        double x2Inter = Math.min(this.getX2(), otro.getX2());
        double y2Inter = Math.min(this.getY2(), otro.getY2());

        double base = x2Inter - x1Inter;
        double altura = y2Inter - y1Inter;

        return base * altura;
    }
}
