public class SinoTibetan extends Linguagem{

    public SinoTibetan(String nome, int numFalantes) {
        super(nome, numFalantes, "Asia", "sujeito-objeto-verbo");
        if (this.getNome().contains("Chines")){
            this.setOrdemDasPalavras("sujeito-verbo-objeto");
        }
    }
    
}
