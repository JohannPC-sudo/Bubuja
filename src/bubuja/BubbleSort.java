/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubuja;

import java.util.Arrays;
/**
 *
 * @author Johann López
 */
public class BubbleSort {
    
    public void sort(int[] array) {
        int n = array.length; //Obtiene la longitud del array
        for (int i = 0; i < n - 1; i++) { // Bucle externo para cada pasada
            for (int j = 0; j < n - i - 1; j++) { // Bucle interno para comparar elementos adyacentes
                if (array[j] > array[j + 1]) { // Si el elemento actual es mayor que el siguiente
                    // Intercambiar array[j] y array[j+1] 
                    int temp = array[j]; // Guardar el valor de array[j] en una variable temporal
                    array[j] = array[j + 1]; // Asignar el valor de array[j+1] a array[j]
                    array[j + 1] = temp; // Asignar el valor temporal a array[j+1]
                }
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         BubbleSort sorter = new BubbleSort(); // Crear una instancia de BubbleSort
        int[] array = {5, 3, 8, 4, 2};// Definir el array a ordenar
        sorter.sort(array); // Llamar al método sort para ordenar el array
        System.out.print(Arrays.toString(array)); // Imprimir el array ordenado
    }
 }
    

