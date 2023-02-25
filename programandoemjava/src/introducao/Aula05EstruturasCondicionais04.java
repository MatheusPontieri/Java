package introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main (String[] args) {
        //Se estou usando && (e), as duas verificações precisam ser verdades pra ser executado. Se estou usando || (ou), pelo menos uma 
        // precisa ser verdade para poder ser executada
        double salarioAnual = 30000;
        double imposto;
        if (salarioAnual <= 34712) {
            imposto = (9.7/100)*salarioAnual;
        } else if (salarioAnual > 34712  && salarioAnual <= 68507) {
            imposto = (37.35/100)*salarioAnual;
        } else {
            imposto = (49.5/100)*salarioAnual;
          }
        double novoSalario = salarioAnual - imposto;
        System.out.println("Seu salario sera de "+novoSalario+" e o imposto sera de "+imposto);

        } 
}