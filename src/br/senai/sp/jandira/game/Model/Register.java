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

    public void BothRegister(){
        /*coleta dados*/
        PlayerRegister();
        EnemyRegister();
    }

    public  void PlayerRegister(){
        System.out.println("--------------------------------------------");
        System.out.println("------------  Cadastro Player  ------------");
        System.out.println("Qual é seu nome: ");
        player.name = teclado.nextLine();
        System.out.println("Selecione sua Skin [Red - Blue - Green]");
        player.skin = teclado.nextLine();
        System.out.println("------  Player Cadastrado com Sucesso  ------");
        System.out.println("--------------------------------------------");

        output.PrintPlayer(player);
    }

    public void EnemyRegister(){
        System.out.println("--------------------------------------------");
        System.out.println("--------------  Cadastro Enemy  --------------");
        System.out.println("Qual é seu nome: ");
        player.name = teclado.nextLine();
        System.out.println("Selecione sua Skin [Red - Blue - Green]");
        player.skin = teclado.nextLine();
        System.out.println("------  Enemy Cadastrado com Sucesso  ------");
        System.out.println("--------------------------------------------");

        output.PrintEnemy(enemy);
    }

    public void Decision(){

        String decision;

        System.out.println("------------  Seja bem vindo !!  -------------");
        System.out.println("O que deseja cadastrar [Player - Enemy - Ambos]: ");
        decision = teclado.nextLine();

        switch (decision){

            case "Player":
            PlayerRegister();
            break;

            case "Enemy":
            EnemyRegister();
            break;

            case "Ambos":
            BothRegister();
            break;

            default:
                System.out.println("Escolha uma opção válida!! ");

        }
    }

}
