/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

import animalsproject.Mamifero;

/**
 *
 * @author cacai
 */
public class Urso extends Mamifero{
    
    public Urso(int patas, String visao, int idade_max) {
        super(patas, visao, idade_max);
    }

    @Override
    public void comer() {
         System.out.println("Alimenta-se de peixes de água doce ou outros animais!");
    }

    //Sobrescrita/polimorfismo de inclusão de ação de briga!
    @Override
    public void brigar() {
        System.out.println("Brigando utilizando garras...");
    }

    
    
    
    
  
    
   
    
    
 
    
    
    
}
