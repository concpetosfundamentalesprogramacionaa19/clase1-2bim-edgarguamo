/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo31 {

    public static void main(String[] args) {
        // TODO code application logic here
        //declaración de variables a usar
        Scanner entrada = new Scanner(System.in);
        //Random aleatorios = new Random(); // Venia por defecto 
        // array para contar el número de notas por rango
        int[] datos = new int[6]; 
        String[] rangos = {"0-8", "8.1-12", "12.1-16","16.1-19","19.1 - 20", 
            "20.1-∞"}; // Array para almacenar el rango de las notas 
        boolean bandera = true; // v para seguir en el bucle 
        int nota = 0; // v para almacenar la nota que reistra el usuario
        int pregunta = 0; // v usada para registrar la pregunta al usuario
        int contador2 = 0; // v usada para contar los registros de notas
        // bucle principal
        while (bandera == true){    
            // Petición de notas 
            System.out.println("Por ingrese la nota");
            nota = entrada.nextInt();
            // almacenamiento de las notas dependiendo del rango 
            if(nota <=8){ // si la nota es menor o igual a 8 
                datos[0] = datos[0] + 1;
            }else{
                if(nota>=8.1 && nota <=12){ 
                    datos[1] = datos[1] + 1;
                }else{
                    if (nota >= 12.1 && nota <=16){
                        datos [2] = datos [2] + 1; 
                    } else {
                        if (nota >= 16.1 && nota <= 19){
                            datos [3] = datos [3] + 1;
                        }else {
                            if (nota >= 19.1 && nota <= 20){
                                datos [4] = datos[4] + 1;
                            }else{
                                datos [5] = datos[5] + 1;
                        }
                    }
                }
            }
        // incremento del contador2
        contador2 = contador2 + 1;
        }
        // Pregunta al usuario para seguir en el bucle 
        System.out.println("Si desea agregar más notas, por favor aplaste 1"
             + " sino aplaste cualquier otro número");
        pregunta = entrada.nextInt();
        // si el usuario desea salir del bucle 
        if (pregunta == 1 ){
            bandera = false;
            }
        }
        // impresión de la información 
        
        System.out.printf("Notas Ingresadas\n Total notas ingresadas %d\n"
                + "Rangos:\n",
                contador2);
        
        for(int i = 0; i<datos.length; i++){
            System.out.printf("%s - %d\n", rangos[i], datos[i]);
        }
        


    }
}
