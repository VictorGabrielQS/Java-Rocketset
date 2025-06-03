package pessoa;

//Um objecto pessoa 

public class Pessoa {

    //Atributo - oque a classe vai conter : 

    //nome , idade , cpf

    //tipo nomeVariavel

    private String nome;
    private int idade;
    private String cpf;

    


    //Método - ações que ela pode fazer 

    String imprimidarDadosPessoa () {
        return "O Nome da pessoa e " + nome + " a idade : " + idade + " cpf e : " + cpf;
    }


    void fazerAniversario () {
        idade = idade + 1;
    }


    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    
}
