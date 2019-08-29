/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

/**
 *
 * @author luan.castoldi
 */
public class Personagem {
    
    String nome;
    int vida;
    int ataque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
   /* public boolean atacando(int valorAtaque){
        if(valorAtaque <= this.ataque){
            System.out.println("INIMIGO ATACADO");
            return true;
        }else{
            System.out.println("INIMIGO MORTO");
            return false;
      
        }
        
        
    }
    */
    
}
