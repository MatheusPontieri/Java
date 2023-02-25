package introducao;

public class Aula02TiposPrimitivosV10 {
    public static void main (String[] args) {
        /* Tipos primitivos (Guardam em memória
        um valor simples (letra minúscula): int,
        double, float, char, byte, short, long, boolean 
        */ 
        int age = 10; /*  Declarando variável -> Colocar tipo dela e começar minúsculo. Se for nome composto, colocar idadePaiNascimento. Criei um espaço na memória com o noem age e uso o "=" pra atribuir um valor a essa variável;
        */ 
        System.out.println(age); // (age) -> Busca o valor em memória; ("age") -> Imprime a palavra "age"
        System.out.println("A idade e: "+age); //Uso o + pra concatenar texto com variável
        System.out.println("A idade e "+age+" anos!");
    }
    
}