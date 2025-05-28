package pessoa;

//Um objecto pessoa 

public class Pessoa {

    //Atributo - oque a classe vai conter : 

    //nome , idade , cpf

    //tipo nomeVariavel

    String nome;
    int idade;
    String cpf;


    //Método - ações que ela pode fazer 

    String imprimidarDadosPessoa (int indice) {
        return "O Nome da pessoa e  : " + nome + " a idade : " + idade + " cpf e : " + cpf;
    }


    void fazerAniversario () {
        idade = idade + 1;
    }
    
}
