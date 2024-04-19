package PrimerPrograma;
public class deciciones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnPlan = true;
        double notaDeLaPelicula = 8.2;

        String plan = "Plus";

        if (fechaDeLanzamiento >= 2022) {
            System.out.println("Peliculas mas populares");
        } else if (fechaDeLanzamiento <= 2022) {
            System.out.println("Peluiculas que aun vale la pena ver");
        }

        if (incluidoEnPlan && plan.equals("Plus")) {
            System.out.println("disfrute de su pelicula");

        } else {
            System.out.println("Pelicula no disponible en su plan");
        }
    }
}
