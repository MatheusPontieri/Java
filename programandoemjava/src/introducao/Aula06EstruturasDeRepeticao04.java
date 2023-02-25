package introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int nParcela = 1; nParcela <= valorTotal; nParcela++){
            double valorParcela = valorTotal / nParcela;
            if (valorParcela < 1000) { // break não pode ser somente dentro do if, tem que estar dentro de algum laço ou switch
                break; // Tenho que parar o laço, se não ficará rodando até o nParcela chegar em 30000
            }
            System.out.println("Parcela "+nParcela+": R$ "+valorParcela);   
        }
    }
}