package com.aluraprojecto.ConversorDeMonedas.Principal;

import com.aluraprojecto.ConversorDeMonedas.Consulta.ConsultaAPI;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int salir = 0;
        String divisaBase = "USD";
        String divisaACambiar = "PEN";
        double valorDelUsuario = 0;
        double numeroConvertido = 0;
        Scanner usuario = new Scanner(System.in);
        ConsultaAPI nuevaConsulta = new ConsultaAPI();
        while (salir != 7) {
            ImprimirMenu();
            int opcionUsuario = usuario.nextInt();
            if (opcionUsuario == 7) {
                salir = opcionUsuario;
            }
            switch (opcionUsuario) {
                case 1 -> { divisaBase = "USD"; divisaACambiar = "ARS";}
                case 2 -> { divisaBase = "ARS"; divisaACambiar = "USD";}
                case 3 -> { divisaBase = "USD"; divisaACambiar = "BRL";}
                case 4 -> { divisaBase = "BRL"; divisaACambiar = "USD";}
                case 5 -> { divisaBase = "USD"; divisaACambiar = "PEN";}
                case 6 -> { divisaBase = "PEN"; divisaACambiar = "USD";}
                default -> { System.out.println("Ingrese un valor valido");
                    break;
                }
            }
            System.out.println("Ingresa el valor que deseas convertir:");
            valorDelUsuario = usuario.nextDouble();
            numeroConvertido = nuevaConsulta.ObtenerValorDeDivisas(divisaBase, divisaACambiar, valorDelUsuario);
            System.out.printf("El valor de %.2f [%s] equivale al valor final de %.2f [%s]\n", valorDelUsuario, divisaBase, numeroConvertido, divisaACambiar);
        }
    }

    public static void ImprimirMenu() {
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
