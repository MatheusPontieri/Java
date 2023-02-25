package introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main (String[] args) {
        // Doar se salario > 5000 (1° Possibilidade)
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 reais!";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado;
        if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

        // 2° Possibilidade (Operador Ternário) - > String resultado = (condição) ? caso for verdadeiro : caso for falso; 
        double salario1 = 7000;
        String mensagemDoar1 = "Eu vou doar 500 reais!";
        String mensagemNaoDoar1 = "Ainda não tenho condições, mas vou ter!";
        String resultado1 = salario1 > 5000 ? mensagemDoar1 : mensagemNaoDoar1; // Se salario > 6000, resultado1 será igual a mensagem doar1, se não for igual, resultado1 será igual a mensagemnãodoar1 -> Sempre associando um valor
        System.out.println(resultado1+"!");

        // Ou 
        double salario2 = 4000;
        String resultado2 = salario2 > 5000 ? "Eu vou doar 500 reais!" : "Ainda não tenho condições, mas vou ter!"; // Se salario > 6000, resultado1 será igual a mensagem doar1, se não for igual, resultado1 será igual a mensagemnãodoar1 -> Sempre associando um valor
        System.out.println(resultado2+"!!");

        // Ou
        double salario3 = 4000;
        boolean resultado3 = salario3 > 5000 ? true : false; // Melhor ainda: boolean resultado3 = salario > 5000;
        System.out.println(resultado3);

        // Pode ser feito, mas não é recomendado
        int idade = 19;
        String resultado4 = idade < 15 ? "Categoria Infantil!" : idade >= 15 && idade < 18 ? "Categoria Juvenil!" : "Categoria Adulto!";
        System.out.println(resultado4);
        // Utilizar ternário quando tiver if e else simples.
    }
}