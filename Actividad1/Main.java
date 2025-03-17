package Lab01_AlgoritmosEstructurasDeDatos.Actividad1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Se define el objeto entrada para el ingreso de datos
        Scanner entrada = new Scanner(System.in);

        // Ingreso de coordenadas para el Rectángulo A
        System.out.println("Ingrese las coordenadas del Rectángulo A:");
        System.out.print("Esquina 1 (x1, y1): ");
        double x1A = entrada.nextDouble();
        double y1A = entrada.nextDouble();

        System.out.print("Esquina 2 (x2, y2): ");
        double x2A = entrada.nextDouble();
        double y2A = entrada.nextDouble();

        // Ingreso de coordenadas para el Rectángulo B
        System.out.println("Ingrese las coordenadas del Rectángulo B:");
        System.out.print("Esquina 1 (x1, y1): ");
        double x1B = entrada.nextDouble();
        double y1B = entrada.nextDouble();

        System.out.print("Esquina 2 (x2, y2): ");
        double x2B = entrada.nextDouble();
        double y2B = entrada.nextDouble();

        // Creación de los objetos Rectángulo A y B
        Rectangulo rA = new Rectangulo(new Coordenada(x1A, y1A), new Coordenada(x2A, y2A));
        Rectangulo rB = new Rectangulo(new Coordenada(x1B, y1B), new Coordenada(x2B, y2B));

        // Mostrar los datos de los rectángulos
        System.out.println("\nInformación de los rectángulos:");
        mostrarRectangulo(rA, "A");
        mostrarRectangulo(rB, "B");

        // VERIFICACION de la relación entre los rectángulos
        Verificador verificador = new Verificador();

        if (verificador.seSobreponen(rA, rB)) {
            System.out.println("Los rectángulos A y B se sobreponen.");

            // Calcular el área de sobreposición
            Rectangulo areaSobreposicion = rectanguloSobre(rA, rB);
            System.out.println("El area de los rectangulos sobrepuestos es: "+ rA.calcularAreaInterseccion(areaSobreposicion));
        } else if (verificador.estanJuntos(rA, rB)) {
            System.out.println("Los rectángulos A y B están juntos.");
        } else {
            System.out.println("Los rectángulos A y B son disjuntos.");
        }

        entrada.close();



    }

    // Método para mostrar la información de un rectángulo
    public static void mostrarRectangulo(Rectangulo r, String nombre) {
        System.out.println("Rectángulo " + nombre + ": " + r);
    }

    // Método para calcular el área de sobreposición de dos rectángulos
    public static Rectangulo rectanguloSobre(Rectangulo r1, Rectangulo r2) {
        double x1 = Math.max(r1.getEsquina1().getX(), r2.getEsquina1().getX());
        double y1 = Math.max(r1.getEsquina1().getY(), r2.getEsquina1().getY());
        double x2 = Math.min(r1.getEsquina2().getX(), r2.getEsquina2().getX());
        double y2 = Math.min(r1.getEsquina2().getY(), r2.getEsquina2().getY());

        if (x1 < x2 && y1 < y2) {
            return new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));
        } else {
            return new Rectangulo(new Coordenada(0, 0), new Coordenada(0, 0)); // No hay intersección
        }
    }
}
