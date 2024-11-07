/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pirchio_potenzaimp;

/**
 *
 * @author ospite
 */
public class Pirchio_potenzaImp {

    public static void main(String[] args) {
        
        int base = 2;
        int esponente = 3;
        int risultato = base;
        
        for(int i = 1; i < esponente; i =i +1){
            risultato = risultato * base;
        }
        
         System.out.print(risultato);
        
    }
}
