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
public abstract class Animal {

    public Animal(int patas, String visao, double idade_max) {
        this.patas = patas;
        this.visao = visao;
        this.idade_max = idade_max;
    }
    
    
    
   private int patas;
   private String visao;
   private  double idade_max;

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    
    //Sobrecarga de método para quantidade de patas!
     public void setPatas(double patas) {
        this.patas = (int) patas;
    }

    public String getVisao() {
        return visao;
    }

    public void setVisao(String visao) {
        this.visao = visao;
    }

    public double getIdade_max() {
        return idade_max;
    }

    public void setIdade_max(int idade_max) {
        this.idade_max = idade_max;
    }
   
   public abstract void comer();
    
   public abstract void mover();
   public abstract void brigar();
    
    
}
