package PrimerPrograma.reto;

import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        /* scanner para los valores */
        Scanner read = new Scanner(System.in);
        /* variable para la opcion */
        byte option = 0;
        /* variables de cantidad y saldo */
        double saldo = 123.45;
        double cantidad = 0;
        /* mientras la opcion sea diferente de 4, se ejecuta el bucle */
        while (option != 4) {
            System.out.println("""
                    Bienvenido, selecciona una opcion
                        1. Consultar Saldo
                        2. Retiro de efectivo
                        3. Abonar Efectivo
                        4. Salir
                    """);
            /* leer la opcion seleccionada */
            option = read.nextByte();
            if (option == 1) {
                System.out.println("Tu saldo es de: $" + saldo + "\n");
            } else if (option == 2) {
                System.out.println("Cuanto dinero, desea retirar:");
                cantidad = read.nextDouble();
                /* si el saldo es menor */
                if (cantidad > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo = saldo - cantidad;
                    System.out.println("""
                            Retire su dinero
                            Su nuevo saldo es de: $""" + saldo);
                }
            } else if (option == 3) {
                System.out.println("Ingrese la cantidad a depositar: ");
                cantidad = read.nextDouble();
                /* si la cantidad es meñor que cerro, manda la exepcion */
                if (cantidad <= 0) {
                    System.out.println("Cantidad Incorrecta, intente de nuevo");
                } else {
                    saldo = cantidad + saldo;
                    System.out.println("Su nuevo saldo es de: $" + saldo);
                }
            } else if (option == 4) {
                System.out.println("Hasta luego");
                /* rompe el ciclo */

                break;
            }
        }
    }

}