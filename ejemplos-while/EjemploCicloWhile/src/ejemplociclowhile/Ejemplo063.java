/*
- Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
- Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * - @author SALASC
 */
public class Ejemplo063 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean bandera = true;
        String pais;
        String capital;
        String salir;
        String reporte = "";
        
        while (bandera == true) {
            System.out.println("Ingrese el país");
            pais = entrada.nextLine();

            System.out.printf("Ingrese la capital de %s\n", pais);
            capital = entrada.nextLine();
            
            reporte = String.format("%s %s %s\n", reporte, pais, capital);

            System.out.println("Desea salir del ciclo? S/N");
            salir = entrada.nextLine();

            if (salir.equals("S")) {
                bandera = false;
            }
            
        }
        System.out.println(reporte);
    }

    /*
    El codigo pide un numero que ingresa el usuario, mientras el numero
    ingresado no sea -100, el ciclo sigue en curso y cuando se ingresa el -100
    el ciclo para y se avisa al usuario
     */
}
