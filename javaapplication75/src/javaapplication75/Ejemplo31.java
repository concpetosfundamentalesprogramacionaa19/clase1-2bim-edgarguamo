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
        Scanner entrada = new Scanner(System.in);
        Random aleatorios = new Random();
        int[] datos = new int[6];
        String[] rangos = {"0-8", "8.1-12", "12.1-16","16.1-19","19.1 - 20", 
            "20.1-∞"};
        boolean bandera = true;
        int nota = 0;
        int pregunta = 0;
        int contador2 = 0;
        while (bandera == true){    
        
        System.out.println("Por ingrese la nota");
        
        nota = entrada.nextInt();
        if(nota <=8){
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
            contador2 = contador2 + 1;
        }
            System.out.println("Si desea agregar más notas, por favor aplaste 1"
                    + " sino aplaste cualquier otro número");
            pregunta = entrada.nextInt();
            if (pregunta == 1 ){
                bandera = false;
            }
        }
        System.out.printf("Notas Ingresadas\n Total notas ingresadas %d\n ",
                contador2);
        
        for(int i = 0; i<datos.length; i++){
            System.out.printf("%s - %d\n", rangos[i], datos[i]);
        }
        


    }
}
