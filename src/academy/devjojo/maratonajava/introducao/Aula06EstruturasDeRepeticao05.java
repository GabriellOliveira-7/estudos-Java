package academy.devjojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    // Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
    // Condicao valorParcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 1000;
        for (int parcela = (int) valorTotal; parcela >= 1 ; parcela--) {
            double valorParcela = valorTotal / parcela;
            valorParcela = Math.round(valorParcela * 100) / 100; // arredondamento para 2 casas decimais
            if(valorParcela < 100){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            }
        }
    }
