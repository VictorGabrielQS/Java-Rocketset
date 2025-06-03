
package conta;

public class TesteContaBancaria {
    public static void main(String[] args) {

        ContaBancaria contaBancaria1 = new ContaBancaria("Maria");

        /*  - Não e permitido , pois os atributos agora são Privados e eu não tenho acesso direto mais


        contaBancaria1.numero = "12345";
        contaBancaria1.titular="Jose";
        contaBancaria1.saldo = 50; 
        */




        contaBancaria1.setNumero("12345");
        contaBancaria1.setTitular("Jose");
        contaBancaria1.setSaldo(50);


        System.out.println(contaBancaria1.getNumero());
        System.out.println(contaBancaria1.getTitular());
        System.out.println(contaBancaria1.getSaldo());


        contaBancaria1.depositar(100);
        contaBancaria1.sacar(50);


    }

}
