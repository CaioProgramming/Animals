/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

import animalsproject.Peixe;

/**
 *
 * @author cacai
 */
public class Tubarao_branco extends Peixe{
    
    public Tubarao_branco(int patas, String visao, int idade_max) {
        super(patas, visao, idade_max);
    }

    @Override
    public void comer() {
        super.comer(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Comendo outros peixes!");
    }

    @Override
    public void mover() {
        super.mover(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Movendo as nadadeiras!");
    }

    @Override
    public void brigar() {
        System.out.println("Brigando com mordidas ferozes!");
    }
    
    
    
    
    
    
    
    
    
}
