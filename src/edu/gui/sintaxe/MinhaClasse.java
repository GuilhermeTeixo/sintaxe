package edu.gui.sintaxe;
public class MinhaClasse {
    public static void main(String[] args) {

        String primeiroNome="Guilherme";
        String segundoNome="Teixo";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
