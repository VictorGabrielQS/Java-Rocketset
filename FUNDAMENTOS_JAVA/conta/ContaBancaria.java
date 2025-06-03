package conta;

public class ContaBancaria {


    //- Atributos - :

    // modificadores de acesso : public , protect , private 

    private String numero;
    private String titular;
    private double saldo;


    //- Construtor - : 
    //Se eu desejo que meu objeto seja atribuido valor ao seu criado eu utilizo o construtor

    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0.0;

    }



    //- Getters e Setters - : 

    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getNumero(){
        return numero;
    }



    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return titular;
    }



    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }





    // - Metodos - : 

    //Depositar
    void depositar(double valor){
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Deposito de R$ " + valor + " Saldo Agora : " + saldo);
        }
        else{
            System.out.println("O valor de deposito invalido.");
        }
    } 
    
    //Sacar
    void sacar(double valor){
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Valor R$" + valor + "sacado com sucesso ! valor atual e " + saldo );
        }else{
            System.out.println("O valor de sacar é invalido...");
        }

    }

}
