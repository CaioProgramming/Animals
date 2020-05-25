/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

import animalsproject.Reptil;

/**
 *
 * @author cacai
 */
public class Iguana extends Reptil{

    public Iguana(int patas, String visao, int idade_max) {
        super(patas, visao, idade_max);
    }

    @Override
    public void comer() {
        super.comer(); 
        System.out.println("Comendo mamão!");
     }

    @Override
    public void mover() {
        super.mover(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Movendo-se com "+  getPatas() + " patas e balançando a cauda!");
    }

    
    
    
    
    
    
}
