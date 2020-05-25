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
public abstract class Peixe extends Animal {

    public Peixe(int patas, String visao, int idade_max) {
        super(patas, visao, idade_max);
    }

    @Override
    public void mover() {
        super.mover(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nadando!");
    }

    @Override
    public void comer() {
        super.comer(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Comendo nutrientes marinhos!");
    }
    
   

   
}
