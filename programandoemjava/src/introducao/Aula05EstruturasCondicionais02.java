package introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main (String[] args) {
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) { 
            System.out.println("Está autorizado!"); 
        } else { // Se o if não for executado, é certeza absoluta que else será executado. Pq não posso colocar dois if logo? Pq cada if (e o que vier junto - else), é um código independente. Não posso ter else sem if.
        }

        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } 
        else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria Juvenil");
        }
        else { // Última condição possível, então posso usar else
            System.out.println("Categoria Adulto");
        }

        // Ou
        String categoria;
        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else { // Última condição possível, então posso usar else
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria+"!");
        // Todas as variáveis dentro de métodos (ex: psvm), tem escopo local. Toda variável de escopo local, deve ser inicializada antes de ser executada. Ex: String categoria;  System.out.println(categoria); Tenho que atribuir algo a ela antes de ser executada (adicionar número, imprimir).
    }    
}