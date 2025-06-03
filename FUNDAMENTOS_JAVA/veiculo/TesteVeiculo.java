package veiculo;

public class TesteVeiculo {
    public static void main(String[] args) {
     
        Veiculo carro = new Carro();
        carro.acelerar();
        carro.freiar();

        
        Veiculo moto = new Moto();
        moto.acelerar();
        moto.freiar();

        
    }
}
