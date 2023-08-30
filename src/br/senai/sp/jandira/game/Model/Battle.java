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

    public void Battle(Player player, Enemy enemy) {

        while (true) {

            int lifePlayer = player.GetLife();
            int lifeEnemy = enemy.GetLife();

            if (lifePlayer == 0) {
                System.out.println("O vencedor é o enemy " + enemy.name);
                break;
            } else if (lifeEnemy == 0) {
                System.out.println(" O vencedor é o player " + player.name);
                break;
            }


            System.out.println("---------------------------- Battle ----------------------------");
            System.out.println(" Ataque Player [R] - " + player.name + " life: " + lifePlayer);
            System.out.println(" Ataque Enemy [Q] - " + enemy.name + "life: " + lifeEnemy);
            System.out.println(" Defesa Player ou Enemy [1 à 5]");
            System.out.println("----------------------------------------------------------------");

            String attack = teclado.next();

            if (attack.equalsIgnoreCase("R")) {
                System.out.println("----------------------------------");
                System.out.println("           Player atacou          ");
                System.out.println("----------------------------------");

                int danoPlayer = (int) (Math.random() * 20) + 1;
                int defesaEnemy = (int) (Math.random() * 20) + 1;

                int chanceDefesa = (int) (Math.random() * 5) + 1;
                int danoReal;

                System.out.println("Digite um número para defesa [1 à 5]");

                int numberDefesa = teclado.nextInt();

                if (numberDefesa == chanceDefesa){
                    danoReal = danoPlayer - defesaEnemy;
                } else {
                    danoReal = danoPlayer;
                }

                if (danoReal < 0){
                    danoReal = 0;
                }

                enemy.SubtrairVida(danoReal);

                System.out.println("----------------------------------");
                System.out.println("O ataque foi de: " + danoPlayer);
                System.out.println("----------------------------------");

            } else if (attack.equalsIgnoreCase("Q")) {
                System.out.println("----------------------------------");
                System.out.println("           Enemy atacou          ");
                System.out.println("----------------------------------");


                int danoEnemy = (int) (Math.random() * 20) + 1;
                int defesaPlayer = (int) (Math.random() * 20) + 1;

                int chanceDefesa = (int) (Math.random() * 5) + 1;
                int danoReal;

                System.out.println("Digite um número para defesa [1 à 5]");
                int numberDefesa = teclado.nextInt();

                if (numberDefesa == chanceDefesa){
                    danoReal = danoEnemy - defesaPlayer;
                } else{
                    danoReal = danoEnemy;
                }

                player.SubtrairVida(danoReal);

                System.out.println("----------------------------------");
                System.out.println("O defesa foi de: " + danoEnemy);
                System.out.println("----------------------------------");

            } else {
                System.out.println(" Tecla inválida!!");
            }

        }
    }
}
