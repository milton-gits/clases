/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.clase1;

/**
 *
 * @author Death
 */
public class Clase1 {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 14;
        boolean mostrarPar = true;
//Primer punto:

        /*while (num1 <= num2) {
            System.out.println("" + num1);
            num1++;
        }*/
        //Segundo punto:
        /* while (num1 < num2) {
            num1++;
            if (num1 % 2 == 0) {
                System.out.println("" + num1);
            }

        }*/
        //tercer punto
        /*while (num1 <= num2) {
            num1++;
            if (num1 % 2 == 0) {
                if (mostrarPar) {
                    System.out.println(num1);
                }
            }
        }*/
        //cuarto punto
        for (int i = num2; i > num1; i--) {
            if (num2 % 2 == 0) {
                System.out.print(" " + num2);
            }
            num2--;
        }
    }
}
