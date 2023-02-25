package introducao;

public class Aula04Operadores05 {
    public static void main (String[] args) {
        // = += -= *= /= %=
        double bonus = 1000; // (1000) Crio e aloco um valor nessa variável. Se quiser trocar o valor da variável, não precisa colocar
        // double bonus = 2000; pois já criei. Só mudar o valor, ex: bonus = 2000;
        bonus += 1000; // (2000) Dando um valor diferente pra esse espaço em memoria. bonus = bonus + 1000. Não colocar bonus = 1000 + 1000 (hardcode), pois dificulta usar depois na hora de mudar os valores.
        bonus -= 1000; // (1000)
        bonus *= 2; // (2000)
        bonus /= 2; // (1000)
        bonus %= 2; // (0)
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1; // contador = contador + 1
        contador++; // Adiciono 1 no contador, mesma coisa que contador += 1;
        System.out.println(contador);
        contador--;
        System.out.println(contador);

        // Tem diferença entre contador++ (executa a op. e depois incrementa) e ++contador (incrementa e depois executa a op.). Ex:
        int contador2 = 0;
        System.out.println("Mostrando contador e depois adicionando: "+contador2++); // Primeiro mostra o contador e depois adiciona 1
        System.out.println("Mostrando contador depois de ser adicionado: "+contador2);

    }
    
}