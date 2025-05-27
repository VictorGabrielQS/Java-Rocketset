package primeirasAulas;

/* 
 * PrimeiraClasse  = Nome da minha Classe 
 * public = Tipo de acesso da minha Classe 
 * class = Tipo da Classe
 */

public class PrimeiraClasse {

    //Todo conteúdo deverá ser inserido aqui dentro 

    //Método main
    // public = tipo de acesso do metodo 
    // static = significa que esse método pertence a essa classe e não uma instancia
    // void = tipo de retorno do metodo , void significa que não retorna nenhum valor 
    // main  = precisa ser obirgatorio porque ele que executa o main da classe 
    // String[] = o tipo que posso receber , aqui esta relatando que posso receber uma lista de Strings  
    // args = irei receber argumentos 
    public static void main(String[] args) {


    // --- Tipo de Dados ---
        
    /* 
     * Valores (int , double , float , long)
     * Texto(String)
     * Booleanos (boleano)
     */

     int dadoDoTipoint = 10;
     double dadoDoTipoDouble = 3.14;
     float dadoDoTipoFloat = 3.14f;
     long dadoDoTipoLong = 8554484848848l;
     String dadoDoTipoString = "Essa e uma String";




     // --- Estrutura de Repetição ---


     // if - else 

     if (dadoDoTipoint == 10) {

        //sysout
        System.out.println("Entrou no if do 10");
        
     }else if(dadoDoTipoint < 12){
    
        System.out.println("Entrou no if do 12");
        
    }else{

        System.out.println("Entrou no else");

     }



    // While - enquanto algo for verdadeiro faça uma coisa . 

    int valorInicial = 0 ;


    while (valorInicial <= 3) {
        System.out.println("Valor atual do while : " + valorInicial); 
        valorInicial ++ ;  // adiciona mais 1 cada vez que for executado
    }
    System.out.println("Saiu do While ...");



    //For - outro tipo de loop - mas segue a estrutura : estado incial / até a condição / incremento
   
    for ( int i = 0 ; i < 4; i++) {
        System.out.println("Valor atual do for : " + i);
    }
    System.out.println("Saiu do for ...");



    }
}

//Fora do escpo da Classe
