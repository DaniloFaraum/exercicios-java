public class SinoTibetan extends Linguagem{

    public SinoTibetan(String nome, int numFalantes) {
        super(nome, numFalantes, "Asia", "sujeito-objeto-verbo");
        if (this.nome == "Chines"){
            this.ordemDasPalavras = "sujeito-verbo-objeto";
        }
    }
    
}
