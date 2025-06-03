package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        
       /*  Pessoa pessoa = new Pessoa();

        pessoa.setNome(  "Daniele");
        pessoa.setCpf( "33334444");
        pessoa.setIdade( 25);

        System.out.println(pessoa.getNome());
        pessoa.fazerAniversario();
        System.out.println(pessoa.imprimidarDadosPessoa(1));


        Pessoa pessoa2 = new Pessoa();

        pessoa2.nome = "Maria";
        pessoa2.setCpf( "33334444");
        pessoa2.setIdade( 19);

        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.imprimidarDadosPessoa(2));
 */

      Professor professor = new Professor();
      professor.setNome("Ricardo");
      professor.setIdade(28);
      professor.setCpf("2222");
      professor.setSalario(5000);

     System.out.println( professor.imprimidarDadosPessoa());


     Aluno aluno = new Aluno();
     aluno.setNome("Fernada");
     aluno.setIdade(19);
     aluno.setCpf("5555");
     aluno.setMatricula("3233");

     System.out.println(aluno.imprimidarDadosPessoa());


    }

}
