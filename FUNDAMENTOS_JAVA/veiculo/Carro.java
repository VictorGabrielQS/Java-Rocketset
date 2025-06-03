package veiculo;

public class Carro implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("O Carro esta acelerando !");
    }

    @Override
    public void freiar() {
        System.out.println("O Carro esta freiando !");
    }

}
