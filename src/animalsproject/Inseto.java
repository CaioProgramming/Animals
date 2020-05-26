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
public abstract class Inseto extends Animal{

    public Inseto(int patas, String visao, double idade_max) {
        super(patas, visao, idade_max);
    }

     
    
    @Override
    public void brigar() {
         System.out.println("Brigando utilizando veneno!");  
    }

    @Override
    public void comer() {
        System.out.println("Alimentando-se de folhas");
    }

    @Override
    public void mover() {
        System.out.println("Movimentando-se escalando paredes");
    }
    
    
    
    
 
    
    
}
