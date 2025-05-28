package conta;

public class ContaBancaria {

    String numero;
    String titular;
    double saldo;



    void depositar(double valor){
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Deposito de R$ " + valor + " Saldo Agora : " + saldo);
        }
        else{
            System.out.println("O valor de deposito invalido.");
        }
    } 
    
    //sacar

    void sacar(double sacar){
        if (sacar > 0 && sacar < saldo) {
            saldo = saldo - sacar;
            System.out.println("Valor sacado com sucesso ");
        }else{
            System.out.println("O valor de sacar é invalido...");
        }

    }

}
