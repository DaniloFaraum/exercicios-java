public class Linguagem{
    private String nome;
    private int numFalantes;
    private String regioesFaladas;
    private String ordemDasPalavras;

    public Linguagem(String nome, int numFalantes, String regioesFaladas, String ordemDasPalavras){
        this.nome = nome;
        this.numFalantes = numFalantes;
        this.regioesFaladas = regioesFaladas;
        this.ordemDasPalavras = ordemDasPalavras;
    }

    public String getNome() { return nome; }
    public int getNumFalantes() { return numFalantes; }
    public String getOrdemDasPalavras() { return ordemDasPalavras; }
    public String getRegioesFaladas() { return regioesFaladas; }
    public void setOrdemDasPalavras(String ordemDasPalavras) { this.ordemDasPalavras = ordemDasPalavras; }
    
    public void getInfo(){
        System.out.println(nome+" é falado por "+numFalantes+" pessoas principalmente em "+regioesFaladas+".");
        System.out.println("A linguagem segue a ordem das palavras: "+ordemDasPalavras);
    }

    public static void main(String[] args) {
        Linguagem portugues = new Linguagem("Português", 260000000, "América, Europa, Africa e Asia", "sujeito-verbo-objeto");
        portugues.getInfo();
        Maia kiche = new Maia("Ki'che'", 2000000);
        kiche.getInfo();
        SinoTibetan chines = new SinoTibetan("Chines", 30000);
        SinoTibetan birmanes = new SinoTibetan("Birmanes", 60000);
        chines.getInfo();
        birmanes.getInfo();
    }
}