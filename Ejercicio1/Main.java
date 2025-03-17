package Lab01_AlgoritmosEstructurasDeDatos.Ejercicio1;
import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número máximo de rectángulos a almacenar: ");
        int maxRectangulos = scanner.nextInt();
        ContainerRect contenedor = new ContainerRect(maxRectangulos);

        while (true) 
        {
            System.out.print("Desea ingresar un rectángulo? (si/no): ");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("no")) 
            {
                break;
            }

            System.out.print("Ingrese x1: ");
            double x1 = scanner.nextDouble();
            System.out.print("Ingrese y1: ");
            double y1 = scanner.nextDouble();
            System.out.print("Ingrese x2: ");
            double x2 = scanner.nextDouble();
            System.out.print("Ingrese y2: ");
            double y2 = scanner.nextDouble();

            contenedor.addRectangulo(new Rectangulo(x1, y1, x2, y2));
        }

        scanner.close();
        System.out.println("\nRectángulos almacenados:");
        System.out.println(contenedor);
    }
}
