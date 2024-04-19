package PrimerPrograma;
import java.util.Scanner;

public class evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalDeEvaluaciones = 0;

        while (nota != -1) {
            System.out.println("Escribe la nota que le darias a la pélicula Matrix");
            nota = teclado.nextDouble();
            if (nota != -1) {
                mediaEvaluaciones += nota;
                totalDeEvaluaciones++;
            }
        }
        System.out
                .println("La media se evaluaciones de esta pelicula es de: " + mediaEvaluaciones / totalDeEvaluaciones);
    }
}
