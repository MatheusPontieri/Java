package introducao;

public class Aula04Operadores {
    public static void main (String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 + numero02;
        System.out.println(numero01+numero02);
        System.out.println("Valor: "+numero01+numero02); // + -> Pode ser usado para concatenação ou adição. A partir do 1° sinal de +, será concatenação e não adição. Ter cuidado com isso !!!
        System.out.println(numero01+numero02+" Valor: "+numero01+numero02);
        System.out.println(resultado);
        int resultado2 = numero01 / numero02;
        System.out.println(resultado2); // Dividir inteiro por inteiro sempre dará inteiro. Aparecerá apenas o 0 (parte inteira)
        int num1 = 10;
        double num2 = 20; // Se colocar pelo menos um double ou float, aparecerá o depois da vírgula 
        System.out.println(num1 / num2);
        double resultado3 = num1 / (float) num2; // Posso fazer cast, mas não é recomendado!!!
        System.out.println("O resultado 3 e: "+resultado3);

    }
}