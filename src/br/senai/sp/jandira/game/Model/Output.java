package br.senai.sp.jandira.game.Model;

public class Output {

    public void PrintPlayer(Player player){
        System.out.println("----------------------------------------");
        System.out.println("O nome do Player é: " + player.name);
    }

    public void PrintEnemy(Enemy enemy){
        System.out.println("----------------------------------------");
        System.out.println("O nome do Enemy é: " + enemy.name);
    }


}
