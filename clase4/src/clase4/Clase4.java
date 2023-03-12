/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase4;

/**
 *
 * @author Death
 */
public class Clase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numeros[] = new int[]{1, 37, 16};
        int resultado = sumatoria(numeros);
        resultado = resultado / numeros.length;

        System.out.println(resultado);
    }

    /*public static double promedioDeDosNotas(int numero1, int numero2) {

        int suma = numero1 + numero2;
        double promedio = suma / 2;

        return promedio;
    }*/
    private static int sumatoria(int[] numerosASumar) {
        int suma = 0;
        for (int index = 0; index < numerosASumar.length; index++) {
            suma = suma + numerosASumar[index];
        }
        return suma;
    }

    private static void Saludar() {
        System.out.println("Hola a todos");
    }
    
}
