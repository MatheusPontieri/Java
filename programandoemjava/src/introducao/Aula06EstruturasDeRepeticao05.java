package introducao;

public class Aula06EstruturasDeRepeticao05 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int nParcela = (int) valorTotal; nParcela >= 1; nParcela--){ 
            double valorParcela = valorTotal / nParcela;
            if (valorParcela < 1000)
            {
                continue; // Uso o continue para ignorar o resto do laço e voltar em cima
            }
            System.out.println("Parcela "+nParcela+": R$ "+valorParcela); 
        }
    }
}