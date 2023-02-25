package introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args){
        // Imprima o dia da semana, considerando 1 como domingo
        int dia = 8;

        // char, int, byte, shot, enum, String (Tipos que switch aceita). switch (variavel) {case possibilidade: execute}. Imprime a
        // possibilidade buscada e continua se não mandar parar (break). Para colocar uma opção de nenhuma das possibilidades, default:
        // Posso mudar o default de lugar. 
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção Invalida!");
                break;
        }
        
        char sexo = 'Z';
        switch (sexo) {
            case 'F':
                System.out.println("Feminino!");
                break;
            case 'M':
                System.out.println("Masculino!");
                break;
            default:
                System.out.println("Opcao Invalida!");
                break;
        }
    }
}