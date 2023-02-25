package introducao;

public class Aula02TiposPrimitivosV11 {
    public static void main (String[] arg) {
        /* Os tipos de variáveis tem seu limite de armazenamento. Ex: byte só cabe de -128 até 127. Exemplo: Não precisa
        colocar o long pra idade. Int já serve*/
        int idade = 10; // Armazena n° inteiro - O que muda pro long é o tamanho que pode armazenar
        long numeroGrande = 100000; // Armazena n° inteiro
        double salarioDouble = 2000.5; // Armazena n° decimais - O que muda pro float é o tamanho que pode armazenar
        float salarioFloat = 2500.1f; // Armazena n° decimais
        byte idadeByte = 10; // Armazena inteiro - ...
        short idadeShort = 10; // Armazena inteiro - ...
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'A'; // Armazena uma letra; 
        char caractere2 = 87; /* Pode armazenar um número também. Todos os tipos de variáveis podem mexer com número,
        exceto o boolean. Se imprimir número sozinho, pode-se referir a uma letra */
        System.out.println(10+" e o resultado!");
        System.out.println(verdadeiro);
        System.out.println(caractere2);
        System.out.println();
    }
}