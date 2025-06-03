package pessoa;

// - extends - 
//Serve para quando eu quero herdar caracteristicas de outra classe

public class Professor  extends  Pessoa{

    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    

    //- Polimorfismo - :
    //Sobrescreve o metodo de acordo com a classe chamada
    
    
    String imprimidarDadosPessoa () {
        System.out.println(super.imprimidarDadosPessoa());
        return "Voce e um professor";
    }

}
