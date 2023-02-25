package introducao;

public class Aula04Operadores03 {
    public static void main (String[] args) {
        // Operadores lógicos -> && (AND) || (OR) ! (NOT)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612; // As duas condições precisam ser verdade pra retornar true
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        char casado = 'N';
        boolean isCasado = casado == 'S';
        System.out.println("Voce e casado: "+isCasado);

    }
}