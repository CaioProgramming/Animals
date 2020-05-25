/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalsproject;

/**
 *
 * @author cacai
 */
public abstract class Ave extends Animal {

    public Ave(int patas, String visao, int idade_max) {
        super(patas, visao, idade_max);
    }

   
    
    
    
    void voar(){
        System.out.println("Voando!");
    }
    
}
