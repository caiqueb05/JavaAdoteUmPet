package br.com.javaadoteumpet;

import java.util.Scanner;

public class JavaAdoteUmPet {

    public static void main(String[] args) {Scanner entrada = new Scanner(System.in);

        int idade = 0, resp = -1;
        String nome;

        boolean espacoSuficiente; //V ou f> para espaco em casa
        boolean condicaoFinanceira; // v ou f> para condicao financeira
        boolean tempoDisponivel; // v ou f> para tempo tempoDisponivel
        int tipoDeAnimal; // 1-gato |2-cachorro|3-outro
        boolean Femea; //v ou f > femea ou macho
        boolean petResgatado; // v ou f > para animal resgatado

        System.out.println("====== Java Adote Um Pet ======");
        System.out.println("\n ##### Seja bem vinde! #####");


        System.out.println("\nDigite o seu nome: ");
        nome = entrada.next();

        System.out.println("\nOlá " + nome + ", digite a sua idade: ");
        idade = entrada.nextInt();

        System.out.println("\nEm que cidade você está localizade? ");
        String cidade = entrada.next();


        resp = -1;
        //### ESPACO EM RESIDENCIA ###
        while(resp != 1 && resp != 0){
            System.out.println("\nVocê possui espaço em sua residencia para a adoção/criação de um pet?");
            System.out.println("\n1 - Sim\n0 - não");

            resp = entrada.nextInt();

            if(resp == 1) {
                espacoSuficiente = true;
            }else if(resp == 0){
                espacoSuficiente = false;
            }else{
                System.out.println("Resposta Inválida!");
            }
        }

        resp = -1;
        ///### CONDICAO FINANCEIRA ###
        while(resp != 1 && resp != 0){
            System.out.println("\nVocê possui condição financeira para adotar um animal?");
            System.out.println("\n1 - Sim\n0 - não");

            resp = entrada.nextInt();

            if(resp == 1) {
                condicaoFinanceira = true;
            }else if(resp == 0){
                condicaoFinanceira = false;
            }else{
                System.out.println("Resposta Inválida!");
            }
        }


        resp = -1;
        //### TEMPO DISPONIVEL ###
        System.out.println("\nVocê possui tempo disponivel para adoção de um pet? ");
        System.out.println("\n1 - Sim\n0 - não");

        resp = entrada.nextInt();

        if(resp == 1) {
            tempoDisponivel = true;
        }else if(resp == 0){
            tempoDisponivel = false;
        }else{
            System.out.println("Resposta Inválida!");
        }
        resp = -1;

        entrada.close();
    }

}
