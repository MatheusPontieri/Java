package introducao;

public class Aula07ArraysPt01 {
    public static void main(String[] args){
        // Objetos em memória separado: declaro a idade (ex) na variável. Objeto em memória junto: Array (tipo reference e não primitivo)
        int[] idade = null; // Criando Array. Ou int idade[]; Tipos de referência podem iniciar com null. Tipos primitivos, não. Quer 
        // dizer que não fazem referência pra nenhum objeto em memória (se usar null)
        System.out.println(idade);

        int[] idades = new int[3]; // Cria um array com 3 espaços // Variável idades faz referência a um objeto em memória que é um array
        // de 3 posições. Índice das posições começa no 0.
        System.out.println(idades[0]); // Imprime a posição 0 do array idades. Por padrão, em um array de inteiros, as posições mostrarão 
        // 0. Em um array de n° com . mostrarão 0.0. Em um array com palavra, mostrará null por padrão

        String[] nomes = new String[3];
        nomes[0] = "Maria";
        System.out.println(nomes[0]);
    }
}