/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pirchio_potenzaproj;

/**
 *
 * @author ospite
 */
public class potenza {
    
    public int base = 2;
    public int esponente = 4;
    public int v_risultato = base;
    
    public int Potenza(int base, int esponente, int v_risultato){
        
        for(int i = 1; i < esponente; i =i +1){
            v_risultato = v_risultato * base;
        }
        return v_risultato;
    }
    
}
