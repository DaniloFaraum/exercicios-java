public class Maia extends Linguagem{
    public Maia(String nome, int numFalantes) {
        super(nome, numFalantes, "América Central", "verbo-objeto-sujeito");
    }

    @Override
    public void getInfo(){
        System.out.println(nome+" é falado por "+numFalantes+" pessoas principalmente em "+regioesFaladas+".");
        System.out.println("A linguagem segue a ordem das palavras: "+ordemDasPalavras);
        System.out.println("Fato interessante: "+nome+" é uma língua ergativa.");
    }

}
