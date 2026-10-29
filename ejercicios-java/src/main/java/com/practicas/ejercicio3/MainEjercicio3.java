package com.practicas.ejercicio3;

public class MainEjercicio3 {

    public static void main(String[] args) { 

        // PRUEBA PARA DEMOSTRACION DE HERENCIA
        EmpleadoRetail empleado =
            new EmpleadoRetail("1001", "Luis", 10000);

        Cajero cajero =
            new Cajero("1002", "Ana", 10000, 500);

        GerenteTienda gerente =
            new GerenteTienda("1003", "Carlos", 10000, 3000);

        System.out.println("\nSueldo de empleado: $"
            + empleado.calcularSueldoNeto());

        System.out.println("Sueldo de cajero: $"
            + cajero.calcularSueldoNeto());

        System.out.println("Sueldo de gerente: $"
            + gerente.calcularSueldoNeto());
    }
}
