/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.marco;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Marco {

    public static void main(String[] args) {
        
        System.out.println("CALCULADORA");
        Scanner marko = new Scanner(System.in);
        System.out.println("ingrese primer numero");
        int numero1 = marko.nextInt();
        System.out.println("ingrese segundo  numero");
        int numero2 = marko.nextInt();
        
        int suma = numero1+numero2;
        
        int resta = numero1+numero2;
        
        int multipliucacion = numero1+numero2;
        
         int divicion = numero1+numero2;
        
        System.out.println("la suma es: "+ suma);
        
        System.out.println("la resta es: "+ suma);
        
        System.out.println("la divicion   es: "+ suma);
        
    }
}
