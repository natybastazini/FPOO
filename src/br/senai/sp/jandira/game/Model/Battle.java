package br.senai.sp.jandira.game.Model;

import java.util.Scanner;

public class Battle {

    String scenarioBattle;

    /*Instancia Scanner*/
    Scanner teclado = new Scanner(System.in);

    /*Instancia Scenario*/
    Scenario scenario = new Scenario();
    public void ChoiceScenario(){
        System.out.println("//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//");
        System.out.println("Escolha um Cenário");
        System.out.println("1- Arábia 2- Grécia 3- Los Angeles 4- Rio de Janeiro 5- Tokio 6- Berlim");
        System.out.println("//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//");

        int userScenario = teclado.nextInt();

        scenarioBattle = scenario.Scenario(userScenario);

        System.out.println(scenarioBattle);
    }

    public void Battle(Player player, Enemy enemy){
        System.out.println(player.name);
        System.out.println(enemy.name);
    }
}
