/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pirchio_potenzaproc;

/**
 *
 * @author ospite
 */
public class Pirchio_potenzaProc {

    public static void main(String[] args) {
        
        int base = 2;
        int esponente = 4;
        int risultato = base;
        
        risultato = potenza(base, esponente);
        
        
        System.out.print(risultato);

    }
    
    
    public static int potenza(int base, int esponente) {
        

        int v_risultato = base;
        
{
        for(int i = 1; i < esponente; i =i +1){
            v_risultato = v_risultato * base;
        }
        return v_risultato;
    }
    
}
}
