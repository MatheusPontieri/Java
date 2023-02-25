package introducao;

public class Aula05EstruturasCondicionais {
    public static void main (String[] args) {
        if (true) { // If só é executado se a condição dentro dele for verdadeira. Se eu tiver apenas uma linha de código dentro do
            // if, posso tirar as chaves (não recomendado). Se colocar if (false), não executa, pois if só executa se for verdadeiro.
            System.out.println("Hello");
        }

        int idade = 17;
        if (idade >= 18) {
            System.out.println("Autorizado a comprar bebida alcoólica!");
        }
        System.out.println("Fora do if!");

        // Ou
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) { // Se o booleano for verdadeiro, execute
            System.out.println("Está autorizado!"); 
        }
        if (isAutorizadoComprarBebida == false) { // isAutorizadoComprarBebida == false é igual a !isAutorizadoComprarBebida (!)
            System.out.println("Não autorizado!");
        }
        // ! --> Negação
        if (!isAutorizadoComprarBebida) { // Se o booleano for falso, execute
            System.out.println("Não autorizado!!");
        }
    }
}