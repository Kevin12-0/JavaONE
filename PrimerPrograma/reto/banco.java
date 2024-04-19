package PrimerPrograma.reto;

import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        byte option = 0;
        double saldo = 123.45;
        double cantidad = 0;
        while (option != 4) {
            System.out.println("""
                    Bienvenido, selecciona una opcion
                        1. Consultar Saldo
                        2. Retiro de efectivo
                        3. Abonar Efectivo
                        4. Salir
                    """);
            option = read.nextByte();
            if (option == 1) {
                System.out.println("Tu saldo es de: $" + saldo + "\n");
            } else if (option == 2) {
                System.out.println("Cuanto dinero, desea retirar:");
                cantidad = read.nextDouble();
                if (cantidad > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo = saldo - cantidad;
                    System.out.println("""
                            Retire su dinero
                            Su nuevo saldo es de: $""" + saldo);
                }

            }
        }
    }

}