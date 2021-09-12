import java.util.Scanner;

class Main {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) throws NumberFormatException{

        //###INFO PESSOA###
        String nome = "";
        String cidade = "";
        int idade = 0;
        int verificaIdade = 0;

        boolean resposta = false;

        //### INFO SOBRE CONDICAO ###
        boolean espacoSuficiente = false; //condicioanais para o final
        boolean condicaoFinanceira = false;
        //condicioanais para ofinal
        boolean tempoDisponivel = false;//condicioanais para o final

        //### INFO SOBRE ANIMAL ###
        boolean ehGato;
        boolean ehFemea;
        boolean petResgatado;

        ///### INICIANDO ###

        System.out.println("======={}Java Adote Um Pet{}=======");
        System.out.println("\n ##### {!}Seja bem vinde{!} #####");

        /////////////Info e verificação de Nome/////////
        do {
            resposta = false;
            System.out.println("\n{*}Digite o seu nome{*} ");
            nome = entrada.nextLine();

            if(!nome.matches("^[A-zÀ-ú '´]+$")){
                System.out.println("Você precisa digitar um nome válido!");
            } else {
                resposta = true;
            }
        } while(resposta == false);

        /////////////Info e verificação de Idade/////////
        do{
            resposta = false;
            System.out.println("\nOlá " + nome + ", digite a sua idade: ");
            try {
                idade = Integer.parseInt(entrada.nextLine());
                if (idade == (int) idade && idade < 1 || idade > 120) {
                    System.out.println("Digite uma idade válida!");
                } else if (idade <= 17) {
                    System.out.println("|{Converse Com Seus Pais ou Responsaveis e Tente Novamente!!!}|");
                } else {
                    verificaIdade = 1;
                }
            } catch(NumberFormatException e){
                System.out.println("Digite uma idade válida!");
            }

        } while (verificaIdade != 1);

        /////////////Info de Localização da Cidade/////////

        do{
            resposta = false;
            System.out.println("\nEm que cidade você está localizade?");
            cidade = entrada.nextLine();

            if(!cidade.matches("^[A-zÀ-ú '´]+$")){
                System.out.println("Nome de cidade inválido!");
            }else{
                resposta = true;
            }

        }while(resposta == false);

        ///////////ESPACO EM RESIDENCIA /////////////
        do{
            resposta = false;
            System.out.println("\nVocê Possui Espaço em Sua Residencia Para a Adoção/Criação de um Pet?");
            System.out.println("\n[1] - ()Sim()\n[0] - ()Não()");

            int opcao = -1;//variavel para armazenar resposta
            opcao = entrada.nextInt();

            if(opcao == 1){
                espacoSuficiente = true;
                resposta = true;
            }
            else if(opcao == 0){
                espacoSuficiente = false;
                resposta = true;
            }else{
                resposta = false;
                System.out.println("Opção inválida, por favor, digite novamente!");
            }

        }
        while(resposta == false);

        /////////////CONDICAO FINANCEIRA/////////////
        do{
            resposta = false;
            System.out.println("\nVocê possui condição financeira para cuidar do pet?");
            System.out.println("\n[1] - ()Sim()\n[0] - ()Não()");

            int opcao = -1;//variavel para armazenar resposta
            opcao = entrada.nextInt();

            if(opcao == 1){
                condicaoFinanceira = true;
                resposta = true;
            }
            else if(opcao == 0){
                condicaoFinanceira = false;
                resposta = true;
            }else{
                resposta = false;
                System.out.println("Opção inválida, por favor, digite novamente!");
            }

        }while(resposta == false);

        /////////////TEMPO DISPONIVEL/////////////

        do{
            resposta = false;
            System.out.println("\nVocê Possui Tempo disponivel para cuidar de um pet?");
            System.out.println("\n[1] - ()Sim()\n[0] - ()Não()");

            int opcao = -1;//variavel para armazenar resposta
            opcao = entrada.nextInt();

            if(opcao == 1){
                tempoDisponivel = true;
                resposta = true;
            }
            else if(opcao == 0){
                tempoDisponivel = false;
                resposta = true;
            }else{
                resposta = false;
                System.out.println("Opção inválida, por favor, digite novamente!");
            }

        }while(resposta == false);

        /////////////TIPO DE ANIMAL /////////////

        do{
            resposta = false;
            System.out.println("\nEm Qual Tipo de Animal Você   Se Interessa ?");
            System.out.println("\n[1] - Gato\n[2] - Cachorro");

            int opcao = -1;//variavel para armazenar resposta
            opcao = entrada.nextInt();

            if(opcao == 1){
                ehGato = true;
                resposta = true;
            }
            else if(opcao == 2){
                ehGato = false;
                resposta = true;
            }else{
                resposta = false;
                System.out.println("Opção inválida, por favor, digite novamente!");
            }

        }while(resposta == false);


        ///###GENERO DO ANIMAL###
        do{
            resposta = false;
            System.out.println("\nQual o genero do animal?");
            System.out.println("\n[1] - Femea\n[2] -Macho");

            int opcao = -1;//variavel para armazenar resposta
            opcao = entrada.nextInt();

            if(opcao == 1){
                ehFemea = true;
                resposta = true;
            }
            else if(opcao == 2){
                ehFemea = false;
                resposta = true;
            }else{
                resposta = false;
                System.out.println("Opção inválida, por favor, digite novamente!");
            }

        }while(resposta == false);

        /////////////FINALIZAÇÃO DO PROGRAMA/////////////


        if (espacoSuficiente == false){
            System.out.println("|{Poxa que pena, Para o Conforto do Pet, é Essencial Possuir Espaço suficiente}|");

        } if (condicaoFinanceira == false){
            System.out.println("|{Nós Vimos Aqui no Programa Que Você Não Tem Condições Financeiras o Suficiente e Sentimos Muito, mas para Cuidar Bem de Um Pet e Preciso Ter as Contas Equilibradas|");
            System.out.println("\n============================");
            /////////////FINALIZAÇÃO DO PROGRAMA/////////////
        } if (tempoDisponivel == false){
            System.out.println("|{Ter um Tempinho é Muito Importante para Dar Uma Atenção para Pet e Por Isso Não vai Ser Possivel Adotar um Pet Agora..}|");
            System.out.println("\n============================");
        }

        System.out.println("|{Sucesso! Deu Tudo Certo!}|");
        System.out.println("\n============================");
        System.out.println("{|Estamos Muito Felizes Por Sua Escolha e Sua Linda Atitude}|");
        System.out.println("\n============================");
        System.out.println("|{Criamos Esse Programa para Servir de Ponte Justamente pra Conseguir\nTe Direcionar a ONG's que Conseguem Ajudar na Causa}|");
        System.out.println("\n============================");



        //entrada.close();
    }//end static void main

}//end Main











