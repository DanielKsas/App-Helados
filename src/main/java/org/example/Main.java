package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Precios fijos
       int precioSimple = 5000;
       int precioDoble = 10000;
       int precioEspecial = 20000;

        // Solicitar al usuario las cantidades vendidas
        System.out.println(" Helados FROZEN ");
        System.out.println("Ingrese la cantidad de helados vendidos hoy:");

        System.out.print("Cantidad helados Simples vendidos: ");
        int cantidadSimple = scanner.nextInt();

        System.out.print("Cantidad de helados dobles vendidos: ");
        int cantidadDoble = scanner.nextInt();

        System.out.print("Cantidad de helados especiales vendidos: ");
        int cantidadEspecial = scanner.nextInt();

        // Lo que hay que calcular
        int totalSimple = precioSimple * cantidadSimple;
        int totalDoble = precioDoble * cantidadDoble;
        int totalEspecial = precioEspecial * cantidadEspecial;

        // Calcular el total general
        int totalGeneral = totalSimple + totalDoble + totalEspecial;

        //  resultados
        System.out.println("\n RESUMEN DE VENTAS - HELADOS FROZEN");

        System.out.println("------------------------------------------");

        System.out.println("Helado Simple ($5,000)   x " + cantidadSimple + " = $" + totalSimple);

        System.out.println("Helado Doble  ($10,000)  x " + cantidadDoble + " = $" + totalDoble);

        System.out.println("Helado Especial ($20,000) x " + cantidadEspecial + " = $" + totalEspecial);

        System.out.println("------------------------------------------");

        System.out.println("TOTAL GENERAL DEL DÍA: $" + totalGeneral);


    }
}
