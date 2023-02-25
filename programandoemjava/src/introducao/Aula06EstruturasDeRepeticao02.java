package introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000
        for (int i = 0; i <= 1000; i++) { // Acaba sendo da forma melhor, pois se mudar algo no programa, como o i = 1, ele sempre 
        // imprimirá par. Sempre pensar no que aconteceria se alterar alguma coisa 
            if (i % 2 == 0)
                System.out.println(i); 
        }
        // Ou
        /*for (int i = 0; i <= 100; i += 2) { // Posso contar de quanto em quanto eu quiser
            System.out.println(i); 
        }*/
    }
}