package primeirasAulas;

import java.util.HashMap;
import java.util.Map;

public class ColecoesHashMap {
    public static void main(String[] args) {

        Map<String , Integer > notas = new HashMap<>();

        notas.put("Dani", 9);
        notas.put("Vini", 8);
        notas.put("Elias", 10);

        System.out.println(notas.get("Dani"));


        // Como percorrer um Hash Map :
        for(Map.Entry<String , Integer> entry : notas.entrySet()){

            String Key = entry.getKey();
            Integer Value = entry.getValue();

            System.out.println("A chave e : " + Key + " Valor e : " + Value);
        }
    }
}
