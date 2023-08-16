package br.senai.sp.jandira.game.Model;

import java.util.Scanner;

public class Register {

    /*instacia player*/
    Player player= new Player();

    /*instancia enemy*/
    Enemy enemy = new Enemy();

    /*instancia teclado*/
    Scanner teclado = new Scanner(System.in);

    /*instancia output*/
    Output output = new Output();

    int avaliaAmbos = 0;

    public void BothRegister(){

        /*coleta dados*/
        avaliaAmbos = 1;
        PlayerRegister();
        EnemyRegister();
        output.PrintPlayer(player);
        output.PrintEnemy(enemy);

    }

    public  void PlayerRegister(){
        System.out.println("--------------------------------------------");
        System.out.println("------------  Cadastro Player  ------------");
        System.out.println("Qual é seu nome: ");
        player.name = teclado.next();
        System.out.println("Selecione sua Skin [Red - Blue - Green]");
        player.skin = teclado.next();
        System.out.println("------  Player Cadastrado com Sucesso  ------");
        System.out.println("--------------------------------------------");

        if(avaliaAmbos != 1){
            output.PrintPlayer(player);
        }
    }

    public void EnemyRegister(){
        System.out.println("--------------------------------------------");
        System.out.println("--------------  Cadastro Enemy  --------------");
        System.out.println("Qual é seu nome: ");
        enemy.name = teclado.next();
        System.out.println("Selecione sua Skin [Red - Blue - Green]");
        enemy.skin = teclado.next();
        System.out.println("------  Enemy Cadastrado com Sucesso  ------");
        System.out.println("--------------------------------------------");

        if(avaliaAmbos != 1){
            output.PrintEnemy(enemy);
        }
    }

    public void Decision(){

        String decision;

        System.out.println("------------  Seja bem vindo !!  -------------");
        System.out.println("O que deseja cadastrar [Player - Enemy - Ambos]: ");
        decision = teclado.next();

        switch (decision.toLowerCase()){

            case "player":
            PlayerRegister();
            break;

            case "enemy":
            EnemyRegister();
            break;

            case "ambos":
            BothRegister();
            break;

            }

        System.out.println("----------------------------------------");
        System.out.println("Deseja continuar? (1- Sim 2- Nâo): ");
        int continuar = teclado.nextInt();

        if (continuar == 1){
            Decision();

        }
    }

}
