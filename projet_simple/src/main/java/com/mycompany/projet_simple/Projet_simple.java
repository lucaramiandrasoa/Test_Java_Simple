/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projet_simple;

import java.util.Scanner;

/**
 *
 * @author LukasRAMIANDRASOA
 */
public class Projet_simple {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nombre;
        System.out.println("Entrer un nombre");
        nombre = scan.nextInt();
        
        //Si nombre divisible par 3 alors "Fluzz"
        //Si nombre divisible par 5 alors "Gratz"
        //Si nombre divisible par 3 et 5 alors "FluzzGratz"
        //sinon on affiche le nombre
        
        if(nombre % 3 == 0){
            System.out.println("Fluzz");
        }
        else if(nombre % 5 == 0){
            System.out.println("Gratz");
        }
        else if((nombre % 3 == 0) && (nombre % 5 == 0)){
            System.out.println("FluzzGratz");
        }else{
            System.out.println("Le nombre est :"+nombre);
        }
    }
}
