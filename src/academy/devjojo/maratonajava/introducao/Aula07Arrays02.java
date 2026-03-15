package academy.devjojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double 0
        // char '\u0000' ' '
        // boolean false
        // string null

        String[] nomes = new String [3];
        nomes[0] = "Cr7";
        nomes[1] = "Messi";
        nomes[2] = "Neymar";
        for (int i = 0; i < nomes.length ; i++) {
               System.out.println(nomes[i]);
        }
    }
}

 //nomes.length  puxa o valor de cima, se for 3 valores puxa 3