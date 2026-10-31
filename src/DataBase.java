import java.util.ArrayList;

public class DataBase {

    String nome;
    int idade;
    String dataNascimento;
    String cpf;
    String senha;
    double dinheiro = 0;

    // Arraylist que armazena o objeto usuário
    static ArrayList<DataBase> db = new ArrayList<>();

    // Criando o metodo construtor
    public DataBase(String nome, int idade, String dataNascimento, String cpf, String senha, double dinheiro){

        // Incializando as variáveis
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.senha = senha;
        this.dinheiro = dinheiro;

    }

    // Metodo para criar usuários, que recebe como parâmetro um objeto, onde o objeto será enviado para um Arraylist
    public static void createUsers(DataBase dataBase) {
        db.add(dataBase);
    }

    // Exibindo os usuários de dentro do Arraylist
    public static void readUsers(){

        //Exibindo usuários os com for-each
        for(DataBase user : db){
            System.out.println("\n\n\n\n\n\n\n");
            System.out.println("Nome: "+user.nome);
            System.out.println("Idade: "+user.idade);
            System.out.println("Data de nascimento: "+user.dataNascimento);
            System.out.println("CPF: "+user.cpf);
            System.out.println("Senha: "+user.senha);
            System.out.println("Dinheiro: "+user.dinheiro);
            System.out.println("--------------------------------------");
        }
    }

}

