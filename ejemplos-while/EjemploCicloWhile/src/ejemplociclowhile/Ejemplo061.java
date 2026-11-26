/*
- Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
- Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
- @author SALASC
 */
public class Ejemplo061 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        boolean bandera = true;
        int salir;

        while (bandera == true) {
            System.out.println("Estoy en ciclo");
            System.out.println("Para salir del ciclo, ingrese -100");
            salir = entrada.nextInt();
            
            if (salir == -100) {
                bandera = false;
            }
        }
        
        System.out.println("Ciclo terminado.");
    }
        
    /*
    El codigo pide un numero que ingresa el usuario, mientras el numero
    ingresado no sea -100, el ciclo sigue en curso y cuando se ingresa el -100
    el ciclo para y se avisa al usuario
    */
}