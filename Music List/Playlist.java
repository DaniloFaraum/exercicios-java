import java.util.ArrayList;
public class Playlist{
    public static void main(String[] args) {
        ArrayList<String> listaParaIlhaDeserta = new ArrayList<String>();
        listaParaIlhaDeserta.add("Azul da cor do mar");
        listaParaIlhaDeserta.add("Burguesinha");
        listaParaIlhaDeserta.add("W/ Brasil");
        listaParaIlhaDeserta.add("Aguas de março");
        listaParaIlhaDeserta.add("O segundo sol");
        listaParaIlhaDeserta.add("Malandragem");
        listaParaIlhaDeserta.add("Capim guiné");
        System.out.println(listaParaIlhaDeserta);
        System.out.println(listaParaIlhaDeserta.size());
        listaParaIlhaDeserta.remove(0);
        listaParaIlhaDeserta.remove(1);
        System.out.println(listaParaIlhaDeserta + " " + listaParaIlhaDeserta.size());
        int a = listaParaIlhaDeserta.indexOf("Malandragem");
        int b = listaParaIlhaDeserta.indexOf("Burguesinha");
        String tempA = listaParaIlhaDeserta.get(a);
        String tempB = listaParaIlhaDeserta.get(b);
        listaParaIlhaDeserta.set(b, tempA);
        listaParaIlhaDeserta.set(a, tempB);
        System.out.println(listaParaIlhaDeserta);
    }
}