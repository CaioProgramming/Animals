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
public abstract class Mamifero extends Animal {
    
    
    
    
    
     
    

    public Mamifero(int patas, String visao, int idade_max) {
        super(patas, visao, idade_max);
    }

    @Override
    public void comer() {
         System.out.println("Alimentando-se através da amamentação!");
    }

     @Override
    public void mover() {
         System.out.println("Movendo-se com as 4 patas!");
    }

    @Override
    public void brigar() {
        throw new UnsupportedOperationException("Brigando utilizando mordidas"); 
    }
    
    
   
}
