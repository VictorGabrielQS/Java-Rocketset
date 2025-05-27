package primeirasAulas;
import java.util.HashSet;

public class ColecoesHashSet {
    public static void main(String[] args) {
        
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(11);
        numeros.add(12);
        numeros.add(13);

        //Remover um elemento de um HashSet:
        numeros.remove(12);

        
        
        //Percorrendo um HashSet :
        for(Integer numero : numeros){
            System.out.println(numero);

        }



        //Verificando se um HashSet contém um elemento:
        System.out.println(numeros.contains(10));

        //Não e permitido eu encontrar um elemento pelo seu indice no HashSet

    }

}
