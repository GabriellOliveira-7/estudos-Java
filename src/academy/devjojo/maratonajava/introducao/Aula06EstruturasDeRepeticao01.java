package academy.devjojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count = count + 1;

            /* OUTRA FORMAS DE FAZER O VERSO ACIMA
            count +=1
            count++
            ou dentro do count (++count)
             */
        }
        count = 0;
        do {
            System.out.println("dentro do do-while" + ++count);
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("For "+ i);

            /*Inicialização: int i; → só declara a variável, não define um valor inicial.
              Condição: i < 10 → o loop roda enquanto i for menor que 10.
              Incremento: i++ → aumenta i em 1 a cada volta.*/


        }
    }
}
