import java.util.Scanner;

public class lectura {
    public static void main(String[] args) {
        /* insertar datos por el teclado */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula favorita: ");
        String pelicula = teclado.nextLine(); /* nextLine cuando es insertar texto */
        System.out.println("Ahora escriba la fecha de lanzamiento:");
        /* nextInt para datos de tipo entero */
        int fechaDeLanzamiento = teclado.nextInt();

        System.out.println("Dinos la nota que le das a esta pelicula:");
        double nota = teclado.nextDouble();
        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}
