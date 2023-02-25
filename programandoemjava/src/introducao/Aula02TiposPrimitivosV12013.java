package introducao;

public class Aula02TiposPrimitivosV12013 {
    public static void main (String[] arg) {
        int idade = (int) 10000L; // Estou fazendo um cast. Forço através dos parênteses. Ex: Colocar um long dentro de um int
        long numeroGrande = 100000; 
        double salarioDouble = 2000.5; 
        // Se colocar float salarioFloat = 2500.5, dará erro, tenho que especificar que ele é float, mesmo já tendo colocado
        //Posso colocar float salarioFloat = 2500.5f (ou F). Quando coloco esse f, estou dizendo que é um float
        // Ex: int idade = 100000000000L; Estou dizendo que esse número é long (L), mas todo esse número não cabe
        // em um tipo int, então posso forçar a caber no int, int idade = (int) 10000L;
        // Cast -> Força o Java a colocar o valor de uma variável dentro da outra. Ex: int idade = (int) 10000000000L;
        float salarioFloat = 2500.5F; 
        float salarioFloat1 = (float) 2500.5D; // Estou dizendo que é double (D), mas forço a ser float com o cast (float)
        byte idadeByte = 10; 
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'A'; 
        char caractere2 = 87; 
        System.out.println(idade);
        // Cast não é uma prática muito boa
        String nome = "Matheus!"; // String não é um tipo primitivo, e sim um tipo de referência.
        //String é uma classe e, assim, deve começar com maiúscula
        System.out.println("Oi, me chamo "+nome);
        
    }
}