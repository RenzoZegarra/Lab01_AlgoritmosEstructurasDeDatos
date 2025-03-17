package Lab01_AlgoritmosEstructurasDeDatos.Ejercicio1;
import java.util.*;

class ContainerRect {
    private Rectangulo[] rectangulos;
    private double[] distancias;
    private double[] areas;
    private int n;
    private static int numRec = 0;

    public ContainerRect(int capacidad) {
        this.n = capacidad;
        this.rectangulos = new Rectangulo[n];
        this.distancias = new double[n];
        this.areas = new double[n];
    }

    public void addRectangulo(Rectangulo rect) {
        if (numRec < n) {
            rectangulos[numRec] = rect;
            distancias[numRec] = rect.calcularDistancia();
            areas[numRec] = rect.calcularArea();
            numRec++;
        } else {
            System.out.println("No es posible guardar más rectángulos.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangulo\tCoordenadas\t\tDistancia\tArea\n");
        for (int i = 0; i < numRec; i++) {
            sb.append((i + 1)).append("\t").append(rectangulos[i])
              .append("\t").append(String.format("%.3f", distancias[i]))
              .append("\t").append(String.format("%.2f", areas[i]))
              .append("\n");
        }
        return sb.toString();
    }
}