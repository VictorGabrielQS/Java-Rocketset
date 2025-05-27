package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Daniele";
        pessoa.cpf = "33334444";
        pessoa.idade = 25;

        System.out.println(pessoa.nome);
        pessoa.fazerAniversario();
        System.out.println(pessoa.imprimidarDadosPessoa(1));


        Pessoa pessoa2 = new Pessoa();

        pessoa2.nome = "Maria";
        pessoa2.cpf = "33334444";
        pessoa2.idade = 19;

        System.out.println(pessoa2.nome);
        System.out.println(pessoa2.imprimidarDadosPessoa(2));


    }

}
