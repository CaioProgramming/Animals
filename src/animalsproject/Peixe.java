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
         System.out.println("Movimentando-se por nado!");
    }

    @Override
    public void comer() {
         System.out.println("Comendo nutrientes marinhos!");
    }

    @Override
    public void brigar() {
        throw new UnsupportedOperationException("Brigando utilizando nadadeiras!");
    }
    
   

   
}
