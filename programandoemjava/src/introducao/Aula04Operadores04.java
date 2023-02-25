package introducao;

public class Aula04Operadores04 {
    public static void main (String[] args) {
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupança > valorPlaystation;
        // Ou. Primeira verificação vai ser falsa, mas a segunda é verdadeira. Pelo menos uma retornou verdadeira. Basta uma ser true.
        System.out.println("isPlaystationCompravel: "+isPlaystationCompravel);
    }
    
}