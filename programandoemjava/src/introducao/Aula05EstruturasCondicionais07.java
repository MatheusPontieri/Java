package introducao;

public class Aula05EstruturasCondicionais07 {
    public static void main(String[] args){
        // utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        byte diaSemana = 3;
        switch (diaSemana){
            case 1:
                System.out.println("Final de semana!");
                break;
            case 2:
                System.out.println("Dia útil!");
                break;
            case 3:
                System.out.println("Dia útil!");
                break;
            case 4:
                System.out.println("Dia útil!");
                break;
            case 5:
                System.out.println("Dia útil!");
                break;
            case 6:
                System.out.println("Dia útil!");
                break;
            case 7:
                System.out.println("Final de semana!");
                break;
            default:
                System.out.println("Dia inválido!");  
                break; 
        }
            
            // Mais rápido:
        switch (diaSemana) {
            case 1:
            case 7:
                System.out.println("Final de semana!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil!");
                break;
            default:
                System.out.println("Inválido!");
                break;
                
        } 
    }
}