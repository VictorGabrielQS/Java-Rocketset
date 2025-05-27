package primeirasAulas;

import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {

    public static void main(String[] args) {
     
        //Lista - lista de dados - estrutura : List<TipoDeDadoAReceber> nomeDaLista = new ArrayList<>();
        
        //Para manipular uma lista eu preciso utilizar os métodos que ja vem definido no List 

        //lista.add(dadoASerAdicionado) - adiciona um elemento na Lista.
        //lista.get(index) - retorna o dado que eu passei a posição no index.

        List<String> nomes = new ArrayList<>();
        nomes.add("Dani");
        nomes.add("Vini");
        nomes.add("Elias");
        // 0 -
        //  1 -
       // 2 -

       System.out.println(nomes.get(2)); 

       //Percorer lista com for in conversional - estrutura : tipoDeDado variavelTemporaria  : listaASerPercorrida 
       for(String nome : nomes){
        System.out.println("Percorendo pelo for in elemento da lista : " + nome);
       }

       //Apartir do java 8 posso utilizar um método mais facil chamado lambda
       //Lambda - lista.forEach(variavelTemporaria -> oQueDesejoFazer) ou lista.forEach(oQueDesejoFazer)

       nomes.forEach(nome -> System.out.println("Percorrendo pelo metodo Lambda : " + nome));

       nomes.forEach(System.out::println);



    }
}
