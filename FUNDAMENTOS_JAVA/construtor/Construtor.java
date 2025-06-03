package construtor;

public class Construtor {

    private  int numero ;
    private  String texto;
   
    public void nomeMetodo(){

    }

    //Construtor tem que ter o mesmo nome da classe  e não pode ter nenhum tipo de retorno 

    public Construtor( int numero , String texto){
        this.numero = numero;
        this.texto = texto;
        System.out.println("Construtor com parametro criado ...");
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    
}
