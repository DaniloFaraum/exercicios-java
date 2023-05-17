public class Maia extends Linguagem{
    public Maia(String nome, int numFalantes) {
        super(nome, numFalantes, "América Central", "verbo-objeto-sujeito");
    }

    @Override
    public void getInfo(){
        System.out.println(getNome()+" é falado por "+getNumFalantes()+" pessoas principalmente em "+getRegioesFaladas()+".");
        System.out.println("A linguagem segue a ordem das palavras: "+getOrdemDasPalavras());
        System.out.println("Fato interessante: " +getNome()+ " é uma língua ergativa.");
    }

}
