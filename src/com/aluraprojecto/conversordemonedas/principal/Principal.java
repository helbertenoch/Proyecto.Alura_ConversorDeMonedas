package com.aluraprojecto.conversordemonedas.principal;

import com.aluraprojecto.conversordemonedas.consultas.ConsultaAPI;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int salir = 0;
        String base = "USD";
        String cambio = "PEN";
        double numeroBase = 0;
        double numeroCambiado = 0;
        Scanner usuario = new Scanner(System.in);
        ConsultaAPI nuevaConsulta = new ConsultaAPI();
        while (salir != 7) {
            ExibirMenu();
            int opcionUsuario = usuario.nextInt();
            if (opcionUsuario == 7) {
                salir = opcionUsuario;
            }
            System.out.println("Ingresa el valor que deseas convertir:");
            numeroBase = usuario.nextDouble();
            switch (opcionUsuario) {
                case 1 -> { base = "USD"; cambio = "ARS";}
                case 2 -> { base = "ARS"; cambio = "USD";}
                case 3 -> { base = "USD"; cambio = "BRL";}
                case 4 -> { base = "BRL"; cambio = "USD";}
                case 5 -> { base = "USD"; cambio = "PEN";}
                case 6 -> { base = "PEN"; cambio = "USD";}
            }
            numeroCambiado = nuevaConsulta.ObtenerValorDeDivisas(base, cambio, numeroBase);
            System.out.println("El valor de " + numeroBase + "[" + base + "]"
                    + " equivale al valor final de" + numeroCambiado + "[" + cambio + "]");

        }
    }

    public static void ExibirMenu() {
        System.out.println("""
                //////////////////////////////////////////////
                Sea Bienvenido/a al Conversor De Monedas :)
                
                1) Dólar => Peso Argentino
                2) Peso Argentino => Dólar
                3) Dólar => Real Brasileño
                4) Real Brasileño => Dólar
                5) Dólar => Sol Peruano
                6) Sol Peruano => Dólar 
                7) Salir
                Elija una opción valida:
                //////////////////////////////////////////////  
                """);

    }
}
