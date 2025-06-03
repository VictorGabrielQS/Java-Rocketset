package execoes;

import pessoa.Pessoa;

public class Excecoes {

    // Checked exceptions
    // Exececoes que eu preciso tratar que eu consigo prever , que eu consigo tratar


    // Unchecked exceptions
    // Exececoes que não conseguimos detectar , meu console não consegue me descrever o erro 


    public static void main(String[] args) throws Exception {
        //Try / catch
/*         try {
            validarNumero();
            
        } catch (Exception e) {
            System.out.println("Deu ruim");
            //para me mostrar o erro :
            e.printStackTrace();
            
        } */


        //Excecoes não verificadas 

        Pessoa p = null;
        p.getCpf();
    }
        

    public static void validarNumero() throws Exception{
        int numero = 10;

        if (numero < 100) {
            throw new Exception("O numero e menor que 100");
        }
    }
}
