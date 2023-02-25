package introducao;

public class Aula04Operadores02 {
    public static void main (String[] args) {
        // % -> Pega resto da divisão inteira
        int resto = 20 % 2;
        System.out.println(resto); // Se der 0, é par. Se der 1, é ímpar. Divindo por 2 é claro

        // < > <= >= == (comparando) !=. Retornam valores booelanos. Apenas = é atribuir. 
        boolean isDezMaiorQueVinte = 10 > 20; // Por convenção, geralmente usa "is" pra tipos booleanos. Tipo, é 10 maior que 20? Retorna true ou false.
        boolean isDezMenorIgualQueVinte = 10 <= 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteDez = 10 != 10;
        // boolean isComparando = 10 == "10"; Não posso comparar tipos diferentes, como número com string. Ou seja, não utilizar valores incomparáveis
        System.out.println("isDezMaiorQueVinte: "+isDezMaiorQueVinte);
        System.out.println("isDezMenorIgualQueVinte: "+isDezMenorIgualQueVinte);
        System.out.println("isDezIgualVinte: "+isDezIgualVinte);
        System.out.println("isDezDiferenteDez: "+isDezDiferenteDez);

        int num1 = 10;
        int num2 = 20;
        boolean verifica = num1 <= num2;
        System.out.println(verifica);

    }
}