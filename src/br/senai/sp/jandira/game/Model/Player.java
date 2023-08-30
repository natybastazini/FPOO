package br.senai.sp.jandira.game.Model;

public class Player {
    public String name;
    public String skin;
    private int life;

    public Player(){
        life = 100;
    }

    //getlife é utilizado para que seja inalterável.
    public int GetLife(){
        return life;
    }

    public void SubtrairVida(int danoPlayer){
        life -= danoPlayer;

        if (life < 0){
            life = 0;
        }
    }

    public void RestartLife(){
        life = 100;
    }

}
