package veiculo;

public class Moto implements Veiculo {

    @Override
    public void acelerar() {
      System.out.println("A Moto esta acelerando !");
    }

    @Override
    public void freiar() {
      System.out.println("A Moto esta freiando !");
    }

}
