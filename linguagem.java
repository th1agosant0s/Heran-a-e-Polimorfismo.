public class linguagem{
   protected String nome;
   protected String regioesFaladas;
   protected String ordemDasPalavras;
   protected int numFalantes;


public linguagem(String nome, String regioesFaladas, String ordemDasPalavras, int numFalantes){
    this.nome = nome;
    this.regioesFaladas = regioesFaladas;
    this.ordemDasPalavras = ordemDasPalavras;
    this.numFalantes = numFalantes; 
    

}

public void getInfo(){
    System.out.println( nome + " é falado por " + numFalantes + " pessoas principalmente em " + regioesFaladas + "." );
}

   public static void main(String[] args) {
    linguagem ingles = new linguagem("Inglês", " Estados Unidos ", null, 10000000);
    ingles.getInfo();
    Mayan iucateco = new Mayan("iucateco", " América Central ", " verbo-objeto-sujeito ", 800000);
    iucateco.getInfo();
    SinoTibetan Tibetano = new SinoTibetan( "Tibetano" , 1500000000);
    Tibetano.getInfo();
      
   }

}