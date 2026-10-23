import java.util.ArrayList;

public class DataBase {

    String nome;
    int idade;
    String dataNascimento;
    String cpf;
    String senha;
    double dinheiro = 0;

    public static void dataBase(){
        ArrayList<String>usersController = new ArrayList<>();
    }
    // Um metodo para exibir as informações dos usuários
    void exibirInfo(){
        System.out.println("Cadastro realizado com sucesso\n");
        System.out.println("Seu nome é: "+nome);
        System.out.println("Sua idade é: "+idade);
        System.out.println("Sua data de nascimento é: "+dataNascimento);
        System.out.println("Seu CPF é: "+cpf);
        System.out.println("Sua senha é: "+senha);
    }
}
