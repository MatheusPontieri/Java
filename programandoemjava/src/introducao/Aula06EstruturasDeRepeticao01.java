package introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args){
        // while, do while, for -> Os 3, se tiver apenas uma linhas dentro do bloco, pode omitir as chaves
        int count = 12;
        while (count <= 10){ // Dentro das aspas, tem que resultar em true or false. Se usar while, precisa trocar o estado da variável
        // variáveldentro do while. Se eu tivesse colocado 12 no count, nem entraria no while, pois a condição deve ser true
            System.out.println(count); // Poderia ser ++count, já começando a imprimir no 1
            count += 1;
        }

        count = 0;
        do { // do while é igual a while, com a diferença que vai ser executado pelo menos uma vez (mesmo se a condição for false) 
            System.out.println("Dentro do while! "+ ++count);
        } while (count < 10);
        
        for (int i = 0 ;i < 10 ;i++) { // for (declara variável; condição (até onde vai o laço); como a variável vai alterar o status)
        // Para i começando de 0, até i ser menos que 10, incrementando de 1 em 1, faça tal coisa. int i = 0 só é executado uma vez.
        // i -> incrementador
            System.out.println("For "+i);
        }
    }
}