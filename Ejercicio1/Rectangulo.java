package Lab01_AlgoritmosEstructurasDeDatos.Ejercicio1;
import java.util.*;
class Rectangulo {
    private double[] esquina1;
    private double[] esquina2;

    public Rectangulo(double x1, double y1, double x2, double y2) {
        this.esquina1 = new double[]{x1, y1};
        this.esquina2 = new double[]{x2, y2};
    }

    public double calcularDistancia() {
        return Math.sqrt(Math.pow(esquina2[0] - esquina1[0], 2) + Math.pow(esquina2[1] - esquina1[1], 2));
    }

    public double calcularArea() {
        return Math.abs((esquina2[0] - esquina1[0]) * (esquina2[1] - esquina1[1]));
    }

    @Override
    public String toString() {
        return "([" + esquina1[0] + ", " + esquina1[1] + "], [" + esquina2[0] + ", " + esquina2[1] + "]";
    }
}