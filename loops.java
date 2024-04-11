import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le darias a la pélicula Matrix");
            nota = teclado.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota;
        }
        System.out.println("La media se evaluaciones de esta pelicula es de: " + mediaEvaluaciones / 3);
    }
}