/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

import animalsproject.Ave;

/**
 *
 * @author cacai
 */
public class Pinguim extends Ave{
    
    
    public Pinguim(int patas, String visao, int idade_max) {
        super(patas, visao, idade_max);
    }

    @Override
    public void mover() {
        super.mover(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Movendo-se por terra com " + getPatas() + " ou as vezes nadando!");
    }

    @Override
    public void comer() {
        super.comer(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Comendo peixes ou nutrientes marinhos!");
    }
    
    
    
    
    
    
    
   
    
}
