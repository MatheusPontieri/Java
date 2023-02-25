package introducao;

public class Teste {
    public static void main(String[] args) {

        double salario = 2000, imposto, taxa;
        if (salario <= 2500) {
            taxa = 50;
            imposto = salario*(50/100);
        } else {
            imposto = 1;
        }
        System.out.println(imposto);

        String nomePessoa = "Matheus";
        switch (nomePessoa) {
            case "João":
                System.out.println("Usuário Inválido!");
            case "Matheus":
                System.out.println("Usuário Válido!");
        }
    }
}