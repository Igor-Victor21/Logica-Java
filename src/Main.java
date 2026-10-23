import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciando as classes
        Scanner read = new Scanner(System.in);
        SingUpUsers singUp = new SingUpUsers();

        // Variável para receber a opção do usuário
        int inputNum = 0;

        // Mensagem inicial do caixa eletrônico
        System.out.println("Olá seja Bem vindo ao sistema bancário IV-Bank");

        // Opções para o usuário
        System.out.println("O que deseja hoje:");
        System.out.println("[1] Cadastrar-se");
        System.out.println("[2] Login");
        System.out.println("[3] Sair");
        System.out.print("$ ");

        // Lendo o teclado do usuário
        inputNum = read.nextInt();

        // Fazendo um switch case para as opções iniciais do caixa eletrônico
            switch (inputNum) {
                case 1:
                    singUp.singUpUsers();
                    break;

                case 2:
                    System.out.println("Login");
                    break;

                case 3:
                    System.out.println("Sair");
                    break;

                default:
                    System.out.println("\n\n\n\n\nOpção inválida tente novamente");
                    String[] arrayVazio = new String[0];
                    main(arrayVazio);

            }

        }
    }
