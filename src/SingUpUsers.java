import java.util.Scanner;

public class SingUpUsers {
    public static void singUpUsers(){

        // Instanciando classes
        Scanner read = new Scanner(System.in);
        DataBase db = new DataBase();

        // Declarando variável de opção numérica
        int inputNum = 0;

        // Listando as opções para o usuário
        System.out.println("Deseja realizar um cadastro?");
        System.out.println("[1] Sim");
        System.out.println("[2] Não, eu quero voltar");
        System.out.print("$ ");
        inputNum = read.nextInt();
        read.nextLine();

        // Condicional para cadastro ou voltar para o ínicio
        if (inputNum == 1){

            // Limpando o buffer do Scanner
            read.nextLine();

            System.out.println("Cadastro de novo usuário no sistema bancário IV-Bank");

            System.out.println("Informe seu nome completo");
            System.out.print("$ ");
            db.nome = read.nextLine();

            System.out.println("Informe sua idade");
            System.out.print("$ ");
            db.idade = read.nextInt();

            // Limpando o buffer do Scanner
            read.nextLine();

            System.out.println("Informe sua data de nascimento");
            System.out.print("$ ");
            db.dataNascimento = read.nextLine();

            System.out.println("Informe seu CPF");
            System.out.print("$ ");
            db.cpf = read.nextLine();

            System.out.println("Informe sua senha");
            System.out.print("$ ");
            db.senha = read.nextLine();

            db.dinheiro = 0;

            //Cadastro realizado com sucesso
            db.exibirInfo();

        } else if (inputNum == 2) {

            // Pulando linhas para não confundir os textos
            System.out.println("\n\n\n\n\n");

            // Chamando a função main para retornar ao ínicio
            String[] argsVazia = new String[0];
            Main.main(argsVazia);

        }else{

            // Caso o número não seja igual a 1 ou nem 2 Exibe uma mensagem, e o usuário volta para o ínicio
            System.out.println("\n\n\n\n\nOpção inválida, tente novamente\n");
            singUpUsers();

        }


    }
}
