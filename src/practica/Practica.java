/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        
        System.out.println(" -------------MULTIPLICACION-----------------");
        
        System.out.println("Introduce el primer número:");
        double numero1 = input.nextDouble();	//aparecera el primer numero	
       
        System.out.println("Introduce la cantidad de veces :");
        double numero2 = input.nextDouble();   //aparecera el segundo numero
        
        double numero3=0;
        
        for (int i=1; i < numero2 + 1; i++){   // formula para la operacion de multiplicacion
            numero3+=numero1;
        }
        System.out.println("la respuesta de la multiplicación es :"+ numero3); //saldra la respuesta
        
    }
        
    }
    

