package wrapper_classe;

import java.util.ArrayList;

public class wrapper {
    public static void main(String[] args) {



        int numeroPrimitivo = 10;
        Integer numeroObjeto = Integer.valueOf(numeroPrimitivo); // conversão manual

        System.out.println("Número como objeto: " + numeroObjeto);

        
     
        //Java faz autoboxing (conversão automática do tipo primitivo para objeto) e unboxing (objeto para tipo primitivo).
        

        int x = 5;
        Integer y = x; // autoboxing


        Integer a = 10;
        int b = a; // unboxing


        //Exemplo com arrayList

        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(10); // autoboxing: int -> Integer
        lista.add(20);
        lista.add(30);


        for(int valor : lista){
            System.out.println(valor);
        }


        // Métodos úteis em Wrapper Classes :

        String numeroTexto = "123";
        int numero = Integer.parseInt(numeroTexto); // converte string para int

        System.out.println("Número: " + numero);


        int maxInt = Integer.MAX_VALUE;
        System.out.println("Maior valor de int: " + maxInt);


    }
}

/* 

🧠 O que são Wrapper Classes?

No Java, tipos primitivos (como int, double, boolean, etc.) não são objetos.
Mas às vezes, precisamos trabalhar com objetos, por exemplo, ao usar:

Coleções (como ArrayList)

APIs que exigem objetos

Métodos genéricos

👉 Por isso existem as Wrapper Classes – elas "embrulham" um tipo primitivo em um objeto.


🧾 Tipos Primitivos e suas Wrapper Classes

Tipo Primitivo	         Wrapper Class

byte	                 Byte
short	                 Short
int	                     Integer
long	                 Long
float	                 Float
double	                 Double
char	                 Character
boolean	                 Boolean


 */