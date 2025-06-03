package pessoa;

public class Aluno extends Pessoa {

    private String matricula;

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }



    //- Polimorfismo - :
    //Sobrescreve o metodo de acordo com a classe chamada
    String imprimidarDadosPessoa () {
        //Vai herdar meu atributo da classe Pai 
        System.out.println(super.imprimidarDadosPessoa());
        return "Voce e um aluno";
    }

}
